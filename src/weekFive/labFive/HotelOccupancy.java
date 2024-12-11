package weekFive.labFive;
import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double occupied = 0;
        double rooms = 0;
        int roomsSum = 0;
        int occupiedSum = 0;
        int vacantSum = 0;
        System.out.println("How many floors does your hotel have?");
        int floors = sc.nextInt();

        for (int i =0; i < floors; i++) {
            System.out.printf("How many rooms are on the floor %d?",i+1);
            rooms = sc.nextDouble();
            roomsSum += rooms;
            System.out.println("How many of those rooms are occupied?");
            occupied = sc.nextDouble();
            occupiedSum += occupied;
            if (occupied > rooms) {
                System.out.println("Thats not possible");
            }
        }
        double occRate = occupied / rooms;
        System.out.println("Floors: "+ floors);
        System.out.println("Rooms: " + roomsSum);
        System.out.println("Occupied Rooms: "+ occupiedSum);
        System.out.println("Vacant rooms: " + (roomsSum - occupiedSum));
        System.out.println("Occupancy: "+ occRate);
        }
    }

