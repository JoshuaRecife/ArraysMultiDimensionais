package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
//		6. Faça um Programa que peça o raio de um círculo, calcule e mostre
//		sua área. Fórmula para diâmetro é D = 2r, na qual “D” representa o diâmetro e 
//		“r” representa o raio. A mesma fórmula em função de r é r = D/2.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o 'raio' do 'circulo'.");
		float r2 = scan.nextFloat();

		double A = Math.PI * Math.pow(r2, 2);
		
		System.out.println("A área do circulo é: "+A);
		
		
		

	}

}
