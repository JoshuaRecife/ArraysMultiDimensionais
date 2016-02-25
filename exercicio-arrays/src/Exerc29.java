import java.util.Scanner;

public class Exerc29 {

	public static void main(String[] args) {
//		29. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
//			que nos vetor B e C serão armazenados os valores pares e ímpares de
//			A, respectivamente.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		int posB = 0;
		int posC = 0;
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro do vetor A");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			}else{
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}
		
		System.out.print("VetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		System.out.println();
		System.out.print("VetorB: ");
		for(int i = 0; i < posB; i++){
			System.out.print(vetorB[i]+" ");
		}
		System.out.println();
		System.out.print("VetorC: ");
		for(int i = 0; i < posC; i++){
			System.out.print(vetorC[i]+" ");
		}
	}
}
