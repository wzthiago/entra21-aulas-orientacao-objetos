package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Atleta {
	
	private String nome;
	private byte age;
	private int qtdWin;
	private int qtdLoss;
	
	
	public Atleta() {//minha classe atleta vazia, sem nenhum parametro
		
	}


	public Atleta(String nome, byte age, int qtdWin, int qtdLoss) {// vai pra meu construtor com quatro parametros
		super();
		this.nome = nome;
		this.age = age;
		this.qtdWin = qtdWin;
		this.qtdLoss = qtdLoss;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public byte getAge() {
		return age;
	}


	public void setAge(byte age) {
		this.age = age;
	}


	public int getQtdWin() {
		return qtdWin;
	}


	public void setQtdWin(int qtdWin) {
		this.qtdWin = qtdWin;
	}


	
	public int getQntLoss() {
		return qtdLoss;
	}


	public void setQntLoss(int qntLoss) {
		this.qtdLoss = qntLoss;
	}


	public void comemorarVitoria() {
		System.out.println("Thanks God!!!"+(getNome()));
		this.qtdWin++;
	}
	
	public void aprenderComDerrota() {
		
		System.out.println("Vou melhorar na próxima vez");
		this.qtdLoss++;
	}

}
