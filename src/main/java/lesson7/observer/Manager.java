package lesson7.observer;

import java.util.Random;

public class Manager implements Observer {
    private String name;
    private VacancyType vacancyType;
    private int minSalary;

    public Manager(String name, VacancyType vacancyType, int minSalary, JobAgency agency) {
        this.name = name;
        this.vacancyType = vacancyType;
        this.minSalary = minSalary;
    }

    @Override
    public String toString() {
        return "Новое резюме от Manager {" +
                "Имя: " + name  +
                ", должность: " + vacancyType +
                ", ЗП " + minSalary +
                '}';
    }

    @Override
    public void update(Vacancy vacancy) {
            System.out.println(name + " - мне нужна эта работа");
    }

    @Override
    public void reject(Vacancy vacancy) {
        System.out.println(name + " - Мне не подходит эта вакансия.");
    }

    @Override
    public VacancyType getVacancyType() {
        return vacancyType;
    }

    @Override
    public int getMinSalary() {
        return minSalary;
    }
}

