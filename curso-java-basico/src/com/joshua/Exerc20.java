package com.joshua;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
//		20. Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um
//			crime. As perguntas s�o:
//		. "Telefonou para a v�tima?"
//		a. "Esteve no local do crime?"
//		b. "Mora perto da v�tima?"
//		c. "Devia para a v�tima?"
//		d. "J� trabalhou com a v�tima?" O programa deve no final emitir
//			uma classifica��o sobre a participa��o da pessoa no crime. 
//		Se a pessoa responder positivamente a 2 quest�es ela deve ser
//			classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5
//			como "Assassino". Caso contr�rio, ele ser� classificado como
//			"Inocente".
		
		Scanner scan = new Scanner(System.in);
		
		int cont = 0;
		String resp1, resp2, resp3, resp4, resp5;
		
		System.out.println("Responda: Sim ou N�o");
		
		System.out.println("Telefonou para a v�tima?");
		resp1 = scan.nextLine();
		
		System.out.println("Esteve no local do crime?");
		resp2 = scan.nextLine();
		
		System.out.println("Mora perto da v�tima?");
		resp3 = scan.nextLine();
		
		System.out.println("Devia para a v�tima?");
		resp4 = scan.nextLine();
		
		System.out.println("J� trabalhou com a v�tima?");
		resp5 = scan.nextLine();
		
		if (resp1.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("sim")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("sim")) {
			cont++;
		}
			
		if (cont == 1) {
			System.out.println("Inocente");
		} else {
			if (cont == 2) {
				System.out.println("Suspeita");
			} else {
				if (cont == 3 || cont == 4) {
					System.out.println("C�mplice");
				} else {
					if (cont == 5) {
						System.out.println("Assassino");
					}
				}
			}
		}
	}
}
