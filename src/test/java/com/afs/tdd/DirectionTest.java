package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    void should_get_direction_enum_value_by_code() {
        assertEquals(Direction.EAST, Direction.getByCode("E"));
        assertEquals(Direction.WEST, Direction.getByCode("W"));
        assertEquals(Direction.NORTH, Direction.getByCode("N"));
        assertEquals(Direction.SOUTH, Direction.getByCode("S"));
    }

    @Test
    void should_get_correct_direction_when_turn_left() {
        assertEquals(Direction.SOUTH, Direction.turnLeft(Direction.EAST));
        assertEquals(Direction.NORTH, Direction.turnLeft(Direction.WEST));
        assertEquals(Direction.EAST, Direction.turnLeft(Direction.NORTH));
        assertEquals(Direction.WEST, Direction.turnLeft(Direction.SOUTH));
    }

    @Test
    void should_get_correct_direction_when_turn_right() {
        assertEquals(Direction.NORTH, Direction.turnRight(Direction.EAST));
        assertEquals(Direction.SOUTH, Direction.turnRight(Direction.WEST));
        assertEquals(Direction.WEST, Direction.turnRight(Direction.NORTH));
        assertEquals(Direction.EAST, Direction.turnRight(Direction.SOUTH));
    }
}
