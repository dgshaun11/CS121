package weekTen.labTen;

public class Peashooter extends Character implements Fighter{
    private int agility;
    public Peashooter(String name, int health, int agility) {
        super(name, health);
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots a pea! Agility: " + agility);
    }

    @Override
    public void defend() {
        System.out.println(name + " dodges the attack swiftly.");
    }
}
