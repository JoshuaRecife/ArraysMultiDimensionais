package com.joshua;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exerc10 {

	public static void main(String[] args) {
//		10. Faça um Programa que pergunte em que turno você estuda. Peça
//		para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
//		mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
//		Inválido!", conforme o caso.
		
		Scanner scan = new Scanner(System.in);
		String turno;
		
		System.out.println("Qual turno você estuda:( M )-matutino ou ( V )-Vespertino ou ( N )-Noturno");
		turno = scan.next();
	
	if(turno.length()>1){
		System.out.println("Digite apenas M ou V ou N.");
	}else{
		if(turno.equalsIgnoreCase("m")){
			System.out.println("Bom dia!!");
		}else{
			if(turno.equalsIgnoreCase("v")){
				System.out.println("Boa Tarde!!");
			}else{
				if(turno.equalsIgnoreCase("n")){
					System.out.println("Boa Noite!!");
				}else{
					System.out.println("Valor Inválido, Digite M ou V ou N");
				}

				}
			}
		}
	}
}
