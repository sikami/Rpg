package main;

public class Characters {
    private String name;
    private int health;
    private int level;
    private boolean isAlive;
    private final int INITIAL_DAMAGE = 20;

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


    public int getHealth() {
        return this.health;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean isAlive() {
        if (this.health == 0) {
            this.isAlive = false;
        } else {
            this.isAlive = true;
        }
        return this.isAlive;
    }

    public void isAttackedBy(Characters enemy) {
        if (this.equals(enemy)) {
        } else {
            if (this.getLevel() >= 5 && this.getLevel() > enemy.getLevel()) {
                this.health -= INITIAL_DAMAGE/2;
            } else if (this.getLevel() <= 5 && this.getLevel() < enemy.getLevel()) {
                this.health -= ((INITIAL_DAMAGE/2) + INITIAL_DAMAGE);
            } else {
                this.health -= INITIAL_DAMAGE;
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




}
