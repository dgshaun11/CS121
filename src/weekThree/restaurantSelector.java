package weekThree;

import javax.swing.*;

public class restaurantSelector {
    public static void main(String[] args) {
        boolean isVegetarian = false;
        boolean isVegan = false;
        boolean isGlutenFree = false;
        String joe = "Joe's Gourmet Burgers";
        String main = "Main Street Pizza Company";
        String corner = "Corner's Cafe";
        String mama = "Mama's Fine Italian";
        String chef = "The Chef's Kitchen";

        String vegetarian = JOptionPane.showInputDialog("Is anyone in your group a vegetarian?");
        if (vegetarian.equalsIgnoreCase("yes")) {
            isVegetarian = true;
        }
        String vegan = JOptionPane.showInputDialog("Is anyone in your group a vegan?");
        if (vegan.equalsIgnoreCase("yes")) {
            isVegan = true;
        }
        String glutenFree = JOptionPane.showInputDialog("Is anyone in your group gluten-free?");
        if (glutenFree.equalsIgnoreCase("yes")) {
            isGlutenFree = true;
        }
        JOptionPane.showMessageDialog(null, "Here are your restaurant choices:");

        if (!(isVegan) && !(isVegetarian) && !(isGlutenFree)) {
            String message1 = String.format("%s",joe);
            JOptionPane.showMessageDialog(null, message1);
        }
        if (!(isVegan) && !(isGlutenFree)) {
            String message2 = String.format("%s", mama);
            JOptionPane.showMessageDialog(null, message2);
        }
        if (!(isVegan))
            {
                String message3 = String.format("%s", main);
                JOptionPane.showMessageDialog(null, message3);
            }
        String message4 = String.format("%s, %s",corner, chef);
        JOptionPane.showMessageDialog(null, message4);
        }
        }
