package ru.geekbrains.oop.lesson7.observer;

public class Vacancy {
    private String companyName;
    private int salary;
    private JobType jobType;

    public Vacancy(String companyName, int salary, JobType jobType) {
        this.companyName = companyName;
        this.salary = salary;
        this.jobType = jobType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public JobType getJobType() {
        return jobType;
    }
}
