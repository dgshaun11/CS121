package weekTwelve;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite{
    public static void main(String[] args) throws FileNotFoundException{

        File file1 = new File("course.txt");
        PrintWriter writer = new PrintWriter(file1);
        Scanner sc = new Scanner(file1);

        //Header
        // %s -> String
        writer.printf("%-20s %-20s %-17s %-20s %-20s", "<User Name>", "<Password>", "<Score>", "<Player>","<Winning Percentage>");
        //variables
        String name;
        String passWord;
        String playerCharacter;
        int score;
        double winningPercent;

        for(int i = 0; i < 2; i++){
            name = JOptionPane.showInputDialog(String.format("Enter user %d's username: ",(i+1)));
            passWord = JOptionPane.showInputDialog(String.format("Enter user %d's password: ", (i+1)));
            playerCharacter = JOptionPane.showInputDialog(String.format("Enter user %d's Character: ", (i+1)));
            score = Integer.parseInt(JOptionPane.showInputDialog(String.format("Enter user %d's score: ", (i+1))));
            winningPercent = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter user %d's winning percentage: ", (i+1))));

            writer.printf("%n%-20s %-20s %-19d %-23s %-20.2f", name, passWord, score, playerCharacter, winningPercent);
        }
        sc.close();
        writer.close(); //closes the writer object
    }

}
