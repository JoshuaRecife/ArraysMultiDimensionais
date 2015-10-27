package com.joshua;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
//		14. Faça um programa que lê as duas notas parciais obtidas por um aluno
//		numa disciplina ao longo de um semestre, e calcule a sua média. A
//		atribuição de conceitos obedece à tabela abaixo:
//		 Média de Aproveitamento Conceito
//		 Entre 9.0 e 10.0 A
//		 Entre 7.5 e 9.0 B
//		 Entre 6.0 e 7.5 C
//		 Entre 4.0 e 6.0 D
//		 Entre 4.0 e zero E
		
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, media;
		String conceito = "";
		
		System.out.println("Digite a primeira nota");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media > 9 && media <= 10){
			conceito = "A";
		}else{
			if(media > 7.5 && media <= 9){
				conceito = "B";
			}else{
				if(media > 6 && media <= 7.5){
					conceito = "C";
				}else{
					if(media > 4 && media <= 6){
						conceito = "D";
					}else{
						if(media > 0 && media <= 4){
							conceito = "E";
						}
					}
				}
			}
		}
		
		System.out.println("Média de Aproveitamento Conceito");
		System.out.println("Sua média foi = "+media +", Conceito: "+conceito);
	}
}
