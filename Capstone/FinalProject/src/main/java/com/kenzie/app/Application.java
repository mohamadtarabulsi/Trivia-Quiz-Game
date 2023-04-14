package com.kenzie.app;

// import necessary libraries
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
    /* Java Fundamentals Capstone project:
       - Define as many variables, properties, and methods as you decide are necessary to
       solve the program requirements.
       - You are not limited to only the class files included here
       - You must write the HTTP GET call inside the CustomHttpClient.sendGET(String URL) method
         definition provided
       - Your program execution must run from the main() method in Main.java
       - The rest is up to you. Good luck and happy coding!
     */


    public static void main(String[] args) {
        //Write main execution code here
        // define API URL
        String URL = "https://jservice.kenzie.academy/api/clues";

        // Send GET request to the API to fetch data and store the response
        String jsonResponse = CustomHttpClient.sendGET(URL);

        // Convert the JSON response to a list of Clue objects
        List<Clue> clues = parseClues(jsonResponse);

        if (clues == null) {
            System.out.println("Error: Unable to fetch clues from the API.");
            return;
        }

        // Shuffle clues randomly
        Collections.shuffle(clues);

        // Initialize score and total questions
        int score = 0;
        int totalQuestions = 10;
        Scanner scanner = new Scanner(System.in);

        // Loop through the number of questions
        for (int i = 0; i < totalQuestions; i++) {
            Clue clue = clues.get(i);
            Category category = clue.getCategory();
            // Display the category and question
            System.out.println("Category: " + category.getTitle());
            System.out.println("Question: " + clue.getQuestion());
            // Read user input
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            // Check if user's answer is correct
            boolean isCorrect = isAnswerCorrect(userAnswer, clue.getAnswer());
            if (isCorrect) {
                score++;
                System.out.println("Great work! Your answer is correct.");
            } else {
                System.out.println("Sorry! That answer was incorrect. The correct answer is \"" + clue.getAnswer() + "\".");
            }
            // Display current score
            System.out.println("Current Score: " + score);
        }
        // Display final score
        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
    // Method to parse clues from JSOn response
    private static List<Clue> parseClues(String responseBody) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ApiResponse apiResponse = objectMapper.readValue(responseBody, ApiResponse.class);
            return apiResponse.getClues();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    // Method to check if user's answer is correct
    // The method is not case sensitive, ignores leading, trailing spaces, and ignores apostrophes
    private static boolean isAnswerCorrect(String userAnswer, String correctAnswer) {
        String normalizedUserAnswer = userAnswer.trim().toLowerCase().replaceAll("'", "");
        String normalizedCorrectAnswer = correctAnswer.trim().toLowerCase().replaceAll("'", "");
        return normalizedUserAnswer.equals(normalizedCorrectAnswer);
    }
}