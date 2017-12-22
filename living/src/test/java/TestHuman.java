package org.ych;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestHuman {

    @Test
    public void testSays() {
	Human james = new Human();

        assertEquals(james.says(), "Hello");
    }

    @Test
    public void testCanTalk() {
	Human james = new Human();

        assertEquals(james.canTalk(), true);
    }
}
