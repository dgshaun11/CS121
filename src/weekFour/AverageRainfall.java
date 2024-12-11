package weekFour;
import java.util.Scanner;
public class AverageRainfall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double totalRainfall = 0;
        int showRainfall = 0;
        System.out.println("Enter number of years");
        int numYears = sc.nextInt();
        double avgRainfall = 0;
        for (int i = 0;i<numYears; i++){
            for (int j = 0; j <12; j++){
                System.out.println("Enter inches of rainfall for year "+(i+1)+" month "+(j+1));
                double rainfall = sc.nextDouble();
                totalRainfall += rainfall;
                showRainfall += rainfall;
            }
        }
        avgRainfall = totalRainfall / (numYears*12);
        System.out.println("Number of months: "+(numYears *12));
        System.out.println("Total inches of rainfall: "+showRainfall);
        System.out.println("Average rainfall per month for "+numYears+" years: "+ avgRainfall);

    }
}
