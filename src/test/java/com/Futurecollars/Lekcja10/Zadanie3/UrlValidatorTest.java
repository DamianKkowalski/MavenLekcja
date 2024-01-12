package com.Futurecollars.Lekcja10.Zadanie3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UrlValidatorTest {
    @Test
    void validUrlShouldReturnTrue() {
        assertTrue(UrlValidator.validation("http://www.onet.pl"));
        assertTrue(UrlValidator.validation("https://mail.google.com"));
        assertTrue(UrlValidator.validation("http://wiadmosci.onet.pl"));
        assertTrue(UrlValidator.validation("http://onet.pl"));
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
