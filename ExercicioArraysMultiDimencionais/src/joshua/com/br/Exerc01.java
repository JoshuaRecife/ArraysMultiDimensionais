package joshua.com.br;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numEntrev;
		int qtdFilhos;
		
		System.out.println("Entre com o número de pessoas entrevistadas");
		numEntrev = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrev][];
		
		for(int i = 0; i < nomesFilhos.length; i++){
			System.out.println("Entre com a quantidade de filhos da "+(i+1)+"º pessoa.");
			qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j = 0; j < nomesFilhos[i].length; j++){
				
				System.out.println("Digite o nome do filho "+(j+1));
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for(int i = 0; i < nomesFilhos.length; i++){
			System.out.println();
			System.out.println("Pessoa "+(i+1) +" tem "+ nomesFilhos[i].length +" filhos.");
			
			for(int j = 0; j < nomesFilhos[i].length; j++){
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}
}
