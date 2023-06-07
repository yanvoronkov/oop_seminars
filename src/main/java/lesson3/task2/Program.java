package lesson3.task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     *
     * @return
     */
//    static Employee generateEmployee(){
//        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
//        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
//        new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary, workingTimeInDay);
//        return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);
    static Employee[] generateEmployee(int size) {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            int salary = random.nextInt(20000, 80000);
            int workingTimeInDay = random.nextInt(1, 12);
            int age = random.nextInt(21, 23);
            switch (random.nextInt(2)) {
                case 0:
                    employees[i] = new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(3)], age, salary, workingTimeInDay);
                    break;
                case 1:
                    employees[i] = new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(3)], age, salary);
                    break;
            }
        }
        return employees;

    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     *
     * @param args
     */
    public static void main(String[] args) {

//        Employee[] employees = new Employee[10];
//        for (int i = 0; i < employees.length; i++)
//        {
//            employees[i] = generateEmployee(10);
//        }

        Employee[] employees  = generateEmployee(10);

//        Arrays.sort(employees, new SalaryComparator());
//        Arrays.sort(employees, new SurnameComparator());
//        Arrays.sort(employees);
        Arrays.sort(employees, new AgeSalaryComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}


