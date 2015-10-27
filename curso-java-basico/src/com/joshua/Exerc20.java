package com.joshua;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
//		20. Faça um programa que faça 5 perguntas para uma pessoa sobre um
//			crime. As perguntas são:
//		. "Telefonou para a vítima?"
//		a. "Esteve no local do crime?"
//		b. "Mora perto da vítima?"
//		c. "Devia para a vítima?"
//		d. "Já trabalhou com a vítima?" O programa deve no final emitir
//			uma classificação sobre a participação da pessoa no crime. 
//		Se a pessoa responder positivamente a 2 questões ela deve ser
//			classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
//			como "Assassino". Caso contrário, ele será classificado como
//			"Inocente".
		
		Scanner scan = new Scanner(System.in);
		
		int cont = 0;
		String resp1, resp2, resp3, resp4, resp5;
		
		System.out.println("Responda: Sim ou Não");
		
		System.out.println("Telefonou para a vítima?");
		resp1 = scan.nextLine();
		
		System.out.println("Esteve no local do crime?");
		resp2 = scan.nextLine();
		
		System.out.println("Mora perto da vítima?");
		resp3 = scan.nextLine();
		
		System.out.println("Devia para a vítima?");
		resp4 = scan.nextLine();
		
		System.out.println("Já trabalhou com a vítima?");
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
					System.out.println("Cúmplice");
				} else {
					if (cont == 5) {
						System.out.println("Assassino");
					}
				}
			}
		}
	}
}
