package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Velocista;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo.Ponto;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo.Reta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Aviao;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Cachorro;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Planta;
import br.com.entra21.orientacao.objetos.principal.aula05.revisao.Revisao;

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
            System.out.println("1 - Aprender Classes");
            System.out.println("2 - Aprender Herança");
            System.out.println("3 - Aprender Polimorfismo");
            System.out.println("4 - Aprender conceitos POO");
            System.out.println("5 - Aprender Polimorfismo com Interface");
            
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
                
            case 3:
                aprenderPolimorfismo();
                break;
            case 4:
                aprenderConceitosPOO();
                break;
            case 5:
                aprenderPolimorfismoInterface();
                break;
            case 6:
                revisarPOO();
            	break;
                
            default:
                System.out.println("Escolha uma opção válida");
                break;
            }
        } while (opcao != 0);

	}

	

	private static void  aprenderClassesObjetos() {
		
		//aula 01 POO
		
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
		// aula 02 - Orientação a objetos, classes 
				Funcionario funcionario1 = new Funcionario();
				funcionario1.setIdade((byte)31);
				funcionario1.setNome("Thiago");
				funcionario1.setCargoAtual("Empreendedor");
				funcionario1.setSalario(3000.00f);
				
				System.out.println("Oi meu nome é: "+funcionario1.getNome()+" e tenho "+funcionario1.getIdade()+" anos");
				
				Funcionario funcionario2 = new Funcionario("Thiago", (byte) 31, "63986488908", "programador jr", 2500.50f);
						
				Diretor direto1 = new Diretor();
				direto1.realizarAprensentacao();
				Diretor direto2 = new Diretor();
				direto2.realizarAprensentacao();
				Diretor direto3 = new Diretor("Paulo", (byte) 80, "00000000000");
				direto3.setObservacao("Observação");
				direto3.realizarAprensentacao();
	}

	private static void aprenderPolimorfismo() {
		
		//padrão de polimorfismo para comportamentos é herdar
		//a segunda forma do polimorfismo [e fazer completamente os comportamentos(métodos) do meu jeito, o que eu herdei
		//a terceira forma do polimorfismo é aproveitar minha herança e fazer o direncial
				 
		
		System.out.println("-----------------------------------------------------------");
		Atleta cr7 = new Atleta ();
		cr7.setNome("Cristiano");
		cr7.comemorarVitoria();
		cr7.aprenderComDerrota();
		
		
		System.out.println("-----------------------------------------------------------");
		Nadador michaelPhelps = new Nadador("Michael", (byte)31, 1, 2, "Mar","Nadadeira");
		System.out.println("Quer escrever uma frase?");
		String frase = input.nextLine();
		michaelPhelps.comemorarVitoria(frase); //procura primeiro na minha classe Nadador, se não tiver busca na herança.
		michaelPhelps.comemorarVitoria();
		michaelPhelps.aprenderComDerrota();
		michaelPhelps.setNome("Phelps - Homem Peixe");
		
		System.out.println("-----------------------------------------------------------");
		Nadador sergio = new Nadador("Sergio Tainha", (byte)30, 3, 5, "Piscina", "Oculos");
		sergio.comemorarVitoria();
				
		Velocista flash = new Velocista();
		flash.setMarcaCalcado("Adidas");
		flash.setNome("Byke Alien ;)");
		System.out.println("-----------------------------------------------------------");
		flash.comemorarVitoria();
		flash.aprenderComDerrota();
		System.out.println("-----------------------------------------------------------");
	}
	
	
	private static void aprenderConceitosPOO() {
		
		// --------------COESÄO------------
		//A classe ponto tem alta COESÃO pos é preciso nas suas responsabilidades
		Ponto pontoAlto = new Ponto(30,10000);
		Ponto esquerdaBaixo = new Ponto(-50,-500);
		
		// --------AGREGACAO e ASSOSIACAO----------
		//A classe reta é AGREGADA por pontos que podem não estar inicializados.
		//A asociação de reta e ponto e de um para muitos respectivamente
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto,esquerdaBaixo);

		}
		
		
	private static void aprenderPolimorfismoInterface() {
		
		Humano thiago = new Humano();
		thiago.setNome("Thiago");
		thiago.apresentarSe();
		thiago.alimentar("Pizza");
		thiago.locomover();
		thiago.comunicar("HEYY");
		
		Gato vezu = new Gato("Vezu", new Pessoa("Rubem", (byte)33, ""));
		vezu.alimentar("Ração");
		vezu.comunicar("Quero ração");
		vezu.locomover();
		
		Capivara robson =new Capivara();
		robson.alimentar("Água");
		robson.locomover();
		robson.comunicar("");
		
		Planta maracuja = new Planta ("Passiflora edulis Sims");
		maracuja.alimentar("Nutrientes");
		maracuja.comunicar("Tem sol hoje");
		maracuja.locomover();
		
		Cachorro marley = new Cachorro();
		marley.setNome("Marley");
		marley.setRaca("Bucica");
		marley.alimentar("Ração");
		marley.locomover();
		marley.comunicar(" Sou um cão Feliz..." );
		
		Aviao comercial= new Aviao();
		comercial.setModelo("Boeing 737");
		System.out.println(comercial.freiar());
		comercial.acelerar(870.5f);
		System.out.println(comercial.getVelocidadeAtual());
		
	}		
		
	private static void revisarPOO() {
		Revisao.revisar();
		
	}
	
}