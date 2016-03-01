package joshua.com.br;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
//		4. Capture do teclado valores para preenchimento de uma matriz M
//			3x3. Após a captura imprima a matriz criada e encontre a
//			quantidade de números pares, a quantidade de números ímpares.
		
		Scanner scan = new Scanner(System.in);
		int[][] vetorA = new int[3][3];
		int contPar = 0;
		int contImpar = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorA[i].length; j++) {

				System.out.println("Digite o número da Linha " + i + " da Coluna " + j);
				vetorA[i][j] = scan.nextInt();

				if (vetorA[i][j] % 2 == 0) {
					contPar++;
				} else {
					contImpar++;
				}
			}
		}

		for(int i =0; i < vetorA.length; i++){
			for(int j =0; j < vetorA[i].length; j++){
				System.out.print(vetorA[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Qtd de números pares: "+contPar);
		System.out.println("Qtd de números ímpares: "+contImpar);
	}
}
