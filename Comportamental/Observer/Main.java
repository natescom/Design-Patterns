public class Main {
    public static void main(String[] args) {
        WeatherData clima = new WeatherData();
        CurrentConditionsDisplay cDisplay = new CurrentConditionsDisplay(clima);
        CurrentConditionsDisplay cDisplay2 = new CurrentConditionsDisplay(clima);
        
        clima.measurementsChange(6, 0, 10);
        clima.measurementsChange(8, 3, 7);

    }
}
