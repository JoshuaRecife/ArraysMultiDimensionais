
import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
//		14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//			que defina e escreva a média aritmética simples dos elementos
//			ímpares armazenados neste vetor.
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int media = 0;
		int impar = 0;
		int soma = 0;
		
		for(int i =0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 != 0){
				impar ++;
				soma += vetorA[i];
			}
				
			media = soma/impar;
		}
		
		System.out.print("vetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		
		System.out.println();
		System.out.println("Soma dos ímpares: "+soma);
		System.out.println("A media dos ímpares: "+media);
	}
}
