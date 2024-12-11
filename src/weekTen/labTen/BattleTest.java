package weekTen.labTen;

public class BattleTest {
    public static void main(String[] args) {
        Allstar allstar = new Allstar("Thor", 100, 30);
        Sunflower sunflower = new Sunflower("Gandalf", 80, 50);
        System.out.println("Battle Start!");
        while ( allstar.isAlive() &&  sunflower.isAlive()) {
            allstar.attack();
            (sunflower).setHealth(sunflower.getHealth() - 10);
            if (!sunflower.isAlive()) {
                System.out.println("\nMage: "+(sunflower.getName() + " has been defeated!"));
                break;
            }
            sunflower.attack();
            allstar.setHealth(allstar.getHealth() - 15);
            if (!allstar.isAlive()) {
                System.out.println("\nWarrior: "+(allstar.getName() + " has been defeated!"));
                break;
            }
        }
// Prints the winner
        if ( allstar.isAlive()) {
            System.out.println("\nWarrior: "+(allstar.getName() + " wins the battle!"));
        } else {
            System.out.println("\nMage: "+(allstar.getName() + " wins the battle!"));
        }
    }
}

