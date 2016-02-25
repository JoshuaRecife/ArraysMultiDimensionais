import java.util.Scanner;

public class Exerc33 {

	public static void main(String[] args) {
//		33. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
//			imprima cada elemento do vetor A e a relação de todos os pares de 0
//			até o respectivo elemento.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Analisando o número "+vetorA[i]);
			
			for(int j = 2; j< vetorA[i]; j++){
				if(j % 2 == 0){
					System.out.println(j +" é par");
				}
			}
			System.out.println();
		}
	}
}
