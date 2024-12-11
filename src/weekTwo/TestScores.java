package weekTwo;

import javax.swing.*;

public class TestScores {
    public static void main(String[] args) {
        int testScore1 = Integer.parseInt(JOptionPane.showInputDialog("What is your first test score?"));
        int testScore2 = Integer.parseInt(JOptionPane.showInputDialog("What is your second test score?"));
        int testScore3 = Integer.parseInt(JOptionPane.showInputDialog("What is your third test score?"));

        int avgScore = (testScore1 + testScore2 + testScore3) / 3;

        String bruh = "Your average score is "+avgScore+".";
        JOptionPane.showMessageDialog(null, bruh);
        if (avgScore < 60) {
            String message1 = "You received a(n) F.";
            JOptionPane.showMessageDialog(null, message1);
        } else if (avgScore < 70) {
            String message2 = "You received a(n) D.";
            JOptionPane.showMessageDialog(null, message2);
        } else if (avgScore < 80) {
            String message3 = "You received a(n) C.";
            JOptionPane.showMessageDialog(null, message3);
        } else if (avgScore < 90) {
            String message4 = "You received a(n) B.";
            JOptionPane.showMessageDialog(null, message4);
        }
        else {
            String message5 = "You received a(n) A!";
            JOptionPane.showMessageDialog(null, message5);
        }

    }



    }

