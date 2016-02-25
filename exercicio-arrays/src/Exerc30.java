import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {
//		30. Ler um vetor A com 20 elementos. Separar os elementos pares e
//			�mpares de A utilizando apenas um vetor extra B. Sugest�o: no in�cio
//			do vetor B armazene os elementos pares de A e nas posi��es
//			restantes do vetor B armazene os elementos de A que s�o �mpares.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int posB = 0;
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"� n�mero inteiro do vetor A");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] % 2 != 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		
		System.out.print("VetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		System.out.println();
		System.out.print("VetorB: ");
		for(int i = 0; i < vetorA.length; i++){
			System.out.print(vetorB[i]+" ");
		}
	}
}
