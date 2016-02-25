import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
//		11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//			que defina e escreva a quantidade de elementos armazenados neste
//			vetor que são pares.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int cont = 0;
		for(int i= 0; i < vetorA.length; i++){
			
			System.out.println("Digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 == 0){
				cont += 1;
			}
		}
		System.out.print("vetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		System.out.println();
		System.out.println("Elementos Pares: "+cont);
	}
}
