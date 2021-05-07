package exemplos;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		/*
		
				 * Faça um programa que crie um vetor por leitura com 5 
				 * valores de pontuação de uma atividade e o escreva em 
				 * seguida. Encontre após a maior pontuação e a apresente. 
		
		*/
		Scanner leia = new Scanner(System.in);
		int pontos[] = new int[5];   //0 - 4
		int maiorPontuacao=0;
		
		for (int x=0;x<5;x++) {
			System.out.println("Digite sua pontuação nas atividades: ");
			pontos[x] = leia.nextInt(); 
			if (maiorPontuacao < pontos[x]) {
				maiorPontuacao = pontos[x];
			}
		}
		System.out.printf("\nA maior pontuação de suas atividades é: %d", maiorPontuacao);
	}

}
