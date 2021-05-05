package exemplos;

import java.util.Scanner;

public class OiMundo {

	public static void main(String[] args) {
		
		//variaveis
		//inteiro numero1
		//cadeia nome
		//escreva("Digite o nome: )
		//leia(nome)
		
		//instaciar = criar um teclado
		Scanner leia = new Scanner(System.in);
		
		String nome; //cadeia
		int numero1 = 10;
		int numero2 = 30;
		double salario = 1999.25;
		char op = 'S';
		
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		//escreva("Digite um numero: ")
		System.out.println("Digite um numero 1: ");
		//leia(numero1)
		numero1 = leia.nextInt();
		System.out.println("Digite o numero 2 :");
		numero2 = leia.nextInt();
		System.out.println("Digite o salario :");
		salario = leia.nextDouble();
		
		System.out.println("nome: "+nome);
		System.out.println("Salario :"+salario);
		System.out.println(numero1+numero2);
		
		
		
		leia.close();
		
	}
	
}
