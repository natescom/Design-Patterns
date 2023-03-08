import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData wData = (WeatherData) o;
        this.temperature = wData.getTemperature();
        this.humidity = wData.getHumidity();
        this.pressure = wData.getPressure();
        display();
    }

    public void display(){
        System.out.printf("DISPLAY: %-10d Current Condititons: %f°F degrees, %f humidity and pressure: %f\n",
        this.hashCode(),temperature,humidity,pressure);
    }
    
}