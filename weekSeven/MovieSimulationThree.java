package weekSeven;

import java.util.Random;
import java.util.Scanner;
public class MovieSimulationThree {
        static final int rows = 5;
        static final int cols = 10;
        static Random rand = new Random();
        static Scanner sc = new Scanner(System.in);
        private static int index = -1;
        private static boolean movieNotFound = true;
        private static String[] movieNames = {"Avengers", "Iron-man", "Annabelle", "Nightmare Before Christmas"};
        private static String [] movieTypes = {"3d", "3d", "2d", "2d"};
        private static double [] moviePrices = {15.50, 14.25, 16.75, 12.10};
        private static int [][] movieAvailability = new int[rows][cols];

        public static void main(String[] args){
            displayMovieDetails(movieNames, movieTypes, moviePrices);
            setSeatAvailability(movieAvailability);
            randomizeAvailability(movieAvailability);
            selectMovie();
            displaySelectedMovie(movieNames, movieTypes, moviePrices);
            randomizeAvailability(movieAvailability);
            displaySeatAvailability(movieAvailability);
        }

        public static void displaySelectedMovie(String [] movieNames, String [] movieTypes, double [] moviePrices){
            System.out.println("-".repeat(20)+ "MOVIE SELECTION" + "-".repeat(20));
            System.out.printf("%-20s %-20s %-20s","Movie Selected", "Movie Type", "Movie Price");
            System.out.println();
            System.out.println(movieNames[index] + " " +movieTypes[index] + " " + moviePrices[index]);
        }
        public static int selectMovie(){
            while (movieNotFound){
                System.out.println("Enter the movie you would like to select.");
                String movieChoice = sc.nextLine();
                for (int i = 0; i < movieNames.length; i++){
                    if (movieChoice.equals(movieNames[i])){
                        movieNotFound = false;
                        index = i;
                        return index;
                    }
                    else{
                        System.out.println("Movie not found. Try again.");
                        movieChoice = sc.nextLine();
                    }
                }
            }
            return index;
        }
        public static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices){
            System.out.println("-".repeat(20) + "Movie Details" +"-".repeat(20));
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
            System.out.println();
            System.out.println("Seating Availability: [1 = unavailable ; 0 = available]");
            int [] numberTop = {1,2,3,4,5,6,7,8,9,10};
            char[] letters = {'A','B','C','D','E'};
            for (int i = 0; i < numberTop.length;i++){
                System.out.print(numberTop[i] + " ");
            }
            System.out.println();
            System.out.println("-".repeat(40));
            for (int row = 0; row < movieAvailability.length; row++){
                System.out.printf("\n%c |",letters[row]);
                for (int col = 0; col < movieAvailability[0].length; col++){
                    System.out.print(movieAvailability[row][col] + " ");
                }
                System.out.print("1");
                System.out.println();
            }
        }
    }
