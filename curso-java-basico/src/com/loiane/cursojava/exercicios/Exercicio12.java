package com.loiane.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
//		12. Tendo como dados de entrada a altura de uma pessoa, construa um
//		algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//		(72.7*altura) - 58
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		
		double altura, pesoIdeal;
		
		System.out.println("Digite sua altura");
		altura = scan.nextDouble();
		
		pesoIdeal = (72.7*altura) - 58;
		
		System.out.println("Seu peso ideal é: "+df.format(pesoIdeal)+" Kg");
		
		

	}

}
