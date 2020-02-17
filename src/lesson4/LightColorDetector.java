package lesson4;

public class LightColorDetector {

    public String classify(int wavelength) {
        if (wavelength < 380) {
            return "Invisible Light";
        }
        if (wavelength <= 449) {
            return "Violet";
        }
        if (wavelength <= 494) {
            return "Blue";
        }
        if (wavelength <= 569) {
            return "Green";
        }
        if (wavelength <= 589) {
            return "Yellow";
        }
        if (wavelength <= 619) {
            return "Orange";
        }
        if (wavelength <= 750) {
            return "Red";
        }
        return "Invisible Light";
    }

}
