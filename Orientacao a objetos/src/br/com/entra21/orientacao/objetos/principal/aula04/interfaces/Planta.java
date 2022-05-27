package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Planta implements Individuo{

	private String nomeCientifico;

	public Planta() {
		super();
	}

	public Planta(String nomeCientifico) {
		super();
		this.nomeCientifico = nomeCientifico;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeCientifico+" Eu não preciso de " + alimento+ " pois faço fotosintese");
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nomeCientifico+" Não preciso mexer, consigo tudo sem sar daqui");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeCientifico+"Planta não fala, porque ainda é muda!!!");
		
	}
	
	
	
}
