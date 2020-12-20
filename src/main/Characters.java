package main;

public class Characters {
    private String name;
    private int health;
    private int level;
    private boolean isAlive;
    private final int INITIAL_DAMAGE = 20;
    private final String MELEE = "melee";
    private final String RANGED = "ranged";
    private String type;
    private Position position;

    public Characters(String name) {
        this.name = name;
        this.health = 1000;
        this.level = 1;
        this.isAlive = true;
    }

    public Characters(String name, int health) {
        this.name = name;
        this.health = health;
        this.level = 1;
    }

    public Characters(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public Characters(String name, int health, int level, String typeAttack) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.type = typeAttack;
    }

    public Characters(String name, int health, int level, String typeAttack, Position location) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.type = typeAttack;
        this.position = location;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return this.health;
    }

    public int getLevel() {
        return this.level;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isAlive() {
        if (this.health == 0) {
            this.isAlive = false;
        } else {
            this.isAlive = true;
        }
        return this.isAlive;
    }

    private void meleeAttack(Characters enemy) {
        if (this.getPosition().getPositionBetweenTwoPoints(enemy.getPosition()) <= 2) {
           initialDamage(enemy);
        }
    }

    private void initialDamage(Characters enemy) {
        if (this.getLevel() >= 5 && this.getLevel() > enemy.getLevel()) {
            this.health -= INITIAL_DAMAGE/2;
        } else if (this.getLevel() <= 5 && this.getLevel() < enemy.getLevel()) {
            this.health -= ((INITIAL_DAMAGE/2) + INITIAL_DAMAGE);
        } else {
            this.health -= INITIAL_DAMAGE;
        }
    }

    private void rangeAttack(Characters enemy) {
        if (this.getPosition().getPositionBetweenTwoPoints(enemy.getPosition()) <= 20) {
            initialDamage(enemy);
        }
    }

    public void isAttackedBy(Characters enemy) {

        if (this.equals(enemy)) {
        } else {

            if (this.getType().equals(MELEE) && enemy.getType().equals(MELEE)) {
                meleeAttack(enemy);
            } else if (this.getType().equals(MELEE) && enemy.getType().equals(RANGED)) {
                rangeAttack(enemy);
            }

            if (this.health <= 0) {
                this.health = 0;
                isAlive = false;
            }

            if (INITIAL_DAMAGE >= this.health) {
                this.health = 0;
                isAlive = false;
            }
        }
    }

    public void isHealedBy(Characters siti) {
        if (this.health == 0) {
        } else if (this.health == 1000){
            this.health = 1000;
        } else {
            this.health += 20;
        }
    }


    public int getMaxRange() {
        if (this.getType().equals(MELEE)) {
            return 2;
        } else if (this.getType().equals(RANGED)) {
            return 20;
        }
        return 0;
    }
}
