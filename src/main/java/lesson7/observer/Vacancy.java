package lesson7.observer;

public class Vacancy {
    private Company company;
    private VacancyType vacancyType;
    private int maxSalary;

    public Vacancy(Company company, VacancyType vacancyType, int maxSalary) {
        this.company = company;
        this.vacancyType = vacancyType;
        this.maxSalary = maxSalary;
    }

    public Company getCompany() {
        return company;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public int getMaxSalary() {
        return maxSalary;
    }
}
