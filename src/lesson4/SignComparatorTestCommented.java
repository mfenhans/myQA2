package lesson4;

public class SignComparatorTestCommented {
    public static void main(String[] args) {
        SignComparatorTestCommented testRunner = new SignComparatorTestCommented();
        testRunner.shouldReturnSignPositiveWhenNumber1();
//        testRunner.shouldReturnSignNegativeWhenNumberNegative();
//        testRunner.shouldReturnEqualToZeroWhenNumber0();
    }

    void shouldReturnSignPositiveWhenNumber1() {
        SignComparator victim = new SignComparator();
        int number = 1;
        String expectedResult = "Sign positive";

        String actualResult = victim.compare(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnTadpoleWhenAge1 : SUCCESS");
        } else {
            System.out.println("shouldReturnTadpoleWhenAge1 : FAILED");
        }
    }

//    void shouldReturnSignPositiveWhenNumber1() {
//        SignComparator victim = new SignComparator();
//        int number = 1;
//        String expectedResult = "Sign Positive";
//
//        String actualResult = victim.compare(number);
//
//        if (expectedResult.equals(actualResult)) {
//            System.out.println("shouldReturnTadpoleWhenAge1 : SUCCESS");
//        } else {
//            System.out.println("shouldReturnTadpoleWhenAge1 : FAILED");
//        }
//    }
//
//    void shouldReturnSignPositiveWhenNumber1() {
//        SignComparator victim = new SignComparator();
//        int number = 1;
//        String expectedResult = "Sign Positive";
//
//        String actualResult = victim.compare(number);
//
//        if (expectedResult.equals(actualResult)) {
//            System.out.println("shouldReturnTadpoleWhenAge1 : SUCCESS");
//        } else {
//            System.out.println("shouldReturnTadpoleWhenAge1 : FAILED");
//        }
//    }
}
