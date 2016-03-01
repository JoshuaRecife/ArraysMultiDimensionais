package joshua.com.br;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
//		5. Faça um programa para armazenar em uma matriz os
//			compromissos de uma agenda pessoal. Cada dia do mês deve
//			conter 24 horas, onde para cada uma destas 24 horas podemos
//			associar uma tarefa específica (compromisso agendado). O
//			programa deve ter um menu onde o usuário indica o dia do mês
//			que deseja alterar e a hora, entrando em seguida com o
//			compromisso, ou então, o usuário pode também consultar a
//			agenda, fornecendo o dia e a hora para obter o
//			compromisso armazenado.
		
		Scanner scan = new Scanner(System.in);
		String[][] compromissos = new String[31][24];
		
		byte opcao;
		byte dia = 0;
		byte hora = 0;
		boolean sair = false;
		boolean diaValido;
		boolean horaValido;
		
		while(!sair){
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextByte();
			
			if(opcao == 1){ // agendar compromisso
				
				diaValido = false;
				while(!diaValido){
					System.out.println("Entre com o dia do mês");
					dia = scan.nextByte();
					
					if(dia > 0 && dia <= 31){
						diaValido = true;
					}else{
						System.out.println("Dia inválido, digite novamente");
					}
				}
				
				horaValido = false;
				while(!horaValido){
					System.out.println("Entre com a hora do compromisso.");
					hora = scan.nextByte();
					
					if(hora >= 0 && hora <= 24){
						horaValido = true;
					}else{
						System.out.println("Hora inválida, digite novamente");
					}
				}
				dia--;
				System.out.println("Digite o compromisso");
				compromissos[dia][hora] = scan.next();
				
			}else{
				if(opcao == 2){ //verificar compromisso
					
					diaValido = false;
					while(!diaValido){
						System.out.println("Entre com o dia do mês");
						dia = scan.nextByte();
						
						if(dia > 0 && dia <= 31){
							diaValido = true;
						}else{
							System.out.println("Dia inválido, digite novamente");
						}
					}
					
					horaValido = false;
					while(!horaValido){
						System.out.println("Entre com a hora do compromisso.");
						hora = scan.nextByte();
						
						if(hora >= 0 && hora <= 24){
							horaValido = true;
						}else{
							System.out.println("Hora inválida, digite novamente");
						}
					}
					dia--;
					System.out.println("O compromisso agendado é: ");
					System.out.println(compromissos[dia][hora]);
					
				}else{
					if(opcao == 0){
						sair = true;
					}else{
						System.out.println("Opção inválida.");
					}
				}
			}
		}
	}
}
