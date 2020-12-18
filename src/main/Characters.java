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
}
