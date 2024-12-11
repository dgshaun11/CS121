package weekTwo;

import javax.swing.JOptionPane;

public class WordGame {
    public static void main(String[] args)
    {
        String name;
        int age;
        String city;
        String college;
        String major;
        String animal;
        String petsName;

        name = JOptionPane.showInputDialog("Enter your name: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        city = JOptionPane.showInputDialog("Enter your city: ");
        college = JOptionPane.showInputDialog("Enter your college: ");
        major = JOptionPane.showInputDialog("Enter your major: ");
        animal = JOptionPane.showInputDialog("Enter your type of pet: ");
        petsName = JOptionPane.showInputDialog("Enter your pet's name: ");

        String message = String.format("There once was a person named %s who lived in %s\n. At the age of %d, %s " +
                "went to college at %s\n. %s graduated with a major in %s. Then, %s adopted a(n) %s named %s\n. " +
                "They both lived happily ever after!",name, city, age, name, college, name, major,name, animal, petsName);

        JOptionPane.showMessageDialog(null, message);
    }
}
