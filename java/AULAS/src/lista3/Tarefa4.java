package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		/*
		 * 4- Uma empresa desenvolveu uma pesquisa para saber as
		 * características psicológicas dos indivíduos de uma região.
		 * Para tanto, a cada uma das pessoasera perguntado:
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 * e as opções 
		 * (1, se a pessoa era calma;
		 *  2, se a pessoa era nervosa e 
		 *  3, se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		- o número de pessoas calmas;
		- o número de mulheres nervosas;
		- o número de homens agressivos;
		- o número de outros calmos;
		- o número de pessoas nervosas com mais de 40 anos;
		- o número de pessoas calmas com menos de 18 anos.
		 */
		
		//variaveis
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); //construtor
		final int PESSOAS = 5;
		int contador = 1;
		char continua='S';
		int idade=0;
		char sexo; //(1-feminino / 2-masculino / 3-Outros), 
		char opcao; // (1, se a pessoa era calma;  *  2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0;
		int pessoasNervosasAcima40Anos=0;
		int pessoasCalmasMenor18ano=0;
		
				
		while (continua=='S' && contador<=PESSOAS) {
			System.out.printf("Pessoa %d\n",contador);
			System.out.print("Digite a idade :");
			idade = leia.nextInt();
			System.out.print("Informe: \n1-feminino\n2-masculino\n3-Outros : ");
			sexo = leia.next().charAt(0);
			System.out.print("Selecione:\n1 - pessoa calma\n2 - pessoa nervosa\n3 - pessoa agressiva : ");
			opcao = leia.next().charAt(0);
			
			if(opcao=='1') {
				pessoasCalmas++;
			}
			
			if (sexo=='1' && opcao =='2' ) {
				 mulheresNervosas++;
			}
			
			if (sexo=='2' && opcao =='3' ) {
				homensAgressivos++;
			}
			
			if (sexo =='3' && opcao =='1') {
				outrosCalmos++;
			}
			
			if (opcao=='2' && idade>40) {
				pessoasNervosasAcima40Anos++;
			}
			
			if (opcao =='1' && idade<18) {
				pessoasCalmasMenor18ano++;
			 }
			
			
			
			//saida do loop - while
			contador++;
			if (contador<=PESSOAS) {
				System.out.print("Continua S/N: ");
				continua = leia.next().toUpperCase().charAt(0);//SIM	
			}
			
		}
		System.out.println("Pessoas calmas: "+pessoasCalmas);
		System.out.println("Mulheres nervorsas : "+mulheresNervosas);
		System.out.println("Homens agressivos : "+homensAgressivos);
		System.out.println("Outros calmos : "+outrosCalmos);
		System.out.println("Pessoas nervorsas acma de 40 anos : "+pessoasNervosasAcima40Anos);
		System.out.println("Pessoas calmas menores de 18 anos : "+pessoasCalmasMenor18ano);
		System.out.println("FIM DO PROGRAMA!!");

	}

}
