# SEBD Term 1 Capstone Project 


Project Title: Trivia Quiz Application


Overview:
The Trivia Quiz Application is an interactive command-line program that provides users with a fun and engaging quiz experience. It utilizes the jService API to generate a set of trivia questions and presents them to the user one at a time. Users are prompted to answer each question, and the application evaluates their responses, providing immediate feedback and keeping track of the total score.

Key Features:

Fetches a list of trivia clues from the jService API, an online database of Jeopardy! questions.
Randomizes the order of clues to ensure a unique quiz experience each time the program is run.
Presents a total of 10 trivia questions to the user, along with their respective categories.
Accepts user input for each question and evaluates the correctness of the response.
Provides feedback on whether the answer is correct or incorrect, and displays the correct answer if the user's response is incorrect.
Keeps track of the total score throughout the quiz and displays the final score at the end of the game.
Technologies Used:

Java: The primary programming language used to develop the application.
jService API: An external RESTful API that provides a wide range of Jeopardy! questions and answers.
JSON Parsing: Deserialization of JSON data retrieved from the API into Java objects (DTOs).
HTTP Client: Java's built-in HTTP client for sending GET requests to the API.
Command-Line Interface: User interaction and input handling through the command-line interface.
