package com.joshua;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
//		17. Fa�a um programa que calcule o fatorial de um n�mero inteiro
//		    fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120
		
		Scanner scan = new Scanner(System.in);
		
		int fat = 1, num;
		
		System.out.println("Digite um n�mero para o calculo do fatorial.");
		num = scan.nextInt();
		
		for(int i = 1;i <= num; i++){
			fat *= i;
		}
		System.out.println(fat);
	}
}
