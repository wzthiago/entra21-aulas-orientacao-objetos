package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Cachorro implements Individuo{
	
	private String nome;
	private String raca;
	
	

	public Cachorro() {
		super();
	}
	
	

	public Cachorro(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}



	@Override
	public void alimentar(String alimento) {
	System.out.println(this.nome+ " eu não como comida apenas " +alimento+ ", sou de raça " + this.raca);
		
	}

	@Override
	public void locomover() {
		System.out.println(this.nome+" sou livre");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nome+"Auuuuuuuuuuu..."+conteudo);
		
	}
	
	

}
