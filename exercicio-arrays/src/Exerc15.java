import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
//		15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
//			que defina o percentual de elementos pares e ímpares,
//			respectivamente, armazenados neste vetor.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int percPar = 0;
		int percImpar = 0;
		int par =0;
		int impar = 0;
		
		for(int i =0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 == 0){
				par ++;
			}else{
				impar ++;
			}
		}
		
		percPar = (par * 100)/vetorA.length;
		percImpar = (100 - percPar);
		
		System.out.print("vetorA: ");
		for(int vetores : vetorA){
			System.out.print(vetores+" ");
		}
		
		System.out.println();
		System.out.println("Percentual de números pares: "+percPar+"%");
		System.out.println("Percentual de números ímpares: "+percImpar+"%");
	}
}
