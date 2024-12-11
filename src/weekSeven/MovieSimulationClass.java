package weekSeven;

import java.util.Random;
import java.util.Scanner;

public class MovieSimulationClass {
    private final int ROW = 5;
    private final int COLUMN = 10;
    private String movieNames[] = {"Avengers", "Ted", "Family Guy Movie", "Deadpool 2"};
    private String movieTypes[] = {"3d","5d", "4d","1dd"};
    private double moviePrice[] ={15.25, 16.50,17.10,14.00};
    private int [][] movieAvailability = new int[ROW][COLUMN];

    private Scanner sc = new Scanner(System.in);

    //default constructor
    public MovieSimulationClass(){

    }

    public int selectMovie() {
        String selectedMovie;
// Infinite loop until the user enters a valid movie name
        while (true) {
            System.out.print("\nEnter the movie name: ");
            selectedMovie = sc.nextLine();
// Check if the entered movie name exists in the movieNames array
            for (int i = 0; i < this.movieNames.length; i++) {
                if (selectedMovie.equals(this.movieNames[i])) {
                    return i; // Return the index of the selected movie
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }

    public void displaySelectedMovie(String movieName, String movieType, double
            moviePrice) {
// Print formatted details of the selected movie
        System.out.printf("\n%s MOVIE SELECTION %s\n", "-".repeat(25),
                "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-23s %-20s $%.2f\n", movieName, movieType, moviePrice);
    }

    public void displayMovieDetails() {
// Print formatted list of movie details (name, type, and price)
        System.out.printf("\n%s MOVIE DETAILS %s\n", "-".repeat(25),
                "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        for (int i = 0; i < this.movieNames.length; i++) {
            System.out.printf("Movie %d: %-16s %-20s %.2f\n", i + 1, this.movieNames[i],
                    this.movieTypes[i], this.moviePrice[i]);
        }
    }

    public void randomizeAvailability() {
        Random random = new Random();
// Loop through each seat and randomly assign its availability (0 or 1)
        for (int i = 0; i < this.movieAvailability.length; i++) {
            for (int j = 0; j < this.movieAvailability[i].length; j++) {
                this.movieAvailability[i][j] = random.nextInt(2); //
                // Randomly assign availability (0 or 1)
            }
        }
    }

    public void displaySeatAvailability() {
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.printf("\n%s AVAILABLE SEATS %s\n", "-".repeat(25),
                "-".repeat(25));
        System.out.print("\nSeating Availability: [1 = unavailable, 0 = available] n\n ");
// displays column numbers
        for (int col = 1; col <= this.movieAvailability[0].length; col++) {
            System.out.printf(" %d", col);
        }
        System.out.printf("\n %s\n", "-".repeat(20));
// displays row labels and seat availability
        for (int i = 0; i < this.movieAvailability.length; i++) {
            System.out.printf("%c |", rowLabel[i]);
            for (int j = 0; j < this.movieAvailability[i].length; j++) {
                System.out.printf("%d ", this.movieAvailability[i][j]);
            }
            System.out.println();
        }
    }

    public void selectSeats() {
// ask the user how many tickets they'd like to purchase
        System.out.print("\nEnter the number of tickets you'd like to purchase: ");
        int tickets = Integer.parseInt(sc.nextLine());
// loop through each ticket and allow the user to pick a seat
        for (int t = 1; t <= tickets; t++) {
            while (true) {
                System.out.printf("Please pick an available seat (e.g., A2) for ticket #%d: ", t);
                String seat = sc.nextLine().toUpperCase();
// extract row and column index from seat input
                int rowIndex = seat.charAt(0) - 65; //
                // convert row character (e.g., 'A') to index
                int seatIndex = Integer.parseInt(seat.substring(1)) - 1; //
                //convert seat number to index
// check if the selected seat is available
                if (this.movieAvailability[rowIndex][seatIndex] == 0) {
                    this.movieAvailability[rowIndex][seatIndex] = 1; //
                    //marks the seat as booked
                    System.out.printf("\nYou have successfully booked seat %s\n",
                            seat);
                    break;
                } else {
                    System.out.printf("\nSorry, seat %s is already booked. Try again!\n", seat);
                }
            }
        }
        System.out.println("\nAll seats are booked! Enjoy your movie!!");
    }
    public void run(){
        displayMovieDetails();
        int index = selectMovie();
        displaySelectedMovie(movieNames[index],movieTypes[index],moviePrice[index]);
        randomizeAvailability();
        displaySeatAvailability();
        selectSeats();
    }


}
