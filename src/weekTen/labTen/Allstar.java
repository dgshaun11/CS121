package weekTen.labTen;

public class Allstar extends Character implements Fighter{
    private int strength;
    public Allstar(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void attack() {
        System.out.println(name + " kicks an Imp! " + strength);
    }

    @Override
    public void defend() {
        System.out.println(name + " uses a dummy shield to block the attack.");
    }
}
