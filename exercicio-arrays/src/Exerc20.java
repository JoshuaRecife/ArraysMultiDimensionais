import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
//		20. Implementar um programa que obtenha a cotação do dólar (U$) em
//			relação ao real (R$) e a seguir armazene em vetor A com 20
//			elementos as seguintes conversões:
//		A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Digite a cotação do dolar");
		cotacao = scan.nextDouble();
		
		System.out.println("Valor do Real em relação ao dolar");
		System.out.println("Cotação do Dolar: "+cotacao);
		for(int i = 0; i < vetorA.length; i++){	
			vetorA[i] = cotacao * (i+1);
			System.out.println("Valor de U$ "+(i+1)+" = R$ "+df.format(vetorA[i]));
		}
	}
}
