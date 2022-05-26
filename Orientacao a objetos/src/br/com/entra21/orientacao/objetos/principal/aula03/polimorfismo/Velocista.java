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
	// Protege em relação a alterações de sintaxe, como visibilidade, tipo de retorno, nome do método e parâmetros.
	// o método é meu, mas eu aproveito a implementação da super-Classe
	// porém eu posso fazer um diferencial
	public void comemorarVitoria() {
	super.comemorarVitoria();
	System.out.println(super.getNome() + " Estou cansado, mas corri para vitória!");
	
	
	}
	
	
	

}
