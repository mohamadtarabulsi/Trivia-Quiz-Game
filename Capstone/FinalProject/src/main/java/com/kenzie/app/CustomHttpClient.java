package com.kenzie.app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

// Define the CustomHttpClient class
public class CustomHttpClient {

    //TODO: Write sendGET method that takes URL and returns response
    public static String sendGET(String URLString) {
        //** Start of GET request algorithm
        // Create an HttpClient with default settings and HTTP/1.1 protocol version
        HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1).build();
        // Create an HttpRequest with the provided URL and GET method
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URLString)).GET().build();

        try {
            // Send the request and receive the response as a String
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            // Check if the status code is 200 (success), return the response body, else print an error message
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                System.out.println("Error while fetching data from the API. Status code: " + response.statusCode());
                return "";
            }
        } catch (IOException | InterruptedException e) {
            // Catch exceptions, print an error message, and return an empty string
            System.out.println("Error while sending GET request: " + e.getMessage());
            return "";
        }
    }
}