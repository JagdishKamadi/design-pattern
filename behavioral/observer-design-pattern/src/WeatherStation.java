import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    List<Observer> observers;
    private String weather;

    public WeatherStation() {
        observers = new ArrayList<>();
    }


    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(weather));
    }

    public void setWeather(String weather) {
        this.weather = weather;
        notifyObserver();
    }
}
