package com.joshua;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
//		4. Faça um Programa que verifique se uma letra digitada é vogal ou
//		consoante.
		
		Scanner scan = new Scanner(System.in);
		String letra;
		
		System.out.println("Digite uma vogal ou uma consoante");
		letra = scan.next();
		
		if(letra.length() > 1){
			System.out.println("Você não digitou uma letra!!");
		}else{
		
			switch(letra){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":System.out.println("Você digitou uma vogal: "+letra);
				break;
			default: System.out.println("Você digitou uma consoante: "+letra);
			}
		}

	}

}
