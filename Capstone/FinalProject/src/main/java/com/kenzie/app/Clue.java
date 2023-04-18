package com.kenzie.app;
// Import the Jackson JSON library
import com.fasterxml.jackson.annotation.JsonProperty;
// Define the Clue class
public class Clue {
    // @JsonProperty annotation to map the "id" JSON field to the id attribute
    @JsonProperty("id")
    // Defines an int called id
    private int id;
    @JsonProperty("answer")
    private String answer;
    @JsonProperty("question")
    private String question;
    @JsonProperty("value")
    private int value;
    @JsonProperty("categoryId")
    private int categoryId;
    @JsonProperty("gameId")
    private int gameId;
    @JsonProperty("invalidCount")
    private int invalidCount;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("game")
    private Game game;
    @JsonProperty("canon")
    private boolean canon;

    // Getter and setter methods for the attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getInvalidCount() {
        return invalidCount;
    }

    public void setInvalidCount(int invalidCount) {
        this.invalidCount = invalidCount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public boolean isCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
    }

    // Override the toString() method to return a String representation of the Clue object
    @Override
    public String toString() {
        return "Clue{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", question='" + question + '\'' +
                ", value=" + value +
                ", categoryId=" + categoryId +
                ", gameId=" + gameId +
                ", invalidCount=" + invalidCount +
                ", category=" + category +
                ", game=" + game +
                ", canon=" + canon +
                '}';
    }
}
