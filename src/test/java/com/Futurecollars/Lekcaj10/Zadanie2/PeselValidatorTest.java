package com.Futurecollars.Lekcaj10.Zadanie2;

import com.Futurecollars.Lekcja10.Zadanie2.PeselValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PeselValidatorTest {
    @Test
    void validPeselShouldReturnTrue() {
        assertTrue(PeselValidator.checkPesel("12312312312"));
        assertTrue(PeselValidator.checkPesel("12312312314"));
    }
    @Test
    void invalidPeselShouldTeturnFalse() {
        assertFalse(PeselValidator.checkPesel("12345"));
        assertFalse(PeselValidator.checkPesel("robietest"));
        assertFalse(PeselValidator.checkPesel("znaklitera123k*"));

    }
    @Test
    void nullPeselShouldReturnFalse(){
        assertFalse(PeselValidator.checkPesel(null));
    }
    @Test
    void emptyPeselShouldReturnFalse(){
        assertFalse(PeselValidator.checkPesel(""));
    }
}
