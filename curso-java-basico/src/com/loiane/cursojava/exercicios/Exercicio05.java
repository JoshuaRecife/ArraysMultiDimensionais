package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
//		5. Fa�a um Programa que converta metros para cent�metros.
		
		Scanner scan = new Scanner(System.in);
		
		double num;
		double cent = 100;
				
		System.out.println("Digite um n�mero para converter de metros para cent�metros");
		num = scan.nextDouble();
		cent *= num;
		
		System.out.println("O resultado �: " +cent+"cm");
		

	}

}
