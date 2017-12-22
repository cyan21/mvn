package org.ych;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestGreeting {

    @Test
    public void testEn() {
        assertEquals(Greeting.en(), "Hello");
    }

    @Test
    public void testFr() {
        assertEquals(Greeting.fr(), "Salut");
    }

    @Test
    public void testSp() {

        assertEquals(Greeting.sp(), "Hola");
    }
}
