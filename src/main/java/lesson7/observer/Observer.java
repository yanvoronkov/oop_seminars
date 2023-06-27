package lesson7.observer;

public interface Observer {
    VacancyType getVacancyType();
    int getMinSalary();
    void update(Vacancy vacancy);
    void reject(Vacancy vacancy);
}
