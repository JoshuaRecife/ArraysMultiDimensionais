import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
//		12. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//			que defina e escreva a soma de todos os elementos armazenados
//			neste vetor.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i= 0; i < vetorA.length; i++){
			
			System.out.println("Digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
			
		}	
		
		System.out.print("vetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		
		System.out.println();
		System.out.println("A soma dos vetores: "+soma);
	}
}
