package weekThree;

import javax.swing.*;

public class SwitchStatements {
    public static void main(String[] args){
        String houseChoice = JOptionPane.showInputDialog("Enter a Hogwarts House (Gryffindor, Hufflepuff, Ravenclaw, Slytherin: ");
        switch (houseChoice) {
            case "Gryffindor":
                JOptionPane.showMessageDialog(null, "Your animal is the lion. Your house colors are red and gold. Your values are courage. chivalry, and determination. Minerva McGonagall is head of your house.");
                break;
            case "Hufflepuff":
                JOptionPane.showMessageDialog(null, "Your animal is a badger. Your house colors are yellow and black. Your values are hard work, dedication, patience, loyalty, and fair play. Pomona Sprout is head of your house.");
                break;
            case "Ravenclaw":
                JOptionPane.showMessageDialog(null,"Your animal is an eagle. Your house colors are blue and bronze. Your values are learning, wisdom, wit, and intellect. Filius Flitwick is head of your house.");
                break;
            case "Slytherin":
                JOptionPane.showMessageDialog(null, "Your animal is a snake. Your colors are green and silver. Your values are ambition, resourcefulness, determination, and cleverness. Severus Snape is head of your house.");
                break;
            default :
                JOptionPane.showMessageDialog(null, "Not a valid entry");
                break;
        }
    }
}
