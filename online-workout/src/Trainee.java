import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {
    private List<Observer> observers = new ArrayList<Observer>();
    private String exercise;

    public void setExercise(String exercise) {
        this.exercise = exercise;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setObservable(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getState() {
        return this.exercise;
    }
}
