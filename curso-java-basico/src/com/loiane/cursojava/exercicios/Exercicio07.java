package com.loiane.cursojava.exercicios;

import java.awt.geom.Area;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
//		7. Faça um Programa que calcule a área de um quadrado, em seguida
//		mostre o dobro desta área para o usuário.

//		Scanner scan = new Scanner(System.in);
//		
//		double lado, area, dobro;
//		
//		System.out.println("Informe um lado de um quadrado para o calculo da área do quadrado:");
//		lado = scan.nextDouble();
//		
//		area = lado*lado;
//		dobro = area*2;
//		System.out.println("A área informada foi: "+lado+", o dobro dessa área é: "+dobro);
		
		Scanner scan = new Scanner(System.in);
		  
		System.out.println("Informe o lado de um quadrado.");
	    float L = scan.nextFloat();
		
	    double Aq = Math.pow(L, 2);
		System.out.println("A área do quadrado é: "+Aq);
		System.out.println("O dobro da área do quadrado é: "+Aq*2);

	}

}
