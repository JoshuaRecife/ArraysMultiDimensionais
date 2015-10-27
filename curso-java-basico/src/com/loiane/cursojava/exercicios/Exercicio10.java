package com.loiane.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
//		10. Faça um Programa que peça a temperatura em graus Celsius,
//		transforme e mostre em graus Farenheit. F = (C * 1.8) + 32;
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		
		double C, F;
		
		System.out.println("Informe a temperatura em Graus Celsius:");
		C = scan.nextDouble();
		
		F = (C * 1.8) + 32;
		
		System.out.println("A temperatura informada em Graus Celsius é: "+df.format(F));
		
		
		

	}

}
