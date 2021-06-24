package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest {

    @Test
    void should_get_direction_enum_value_by_code() {
        assertEquals(Direction.getByCode("E"), Direction.EAST);
        assertEquals(Direction.getByCode("W"), Direction.WEST);
        assertEquals(Direction.getByCode("N"), Direction.NORTH);
        assertEquals(Direction.getByCode("S"), Direction.SOUTH);
    }
}
