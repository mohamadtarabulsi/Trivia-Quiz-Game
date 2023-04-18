package com.kenzie.app;
// Import the Jackson JSON library
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

// Define the ApiResponse class
public class ApiResponse {
    // @JsonProperty annotation to map the "clues" JSON field to the clues attribute
    @JsonProperty("clues")
    // Defines a List of Clue objects called clues
    private List<Clue> clues;

    // Getter and setter methods for the clues attribute
    public List<Clue> getClues() {
        return clues;
    }

    public void setClues(List<Clue> clues) {
        this.clues = clues;
    }
}
