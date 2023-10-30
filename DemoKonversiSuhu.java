package temperatureConversion;

import temperaturePackage.TemperatureConversion2;
import temperaturePackage.TemperatureConversion;

public class TemperatureConversionDemo {

    public static void main(String[] args) {
        TemperatureConversion temperature1 = new TemperatureConversion();
        TemperatureConversion2 temperature2 = new TemperatureConversion2();

        temperature1.celsiusToFahrenheit(100);
        temperature1.celsiusToReamur(100);
        temperature2.fahrenheitToReamur(100);

        System.out.println("Result " + temperature1.getCelsiusToFahrenheit());
        System.out.println("Result " + temperature1.getCelsiusToReamur());
        System.out.println("Result " + temperature2.getFahrenheitToReamur());
    }
}
