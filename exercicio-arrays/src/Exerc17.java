import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
//		17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
//			de um grupo de pessoas. Escreva um programa que determine e
//			escreva a quantidade de pessoas que possuem idade superior a 35
//			anos.
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int cont = 0;
		
		for(int i = 0; i < idades.length; i++){
			System.out.println("Digite a idade da "+(i+1)+"º pessoa");
			idades[i] = scan.nextInt();
			
			if(idades[i] > 35){
				cont++;
			}
		}
		System.out.println("Existem "+cont+" pessoas com mais de 35 anos.");
	}
}
