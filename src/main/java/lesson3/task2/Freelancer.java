package lesson3.task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    int workingTimeInDay;

    public Freelancer(String name, String surname, int age, double salary, int workingTimeInDay) {
        super(name, surname, age, salary);
        this.workingTimeInDay = workingTimeInDay;
    }

    @Override
    public double calculateSalary() {
        return (salary/168)*workingTimeInDay*20;
        //почасовая ставка фрилансера (месячная ставка / на 168 часов) * количество отработанных часов в день * на число рабочих дней (20)
    }

    @Override
    public String toString() {
        return String.format("%s %s  | Возраст: %d | Фрилансер | Отработано часов: %d | Часовая ставка, руб: %.2f | Итоговая заработная плата, руб: %.2f",
                surname, name, age, workingTimeInDay*20, salary/168, calculateSalary());
    }
}
