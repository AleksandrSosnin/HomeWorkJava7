package ru.geekbrains.oop.lesson7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, int salary);
    void receiveVacancy(Vacancy vacancy); 
}
