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
    void should_move_one_step_toward_south() {
        rover.init(0,0,"S");
        rover.moveForward();
        assertRover(0, 1, Direction.SOUTH);
    }

    @Test
    void should_move_one_step_toward_north() {
        rover.init(0,0,"N");
        rover.moveForward();
        assertRover(0, -1, Direction.NORTH);
    }

    @Test
    void should_move_one_step_toward_east() {
        rover.init(0,0,"E");
        rover.moveForward();
        assertRover(1, 0, Direction.EAST);
    }

    @Test
    void should_move_one_step_toward_west() {
        rover.init(0,0,"W");
        rover.moveForward();
        assertRover(-1, 0, Direction.WEST);
    }

    private void assertRover(int x, int y, Direction direction) {
        assertEquals(x, rover.getPosition().getX());
        assertEquals(y, rover.getPosition().getY());
        assertEquals(direction, rover.getDirection());
    }
}
