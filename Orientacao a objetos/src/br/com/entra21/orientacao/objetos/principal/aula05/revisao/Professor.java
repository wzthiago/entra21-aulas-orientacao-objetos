package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Professor extends Pessoa implements comportamentosAcademicos {

	private Estudante estudantes[];
	private Disciplina disciplina[];

	public Professor() {

	}

	public Professor(Estudante[] estudantes, Disciplina[] disciplina) {
		super();
		this.estudantes = estudantes;
		this.disciplina = disciplina;
	}

	// construtor da super classe
	public Professor(String nome, byte idade, String cpf) {// construtor que a super classe dá
		super(nome, idade, cpf);

	}

	// construtor que a super classe dá
	public Professor(String nome, byte idade, String cpf, Estudante[] estudantes, Disciplina[] disciplina) {
		super(nome, idade, cpf);
		this.estudantes = estudantes;
		this.disciplina = disciplina;

	}

	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	public Disciplina[] getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String realizarApresentacao() {
		String apresentacao = "oi sou o professor " + super.getNome() + " e tenho  " + this.estudantes.length;
		return apresentacao;
	}

	@Override
	public String gerarDosse(String nome) {
		String mensagem = "";
		Estudante estudanteLocalizado = null;
		for (byte estudante = 0; estudante < this.estudantes.length; estudante++) {
			if (this.estudantes[estudante] != null && this.estudantes[estudante].getNome().equals(nome)) {
				estudanteLocalizado = this.estudantes[estudante];
				break;
			}
		}

		if (estudanteLocalizado != null) {
			mensagem = escreverDetalheDossie(estudanteLocalizado);
		} else {
			mensagem = "Esse aluno não existe na minha lista";
		}

		return mensagem;
	}

	private String escreverDetalheDossie(Estudante estudante) {
		String detalhe = "O estudante " + estudante.getNome() + " já aprendeu " + estudante.getDisciplinas().length
				+ " disciplinas";
		detalhe += "\n observações que eu percebi sobre este estudante";
		detalhe += "\n " + estudante.getObservacao();

		return detalhe;
	}

}
