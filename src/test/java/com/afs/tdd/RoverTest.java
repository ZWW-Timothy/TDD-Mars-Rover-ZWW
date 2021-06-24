package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {

    private final Rover rover = new Rover();

    @Test
    void should_init_position_and_direction() {
        rover.init(1, -1, "S");
        assertRoverInfo(1, -1, Direction.SOUTH, rover);
    }

    @Test
    void should_move_one_step_toward_south() {
        rover.init(0,0,"S");
        rover.moveForward();
        assertRoverInfo(0, 1, Direction.SOUTH, rover);
    }

    @Test
    void should_move_one_step_toward_north() {
        rover.init(0,0,"N");
        rover.moveForward();
        assertRoverInfo(0, -1, Direction.NORTH, rover);
    }

    @Test
    void should_move_one_step_toward_east() {
        rover.init(0,0,"E");
        rover.moveForward();
        assertRoverInfo(1, 0, Direction.EAST, rover);
    }

    @Test
    void should_move_one_step_toward_west() {
        rover.init(0,0,"W");
        rover.moveForward();
        assertRoverInfo(-1, 0, Direction.WEST, rover);
    }

    @Test
    void should_execute_instruction() {
        rover.init(0,0,"S");
        Rover roverExecutionResult = rover.executeInstruction("MMLMRMLLMRRMLRLM");
        assertRoverInfo(-2,3, Direction.WEST, roverExecutionResult);
    }

    private void assertRoverInfo(int x, int y, Direction direction, Rover currentRover) {
        assertEquals(x, currentRover.getPosition().getX());
        assertEquals(y, currentRover.getPosition().getY());
        assertEquals(direction, currentRover.getDirection());
    }
}
