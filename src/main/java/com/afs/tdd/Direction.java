package com.afs.tdd;

public enum Direction {

    EAST("E"),
    WEST("W"),
    SOUTH("S"),
    NORTH("N");

    private final String code;

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
        switch(direction) {
            case EAST:
                return Direction.SOUTH;
            case WEST:
                return Direction.NORTH;
            case SOUTH:
                return Direction.WEST;
            case NORTH:
                return Direction.EAST;
        }
        return null;
    }

    public static Direction turnRight(Direction direction) {
        switch(direction) {
            case EAST:
                return Direction.NORTH;
            case WEST:
                return Direction.SOUTH;
            case SOUTH:
                return Direction.EAST;
            case NORTH:
                return Direction.WEST;
        }
        return null;
    }
}
