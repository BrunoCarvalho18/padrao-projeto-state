package br.com.dominio.principal;

import br.com.dominio.marionete.SuperMario;
import br.com.dominio.state.State;

public class Principal {

	public static void main(String[] args) {

		State mario = new SuperMario();
		mario = mario.pegarCogumelo();
		mario = mario.pegarFlorDeFogo();
		mario = mario.pegarCogumelo();

		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();
		mario = mario.colidirComInimigo();
		
        System.out.println();
		System.out.println("Estado final: " + mario.retornarTipo());

	}

}
