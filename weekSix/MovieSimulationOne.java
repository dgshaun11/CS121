package weekSix;
import java.util.Scanner;

public class MovieSimulationOne {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("How many movie details would you like?");
        final int movieDetails = sc.nextInt();
        sc.nextLine();

        String[] movieNames = new String [movieDetails];
        String[] movieTypes = new String [movieDetails];
        int [] movieAvailability = new int [movieDetails];
        double [] moviePrices = new double [movieDetails];

        for (int i = 0; i < movieDetails; i++){
            System.out.println("Enter the movie's name");
            movieNames[i] = sc.nextLine();
            System.out.println("Enter the type of the movie");
            movieTypes[i] = sc.nextLine();
            System.out.println("Enter the seats available");
            movieAvailability[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the price of tickets");
            moviePrices[i] = sc.nextDouble();
            sc.nextLine();
        }
        //this is calling a method'
        displayCharacterDetails(movieNames, movieTypes, movieAvailability, moviePrices);

    }
    static void displayCharacterDetails(String movieNames[], String movieTypes[], int movieAvailability[], double moviePrices[])
    {
        //i can make a string variable called header that uses string.format to format and make it look nice
        System.out.println("-------------------Movie Details--------------------");
        String header = String.format("%-20s %-20s %-20s %-20s", "Movie name", "Movie Type", "Available Seats", "Movie Price");
        System.out.println(header);
        for (int i = 0; i < movieNames.length; i++){
            System.out.println(movieNames[i] + movieTypes[i] + movieAvailability[i] + moviePrices[i] );
            String body = String.format("Movie %d: %-15s %-13s %-25d $%-24f",i+1, movieNames[i], movieTypes[i],movieAvailability[i], moviePrices[i]);
            System.out.print(body);
        }

    }
}
