package SemestrTwo.OOP_Inheritance.Hero;

public abstract class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.setUsername(username);
        this.setLevel(level);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract String action();
}