package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {

    @Test
    void should_init_position_and_direction() {
        Rover rover = new Rover();
        rover.init(1, 1, "S");
        assertEquals(rover.getXPosition(), 1);
        assertEquals(rover.getYPosition(), 1);
        assertEquals(rover.getDirection(), "S");
    }
}
