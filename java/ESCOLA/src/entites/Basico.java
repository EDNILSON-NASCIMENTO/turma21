package entites;

public class Basico extends Aluno {

	public int diaAniversario;

	public Basico(int matricula, String cpf, String nome, int diaAniversario) {
		super(matricula, cpf, nome);
		this.diaAniversario = diaAniversario;
	}
	
	
	
}
