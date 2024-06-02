package iphone;

import iphone.musica.IRepodutorMusical;
import iphone.navegador.INavegadorInternet;
import iphone.telefone.IAparelhoTelefonico;

public class Iphone {
	public static void main(String[] args) {
		
		FuncoesIphone iphone = new FuncoesIphone();
        IRepodutorMusical musica = (IRepodutorMusical) iphone;
        IAparelhoTelefonico telefone = (IAparelhoTelefonico) iphone;
        INavegadorInternet safari = (INavegadorInternet) iphone;
        
        System.out.println("Musica");
        musica.selecionarMusical();
        musica.tocar();
        musica.pausar();
        
        System.out.println("\n");
        
        System.out.println("Ligação");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
        System.out.println("\n");
        
        System.out.println("Safari");
        safari.exibirPagina();
        safari.atualizarPagina();
        safari.adicionarNovaAba();
	}

}
