package weekTen.labTen;

public class CharacterTest {
    public static void main(String[] args) {
// Creates characters to test encapsulation
        Allstar allstar = new Allstar("Phil", 100, 35);
        Sunflower sunflower = new Sunflower("Barbara", 80, 60);
        Peashooter peashooter = new Peashooter("Bobby", 90, 50);
// Tests setting and getting health values
        System.out.println("Testing Encapsulation and Health:");
        allstar.setHealth(90);
        System.out.println("\nAllstar: "+allstar.getName() + " Health: " +
                allstar.getHealth()); // Expected: 90
        sunflower.setHealth(85);
        System.out.println("\nSunflower: "+sunflower.getName() + " Health: " +
                sunflower.getHealth()); // Expected: 85
        peashooter.setHealth(-10); // Invalid health value
        System.out.println("\nPeashooter: "+peashooter.getName() + " Health: " +
                peashooter.getHealth()); // Expected: 0 (no negative health)
    }
}

