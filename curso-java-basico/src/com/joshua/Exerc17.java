package com.joshua;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
//		17. Faça um Programa que peça um número correspondente a um
//		determinado ano e em seguida informe se este ano é ou não bissexto.
		
		Scanner scan = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite um ano para determinar se é bissexto.");
		ano = scan.nextInt();
		
		if(ano % 400 == 0 || (ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println("Ano "+ano+" é bissexto");
			
		}else{
			System.out.println("Ano " +ano+" não é bissexto");
		
		}
	}
}
