import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
//		22. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
//			que verifique se "todos" os elementos do vetor A são pares. Se pelo
//			menos um elemento do vetor não for par o processo de repetição para
//			percorrer os elementos do vetor deve ser encerrado, como sugestão:
//			utilize uma variável do tipo flag para atingir este propósito.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro par.");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Vetores pares: ");

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.print(vetorA[i] + " ");
			} else {
				System.out.println();
				System.out.println("Número ímpar ("+vetorA[i]+") inserido na "+i +"º posição. Programa encerrado!");
				break;
			}
		}
	}
}
