package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

//		4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, num4;
		
		double soma = 0;
		double media;
		
		System.out.println("Digite a Primeira nota: ");
		num1 = scan.nextDouble();
		soma += num1;
		
		System.out.println("Digite a Segunda nota: ");
		num2 = scan.nextDouble();
		soma += num2;

		System.out.println("Digite a Terceira nota: ");
		num3 = scan.nextDouble();
		soma += num3;
		
		System.out.println("Digite a Quarta nota: ");
		num4 = scan.nextDouble();
		soma += num4;
		
		
		media = soma/4;
//	    media = (num1 + num2 + num3 + num4)/4;
		System.out.println("A media desse aluno foi de: "+media);
		
		

	}

}
