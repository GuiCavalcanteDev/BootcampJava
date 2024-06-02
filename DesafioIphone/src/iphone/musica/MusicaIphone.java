package iphone.musica;

public class MusicaIphone implements IRepodutorMusical{

	@Override
	public void selecionarMusical() {
		System.out.println("Tocando Música");
		
	}

	@Override
	public void tocar() {
		System.out.println("Selecione a música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pause");
		
	}

}
