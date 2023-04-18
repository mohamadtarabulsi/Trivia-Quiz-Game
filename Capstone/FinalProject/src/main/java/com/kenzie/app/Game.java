package com.kenzie.app;
// Import the Jackson JSON library
import com.fasterxml.jackson.annotation.JsonProperty;
// Define the Game class
public class Game {
    // @JsonProperty annotation to map the "aired" JSON field to the aired attribute
    @JsonProperty("aired")
    // Defines a String called aired
    private String aired;
    @JsonProperty("canon")
    private boolean canon;

    // Getter and setter methods for the attributes
    public String getAired() {
        return aired;
    }

    public void setAired(String aired) {
        this.aired = aired;
    }

    public boolean isCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
    }

    @Override
    public String toString() {
        return "Game{" +
                "aired='" + aired + '\'' +
                ", canon=" + canon +
                '}';
    }
}
