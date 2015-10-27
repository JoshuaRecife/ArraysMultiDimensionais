package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//		2. Faça um Programa que peça um número e então mostre a
//		mensagem O número informado foi [número].
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Digite um Número");
		num = scan.nextInt();
		
		System.out.println("O número informado foi: "+num);

	}

}
