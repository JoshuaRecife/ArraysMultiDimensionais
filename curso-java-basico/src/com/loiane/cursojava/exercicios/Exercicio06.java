package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
//		6. Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre
//		sua �rea. F�rmula para di�metro � D = 2r, na qual �D� representa o di�metro e 
//		�r� representa o raio. A mesma f�rmula em fun��o de r � r = D/2.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o 'raio' do 'circulo'.");
		float r2 = scan.nextFloat();

		double A = Math.PI * Math.pow(r2, 2);
		
		System.out.println("A �rea do circulo �: "+A);
		
		
		

	}

}
