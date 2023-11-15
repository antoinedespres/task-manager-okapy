package fr.okapy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    @AfterAll
    static void afterAll() {

    }

    @Test
    void itWorks() {
        int actual = 1;
        assertEquals(1, actual);
    }

    @Test
    void itDoesNotWork() {
        int actual = 0;
        assertEquals(1, actual);
    }
}