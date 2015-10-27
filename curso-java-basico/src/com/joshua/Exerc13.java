package com.joshua;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
//		13. Faça um Programa que leia um número e exiba o dia correspondente
//		da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
//		aparecer valor inválido.
		
		Scanner scan = new Scanner(System.in);

		String diaSemana;

		System.out.println("Digite um num. do dia da semana: 1 - Domingo, 2 - Segunda, etc.)");
		diaSemana = scan.next();

		if (diaSemana.length() > 1) {
			System.out.println("Você não digitou uma letra!!");
		} else {

			switch (diaSemana) {
			case "1":
				System.out.println("Domingo");
				break;
			case "2":
				System.out.println("Segunda");
				break;
			case "3":
				System.out.println("Terça");
				break;
			case "4":
				System.out.println("Quarta");
				break;
			case "5":
				System.out.println("Quinta");
				break;
			case "6":
				System.out.println("Sexta");
				break;
			case "7":
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Valor Inválido");

			}
		}
	}
}
