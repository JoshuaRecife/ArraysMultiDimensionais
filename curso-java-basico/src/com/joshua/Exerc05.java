package com.joshua;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
//		5. Fa�a um programa para a leitura de duas notas parciais de um aluno.
//		O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
//		a. A mensagem "Aprovado", se a m�dia alcan�ada for maior ou
//		igual a sete;
//		b. A mensagem "Reprovado", se a m�dia for menor do que sete;
//		c. A mensagem "Aprovado com Distin��o", se a m�dia for igual a
//		dez.
		
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota parcial do aluno");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota parcial do aluno");
		nota2 = scan.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if(media >= 7){
			System.out.println("Aprovado, m�dia: "+media);
		}else{
			if(media <= 7){
				System.out.println("Reprovado, m�dia: "+media);
			}else{
				if(media == 10){
					System.out.println("Aprovado com Distin��o, m�dia: "+media);
				}else{
					
				}
			}
		}
	}
}
