package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String lista : list) {
			System.out.println(lista);
		}

		System.out.println("________________________________________");
		list.remove(2);
		list.remove("Anna");
		
//		Predicado (Remove nome começando com M)
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String lista : list) {
			System.out.println(lista);
		}
		
		System.out.println("________________________________________");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		
//		Predicado com Stream
		System.out.println("________________________________________");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String lista : result) {
			System.out.println(lista);
			
		System.out.println("________________________________________");	
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		}
	}

}
