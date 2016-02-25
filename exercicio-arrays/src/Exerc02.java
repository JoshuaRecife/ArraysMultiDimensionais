import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
//		2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
//			mesmo tipo e tamanho e com os elementos do vetor A multiplicados
//			por 2, ou seja: B[i] = A[i] * 2.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Informe o "+(i+1)+"º número inteiro do Vetor");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}

		System.out.print("VetorA: ");
		for (int temp : vetorA) {
			System.out.print(+temp + " ");
		}

		System.out.println();

		System.out.print("VetorB: ");
		for (int temp2 : vetorB) {
			System.out.print(+temp2 + " ");
		}
	}
}
