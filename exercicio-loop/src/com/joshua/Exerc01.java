package com.joshua;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
//		1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
//		   mensagem caso o valor seja inválido e continue pedindo até que o
//		   usuário informe um valor válido.
		
		Scanner scan = new Scanner(System.in);
		
		double nota;
		boolean verdadeiro = false;
		 
		do{
		System.out.println("Digite uma nota entre zero(0) e dez(10)");
		nota = scan.nextDouble();
		
		if(nota >= 0 && nota <= 10){
			System.out.println("Sua nota foi: "+nota);
			verdadeiro = true;
		}else{
			System.out.println("Valor inválido tente novamente");
		}
		
		}while(!verdadeiro);
	}

}
