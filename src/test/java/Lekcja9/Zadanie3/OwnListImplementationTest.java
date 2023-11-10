package Lekcja9.Zadanie3;

import com.Futurecollars.Lekcja9.Zadanie3.OwnListImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OwnListImplementationTest {




        @Test
        public void testAdd() {
            OwnListImplementation<String> ownList = new OwnListImplementation<>();
            assertTrue(ownList.add("One"));
            assertTrue(ownList.add("Two"));
            assertTrue(ownList.add("Three"));
        }

        @Test
        public void testGet() {
            OwnListImplementation<String> ownList = new OwnListImplementation<>();
            ownList.add("One");
            ownList.add("Two");
            assertEquals("One", ownList.get(0));
            assertEquals("Two", ownList.get(1));
        }

        @Test
        public void testRemove() {
            OwnListImplementation<String> ownList = new OwnListImplementation<>();
            ownList.add("One");
            ownList.add("Two");
            assertTrue(ownList.remove("One"));
            assertFalse(ownList.remove("Three"));
        }

        @Test
        public void testSize() {
            OwnListImplementation<String> ownList = new OwnListImplementation<>();
            ownList.add("One");
            ownList.add("Two");
            assertEquals(2, ownList.size());
        }
    }
