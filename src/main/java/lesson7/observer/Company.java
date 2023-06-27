package lesson7.observer;

public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public void publishVacancy(JobAgency agency, VacancyType vacancyType, int maxSalary) {
        System.out.println("Новая вакансия от " + name + " (" + vacancyType + ", " + maxSalary + " руб)");
        agency.notifyObservers(new Vacancy(this, vacancyType, maxSalary));
    }

    public String getName() {
        return name;
    }
}
