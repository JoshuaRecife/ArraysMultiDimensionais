package com.joshua;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
//		2. Fa�a um Programa que pe�a um valor e mostre na tela se o valor �
//		positivo ou negativo.
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um n�mero positivo ou negativo");
		num = scan.nextInt();
		
		if (num < 0){
			System.out.println("N�mero Negativo!");
		}else{
			System.out.println("N�mero Positivo!!");
		}

	}

}
