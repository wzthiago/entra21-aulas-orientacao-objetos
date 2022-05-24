package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, então é um obj
	// porem o System.in é uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
				
        byte opcao;

         do {
            System.out.println("Escolha uma opção");
            System.out.println("0 - Sair");
            System.out.println("1 - Aprender classes");
            System.out.println("2 - Aprender herança");

 
            opcao = input.nextByte();

 

            switch (opcao) {
            case 0:
                System.out.println("Saindo");
                break;
            case 1:
                aprenderClassesObjetos();
                break;
            case 2:
                aprenderHeranca();
                break;
            default:
                System.out.println("Escolha uma opção válida");
                break;
            }
        } while (opcao != 0);

	}

	private static void  aprenderClassesObjetos() {
		
		// aula 02 - Orientação a objetos, classes 
		Diretor direto1 = new Diretor();
		direto1.realizarAprensentacao();
		Diretor direto2 = new Diretor();
		direto2.realizarAprensentacao();
		Diretor direto3 = new Diretor("Paulo", (byte) 80);
		direto3.realizarAprensentacao();
		
		
		
		
		// instanciando um objeto da classe Professor na variavel professorJava
		Professor professorJava = new Professor();
		professorJava.setNome("Oliota");
		// instanciando um objeto da classe Professor na variavel professoraIngles
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		// Acessando os atributos com encapsulamento
		System.out.println("Nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela é " + professoraIngles.getIdade());

		// Acessando o atributo estático da Classe Professor, atributos estáticos ou
		// metodos estatico não pertencem aos objetos da Classe
		// dessa forma é possivel acessar em a necessidade de criar um objeto com new
		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel é independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		alunoTeste.nome = "Thiago";
		Aluno outroAluno = new Aluno();
		outroAluno.nome = "Outro aluno";
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as alterações aqui só afetam esse objeto
		alunoObjeto.idade = 18;

		// as alterações aqui só afetam esse objeto
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		// as alterações aqui só afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		/*
		 * // Interagindo com o usuario para preencher os atributos do Aluno que ainda
		 * não tem encapsulamento 
		 * System.out.println("Qual o nome do aluno novato?");
		 * alunoNovato.nome = input.next();
		 * 
		 * System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		 * alunoNovato.idade = input.nextByte();
		 * 
		 * System.out.println("Bem vindo " + alunoNovato.nome);
		 */

	}

	private static void aprenderHeranca() {
		 
		

	}
}