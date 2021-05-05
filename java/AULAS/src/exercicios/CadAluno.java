package exercicios;

import java.util.Scanner;

public class CadAluno {

	
	
	public static void main(String[] args) {
		
		
		//variaveis
		Scanner kb = new Scanner(System.in);
		String nome="";
		int anoNascimento=0;
		char tipo=' ';
		double salario=0.00;
		boolean vivo=true;
		
		System.out.println("Digite o nome completo :");
		nome = kb.nextLine().toUpperCase();
		System.out.print("DIGITE O ANO DE NASCIMENTO :");
		anoNascimento = kb.nextInt();
		System.out.println("Digite o salario :");
		salario = kb.nextDouble();
		
		System.out.print("Digite M/F/O: ");
		tipo = kb.next().toUpperCase().charAt(0);
		// %s - string
		// %d - int
		// %.2f - double
		// %c - char
		System.out.printf("Nome : %s, idade : %d, tipo : %c salario: %.4f",nome,(2021-anoNascimento),tipo,salario);
		
		//entradas
		//processamentos
		//saidas
		

	}
	
	
}
