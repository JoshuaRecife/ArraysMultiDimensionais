package com.joshua;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
//		19. Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao
//			usu�rio qual opera��o ele deseja realizar. O resultado da opera��o
//			deve ser acompanhado de uma frase que diga se o n�mero �:
//			. par ou �mpar;
//			a. positivo ou negativo;
		
		Scanner scan = new Scanner(System.in);
		
		double result = 0;
		double num1, num2 ;
		String sinal;
			
		System.out.println("Digite o primeiro n�mero para determinar se � par ou �mpar");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero");
		num2 = scan.nextDouble();
		
		System.out.println("Escolha um sinal de opera��o: +, -, *, / ");
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
		default : System.out.println("Digite um sinal v�lido");
		valido = false;
		}
		
		if(valido){
			
		System.out.println("Resultado: "+result);
		
		if(result % 2 == 0){
			System.out.println("N�mero: Par");
		}else{
			System.out.println("N�mero: �mpar");
		}
		
		if(result >= 0){
			System.out.println("N�mero: Positivo");
		}else{
			System.out.println("N�mero: Negativo");
		}
	 }
	}
}
