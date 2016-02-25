import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
//		27. Ler um vetor A com 10 elementos e construir um vetor B de mesmo
//			tipo e tamanho e com os mesmos elementos de A, sendo que estes
//			deverão estar invertidos, ou seja, o primeiro elemento de A passa a
//			ser o último de B, o segundo elemento de A passa a ser o penúltimo
//			de B e assim por diante.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
			
			vetorB[vetorA.length - i - 1] = vetorA[i];
		}
				
		System.out.print("VetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		
		System.out.println();
		System.out.print("VetorA: ");
		for(int vetores : vetorB){
			System.out.print(vetores+" ");
		}
	}
}
