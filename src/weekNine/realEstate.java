package weekNine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class realEstate {
    private static Scanner scn = new Scanner(System.in);
    private double price;
    private String propertyID;
    private int reserveNum;
    private int memberID;
    private String propType;
    private String location;
    private static ArrayList<String> properties = new ArrayList<>(Arrays.asList("P12345", "M45123", "F60123", "C85201", "H55538"));
    public realEstate(int memberID, int reserveNum) {
        this.memberID = memberID;
        this.reserveNum = reserveNum;
    }

    public realEstate(String propType, String location, int reserveNum) {
        this.propType = propType;
        this.location = location;
        this.reserveNum = reserveNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setPropertyID(String propertyID) {
        propertyID = propertyID;
    }

    public void setReserveNum(int reserveNum) {
        this.reserveNum = reserveNum;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setPropType(String propType) {
        this.propType = propType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getReserveNum() {
        return reserveNum;
    }

    public double getPrice() {
        return price;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getPropType() {
        return propType;
    }

    public String getLocation() {
        return location;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public int incrementReserve() {
        return reserveNum + 1;
    }

    public void placeReserve(double money) {
        if (money > price) {
            System.out.println("You are now the owner of " + getPropertyID());
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    public void placeReserve(String location) {
        System.out.println("You are now placing a reserve in the " + getLocation() + "area.");
    }

    public void startUp(boolean memberID) {
        if (memberID == false) {
            System.out.println("Thank You for Using Turney's Real Estate Portal! \n" +
                    "Property ID: " + getPropertyID() + "\n Location: " + getLocation() + "\n Type: "
                    + getPropType() + "\n Price: " + getPrice() + "\n Reservation Number: "
                    + getReserveNum());
        } else {
            System.out.println("Thank You for Using Turney's Real Estate Portal, Premium User \n" +
                    "Member ID: " + getMemberID() + "\n Property ID: " + getPropertyID() + "\n Reservation Number: "
                    + getReserveNum());
        }

    }

    public ArrayList<String> getProperty() {
        return properties;
    }

    public static void searchProperties() {
        System.out.println("Go through our large amount of options.");
        for (int i = 0; i < properties.size(); i++) {
            System.out.println(i + " " + properties.get(i) + " ");
        }
        System.out.println("Please pick a property by selecting its number.");
        int choice = scn.nextInt();
        String propertyIDChoice = properties.get(choice);
        setPropertyID(propertyIDChoice);
        properties.remove(propertyIDChoice);
    }
}
