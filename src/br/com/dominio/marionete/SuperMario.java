package br.com.dominio.marionete;

import br.com.dominio.state.State;

public class SuperMario implements State {

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Mais de 1000 pontos");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou uma estrela: Mario está invencível");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma flor: Mario atira fogo");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com um inimigo: Volta a ser apenas o Mario baixinho");
		return new Mario();
	}

	@Override
	public String retornarTipo() {
		return "Super Mario";
	}

}
