package Lekcja9.Zadanie2;

import com.Futurecollars.Lekcja9.Zadanie2.QueueImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueImplementationTest {

        @Test
        void testAdd() {
            QueueImplementation ownQueue = new QueueImplementation();
            assertTrue(ownQueue.add(1));
            assertTrue(ownQueue.add(2));
            assertTrue(ownQueue.add(3));
        }

        @Test
        void testRemove() {
            QueueImplementation ownQueue = new QueueImplementation();
            ownQueue.add(1);
            ownQueue.add(2);
            ownQueue.add(3);

            assertEquals(1, ownQueue.remove());
            assertEquals(2, ownQueue.remove());
            assertEquals(3, ownQueue.remove());
        }

        @Test
        void testElement() {
            QueueImplementation ownQueue = new QueueImplementation();
            ownQueue.add(1);
            ownQueue.add(2);
            ownQueue.add(3);

            assertEquals(1, ownQueue.element());
            ownQueue.remove();
            assertEquals(2, ownQueue.element());
        }

        @Test
        void testEmptyQueue() {
            QueueImplementation ownQueue = new QueueImplementation();

            assertThrows(IllegalStateException.class, ownQueue::remove);
            assertThrows(IllegalStateException.class, ownQueue::element);
        }

        @Test
        void testNullElement() {
            QueueImplementation ownQueue = new QueueImplementation();

            assertThrows(NullPointerException.class, () -> ownQueue.add(null));
        }
}