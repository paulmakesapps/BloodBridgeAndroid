package Dice;

import java.util.Random;

/**
 * Created by Paul on 6/3/2017.
 */
public class Roll {

    public Roll(){

    }

    public int twoDSix(){
        Random r = new Random();
        return r.nextInt((12 - 2) + 1) + 2;
    }
}
