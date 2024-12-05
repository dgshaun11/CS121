package weekTen.labTen;

public abstract class Character {
    protected String name;
    public static final int MAX_HEALTH=100;
    protected int health;

    public Character(String name, int health){
        if(health <=MAX_HEALTH) {
            this.health = health;
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        if (health >0) {
            return health;
        }
        else {
            return 0;
        }
    }
    public void setHealth(int health){
        this.health = health;
    }
    public boolean isAlive() {
        if (health <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public abstract void attack();
}
