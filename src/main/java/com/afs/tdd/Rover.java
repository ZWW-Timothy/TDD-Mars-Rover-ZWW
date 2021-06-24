package com.afs.tdd;

public class Rover {

    private Integer xPosition;
    private Integer yPosition;
    private String direction;

    public Rover() {
    }

    public Rover(Integer xPosition, Integer yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public void init(int x, int y, String direction) {
        this.xPosition = x;
        this.yPosition = y;
        this.direction = direction;
    }

    public int getXPosition() {
        return this.xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }

    public String getDirection() {
        return this.direction;
    }
}
