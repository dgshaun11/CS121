package weekTen.labTen;

public class Sunflower extends Character implements Fighter{
    private int magicPower;
    public Sunflower(String name, int health, int magicPower){
        super(name, health);
        this.magicPower = magicPower;
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots a sunflower seed! Magic Power: " + magicPower);
    }

    @Override
    public void defend() {
        System.out.println(name + " conjures a healing beam.");
    }
}
