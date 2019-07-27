package basicLearingJava;

import java.util.*;

public class EmployeeSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Sebastian", 35000);
		staff[1] = new Employee("Lewis", 50000000);
		staff[2] = new Employee("Leclerc", 6000);

		Arrays.sort(staff);

		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
	}

}
