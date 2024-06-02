package iphone;

import iphone.musica.IRepodutorMusical;
import iphone.navegador.INavegadorInternet;
import iphone.telefone.IAparelhoTelefonico;

public class FuncoesIphone implements IAparelhoTelefonico, IRepodutorMusical, INavegadorInternet{

	@Override
	public void exibirPagina() {
		 System.out.println("Pagina via Safari");
		
	}

	@Override
	public void adicionarNovaAba() {
		 System.out.println("Adicionando nova pagina via Safari");
		
	}

	@Override
	public void atualizarPagina() {
		 System.out.println("Atualizando a pagina via Safari");
		
	}

	@Override
	public void selecionarMusical() {
		System.out.println("Escolhendo musica via Spotify");
		
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo musica via Spotify");
		
	}

	@Override
	public void pausar() {
		System.out.println("Parado na musica via Spotify");
		
	}

	@Override
	public void ligar() {
		 System.out.println("Ligando via telefone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo via telefone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz");
		
	}

}
