package com.joshua;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
//		17. Fa�a um Programa que pe�a um n�mero correspondente a um
//		determinado ano e em seguida informe se este ano � ou n�o bissexto.
		
		Scanner scan = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite um ano para determinar se � bissexto.");
		ano = scan.nextInt();
		
		if(ano % 400 == 0 || (ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println("Ano "+ano+" � bissexto");
			
		}else{
			System.out.println("Ano " +ano+" n�o � bissexto");
		
		}
	}
}
