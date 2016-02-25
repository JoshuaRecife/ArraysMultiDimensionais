import java.util.Scanner;

public class Exerc31 {

	public static void main(String[] args) {
//		31. Criar um vetor A com 5 elementos inteiros. Escreva um programa que
//			imprima a tabuada de cada um dos elementos do vetor A.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Tabuada de: "+vetorA[i]);
			
			for(int j = 1; j <= 10; j++){
				System.out.println(vetorA[i]+" x "+j+" = "+(vetorA[i] * j)); 
			}
			System.out.println();
		}
		
//		ou

//		int posA = 0;
//		do{
//			System.out.println("Tabuada de: "+vetorA[posA]); 
//			for(int i = 1; i<= 10; i++){
//				System.out.println(vetorA[posA]+" x "+i+" = "+(vetorA[posA] * i));
//			}
//				posA++;
//				System.out.println();
//		}while(posA < vetorA.length);
	}
}
