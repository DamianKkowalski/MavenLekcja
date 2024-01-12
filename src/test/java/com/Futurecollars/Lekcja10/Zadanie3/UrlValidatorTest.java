package com.Futurecollars.Lekcja10.Zadanie3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UrlValidatorTest {
    @Test
    void validUrlShouldReturnTrue() {
        assertTrue(UrlValidator.validation("https://www.example.com"));
        assertTrue(UrlValidator.validation("http://example.com"));
        assertTrue(UrlValidator.validation("ftp://ftp.example.com/path/to/file"));
    }
    @Test
    void invalidUrlShouldReturnFalse() {
        assertFalse(UrlValidator.validation("invalid"));
        assertFalse(UrlValidator.validation("htttp.vikop"));
        assertFalse(UrlValidator.validation("ftp://.example.com.ttp"));
    }

    @Test
    void nullUrlShouldReturnFalse() {
        assertFalse(UrlValidator.validation(null));
    }

    @Test
    void emptyUrlShouldReturnFalse() {
        assertFalse(UrlValidator.validation(""));
    }

}
