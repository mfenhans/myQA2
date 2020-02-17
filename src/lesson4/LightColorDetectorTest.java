package lesson4;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.shouldReturnInvisibleLightWavelength100();
        testRunner.shouldReturnVioletWhenWavelength380();
        testRunner.shouldReturnVioletWhenWavelength449();
        testRunner.shouldReturnBlueWhenWavelength494();
        testRunner.shouldReturnGreenWhenWavelength569();
        testRunner.shouldReturnYellowWhenWavelength589();
        testRunner.shouldReturnOrangeWhenWavelength619();
        testRunner.shouldReturnRedWhenWavelength750();
        testRunner.shouldReturnInvisibleLightWavelength1000();
}

    void shouldReturnInvisibleLightWavelength100() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 100;
        String expectedResult = "Invisible Light";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnInvisibleLightWavelength100 : SUCCESS");
        } else {
            System.out.println("shouldReturnInvisibleLightWavelength100 : FAILED");
        }
    }

    void shouldReturnVioletWhenWavelength380() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 380;
        String expectedResult = "Violet";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnVioletWhenWavelength380 : SUCCESS");
        } else {
            System.out.println("shouldReturnVioletWhenWavelength380 : FAILED");
        }
    }

    void shouldReturnVioletWhenWavelength449() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 449;
        String expectedResult = "Violet";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnVioletWhenWavelength449 : SUCCESS");
        } else {
            System.out.println("shouldReturnVioletWhenWavelength449 : FAILED");
        }
    }

    void shouldReturnBlueWhenWavelength494() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 494;
        String expectedResult = "Blue";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnBlueWhenWavelength494 : SUCCESS");
        } else {
            System.out.println("shouldReturnBlueWhenWavelength494 : FAILED");
        }
    }

    void shouldReturnGreenWhenWavelength569() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 569;
        String expectedResult = "Green";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnGreenWhenWavelength569 : SUCCESS");
        } else {
            System.out.println("shouldReturnGreenWhenWavelength569 : FAILED");
        }
    }

    void shouldReturnYellowWhenWavelength589() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 589;
        String expectedResult = "Yellow";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnYellowWhenWavelength589 : SUCCESS");
        } else {
            System.out.println("shouldReturnYellowWhenWavelength589 : FAILED");
        }
    }

    void shouldReturnOrangeWhenWavelength619() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 619;
        String expectedResult = "Orange";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnOrangeWhenWavelength619 : SUCCESS");
        } else {
            System.out.println("shouldReturnOrangeWhenWavelength619 : FAILED");
        }
    }

    void shouldReturnRedWhenWavelength750() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 750;
        String expectedResult = "Red";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnRedWhenWavelength750 : SUCCESS");
        } else {
            System.out.println("shouldReturnRedWhenWavelength750 : FAILED");
        }
    }

    void shouldReturnInvisibleLightWavelength1000() {
        LightColorDetector victim = new LightColorDetector();

        int wavelength = 1000;
        String expectedResult = "Invisible Light";

        String actualResult = victim.classify(wavelength);

        if (expectedResult.equals(actualResult)) {
            System.out.println("shouldReturnInvisibleLightWavelength1000 : SUCCESS");
        } else {
            System.out.println("shouldReturnInvisibleLightWavelength1000 : FAILED");
        }
    }

}
