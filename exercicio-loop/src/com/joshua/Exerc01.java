package com.joshua;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
//		1. Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma
//		   mensagem caso o valor seja inv�lido e continue pedindo at� que o
//		   usu�rio informe um valor v�lido.
		
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
			System.out.println("Valor inv�lido tente novamente");
		}
		
		}while(!verdadeiro);
	}

}
