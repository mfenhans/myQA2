package lv.testname.tutorial;

import java.util.Random;

public class sumRandom {
    public static void main(String[] args) {
        Random random = new Random ();

        int sumRandomNumber = random.nextInt(100);
        int sumRandomNumber2 = random.nextInt(100);
        int sumRandomNumber3 = random.nextInt(100);

        int sum = sumRandomNumber + sumRandomNumber2 + sumRandomNumber3;

        System.out.println(sum);
    }
}
