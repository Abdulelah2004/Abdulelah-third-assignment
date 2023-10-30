package temperaturePackage;

public class TemperatureConversion {

    private float fahrenheit, reamur;

    public void celciusToFahrenheit(float celsiusTemperature) {
        fahrenheit = (float) ((9.0 / 5.0 * celsiusTemperature) + 32);
    }

    public float celsiusToFahrenheit() {
        return fahrenheit;
    }

    public void celciusToReamur(float celsiusTemperature) {
        reamur = (float) (celsiusTemperature * (4.0 / 5.0));
    }

    public float celsiusToReamur() {
        return reamur;
    }
}
