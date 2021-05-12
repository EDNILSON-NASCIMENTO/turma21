package programas;

import classes.Funcionario;
import classes.Terceiro;

public class TesteFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario func1 = new Funcionario("João","X01",80,20.00);
		Funcionario func2 = new Terceiro("Carlos","Y02",10,20.00,15.00);
		
		System.out.println(func2.salario());
		if (func2.salario()<=1000) {
			
			System.out.println("Isento!!!");
		} else {
			
			System.out.println("o LEÃO vai te pega!!!");
		}
			
		
	}

}
