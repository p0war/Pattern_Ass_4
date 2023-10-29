import java.util.ArrayList;
import java.util.List;

public class Store implements Observable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void newProductArrival(String product) {
        String message = "Новый продукт поступил: " + product;
        notifyObservers(message);
    }
}
