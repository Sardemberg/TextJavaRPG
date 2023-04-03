package dices;

import java.util.Random;

public class Row2 {
    private static Random dice = new Random();

    public static int sortear(){
        return dice.nextInt(2) + 1;
    }
}
