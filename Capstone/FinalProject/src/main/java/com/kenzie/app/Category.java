package com.kenzie.app;
// Import the Jackson JSON library
import com.fasterxml.jackson.annotation.JsonProperty;

// Define the Category class
public class Category {
    // @JsonProperty annotation to map the "id" JSON field to the id attribute
    @JsonProperty("id")
    // Defines an int called id
    private int id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("canon")
    private boolean canon;

    // Getter and setter methods for the attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
    }
    // Override the toString() method to return a String representation of the Category object
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", canon=" + canon +
                '}';
    }
}