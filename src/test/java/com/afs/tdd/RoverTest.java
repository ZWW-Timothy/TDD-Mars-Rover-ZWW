package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {

    @Test
    void should_init_position_and_direction() {
        Rover rover = new Rover();
        rover.init(1, -1, "S");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(-1, rover.getPosition().getY());
        assertEquals(Direction.SOUTH, rover.getDirection());
    }

    @Test
    void should_move_one_step_forward_when_get_instruction() {
        Rover rover = new Rover();
        rover.init(0,0,"S");
        rover.moveForward();
        assertEquals(0, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
        assertEquals(Direction.SOUTH, rover.getDirection());
    }
}
