import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
//		21. Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
//			0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); 
//			Pede-se	para implementar um programa que determine o percentual de
//			números 0's e 1's existentes no vetor A.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int percZero;
		int percUm;
		int zero = 0;
		int um = 0;
		for(int i = 0; i < vetorA.length; i++){
			vetorA[i] = (int) Math.round(Math.random() * 1);
			
			if(vetorA[i] == 0){
				zero++;
			}else{
				um++;
			}
		}
		
		percZero = (zero * 100)/vetorA.length;
		percUm = ( 100 - percZero);
		
		System.out.print("Vetor A: ");
		for(int temp : vetorA){
			System.out.print(temp+" ");
		}
		System.out.println();
		System.out.println("Percentagem de Zeros: "+percZero+"%");
		System.out.println("Percentagem de Uns: "+percUm+"%");
	}
}
