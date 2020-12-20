package Test;

import main.Characters;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    //iteration one
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
        Characters sam = new Characters("Sam");
        assertTrue(sam.isAlive());
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
        Characters soto = new Characters("Soto", 15);
        soto.isAttackedBy(bluto);
        assertFalse(soto.isAlive());
    }

    @org.junit.jupiter.api.Test
    public void testCharacterCanHealCharacter() {
        Characters siti = new Characters("Siti");
        Characters soto = new Characters("Soto", 10);
        soto.isHealedBy(siti);
        assertEquals(30, soto.getHealth());
    }


    @org.junit.jupiter.api.Test
    public void testDeadCharacterCannotBeHealed() {
        Characters bluto = new Characters("Bluto", 0);
        Characters siti = new Characters("Siti");
        bluto.isHealedBy(siti);
        assertEquals(0, bluto.getHealth());
    }

    @org.junit.jupiter.api.Test
    public void testHealingCannotRaiseHealthAbove1000() {
        Characters jono = new Characters("Jono");
        Characters mimin = new Characters("Mimin");
        jono.isHealedBy(mimin);
        assertEquals(1000, jono.getHealth());
    }

    //iteration two
    @org.junit.jupiter.api.Test
    public void testCharacterCannotSelfDamage() {
        Characters obiwan = new Characters("Obi Wan Kenobi", 100);
        obiwan.isAttackedBy(obiwan);
        assertEquals(100, obiwan.getHealth());
    }

    @org.junit.jupiter.api.Test
    public void testCharacterCanHealSelf() {
        Characters soto = new Characters("Soto", 20);
        soto.isHealedBy(soto);
        assertEquals(40, soto.getHealth());
    }

    @org.junit.jupiter.api.Test
    public void testAttackByLowerLevelEnemy() {
        Characters bluto = new Characters("Bluto", 200, 5);
        Characters soto = new Characters("Soto", 300, 2);
        bluto.isAttackedBy(soto);
        assertEquals(190, bluto.getHealth());

    }

    @org.junit.jupiter.api.Test
    public void testAttackByHigherLevelEnemy() {
        Characters bluto = new Characters("Bluto", 200, 4);
        Characters soto = new Characters("Soto", 150, 7);
        bluto.isAttackedBy(soto);
        assertEquals(170, bluto.getHealth());
    }



}
