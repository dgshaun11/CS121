package weekTwelve;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException{
        try{
            //instances
            FileWriter writer = new FileWriter("course.txt", true);
            PrintWriter printWriter = new PrintWriter(writer);
            //variables
            String name = JOptionPane.showInputDialog("Enter the user's name");
            String password = JOptionPane.showInputDialog("Enter the user's password");
            String character = JOptionPane.showInputDialog("Enter the user's character");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter the uesr's score"));
            double winningPercent = Double.parseDouble(JOptionPane.showInputDialog("Enter the user's winning percent"));

            printWriter.printf("%n%-20s %-20s %6d %23s %-20.2f", name, password, score, character, winningPercent);

            writer.close();
            printWriter.close();
        } catch(FileNotFoundException e){
            System.err.println("**** Your File wasn't found. ****");
        }
    }
}
