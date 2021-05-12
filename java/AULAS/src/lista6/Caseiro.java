package lista6;

public class Caseiro extends Cachorro {

	private String porte;
	private char pelagem; //M-MUITO P-pouco
	
	public Caseiro(String nome, int idade, String porte, char pelagem) {
		super(nome, idade);
		this.porte = porte;
		this.pelagem = pelagem;
	}
	
	
}
