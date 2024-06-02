package iphone.navegador;

public class Safari implements INavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Pagina aberta");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova pagina");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
		
	}

}
