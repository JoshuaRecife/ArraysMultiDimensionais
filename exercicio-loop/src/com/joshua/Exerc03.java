package com.joshua;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
//		3. Faça um programa que leia e valide as seguintes informações:
//			a. Nome: maior que 3 caracteres;
//			b. Idade: entre 0 e 150;
//			c. Salário: maior que zero;
//			d. Sexo: 'f' ou 'm';
//			e. Estado Civil: 's', 'c', 'v', 'd';
		
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean valido = false;
		
		
		do{
		System.out.println("Entre com seu Nome");
		nome = scan.nextLine();
		
		if(nome.length() > 3){
			valido = true;
		}else{
			System.out.println("Digite mais de 3 letras, tente novamente!");
			valido = false;
		}
		
		}while(!valido);
		
		
		do{
		System.out.println("Entre com a Idade");
		idade = scan.nextInt();
		
		if(idade < 0 || idade > 150){
			System.out.println("Digite novamente uma idade válida!");
			valido = false;
		}else{

			valido = true;
			
		}
		
		}while(!valido);
		
		
		do{
		System.out.println("Entre com o Salario");
		salario = scan.nextDouble();
		
		if(salario < 0){
			System.out.println("Digite um Salário válido!");
			valido = false;
		}else{

			valido = true;
		}
		
		}while(!valido);
		
		
		do{
		System.out.println("Entre com 'F' para Feminino ou 'M' para Masculino");
		sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("f") || (sexo.equalsIgnoreCase("m"))){

			valido = true;
		}else{
			System.out.println("Sexo inválido, digite F ou M");
			valido = false;
		}
		
		}while(!valido);
		
		do{
		System.out.println("Entre com: 'S' para solteiro, 'C' - Casado, 'V' - viúvo ou 'D' - Divorciado");
		estadoCivil = scan.next();
		
		if(estadoCivil.equalsIgnoreCase("s") || 
				estadoCivil.equalsIgnoreCase("c") || 
				estadoCivil.equalsIgnoreCase("v") || 
				estadoCivil.equalsIgnoreCase("d")){

			valido = true;
		}else{
			System.out.println("Digite 's' ou 'c' ou 'v' ou 'd'");
			valido = false;
		}
		
		}while(!valido);
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salário: "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil: "+estadoCivil);

	}
}
