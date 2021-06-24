package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {

    @Test
    void should_init_position_and_direction() {
        Rover rover = new Rover();
        Position position = new Position(1, 1);
        rover.init(position, Direction.SOUTH);
        assertEquals(rover.getPosition().getX(), 1);
        assertEquals(rover.getPosition().getY(), 1);
        assertEquals(rover.getDirection(), Direction.SOUTH);
    }
}
