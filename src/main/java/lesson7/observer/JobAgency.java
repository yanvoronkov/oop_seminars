package lesson7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {
    private List<Observer> observers = new ArrayList<>();

    public void getObservers() {
        for (Observer observer : observers) {
            System.out.println(observer);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Vacancy vacancy) {
        List<Observer> toRemove = new ArrayList<>();
        for (Observer observer : observers) {
            if (observer.getVacancyType() == vacancy.getVacancyType() && observer.getMinSalary() <= vacancy.getMaxSalary()) {
                observer.update(vacancy);
                toRemove.add(observer);
            } else if (observer.getVacancyType() == vacancy.getVacancyType() && observer.getMinSalary() >= vacancy.getMaxSalary()){
                observer.reject(vacancy);
            }
        }
        observers.removeAll(toRemove);
    }
}
