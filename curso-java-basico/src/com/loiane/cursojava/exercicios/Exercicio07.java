package com.loiane.cursojava.exercicios;

import java.awt.geom.Area;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
//		7. Fa�a um Programa que calcule a �rea de um quadrado, em seguida
//		mostre o dobro desta �rea para o usu�rio.

//		Scanner scan = new Scanner(System.in);
//		
//		double lado, area, dobro;
//		
//		System.out.println("Informe um lado de um quadrado para o calculo da �rea do quadrado:");
//		lado = scan.nextDouble();
//		
//		area = lado*lado;
//		dobro = area*2;
//		System.out.println("A �rea informada foi: "+lado+", o dobro dessa �rea �: "+dobro);
		
		Scanner scan = new Scanner(System.in);
		  
		System.out.println("Informe o lado de um quadrado.");
	    float L = scan.nextFloat();
		
	    double Aq = Math.pow(L, 2);
		System.out.println("A �rea do quadrado �: "+Aq);
		System.out.println("O dobro da �rea do quadrado �: "+Aq*2);

	}

}
