import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {
//		23. N�meros pal�ndromos s�o aqueles que escritos da direita para a
//			esquerda t�m o mesmo valor quando escritos da esquerda para a
//			direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
//			programa que verifique se um dado vetor A de 10 elementos inteiros �
//			um pal�ndromo, ou seja, se o primeiro elemento do vetor e igual ao
//			�ltimo, se o segundo elemento do vetor � igual ao pen�ltimo e assim
//			por diante at� verificar todos os elementos ou chegar a conclus�o que
//			o vetor n�o � um pal�ndromo.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		boolean palindromo = true;
		
		for(int i = 0; i < vetorA.length; i++){
			System.out.println("Digite o "+(i+1)+"� n�mero inteiro.");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++){
			if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
				System.out.println("Vetor A n�o � Pal�ndromo");
				for(int temp : vetorA){
					System.out.print(temp+ " ");
				}
				palindromo = false;
				break;
			}
		}
		if(palindromo){
			System.out.print("Vetor A � palindromo: ");
			for(int temp : vetorA){
				System.out.print(temp+ " ");
			}
		}
	}
}
