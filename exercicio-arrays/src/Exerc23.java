import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
//		23. Números palíndromos são aqueles que escritos da direita para a
//			esquerda têm o mesmo valor quando escritos da esquerda para a
//			direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
//			programa que verifique se um dado vetor A de 10 elementos inteiros é
//			um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
//			último, se o segundo elemento do vetor é igual ao penúltimo e assim
//			por diante até verificar todos os elementos ou chegar a conclusão que
//			o vetor não é um palíndromo.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		boolean palindromo = true;
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"º número inteiro.");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
				System.out.println("Vetor A não é Palíndromo");
				for(int temp : vetorA){
					System.out.print(temp+ " ");
				}
				palindromo = false;
				break;
			}
		}
		if(palindromo){
			System.out.print("Vetor A é palindromo: ");
			for(int temp : vetorA){
				System.out.print(temp+ " ");
			}
		}
	}
}
