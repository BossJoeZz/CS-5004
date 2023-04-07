package com.model;

public enum Player {

    /*
    * X as Player name X
    * Y as Player name O
    * */
    X("X"), Y("O");

    private String name;

    private Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
