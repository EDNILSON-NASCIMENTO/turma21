package application;

import java.util.Scanner;

import entites.Aluno;
import entites.Basico;

public class CAdMallu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		String nome = leia.next().toUpperCase();
		System.out.println("Digite o cpf : ");
		String cpf = leia.next();
		System.out.println("informe o numero da matricula: ");
		int matricula = leia.nextInt();
		
		Aluno aluno1 = new Aluno(matricula, cpf, nome);
		Aluno aluno2 = new Aluno(matricula,nome);
		
		Basico alunoBas = new Basico(matricula, cpf, nome, 1);
		
		
		
		System.out.println(aluno1.nome);
		System.out.println(aluno2.nome);
		
		
		

	}

}
