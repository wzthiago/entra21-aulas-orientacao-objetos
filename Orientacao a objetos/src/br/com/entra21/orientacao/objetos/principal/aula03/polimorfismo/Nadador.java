package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Nadador extends Atleta{

	private String ambienteAquatico;
	private String equipamentoAquatico;
	
	public Nadador() {
		
	}

	public Nadador(String ambienteAquatico, String equipamentoAquatico) {
		super();
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
	}
	
	public Nadador(String nome, byte age, int qtdWin, int qtdLoss, String ambienteAquatico, String equipamentoAquatico) {
		super(nome, age, qtdWin, qtdLoss);
		this.ambienteAquatico = ambienteAquatico;
		this.equipamentoAquatico = equipamentoAquatico;
		
	}
	
	public String getAmbienteAquatico() {
		return ambienteAquatico;
	}

	public void setAmbienteAquatico(String ambienteAquatico) {
		this.ambienteAquatico = ambienteAquatico;
	}

	public String getEquipamentoAquatico() {
		return equipamentoAquatico;
	}

	public void setEquipamentoAquatico(String equipamentoAquatico) {
		this.equipamentoAquatico = equipamentoAquatico;
	}
	
	//comemorar vitoria já existe na super classe
	//mas se eu criar com o mesmo nome, visibilidade, tipo de retorno e argumentos 
	//o método escolhido será esse aqui, não o da super-Classe 
	public void comemorarVitoria(String frase) {
		setQtdWin(getQtdWin()+1);
		System.out.println(getNome()+ (frase.isEmpty()?" comemora jogando água para cima":frase));
		// is Empty testa se a String tem zero caracteres
	}
	
	
}
