package com.afs.tdd;

public class Rover {

    private Position position;
    private Direction direction;

    public Rover() {
    }

    public Rover(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public void init(int xPosition, int yPosition, String direction) {
        this.position = new Position(xPosition, yPosition);
        this.direction = Direction.getByCode(direction);
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void moveForward() {
        this.position = new Position(0,1);
    }
}
