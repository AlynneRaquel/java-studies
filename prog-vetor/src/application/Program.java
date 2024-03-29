package application;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}		
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum +=  vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %2.f%n", avg);
		
		sc.close();
	}

}
