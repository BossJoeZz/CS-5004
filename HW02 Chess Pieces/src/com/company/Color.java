package com.company;

public enum  Color {

    BLACK("BLACK"),
    WHITE("WHITE");

    private String type;

    private Color() {

    }

    private Color(String s) {
        this.type = s;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
