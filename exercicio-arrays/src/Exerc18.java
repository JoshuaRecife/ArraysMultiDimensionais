import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
//		18. Ler um vetor A com 10 elementos inteiros correspondentes as idades
//		de um grupo de pessoas. Escreva um programa que determine e
//		escreva a menor e a maior idade e suas respectivas posi��es.
	
	Scanner scan = new Scanner(System.in);
	
	int[] idades = new int[10];
	int menor = Integer.MAX_VALUE;
	int maior = Integer.MIN_VALUE;
	int cont = 0;
	int cont2 = 0;
	
	for(int i = 0; i < idades.length; i++){
		System.out.println("Digite a idade da "+(i+1)+"� pessoa");
		idades[i] = scan.nextInt();

		if(idades[i] > maior){
			maior = idades[i];
			cont = i;
		}
			if(idades[i] < menor){
				menor = idades[i];
				cont2 = i;
			}
	}
	System.out.println("A maior idade �: "+maior);
	System.out.println("Posi��o do vetor: "+cont);
	
	System.out.println("A menor idade �: "+menor);
	System.out.println("Posi��o do vetor: "+cont2);

	}
}
