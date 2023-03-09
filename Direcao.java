package composicao;

public class Direcao {

	private String cor;
	private int tamanhoDoRaio;
	private boolean kitMultimidia;

	public Direcao(String cor, int tamanhoDoRaio, boolean kitMultimidia) {
		this.cor = cor;
		this.tamanhoDoRaio = tamanhoDoRaio;
		this.kitMultimidia = kitMultimidia;
	}

	public Direcao() {
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTamanhoDoRaio() {
		return tamanhoDoRaio;
	}

	public void setTamanhoDoRaio(int tamanhoDoRaio) {
		this.tamanhoDoRaio = tamanhoDoRaio;
	}

	public boolean iskitMultimidia() {
		return kitMultimidia;
	}

	public void setKitMultimidia(boolean kitMultimidia) {
		this.kitMultimidia = kitMultimidia;
	}

	
}
