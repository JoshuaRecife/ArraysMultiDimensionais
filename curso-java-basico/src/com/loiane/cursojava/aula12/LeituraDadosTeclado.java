package com.loiane.cursojava.aula12;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Digite seu nome completo:");
//		String nomeCompleto = scan.nextLine();
//		
//		System.out.println("Seu nome �: " +nomeCompleto);
//		
//
//		System.out.println("Digite seu primeiro nome:");
//		String primeiroNome = scan.next();
//		
//		System.out.println("Seu primeiro nome �: " +primeiroNome);
//	
//		
//		System.out.println("Digite sua idade:");
//		int idade = scan.nextInt();
//		
//		System.out.println("Sua Idade �: " +idade);
		
		
//		System.out.println("Digite sua altura:");
//		double altura = scan.nextDouble();
//		
//		System.out.println("Sua altura �: "+altura);
		
		System.out.println("Digite seu nome:");
		String nome = scan.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		
		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		
		System.out.println("Seu nome �: "+nome);
		System.out.println("Sua idade �: "+idade);
		System.out.println("Sua altura �: "+altura);
	}

}
