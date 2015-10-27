package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
//		5. Faça um Programa que converta metros para centímetros.
		
		Scanner scan = new Scanner(System.in);
		
		double num;
		double cent = 100;
				
		System.out.println("Digite um número para converter de metros para centímetros");
		num = scan.nextDouble();
		cent *= num;
		
		System.out.println("O resultado é: " +cent+"cm");
		

	}

}
