package temperaturePackage;

public class TemperatureConversion2 extends TemperatureConversion {
    private float reamur;

    public void fahrenheitToReamur(float fahrenheitTemperature) {
        reamur = (float) ((fahrenheitTemperature - 32) * 4 / 9);
    }

    public float getReamurTemperature() {
        return reamur;
    }
}
