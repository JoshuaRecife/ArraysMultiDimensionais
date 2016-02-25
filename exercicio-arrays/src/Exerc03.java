import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
//		3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
//			mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
//			ser o quadrado do respectivo elemento de A, ou seja:
//			B[i] = A[i] * A[I].
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			
			System.out.println("Digite o "+(i+1)+"º número inteiro do vetor.");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
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
