package lesson3.task2;

import java.util.Comparator;

public class AgeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = Integer.compare(o1.age, o2.age);
        if (res == 0) {
            return Double.compare(o1.calculateSalary(), o2.calculateSalary());
        }
        return res;

    }
}
