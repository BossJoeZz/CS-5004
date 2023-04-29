package com.model;

/**
 * The Color enum represents two different colors: BLACK and WHITE.
 */
public enum  Color {

    BLACK("BLACK"),
    WHITE("WHITE");

    private String type;

    /**
     * Default constructor for the Color enum.
     */
    private Color() {

    }

    /**
     * Constructor for the Color enum that initializes the type field.
     * @param s the type of the color
     */
    private Color(String s) {
        this.type = s;
    }

    /**
     * Returns the type of the color.
     * @return the type of the color
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the color.
     * @param type the type of the color
     */
    public void setType(String type) {
        this.type = type;
    }
}
