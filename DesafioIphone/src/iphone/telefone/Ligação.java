package iphone.telefone;

public class Ligação implements IAparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("Ligar");
		
	}

	@Override
	public void atender() {
		System.out.println("Atender");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Ligação não atendida, iniciando correio de voz");
		
	}

}
