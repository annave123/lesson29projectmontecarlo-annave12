package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner loopCounter = new Scanner(System.in);
        System.out.println("How many loop iterations would you like");
        int loops = loopCounter.nextInt();
        int cirCount = 0;
        int sqrCount = 0;

        MonteCarlo xRain = new MonteCarlo();

        double h = 0;
        double k = 0;


        for (int i = 0; i <= loops - 1; i++) {

            h = xRain.nextRainDrop_X;
            k = xRain.nextRainDrop_Y;


            if (Math.pow(h - 5, 2) + Math.pow(k - 3, 2) <= 4) {
                cirCount = cirCount + 1;
            } else {
                sqrCount = sqrCount + 1;
            }

        }
        System.out.println("The number of raindrops in the Square " + cirCount + " the number of raindrops in the Circle " + sqrCount);


    }
}
