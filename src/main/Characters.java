package main;

public class Characters {
    private String name;
    private int health;
    private int level;
    private boolean isAlive;

    public Characters(String name) {
        this.name = name;
        this.health = 1000;
        this.level = 1;
        this.isAlive = true;
    }


    public int getHealth() {
        return this.health;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void isAttackedBy(Characters enemy) {
        this.health -= 20;
    }


    public void isAttackedBy(Characters enemy, int damage) {
        if (damage >= this.health) {
            this.health = 0;
            isAlive = false;
        }
    }

}
