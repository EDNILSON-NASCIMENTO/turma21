package classes;

public class Graduacao extends Estudante{
	
	private double bonus = 2.00;

	public Graduacao(int matricula, String cpf) {
		super(matricula, cpf);
		
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void tirarNotas(double pontos) { 
		double aux=0.00;
		if (super.getPontos()>=pontos) {
			super.tirarNotas(pontos);
		}
		else if ((super.getPontos()+bonus) >= pontos) {
			aux = pontos - super.getPontos();
			bonus=bonus-aux;
			super.adicionarNota(aux);
			super.tirarNotas(pontos);
		} else {
			System.out.println("impossivel realizar operação!!!");
		}
		
		
		
	}
	
}
