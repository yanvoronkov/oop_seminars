package lesson7.observer;

import java.util.Random;

public class Master implements Observer {

    private String name;
    private VacancyType vacancyType;
    private int minSalary;

    public Master(String name, VacancyType vacancyType, int minSalary, JobAgency agency) {
        this.name = name;
        this.vacancyType = vacancyType;
        this.minSalary = minSalary;
    }

    @Override
    public String toString() {
        return "Новое резюме от Master {" +
                "Имя: " + name  +
                ", должность: " + vacancyType +
                ", ЗП " + minSalary +
                '}';
    }

    @Override
    public void update(Vacancy vacancy) {
        if (vacancy.getVacancyType().equals(vacancyType) && vacancy.getMaxSalary() >= minSalary) {
            System.out.println(name + " - мне нужна эта работа");
        } else {
            reject(vacancy);
        }
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
