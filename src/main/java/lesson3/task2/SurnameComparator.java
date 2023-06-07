package lesson3.task2;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return CharSequence.compare(o1.surname, o2.surname);

    }
}
