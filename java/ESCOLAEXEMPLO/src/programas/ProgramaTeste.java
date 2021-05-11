package programas;

import java.util.Scanner;

import classes.Basico;

public class ProgramaTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno ");
		String nome = leia.next().toUpperCase();
		System.out.print("Digite o numero da matricula :");
		int matricula = leia.nextInt();
		System.out.print("Digite o cpf :");
		String cpf = leia.next();
		System.out.print("Digite o dia de aniversário :");
		int dia = leia.nextInt();
		System.out.print("Digite a nota inicial:");
		double nota = leia.nextDouble();
		
		Basico aluno1 = new Basico(matricula,cpf,dia); //instanciando o objeto
		
		aluno1.setNome(nome);
		aluno1.adicionarNota(nota);
		System.out.printf("Pontos atuais do aluno %s = %.0f \n",aluno1.getNome(),aluno1.getPontos());
		System.out.println("Digite o dia atual :");
		int diaAtual = leia.nextInt();
		aluno1.bonusAniversario(diaAtual);
		System.out.printf("Pontos após método do aluno %s = %.0f\n ",aluno1.getNome(),aluno1.getPontos());
		
		
	
			
	}

}
