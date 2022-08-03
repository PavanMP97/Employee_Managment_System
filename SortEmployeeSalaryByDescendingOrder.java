package edbms;

import java.util.Comparator;

public class SortEmployeeSalaryByDescendingOrder implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getSalary().compareTo(o1.getSalary());
	}

}
