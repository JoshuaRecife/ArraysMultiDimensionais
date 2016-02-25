import java.util.Scanner;

public class Exerc34 {

	public static void main(String[] args) {
//		34. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
//			imprima cada elemento do vetor A e a relação de todos os divisores do
//			respectivo elemento.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Analisando o número "+vetorA[i]);
			
			for(int j = 1; j<= vetorA[i]; j++){
				if(vetorA[i] % j == 0){
					System.out.println(j +" é divisor");
				}
			}
			System.out.println();
		}
	}
}
