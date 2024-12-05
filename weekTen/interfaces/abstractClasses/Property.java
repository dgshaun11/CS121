package weekTen.interfaces.abstractClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Property {

    Scanner sc = new Scanner(System.in);
    protected String location;
    protected double price;
    protected int squareFootage;
    protected String username;
    protected String password;

    public Property(String location, double price, int squareFootage){
        this.location = location;
        this.price = price;
        this.squareFootage = squareFootage;
    }
    public Property() {

    }

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setLocation(String location){
        this.location = location;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setSquareFootage(int squareFootage){
        this.squareFootage = squareFootage;
    }
    public String getLocation(){
        return location;
    }
    public double getPrice(){
        return price;
    }
    public int getSquareFootage(){
        return squareFootage;
    }
    public double calcPayoutPerSqaureFootage() {
        return price/squareFootage;
    }
    public void login() {
        System.out.println("Please Enter Your Username.");
        String input = sc.nextLine();
        while (!input.equals(username)){
            System.out.println("Invalid username.");
            input = sc.nextLine();
        }
        System.out.println("Please Enter Your Password");
        input = sc.nextLine();
        while (!input.equals(password)){
            System.out.println("Invalid password.");
            input = sc.nextLine();
        }
        System.out.println("Welcome " + username);
    }

    public void signOut() {
        System.out.println("Signing out. Goodbye!");
    }

    public abstract void display();
}
