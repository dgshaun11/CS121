package weekSixteen;

import static java.lang.Character.valueOf;

public class Recursion {
    public void countDown(int num){
        if (num == 0){
            System.out.println("Blast Off!");
            return;
        }
        System.out.println(num + "...");
        countDown(num-1);
    }
    public void alphaBackwards(char letter){
        if (letter == 'a'){
            System.out.println(letter);
            return;
        }
        System.out.println(letter + " ");
        int ascii = (int) letter + -1;
        alphaBackwards((char) ascii);
    }
}
