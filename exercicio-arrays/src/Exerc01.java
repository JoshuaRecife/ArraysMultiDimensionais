import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
//		1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
//			mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
//			seja, B[i] = A[i].
		
//		int[] vetorA = new int[5];
//		int[] vetorB = new int[vetorA.length];
//		vetorA[0] = 1;
//		vetorA[1] = 2;
//		vetorA[2] = 3;
//		vetorA[3] = 4;
//		vetorA[4] = 5;
//		
//		for(int i = 0; i < vetorA.length; i++){
//			vetorB[i]= vetorA[i];
//			System.out.println(vetorB[i]);
//		}
		
//		ou
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o vetor da posição " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		System.out.print("VetorA: ");
		for(int temp : vetorA){
			System.out.print(temp+" ");
		}
		System.out.println();
		
		System.out.print("VetorB: ");
		for(int temp1 : vetorB){
			System.out.print(temp1+" ");
		}
	}
}
