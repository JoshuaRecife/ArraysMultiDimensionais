import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
//		20. Implementar um programa que obtenha a cota��o do d�lar (U$) em
//			rela��o ao real (R$) e a seguir armazene em vetor A com 20
//			elementos as seguintes convers�es:
//		A[i] = cota��o do dolar * i, para todo i variando de 1 at� 20.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Digite a cota��o do dolar");
		cotacao = scan.nextDouble();
		
		System.out.println("Valor do Real em rela��o ao dolar");
		System.out.println("Cota��o do Dolar: "+cotacao);
		for(int i = 0; i < vetorA.length; i++){	
			vetorA[i] = cotacao * (i+1);
			System.out.println("Valor de U$ "+(i+1)+" = R$ "+df.format(vetorA[i]));
		}
	}
}
