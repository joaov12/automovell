package composicao;

public class Automovel {
	private Motor motor;
	private Direcao direcao;
	private String marca;
	
	public Automovel(Motor motor, Direcao direcao, String marca) {
		this.motor = motor;
		this.direcao = direcao;
		this.marca = marca;
	}

	public Automovel() {
	}

	public Motor getMotor() {
		return motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

}
