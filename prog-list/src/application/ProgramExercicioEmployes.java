package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import entities.Employee;

public class ProgramExercicioEmployes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be registered? ");
		Integer x = sc.nextInt();

		List<Employee> list = new ArrayList<>();
		for (int i = 0; i < x; i++) {

			System.out.println("ID: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}

		System.out.println("Enter the employee ID that have salary increase: ");
		Integer idSalary = sc.nextInt();

		Employee result = list.stream().filter(y -> y.getId() == idSalary).findFirst().orElse(null);

		if (result == null) {
			System.out.println("This ID does not exist");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			result.increaseSalary(percentage);
		}


		for (Employee listEmployee : list) {
			System.out.println("List of employees: " + listEmployee);
		}

		sc.close();
	}

}
