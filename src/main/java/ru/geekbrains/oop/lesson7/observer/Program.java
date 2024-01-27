package ru.geekbrains.oop.lesson7.observer;

public class Program {
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student1 = new Student("Студент #1");
        Employee employee1 = new Employee("Сотрудник #1");
        Employee employee2 = new Employee("Сотрудник #2");

        publisher.registerObserver(student1);
        publisher.registerObserver(employee1);
        publisher.registerObserver(employee2);

        for (int i = 0; i < 3; i++){
            google.publishVacancy();
            yandex.publishVacancy();
            geekBrains.publishVacancy();
        }
    }
}
