package application;
import java.util.Scanner;

import entities.Pessoa;


public class ProgramExercicioAltura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas Pessoas? ");
		int x = sc.nextInt();
		Pessoa[] vect = new Pessoa[x];
		

		for (int i=0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome da Pessoa: ");
			String nome = sc.nextLine();
			System.out.print("Digite a idade da Pessoa: ");
			int idade = sc.nextInt();
			System.out.print("Digite a altura da Pessoa: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		double sumAltura = 0.0;
		for (int i=0; i < vect.length; i++) {
			sumAltura += vect[i].getAltura();
		}
		
		double averageAltura = sumAltura / vect.length;
		System.out.println("Altura Média: " + averageAltura);
		
		for (int i=0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println("Menores de 16 anos: ");
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
