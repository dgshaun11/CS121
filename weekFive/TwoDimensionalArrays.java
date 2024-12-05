package weekFive;

public class TwoDimensionalArrays {
    public static void main(String[] args){
        int [][]array1 = {
                {0,1,2},
                {3,4,5},
                {6,7,8},
                {9,10,11}
        };
        for (int row = 0; row < array1.length; row++){
            for (int col = 0; col < array1[col].length; col++){
                System.out.println(array1[row][col]);
            }
        }
        double [][] array2 = new double[4][3];
        array2[0][0] = 0;
        array2[0][1] = 1;
        array2[0][2] = 2;
        array2[1][0] = 3;
        array2[1][1] = 4;
        array2[1][2] = 5;
        array2[2][0] = 6;
        array2[2][1] = 7;
        array2[2][2] = 8;
        array2[3][0] = 9;
        array2[3][1] = 10;
        array2[3][2] = 11;
        for (double [] row : array2){
            for (double column: row){
                System.out.println(column);
            }
        }
        String [][] stringArray = {
                {"Penguin, Dog, Cat"},
                {"Shark, Dolphin, Alligator"}
        };
        for (String[] row : stringArray){
            for (String column : row){
                System.out.println(column);
            }
        };

    }
}
