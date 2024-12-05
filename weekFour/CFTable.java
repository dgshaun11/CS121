package weekFour;

public class CFTable {
    public static void main(String[] args){
        double c = 0;
        double f = 32;
        for (c= 0; c <= 20; c++){
            if (c!=0) {
                f = (9.0/5.0)*c+32.0;
                System.out.println(c+" " +f);
            }
            else {
                System.out.println(c+ " "+ f);
            }
        }
    }
}
