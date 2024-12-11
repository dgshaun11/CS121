package weekTwo;

import java.util.Scanner;

public class ActivityOne {
    public static void main(String[] args){
        double a;
        double P;
        double r;
        int n;
        int t;
        int l;
        int answer;
        //declaring an object/creating an instance
        Scanner Sc = new Scanner(System.in);
        System.out.println("How much is your principal amount?");
        P = Double.parseDouble(Sc.nextLine());
        System.out.println("What is the annual interest rate?");
        r = Double.parseDouble(Sc.nextLine())/100;
        //scn.nextInt(); scn.nextLine(); scn.nextDouble()
        System.out.println("How many times per year is the interest compounded?");
        n= Integer.parseInt(Sc.nextLine());
        System.out.println("How long is the account sitting for interest?");
        t = Integer.parseInt(Sc.nextLine());
        a = P * Math.pow((1+ r/n), n*t);
        System.out.printf("After %d years you will have $ %.2f",t,a);
    }
}
