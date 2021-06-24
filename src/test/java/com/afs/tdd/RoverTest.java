package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {

    private final Rover rover = new Rover();

    @Test
    void should_init_position_and_direction() {
        rover.init(1, -1, "S");
        assertRover(1, -1, Direction.SOUTH);
    }

    @Test
    void should_move_one_step_forward_when_get_instruction() {
        rover.init(0,0,"S");
        rover.moveForward();
        assertRover(0, 1, Direction.SOUTH);
    }

    private void assertRover(int x, int y, Direction direction) {
        assertEquals(x, rover.getPosition().getX());
        assertEquals(y, rover.getPosition().getY());
        assertEquals(Direction.SOUTH, direction);
    }
}
