package Test;

import main.Characters;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class Test {
    private Characters characters;

    @org.junit.jupiter.api.Test
    public void testCharacterHealthStarts1000() {
        characters = new Characters("Frodo");
        assertEquals(1000, characters.getHealth());
    }

    @org.junit.jupiter.api.Test
    public void testCharacterLevelStartsAt1() {
        characters = new Characters("Sam");
        assertEquals(1, characters.getLevel());
    }

    @org.junit.jupiter.api.Test
    public void testNewCharacterIsAlive() {
        characters = new Characters("Sam");
        assertTrue(characters.isAlive());
    }


}
