package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Velocista extends Atleta{
	
	private String tipoPista;
	private String marcaCalcado;
	
	public Velocista() {
		super();
	}

	public Velocista(String tipoPista, String marcaCalcado) {
		super();
		this.tipoPista = tipoPista;
		this.marcaCalcado = marcaCalcado;
	}

	public String getTipoPista() {
		return tipoPista;
	}

	public void setTipoPista(String tipoPista) {
		this.tipoPista = tipoPista;
	}

	public String getMarcaCalcado() {
		return marcaCalcado;
	}

	public void setMarcaCalcado(String marcaCalcado) {
		this.marcaCalcado = marcaCalcado;
	}

	 @Override
	// Protege em rela��o a altera��es de sintaxe, como visibilidade, tipo de retorno, nome do m�todo e par�metros.
	// o m�todo � meu, mas eu aproveito a implementa��o da super-Classe
	// por�m eu posso fazer um diferencial
	public void comemorarVitoria() {
	super.comemorarVitoria();
	System.out.println(super.getNome() + " Estou cansado, mas corri para vit�ria!");
	
	
	}
	
	
	

}
