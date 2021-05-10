package application;

import java.util.Scanner;

import entites.Aluno;

public class CadAluno {

	public static void main(String[] args) {

		//teste programador para programador
		Scanner leia = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno(1,"111.111.111-11", "JOÃO"); //instanciou o objeto aluno1 do tipo ALUNO
		Aluno aluno2 = new Aluno(2,"222.222.222-22","MARIA");
		Aluno aluno3 = new Aluno(3,"JOSÉ");
		
				
		
		aluno2.nome = "MARIA";
		
		
		aluno1.nome = "JOÃO";
		aluno1.anoNascimento = 1980;
		
		System.out.println(aluno1.nome);
		
		
		

	}

}
