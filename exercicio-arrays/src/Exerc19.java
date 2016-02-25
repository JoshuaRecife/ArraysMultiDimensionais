import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
//		19. Ler as duas notas bimestrais para um conjunto de 10 alunos.
//			Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
//			tipo real. Escreva um programa que calcule a média aritmética simples
//			das notas informadas armazenando o resultado em um vetor “Result”
//			de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
//			de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
//			estará “aprovado”, caso contrário, a situação do aluno será
//			“reprovado”.
		
		Scanner scan = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] results = new double[notas1.length];
		
		for(int i = 0; i< notas1.length; i++){
			System.out.println("Digite a 1º nota do aluno "+(i+1));
			notas1[i] = scan.nextDouble();
			
			System.out.println("Digite a 2º nota do aluno "+(i+1));
			notas2[i] = scan.nextDouble();
			
			results[i] = (notas1[i] + notas2[i])/2; 
			
		}
		System.out.println("");
		for(int i = 0; i< results.length; i++){
			
			if(results[i] >= 7 ){
				System.out.println("Aluno "+(i+1)+": Aprovado, média: "+results[i]);
			}else{
				System.out.println("Aluno "+(i+1)+": Reprovado, média: "+results[i]);
			}
			System.out.println("");
		}
	}
}
