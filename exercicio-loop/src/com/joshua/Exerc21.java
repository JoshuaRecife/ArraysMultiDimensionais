package com.joshua;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
//		21. Fa�a um programa que calcule o n�mero m�dio de alunos por turma.
//			Para isto, pe�a a quantidade de turmas e a quantidade de alunos para
//			cada turma. As turmas n�o podem ter mais de 40 alunos.
		
		Scanner scan = new Scanner(System.in);
		
		int qtdT, qtdA;
		boolean verdade = true;
		double media = 0;
		double soma = 0;
		
		System.out.println("Digite a quantidade de Turma");
		qtdT = scan.nextInt();
			
		for(int i = 1; i<=qtdT; i++){
			
			do{
				System.out.println("Digite a quantidade de Alunos da, " +i+"� Turma");
				qtdA = scan.nextInt();
					if(qtdA > 40){
						System.out.println("Quantidade inv�lida, passou de 40 alunos, tente novamente!");
						System.out.println("");
						verdade = false;
					}else{
						soma += qtdA;
						verdade = true;
					}
			}while(!verdade);
		}
		
		media = (soma/qtdT);
		
		System.out.println("A m�dia de cada turma � de '"+media+"', alunos");
	}
}
