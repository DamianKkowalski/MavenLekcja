package com.Futurecollars.Lekcja3.Zadanie5;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PithagorasThesisTest {

    @Test
    void isPithagorasThesisTrue() {

        assertTrue(PithagorasThesis.isPithagorasTheoremFullfilled(3, 4, 5));
        assertTrue(PithagorasThesis.isPithagorasTheoremFullfilled(5, 12, 13));
        assertTrue(PithagorasThesis.isPithagorasTheoremFullfilled(8, 15, 17));

    }

    @Test
    void isPithagorasThesisFalse() {

        assertFalse(PithagorasThesis.isPithagorasTheoremFullfilled(3, 4, 6));
        assertFalse(PithagorasThesis.isPithagorasTheoremFullfilled(5, 12, 15));
        assertFalse(PithagorasThesis.isPithagorasTheoremFullfilled(8, 15, 22));

    }

    @Test
    void isPithagorasThesisFalseWithNegativeNumber() {

        assertFalse(PithagorasThesis.isPithagorasTheoremFullfilled(-3, 4, 6));
        assertFalse(PithagorasThesis.isPithagorasTheoremFullfilled(5, -12, 15));
        assertFalse(PithagorasThesis.isPithagorasTheoremFullfilled(8, 15, -22));

    }

}
