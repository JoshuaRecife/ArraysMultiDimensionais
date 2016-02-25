import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
//		16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
//			que calcule e escreva: 
//		 a) A soma de elementos armazenados neste
//			vetor que são inferiores a 15; 
//		 b) A quantidade de elementos armazenados no vetor que são iguais a 15; e 
//		 c) A média dos	elementos armazenados no vetor que são superiores a 15.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma =0;
		int cont = 0;
		int cont2 = 0;
		int soma2 =0;
		float media = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o "+(i+1)+"° vetor inteiro");
			vetorA[i] = scan.nextInt();

			if (vetorA[i] < 15) {
				soma += vetorA[i];
			} else {

				if (vetorA[i] == 15) {
					cont++;
				} else {

					if (vetorA[i] > 15) {
						cont2++;
						soma2 += vetorA[i];
					}
				}
			}
		}
		
		media = (soma / cont2);
		
		System.out.println("A soma dos números inferiores a 15: "+soma);
		System.out.println("Quantidade de elementos iguais a 15: "+cont);
		System.out.println("A média dos elemnetos superiores a 15: "+media);
	}
}
