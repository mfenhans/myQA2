package lesson4;

public class SignComparator {

    public String compare(int number) {
        if (number > 0) {
            return "Sign positive";
        }

        if (number < 0) {
            return "Sign Negative";
        }

        return "Number is 0";
    }
}
