package com.joshua;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
//		12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
//		    qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
//		    numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
//		° Tabuada de 5:
//		° 5 X 1 = 5
//		° 5 X 2 = 10
//		° ...
//		° 5 X 10 = 50
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int mult = 1;
		
		System.out.println("Digite um número para a multiplicação");
		num1 = scan.nextInt();
		
		System.out.println("Tabuada de "+num1+":");
		for(int i = 1; i <= 10;i++){
			mult = num1 * i;
			System.out.println(num1+" X "+i +" = "+mult);
		}
	}
}
