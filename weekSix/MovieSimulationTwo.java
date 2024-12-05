package weekSix;
import java.util.Random;
public class MovieSimulationTwo {
    static final int rows = 5;
    static final int cols = 10;
    static Random rand = new Random();
    public static void main(String[] args){
        String[] movieNames = {"Avengers", "Iron-man", "Annabelle", "Nightmare Before Christmas"};
        String [] movieTypes = {"3d", "3d", "2d", "2d"};
        double [] moviePrices = {15.50, 14.25, 16.75, 12.10};
        int [][] movieAvailability = new int[rows][cols];

        displayMovieDetails(movieNames, movieTypes, moviePrices);
        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }
    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices){
        System.out.println("--------------------Movie Details-----------------");
        System.out.printf("%-20s %-20s %-20s", "Movie Name", "Movie Type", "Movie Price");
        System.out.println();
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println(movieNames[i] + "        " + movieTypes[i] + "         " + moviePrices[i]);
        }
    }
    public static void setSeatAvailability(int [][] movieAvailability){
        for (int i = 0; i < movieAvailability.length; i++){
            for (int j = 0; j < movieAvailability[0].length; j++){
                movieAvailability[i][j] = 0;
            }
        }
    }
    public static void randomizeAvailability(int [][] movieAvailability){
        for (int row = 0; row < movieAvailability.length; row++){
            for (int col = 0; col < movieAvailability[row].length; col++){
                if (Math.random() < .5){
                movieAvailability[row][col] = 1;
                }
                else {
                  movieAvailability[row][col] = 0;
                }
            }
        }
    }
public static void displaySeatAvailability(int [][] movieAvailability){
        System.out.println("----------INITIAL SEATS------------");
        System.out.println();
        System.out.println("Seating Availability: [1 = unavailable ; 0 = available]");
    for (int row = 0; row < movieAvailability.length; row++){
        for (int col = 0; col < movieAvailability[0].length; col++){
            System.out.print(movieAvailability[row][col] + " ");
        }
        System.out.println();
    }
    }
}
