package com.joshua;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
//		17. Faça um programa que calcule o fatorial de um número inteiro
//		    fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
		
		Scanner scan = new Scanner(System.in);
		
		int fat = 1, num;
		
		System.out.println("Digite um número para o calculo do fatorial.");
		num = scan.nextInt();
		
		for(int i = 1;i <= num; i++){
			fat *= i;
		}
		System.out.println(fat);
	}
}
