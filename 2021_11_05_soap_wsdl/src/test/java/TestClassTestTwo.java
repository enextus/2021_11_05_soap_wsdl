import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestClassTestTwo {

    Date date;
    long time;
    Timestamp ts;

    @BeforeAll
    public static void init() {

    }

    @BeforeEach
    public void setUp() {
        date = new Date();
        time = date.getTime();
        System.out.println("Time in Milliseconds: " + time);

        ts = new Timestamp(time);
        System.out.println("Current Time Stamp: " + ts);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void mainOneA() {
        assertEquals("class java.util.Date", String.valueOf(date.getClass()));
    }

    @Test
    public void mainOneB() {
        assertTrue(true, String.valueOf(date != null));
    }

    @Test
    public void mainTwo() {
        assertFalse(false);
    }

    @Test
    public void mainThree() {
        assertEquals(1, 1);
    }
}