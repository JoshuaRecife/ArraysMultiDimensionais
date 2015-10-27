package com.joshua;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
//		19. Faça um Programa que leia 2 números e em seguida pergunte ao
//			usuário qual operação ele deseja realizar. O resultado da operação
//			deve ser acompanhado de uma frase que diga se o número é:
//			. par ou ímpar;
//			a. positivo ou negativo;
		
		Scanner scan = new Scanner(System.in);
		
		double result = 0;
		double num1, num2 ;
		String sinal;
			
		System.out.println("Digite o primeiro número para determinar se é par ou ímpar");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número");
		num2 = scan.nextDouble();
		
		System.out.println("Escolha um sinal de operação: +, -, *, / ");
		sinal = scan.next();
		
		boolean valido = true;
		
		switch(sinal){
		case "+": result = (num1) + (num2);
			break;
		case "-": result = (num1) - (num2);
			break;
		case "*": result = (num1) * (num2);
			break;
		case "/": result = (num1) / (num2);
			break;
		default : System.out.println("Digite um sinal válido");
		valido = false;
		}
		
		if(valido){
			
		System.out.println("Resultado: "+result);
		
		if(result % 2 == 0){
			System.out.println("Número: Par");
		}else{
			System.out.println("Número: Ímpar");
		}
		
		if(result >= 0){
			System.out.println("Número: Positivo");
		}else{
			System.out.println("Número: Negativo");
		}
	 }
	}
}
