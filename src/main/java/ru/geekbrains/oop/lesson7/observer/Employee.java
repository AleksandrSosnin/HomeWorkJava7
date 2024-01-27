package ru.geekbrains.oop.lesson7.observer;

public class Employee implements Observer {
    private String name;
    private int salary;

    public Employee(String name){
        this.name = name;
        salary = 0; // начальная заработная плата
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Сотрудник %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Сотрудник %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveVacancy(Vacancy vacancy) {
        System.out.printf("Сотрудник %s: Получена новая вакансия! (компания: %s; заработная плата: %d; тип: %s)\n",
                name, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getJobType());
    }
}