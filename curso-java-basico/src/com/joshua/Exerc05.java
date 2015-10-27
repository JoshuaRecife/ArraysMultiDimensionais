package com.joshua;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
//		5. Faça um programa para a leitura de duas notas parciais de um aluno.
//		O programa deve calcular a média alcançada por aluno e apresentar:
//		a. A mensagem "Aprovado", se a média alcançada for maior ou
//		igual a sete;
//		b. A mensagem "Reprovado", se a média for menor do que sete;
//		c. A mensagem "Aprovado com Distinção", se a média for igual a
//		dez.
		
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota parcial do aluno");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota parcial do aluno");
		nota2 = scan.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if(media >= 7){
			System.out.println("Aprovado, média: "+media);
		}else{
			if(media <= 7){
				System.out.println("Reprovado, média: "+media);
			}else{
				if(media == 10){
					System.out.println("Aprovado com Distinção, média: "+media);
				}else{
					
				}
			}
		}
	}
}
