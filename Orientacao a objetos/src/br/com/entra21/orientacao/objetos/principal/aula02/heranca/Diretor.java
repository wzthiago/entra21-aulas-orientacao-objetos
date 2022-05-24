package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor {
	
	private String nome;
	private byte idade;
	private String cursoAtual;
	private byte quantidadeProfessores;
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, byte idade) {
		this.nome=nome;
		this.idade=idade;
	}

	public void realizarAprensentacao() {
		
		System.out.println("Oi meu nome � "+this.nome+ " e tenho " + this.idade);
	}
	
}
