import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
//		4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
//			mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
//			raiz quadrada do respectivo elemento de A, ou seja:
//			B[i] = sqrt(A[i]).
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"° vetor inteiro.");
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("VetorA: ");
		for(int temp : vetorA){
			System.out.print(temp+" ");
		}
		System.out.println(" ");
		
		System.out.print("VetorB: ");
		for(double temp : vetorB){
			System.out.print(df.format(temp)+" ");
		}
	}
}
