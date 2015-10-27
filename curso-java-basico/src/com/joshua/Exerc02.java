package com.joshua;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
//		2. Faça um Programa que peça um valor e mostre na tela se o valor é
//		positivo ou negativo.
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número positivo ou negativo");
		num = scan.nextInt();
		
		if (num < 0){
			System.out.println("Número Negativo!");
		}else{
			System.out.println("Número Positivo!!");
		}

	}

}
