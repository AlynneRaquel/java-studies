package application;
import java.util.Scanner;

public class ProgramExercicioNegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos N�meros Voc� vai digitar? ");
		int x = sc.nextInt();
		double[] vect = new double[x];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextDouble();
		}

		System.out.println("N�meros Negativos: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}

			sc.close();

		}
	}
}
