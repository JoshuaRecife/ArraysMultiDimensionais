package com.joshua;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
//		2. Faça um programa que leia um nome de usuário e a sua senha e não
//		   aceite a senha igual ao nome do usuário, mostrando uma mensagem
//		   de erro e voltando a pedir as informações.
		
		Scanner scan = new Scanner(System.in);
		
		String nome,senha;
		
		boolean valido = false;
		
			System.out.println("Digite seu primeiro nome");
			nome = scan.next();

		do{	
			System.out.println("Digite sua senha");
			senha = scan.next();
			
			if(senha.equalsIgnoreCase(nome) ){
				System.out.println("Digite uma senha diferente do Nome: "+nome);
			}else{
				System.out.println("Seu nome: "+nome);
				System.out.println("sua senha: "+senha);
				valido = true;
			}
			
		}while(!valido);
	}
}
