package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Capivara implements Individuo {
	
	// quando eu não escrevo meu construtor vazio é pq ele já tem por padrao
	// porem, quando eu crio um construtor customizado eu perco meu construtor
	// padrão eu sou obrigado a criar um manualmente

	@Override
	public void alimentar(String alimento) {
		System.out.println("A capivara come mato e " + alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("A capivara anda, corre e nada");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("...");
		
	}

	
	
}
