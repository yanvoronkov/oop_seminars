package lesson7.observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency agency = new JobAgency();

        Company geekBrains = new Company("GeekBrains");
        Company google = new Company("Google");
        Company yandex = new Company("Yandex");

        Manager manager1 = new Manager("John Smith", VacancyType.JUNIOR_DEVELOPER, 60000, agency);
        Manager manager2 = new Manager("Mary Johnson", VacancyType.SENIOR_DEVELOPER, 120000, agency);
        Manager manager3 = new Manager("Bob Williams", VacancyType.PROJECT_MANAGER, 90000, agency);


        agency.addObserver(manager1);
        agency.addObserver(manager2);
        agency.addObserver(manager3);
        System.out.println("============================");
        agency.getObservers();
        System.out.println("============================");

        geekBrains.publishVacancy(agency, VacancyType.JUNIOR_DEVELOPER, 50000);
        google.publishVacancy(agency, VacancyType.SENIOR_DEVELOPER, 150000);
        yandex.publishVacancy(agency, VacancyType.PROJECT_MANAGER, 100000);
        System.out.println("============================");
        agency.getObservers();


    }

}
