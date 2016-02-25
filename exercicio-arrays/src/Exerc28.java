import java.util.Scanner;

public class Exerc28 {

	public static void main(String[] args) {
//		28. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
//			sendo este a junção dos dois outros vetores. Os primeiros 10
//			elementos de C deverão receber os elementos de A e os últimos
//			elementos C deverão receber os elementos de B. Desta forma, C
//			deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro do vetor A");
			vetorA[i] = scan.nextInt();
			
			System.out.println("Digite o "+(i+1)+"º número inteiro do vetor B");
			vetorB[i] = scan.nextInt();
			
			vetorC[i] = vetorA[i];
			vetorC[vetorA.length + i] = vetorB[i];
		}
		System.out.print("VetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		System.out.println();
		System.out.print("VetorB: ");
		for(int vetores : vetorB){
			System.out.print(vetores+" ");
		}
		System.out.println();
		System.out.print("VetorC: ");
		for(int vetores : vetorC){
			System.out.print(vetores+" ");
		}
	}
}
