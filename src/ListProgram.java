import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ListEmployee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++ ) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			ListEmployee emp = new ListEmployee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("This id does not exist");		
		} 
		else {
			System.out.println("Enter the percentage");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of Employee");
		for(ListEmployee emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	//Função 	
	public static Integer position(List<ListEmployee> listaFuncao, int id ) {
		
		for (int i = 0; i < listaFuncao.size(); i++) {
			if (listaFuncao.get(i).getId() == id){
				return i;
			}
		}
		return null;
	}

}
