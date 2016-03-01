package joshua.com.br;

import java.util.Random;

public class Exerc02 {

	public static void main(String[] args) {
//		2. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 
//		   0-9. Após isso determine o maior número da matriz e a sua posição
//		   (linha, coluna).
		
		int[][] numAleatorios = new int[4][4];
		Random numRandom = new Random();
		
		int maior = 0;
		int linha = 0;
		int coluna = 0;
		
		System.out.println("Núm. aleatórios entre 0 e 9");
		
		for(int i = 0; i < numAleatorios.length; i++){
			
			for(int j = 0; j<numAleatorios[i].length; j++){
				
				numAleatorios[i][j] = numRandom.nextInt(9);
				
				System.out.print(numAleatorios[i][j]+" ");
				
				if(numAleatorios[i][j] > maior){
					maior = numAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println();
		}
		System.out.println("Maior número da matriz: "+maior);
		System.out.println("Linha "+linha+", coluna "+coluna+".");
	}
}
