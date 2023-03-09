package composicao;

public class Motor {
	private int potencia;
	private double combustivel;
	private int chassi;

	public Motor(int potencia, double combustivel, int chassi) {
		this.potencia = potencia;
		this.combustivel = combustivel;
		this.chassi = chassi;
	}

	public Motor() {
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

}
