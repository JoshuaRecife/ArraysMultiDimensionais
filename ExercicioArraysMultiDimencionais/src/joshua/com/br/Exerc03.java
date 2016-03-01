package joshua.com.br;

import java.util.Random;

public class Exerc03 {

	public static void main(String[] args) {
//		3. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
//			0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
//			qual é o maior e o menor valor da coluna 7.
		
		int [][] numAleatorios = new int[10][10];
		Random numR = new Random();
		int maiorL = 0;
		int menorL = 100;
		int maiorC = 0;
		int menorC = 100;
		
		for (int i = 0; i < numAleatorios.length; i++) {

			System.out.print("Linha: " + i + " - ");

			for (int j = 0; j < numAleatorios[i].length; j++) {

				numAleatorios[i][j] = numR.nextInt(9);
				System.out.print(numAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < numAleatorios[5].length; i++) {
			if (numAleatorios[5][i] > maiorL) {
				maiorL = numAleatorios[5][i];
			}
			if (numAleatorios[5][i] < menorL) {
				menorL = numAleatorios[5][i];
			}
		}
		
		for (int i = 0; i < numAleatorios.length; i++) {

			if (numAleatorios[i][7] > maiorC) {
				maiorC = numAleatorios[i][7];
			}
			if (numAleatorios[i][7] < menorC) {
				menorC = numAleatorios[i][7];
			}
		}
		System.out.println("Maior valor da Linha 5 = "+maiorL);
		System.out.println("Menor valor da Linha 5 = "+menorL);
		System.out.println("Maior valor da Coluna 7 = "+maiorC);
		System.out.println("Menor valor da Coluna 7 = "+menorC);
	}
}
