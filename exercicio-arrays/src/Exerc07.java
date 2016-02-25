import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
//		7. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
//			um vetor C, onde cada elemento de C é a subtração dos respectivos
//			elementos em A e B, ou seja:
//			C[i] = A[i] – B[i].
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length;i++){
			System.out.println("Digite "+(i+1)+"º vetor A inteiro.");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorB.length;i++){
			System.out.println("Digite "+(i+1)+"º vetor B inteiro.");
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		
		
		System.out.print("VetorA: ");
		for(int vetores : vetorA){
			System.out.print(+vetores+" ");
		}
		
		System.out.println();
		
		System.out.print("VetorB: ");
		for(int vetores : vetorB){
			System.out.print(+vetores+" ");
		}
		
		System.out.println();
		
		System.out.print("VetorC: ");
		for(int vetores : vetorC){
			System.out.print(+vetores+" ");
		}

	}

}
