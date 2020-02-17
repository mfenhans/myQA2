package lv.testname.tutorial;

import java.util.Random;

public class myRandomNumber {
    public static void main(String[] args) {
        Random random = new Random ();

        int sumRandomNumber = random.nextInt(100);
        int sumRandomNumber2 = random.nextInt(100);
        int sumRandomNumber3 = random.nextInt(100);

        System.out.println(sumRandomNumber);
        System.out.println(sumRandomNumber2);
        System.out.println(sumRandomNumber3);
    }
}
