package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainFileTest {

    @Test
    public void readyToRoll() {
        System.out.println("hell world");
        String s = new String("c");
        assertEquals(s,s);
    }
}