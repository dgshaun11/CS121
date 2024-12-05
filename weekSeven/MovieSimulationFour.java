package weekSeven;
import java.util.Scanner;
import java.util.Random;
public class MovieSimulationFour {
    //static scanner instance to handle user input throughout the program
    static Scanner scanner = new Scanner(System.in);
    /**
     * main method - the entry point of the program.
     * sets up the movie details, seat availability, and allows the user to select
     a movie and seats.
     */
    public static void main(String[] args) {
// constants defining the number of rows and columns in the seating
        //arrangement
        final int ROWS = 5;
        final int COLUMNS = 10;
// array of available movies, their types (2D/3D), and their prices
        String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String[] movieTypes = {"3D", "2D", "3D", "2D"};
        double[] moviePrices = {15.00, 12.00, 14.00, 12.00};
// 2D array representing the seating availability for a movie theater
        int[][] movieAvailability = new int[ROWS][COLUMNS];
// displays the available movies and their details (name, type, price)
        displayMovieDetails(movieNames, movieTypes, moviePrices);
// lets the user select a movie by entering its name and getting the index
        //of the selected movie
        int index = selectMovie(movieNames);
// displays the details of the selected movie
        displaySelectedMovie(movieNames[index], movieTypes[index],
                moviePrices[index]);
// randomly generates seat availability (0 = available, 1 = unavailable)
        randomizeAvailability(movieAvailability);
// displays the seat availability to the user
        displaySeatAvailability(movieAvailability);
// allows the user to select seats based on availability
        selectSeats(movieAvailability);
// closes the scanner to prevent resource "leakage"
        scanner.close();
    }
    /**
     * This method allows the user to select a movie by entering its name.
     * It takes an array of movie names and prompts the user to enter a movie name.
     * If the name is valid, it returns the index of the selected movie.
     *
     * @param movieNames an array of available movie names.
     * @return The index of the selected movie.
     */
    static int selectMovie(String[] movieNames) {
        String selectedMovie;
// Infinite loop until the user enters a valid movie name
        while (true) {
            System.out.print("\nEnter the movie name: ");
            selectedMovie = scanner.nextLine();
// Check if the entered movie name exists in the movieNames array
            for (int i = 0; i < movieNames.length; i++) {
                if (selectedMovie.equals(movieNames[i])) {
                    return i; // Return the index of the selected movie
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }
    /**
     * displays the selected movie's details including the name, type, and price.
     * This method takes three parameters: movie name, type, and price.
     *
     * @param movieName The name of the selected movie.
     * @param movieType The type of the movie (2D/3D).
     * @param moviePrice The price of the movie.
     */
    static void displaySelectedMovie(String movieName, String movieType, double
            moviePrice) {
// Print formatted details of the selected movie
        System.out.printf("\n%s MOVIE SELECTION %s\n", "-".repeat(25),
                "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
                System.out.printf("%-23s %-20s $%.2f\n", movieName, movieType, moviePrice);
    }
    /**
     * displays all available movies along with their type and price
     * This method takes three parameters: an array of movie names, an array of
     movie types, and an array of movie prices.
     *
     * @param movieNames Array of available movie names
     * @param movieTypes Array of movie types (2D/3D)
     * @param moviePrices Array of movie prices
     */
    static void displayMovieDetails(String[] movieNames, String[] movieTypes,
                                    double[] moviePrices) {
// Print formatted list of movie details (name, type, and price)
        System.out.printf("\n%s MOVIE DETAILS %s\n", "-".repeat(25),
                "-".repeat(25));
        System.out.printf("%-20s %-20s %s\n", "Movie Name", "Movie Type", "Movie Price");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("Movie %d: %-16s %-20s %.2f\n", i + 1, movieNames[i],
                    movieTypes[i], moviePrices[i]);
        }
    }
    /**
     * randomizes the seat availability for the theater
     * This method takes one parameter, a 2D array representing the seating
     availability.
     * It populates the array with random values: 0 for available seats and 1 for
     unavailable seats.
     *
     * @param movieAvailability 2D array of seat availability (0 = available, 1 =
    unavailable).
     */
    static void randomizeAvailability(int[][] movieAvailability) {
        Random random = new Random();
// Loop through each seat and randomly assign its availability (0 or 1)
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = random.nextInt(2); //
               // Randomly assign availability (0 or 1)
            }
        }
    }
    /**
     * displays the seating availability for the movie theater
     * This method takes one parameter: a 2D array representing the seat
     availability
     *
     * @param movieAvailability 2D array of seat availability (0 = available, 1 =
    unavailable).
     */
    static void displaySeatAvailability(int[][] movieAvailability) {
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        System.out.printf("\n%s AVAILABLE SEATS %s\n", "-".repeat(25),
                "-".repeat(25));
        System.out.print("\nSeating Availability: [1 = unavailable, 0 = available] n\n ");
// displays column numbers
        for (int col = 1; col <= movieAvailability[0].length; col++) {
            System.out.printf(" %d", col);
        }
        System.out.printf("\n %s\n", "-".repeat(20));
// displays row labels and seat availability
        for (int i = 0; i < movieAvailability.length; i++) {
            System.out.printf("%c |", rowLabel[i]);
            for (int j = 0; j < movieAvailability[i].length; j++) {
                System.out.printf("%d ", movieAvailability[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * Allows the user to select seats for the movie by entering seat numbers
     * This method takes one parameter: a 2D array representing the seat
     availability
     * It prompts the user for the number of tickets and lets them pick available
     seats
     *
     * @param movieAvailability 2D array of seat availability (0 = available, 1 =
    unavailable).
     */
    static void selectSeats(int[][] movieAvailability) {
// ask the user how many tickets they'd like to purchase
        System.out.print("\nEnter the number of tickets you'd like to purchase: ");
        int tickets = Integer.parseInt(scanner.nextLine());
// loop through each ticket and allow the user to pick a seat
        for (int t = 1; t <= tickets; t++) {
            while (true) {
                System.out.printf("Please pick an available seat (e.g., A2) for ticket #%d: ", t);
                String seat = scanner.nextLine().toUpperCase();
// extract row and column index from seat input
                int rowIndex = seat.charAt(0) - 65; //
               // convert row character (e.g., 'A') to index
                int seatIndex = Integer.parseInt(seat.substring(1)) - 1; //
                //convert seat number to index
// check if the selected seat is available
                if (movieAvailability[rowIndex][seatIndex] == 0) {
                    movieAvailability[rowIndex][seatIndex] = 1; //
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
} // end class
