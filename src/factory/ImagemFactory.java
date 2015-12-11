package factory;

public class ImagemFactory {
	
	public  static Imagem getImagem(String tipoImagem){
		if (tipoImagem.equals("jpg")) return new JPG();
		else if(tipoImagem.equals("bmp")) return new BMP();
		else return null;
	}

}
