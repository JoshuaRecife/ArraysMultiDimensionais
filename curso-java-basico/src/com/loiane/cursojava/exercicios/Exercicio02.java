package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
//		2. Fa�a um Programa que pe�a um n�mero e ent�o mostre a
//		mensagem O n�mero informado foi [n�mero].
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Digite um N�mero");
		num = scan.nextInt();
		
		System.out.println("O n�mero informado foi: "+num);

	}

}
