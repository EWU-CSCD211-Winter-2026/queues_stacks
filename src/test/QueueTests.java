
package test;

import queue.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTests {

    @Test
    public void testQueue() {
        // Arrange
        Queue q = new Queue(4);
        q.enqueue(11);

        // Act
        // Assert
        String expected = " 0 1 2 3\n 0 0 0 0";
        String actual = q.toString();

        assertEquals(expected, actual);

    }

}
