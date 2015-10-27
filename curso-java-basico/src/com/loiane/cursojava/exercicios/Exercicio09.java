package com.loiane.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
//		9. Faça um Programa que peça a temperatura em graus Farenheit,
//		transforme e mostre a temperatura em graus Celsius.
//		oC = (5 * (F-32) / 9).
		
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		
		float f, c;
		
		System.out.println("Informe a temperatura em Farenheit:");
		f = scan.nextFloat();
		
		c = (5 * (f-32) / 9);
		
		System.out.println("A temperatura de: "+f+"Fº "+"é de "+df.format(c)+"Cº "+"\"em graus celsius\"");
		
		

	}

}
