package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Estudante extends Pessoa implements comportamentosAcademicos {

	private Disciplina disciplinas[];

	public Estudante() {

	}

	public Estudante(Disciplina[] disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public Estudante(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);

	}

	public Estudante(String nome, byte idade, String cpf, Disciplina[] disciplinas) {
		super(nome, idade, cpf);
		this.disciplinas = disciplinas;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String realizarApresentacao() {
		String apresentacao = "Oi meu nome é "+super.getNome();
		
		return apresentacao;
	}

	@Override
	public String gerarDosse(String nome) {
		String mensagem = "";
		if(nome.equals(super.getNome())) {
			mensagem = "O dossie sobre mim é gerado com minha interação entre professor e colegas";
		}else {
			mensagem="Eiii...Você errou meu nome";
		}
		return mensagem;
	}

}
