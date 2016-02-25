import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
//		5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
//			mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
//			ser o respectivo elemento de A multiplicado por sua posição (ou
//			índice), ou seja:
//			B[i] = A[i] * i.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º vetor inteiro.");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.print("VetorA: ");
		
		for(int temp : vetorA){
			System.out.print(temp+" ");
		}
		
		System.out.println();
		
		System.out.print("VetorB: ");
		for(int temp : vetorB){
			System.out.print(temp+" ");
		}
	}
}
