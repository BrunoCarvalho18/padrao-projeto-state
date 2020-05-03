package br.com.dominio.marionete;

import br.com.dominio.state.State;

public class MarioInvencivel implements State{

	@Override
	public State pegarCogumelo() {
		System.out.println("Pegou um cogumelo: Seu estado ainda é invencível");
		return this;
	}

	@Override
	public State pegarEstrela() {
		System.out.println("Pegou uma estrela: Mario está invencível");
		return this;
	}

	@Override
	public State pegarFlorDeFogo() {
		System.out.println("Pegou uma flor: Mario atira fogo e ainda está invencível");
		return this;
	}

	@Override
	public State colidirComInimigo() {
		System.out.println("Colidiu com o inimgo: o inimigo morreu");
		return this;
	}

	@Override
	public String retornarTipo() {
		return "Mario Invencivel";
	}

}
