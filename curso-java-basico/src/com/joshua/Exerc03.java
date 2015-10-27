package com.joshua;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
//		3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//		Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		
		Scanner scan = new Scanner(System.in);
		String sexo;
		
		System.out.println("Digite F para Feminino ou M para Masculino");
		sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f")){
			System.out.println("Sexo Feminino");
		}else{
			if (sexo.equalsIgnoreCase("m")){
				System.out.println("Sexo Masculino");
			}else{
				System.out.println("Sexo inválido!!");
			}
		}

	}

}
