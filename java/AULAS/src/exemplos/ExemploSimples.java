package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSimples {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor :");
		int valor = leia.nextInt();
		//System.out.println(((valor%2)==0) ? "NUMERO PAR": "NUMERO IMPAR");
		System.out.println((valor==0)? "ZERO É NEUTRO":((valor%2)==0) ? "NUMERO PAR": "NUMERO IMPAR");
		/*
		if ((valor%2)==0) {
			System.out.println("Valor é par!!!");
		} 
		else {
			System.out.println("Valor é impar");
		}
		*/
	}

}
