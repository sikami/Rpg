package Test;

import main.Characters;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    @org.junit.jupiter.api.Test
    public void testCharacterHealthStarts1000() {
        Characters characters = new Characters("Frodo");
        assertEquals(1000, characters.getHealth());
    }

    @org.junit.jupiter.api.Test
    public void testCharacterLevelStartsAt1() {
        Characters characters = new Characters("Sam");
        assertEquals(1, characters.getLevel());
    }

    @org.junit.jupiter.api.Test
    public void testNewCharacterIsAlive() {
        Characters characters = new Characters("Sam");
        assertTrue(characters.isAlive());
    }

    @org.junit.jupiter.api.Test
    public void testCharacterDealsDamageToOtherCharacter() {
        Characters soto = new Characters("Soto");
        Characters bluto = new Characters("Bluto");
        soto.isAttackedBy(bluto);
        assertEquals(980, soto.getHealth());

    }

    @org.junit.jupiter.api.Test
    public void testCharacterDeadWhenAttackExceedsCurrentHealth() {
        Characters bluto = new Characters("Bluto");
        Characters soto = new Characters("Soto");
        soto.isAttackedBy(bluto, 2000);
        assertFalse(soto.isAlive());
    }

    @org.junit.jupiter.api.Test
    public void testCharacterCanHealCharacter() {
        Characters siti = new Characters("Siti");
        Characters soto = new Characters("Soto");
    }





}
