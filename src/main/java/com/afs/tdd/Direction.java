package com.afs.tdd;

public enum Direction {

    EAST("E"),
    WEST("W"),
    SOUTH("S"),
    NORTH("N");

    private String code;

    Direction(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Direction getByCode(String code) {
        for (Direction value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }

    public static Direction turnLeft(Direction direction) {
        return Direction.SOUTH;
    }

    public static Direction turnRight(Direction direction) {
        return Direction.NORTH;
    }
}
