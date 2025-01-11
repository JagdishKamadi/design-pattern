
public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new TVDisplay());
        weatherStation.addObserver(new PhoneDisplay());

        // change temperature to sunny
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Hot");
    }
}