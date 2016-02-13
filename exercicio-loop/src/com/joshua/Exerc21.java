package com.joshua;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
//		21. Faça um programa que calcule o número médio de alunos por turma.
//			Para isto, peça a quantidade de turmas e a quantidade de alunos para
//			cada turma. As turmas não podem ter mais de 40 alunos.
		
		Scanner scan = new Scanner(System.in);
		
		int qtdT, qtdA;
		boolean verdade = true;
		double media = 0;
		double soma = 0;
		
		System.out.println("Digite a quantidade de Turma");
		qtdT = scan.nextInt();
			
		for(int i = 1; i<=qtdT; i++){
			
			do{
				System.out.println("Digite a quantidade de Alunos da, " +i+"º Turma");
				qtdA = scan.nextInt();
					if(qtdA > 40){
						System.out.println("Quantidade inválida, passou de 40 alunos, tente novamente!");
						System.out.println("");
						verdade = false;
					}else{
						soma += qtdA;
						verdade = true;
					}
			}while(!verdade);
		}
		
		media = (soma/qtdT);
		
		System.out.println("A média de cada turma é de '"+media+"', alunos");
	}
}
