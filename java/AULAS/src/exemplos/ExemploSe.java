package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero inteiro: ");
		numero = leia.nextInt();
				
		if (numero==0) {
			System.out.println("Zero é neutro!!!");
		}
		else if (numero<0) {
			System.out.println("Numero negativo!!!");
		}
		else if ((numero%2)==0) {
			System.out.println("O numero é par!!!");
		} 
		else {
			System.out.println("O numero é impar!!!");
		}

	}

}
