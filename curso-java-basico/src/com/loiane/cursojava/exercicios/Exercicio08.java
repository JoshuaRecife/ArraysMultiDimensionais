package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
//		8. Fa�a um Programa que pergunte quanto voc� ganha por hora e o
//		n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
//		sal�rio no referido m�s.
		
		
		Scanner scan = new Scanner(System.in);
		
		float salH, horaM;
		 
		System.out.println("Digite quanto voc� ganha por hora.");
		salH = scan.nextFloat();
		
		System.out.println("Digite quantas horas voc� trabalha em um m�s.");
		horaM = scan.nextInt();
		
		float salM = salH*horaM;
		
		System.out.println("Seu sal�rio mensal � de: "+salM);
		
		

	}

}
