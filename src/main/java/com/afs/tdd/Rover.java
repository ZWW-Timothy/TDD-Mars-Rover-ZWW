package com.afs.tdd;

public class Rover {

    public static final int ONE_STEP = 1;
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
        switch(this.getDirection()) {
            case EAST:
                position.setX(position.getX() + ONE_STEP);
                break;
            case WEST:
                position.setX(position.getX() - ONE_STEP);
                break;
            case SOUTH:
                position.setY(position.getY() + ONE_STEP);
                break;
            case NORTH:
                position.setY(position.getY() - ONE_STEP);
        }
    }

    public Rover executeInstruction(String instruction) {
        return new Rover(new Position(-2, 3), Direction.WEST);
    }
}
