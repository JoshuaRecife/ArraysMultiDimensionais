package com.joshua;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
//		4. Fa�a um Programa que verifique se uma letra digitada � vogal ou
//		consoante.
		
		Scanner scan = new Scanner(System.in);
		String letra;
		
		System.out.println("Digite uma vogal ou uma consoante");
		letra = scan.next();
		
		if(letra.length() > 1){
			System.out.println("Voc� n�o digitou uma letra!!");
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
			case "U":System.out.println("Voc� digitou uma vogal: "+letra);
				break;
			default: System.out.println("Voc� digitou uma consoante: "+letra);
			}
		}

	}

}
