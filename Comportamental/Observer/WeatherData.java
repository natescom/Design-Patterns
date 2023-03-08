import java.util.Observable;

public class WeatherData extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChange(float temp, float hum, float pres){
        temperature = temp;
        humidity = hum;
        pressure = pres;
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}