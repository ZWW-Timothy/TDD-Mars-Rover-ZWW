package com.afs.tdd;

public class Application {

    public static void main(String[] args) {
        Rover rover = new Rover();
        rover.init(1, -1, "E");
        Rover roverResult = rover.executeInstruction("MLMMRMMLLMRRML");
        System.out.println("(" + roverResult.getPosition().getX() + ", " + roverResult.getPosition().getY() + ")");
        System.out.println(rover.getDirection().toString());
    }
}
