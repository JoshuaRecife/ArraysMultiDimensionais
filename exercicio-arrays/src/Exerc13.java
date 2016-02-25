import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
//		13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//			que determine a soma dos elementos armazenados neste vetor que
//			são múltiplos de 5.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i =0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 5 == 0){
				soma += vetorA[i];
			}
		}
		
		System.out.print("vetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		
		System.out.println();
		System.out.println("A soma dos multiplos de 5: "+soma);
	}
}
