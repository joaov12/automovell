package composicao;

public class Principal {

	public static void main(String[] args) {
		Motor mot1 = new Motor(200, 150.00 , 12345);
		Direcao dir1 = new Direcao("Preto", 14, false);
		
		Automovel auto1 = new Automovel(mot1, dir1, "Fiat");
		
		System.out.println(" -- Caracteristicas do automovel " + auto1.getMarca() + " -- ");
		System.out.println("Potencia: " + auto1.getMotor().getPotencia() + " |  Capacidade de combustivel: " +auto1.getMotor().getCombustivel());
		System.out.println("Numero do chassi: " +  auto1.getMotor().getChassi() +  " |  Cor: " + auto1.getDirecao().getCor());
		System.out.println("Tamanho do aro: " + auto1.getDirecao().getTamanhoDoRaio()  + " |  Dispositivo multimidia ligado? " + auto1.getDirecao().iskitMultimidia());

		// auto1.setDirecao(dir1);
	}

}
