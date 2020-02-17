package lesson4;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest testRunner = new SignComparatorTest();
        testRunner.shouldReturnSignPositiveWhenNumber1();
        testRunner.shouldReturnSignNegativeWhenNumberNegative();
        testRunner.shouldReturnEqualToZeroWhenNumber0();
    }

    void shouldReturnSignPositiveWhenNumber1() {
        SignComparator victim = new SignComparator();
        int number = 1;
        String expectedResult = "Sign positive";

        String actualResult = victim.compare(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnSignPositive : SUCCESS");
        } else {
            System.out.println("shouldReturnSignPositive : FAILED");
        }
    }

      void shouldReturnSignNegativeWhenNumberNegative() {
        SignComparator victim = new SignComparator();
        int number = -1;
        String expectedResult = "Sign Negative";

        String actualResult = victim.compare(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnSignNegative : SUCCESS");
        } else {
            System.out.println("shouldReturnSignNegative : FAILED");
        }
    }

    void shouldReturnEqualToZeroWhenNumber0() {
        SignComparator victim = new SignComparator();
        int number = 0;
        String expectedResult = "Equal To Zero";

        String actualResult = victim.compare(number);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnEqualToZero : SUCCESS");
        } else {
            System.out.println("shouldReturnEqualToZero : FAILED");
        }
    }
}
