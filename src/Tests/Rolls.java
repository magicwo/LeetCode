package Tests;

import java.util.Random;

public class Rolls {

    public static void main(String[] args) {
        int t =Integer.parseInt(args[0]);
        int SIDES=6;
        int[] rolls=new int[SIDES+1];
        for (int i=1;i<=SIDES;i++){
            rolls[i]=i;
        }
        for (int i=0;i<t;i++){
            int result = (int) Math.random();
        }

    }
}
