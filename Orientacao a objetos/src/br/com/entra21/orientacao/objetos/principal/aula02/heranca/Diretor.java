package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Diretor extends Pessoa {
	
	//removi os atributos comuns
	//mantive os especificos
	//private String nome;
	//private byte idade;
	//private String cpf;
	
	//mantive os especificos
	private String cursoAtual;
	private byte quantidadeProfessores;
	
	public Diretor() {
		super();
	}
	
	
	public Diretor(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);
		this.cursoAtual = cursoAtual;
		this.quantidadeProfessores = quantidadeProfessores;
	}


	
	public String getCursoAtual() {
		return cursoAtual;
	}

	public void setCursoAtual(String cursoAtual) {
		this.cursoAtual = cursoAtual;
	}

	public byte getQuantidadeProfessores() {
		return quantidadeProfessores;
	}

	public void setQuantidadeProfessores(byte quantidadeProfessores) {
		this.quantidadeProfessores = quantidadeProfessores;
	}
	
	public void realizarAprensentacao() {
		
		System.out.println("Oi meu nome é " +getNome()+ " e tenho " + getIdade());
		//System.out.println("Oi meu nome é "+this.nome+ " e tenho " + this.idade);
	}
	
}
