/*
 * Copyright (c) 2023 THGEEK.COM. All rights reserved.
 */

package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link ExamRoom_855}
 *
 * @author Tao Hong
 * @version 1.0
 * @since 2023/12/30 11:13
 */
class ExamRoom_855Test {
    private ExamRoom_855 examRoom;

    @BeforeEach
    void setUp() {
        examRoom = new ExamRoom_855(10);
    }

    @Test
    void seatAndLeave() {
        int zero = examRoom.seat();
        assertEquals(0, zero);
        int nine = examRoom.seat();
        assertEquals(9, nine);
        int four = examRoom.seat();
        assertEquals(4, four);
        int two = examRoom.seat();
        assertEquals(2, two);

        examRoom.leave(4);

        int five = examRoom.seat();
        assertEquals(5, five);
    }
}