package br.com.dominio.marionete;

import br.com.dominio.state.State;

public class FireMario implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Mais de 1000 pontos");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou um estrela: Mario está invencível");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma flor: Continua com poderes de fogo");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com um inimigo: ");
		return new SuperMario();
	}

	@Override
	public String retornarTipo() {
		return "Fire Mario";
	}

}
