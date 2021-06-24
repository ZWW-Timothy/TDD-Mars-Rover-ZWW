package com.afs.tdd;

public enum Direction {

    EAST("E"),
    WEST("W"),
    SOUTH("S"),
    NORTH("N");

    private String code;

    Direction(String code) {
    }

    public String getCode() {
        return code;
    }
}
