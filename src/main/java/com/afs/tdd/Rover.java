package com.afs.tdd;

public class Rover {

    private Position position;
    private String direction;

    public Rover() {
    }

    public Rover(Position position, String direction) {
        this.position = position;
        this.direction = direction;
    }

    public void init(Position position, String direction) {
        this.position = position;
        this.direction = direction;
    }

    public Position getPosition() {
        return this.position;
    }

    public String getDirection() {
        return this.direction;
    }
}
