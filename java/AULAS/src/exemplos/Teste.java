package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) 
	{
		   //Declarando Variaveis 
        int [][] matriz = new int [3][3];
        int maior10=0;
        /*
         * 3- Leia uma matriz 3 x 3, conte 
         * e escreva quantos valores maiores
         *  que 10 ela possui.
         *
         */

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        System.out.println("Matriz M[3][3] \n");



        // Processamento do loop FOR referente a primeira linha e coluna 
        for(int linha=0; linha < 3; linha++) {
            for(int coluna = 0; coluna <3; coluna++) {
                System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
                matriz[linha][coluna]=leia.nextInt();
                
                if (matriz[linha][coluna] >10) {

                    maior10++;
                   
                }

            }
        }
        //IMPREMINDO o procedssamento anterior
        System.out.println("\nA Matriz ficou: \n");

        //Segundo LOOOP for Especialmente para Imprimir a Planilha
        for(int linha=0; linha < 3; linha++) {
            for(int coluna =0; coluna < 3; coluna++) {
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }
            System.out.println();

        }
        System.out.printf("Existe %d numero(s) maior(es) que 10, nesta Tabela  !!",maior10);
        
	}

}
