package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary);
        }
    }

    @Override
    public void sendVacancy(Vacancy vacancy) {
        for (Observer observer : observers) {
            observer.receiveVacancy(vacancy);
        }
    }
}
