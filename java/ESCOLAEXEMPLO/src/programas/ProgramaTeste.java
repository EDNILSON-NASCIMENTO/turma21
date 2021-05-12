package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Graduacao;


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
		Graduacao grad1 = new Graduacao(matricula, cpf);
		aluno1.setNome(nome);
		aluno1.adicionarNota(nota);
		grad1.adicionarNota(10);
		
		/*
		System.out.printf("Pontos atuais do aluno %s = %.0f \n",aluno1.getNome(),aluno1.getPontos());
		System.out.println("Digite o dia atual :");
		int diaAtual = leia.nextInt();
		aluno1.bonusAniversario(diaAtual);
		System.out.printf("Pontos após método do aluno %s = %.0f\n ",aluno1.getNome(),aluno1.getPontos());
		*/
		char op=' ';
		System.out.println("Nota do aluno1 "+aluno1.getPontos());
		for (int x=1; x<=3; x++) {
			System.out.print("Informe o valor :");
			nota = leia.nextDouble();
			System.out.println("Digite 1-adicionar ou 2-debitar:");
			op = leia.next().charAt(0);
			if (op =='1') {
				aluno1.adicionarNota(nota);
			} else {
				aluno1.tirarNotas(nota);
			}
			//System.out.println("Valor atual do bonus"+grad1.getBonus());
			System.out.println("Novo saldo de nota de aluno1 :"+aluno1.getPontos());
		}
	
			
	}

}
