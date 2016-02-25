import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {
//		24. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
//			mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
//			a) Bi deverá receber 1 quando Ai for par; 
//			b) Bi deverá receber 0 quando Ai for ímpar.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i< vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro.");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 == 0){
				vetorB[i] = 1;
			}else{
				vetorB[i] = 0;
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
	}
}
