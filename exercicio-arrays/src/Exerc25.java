import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
//		25. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
//			um vetor C de mesmo tipo e tamanho, obedecendo as seguintes	regras de formação: 
//			a) Ci deverá receber 1 quando Ai for maior que Bi;
//			b) Ci deverá receber 0 quando Ai for igual a Bi; 
//			c) Ci deverá receber -1	quando Ai for menor que Bi.
		
Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro do vetor A");
			vetorA[i] = scan.nextInt();
			
			System.out.println("Digite o "+(i+1)+"º número inteiro do vetor B");
			vetorB[i] = scan.nextInt();
			
			if(vetorA[i] > vetorB[i]){
				vetorC[i] = 1;
			}else{
				if(vetorA[i] == vetorB[i]){
					vetorC[i] = 0;
				}else{
					if(vetorA[i] < vetorB[i]){
						vetorC[i] = -1;
					}
				}
			}
		}
		
		System.out.print("Vetor A: ");
		for(int temp : vetorA){
			System.out.print(temp+" ");
		}
		
		System.out.println();
		System.out.print("Vetor B: ");
		for(int temp : vetorB){
			System.out.print(temp+" ");
		}
		
		System.out.println();
		System.out.print("Vetor C: ");
		for(int temp : vetorC){
			System.out.print(temp+" ");
		}
	}
}
