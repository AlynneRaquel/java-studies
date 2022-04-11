import java.util.Scanner;

public class matrizExercises {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Main diagonal: ");
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<n; j++) {
				if (i==j) {
					System.out.print(matriz[i][j] + " " );	
				}	
			}
		}
		
		//melhor forma
		System.out.print("Main diagonal: ");
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int count = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<n; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.print("Negative numbers = " + count);
		
		sc.close();
		
		
	}

}
