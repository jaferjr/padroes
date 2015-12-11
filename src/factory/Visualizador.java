package factory;

public class Visualizador {
	public static void main(String[] args) {
		
		Imagem imagemJPG = ImagemFactory.getImagem("jpg");
		imagemJPG.carregar();
		imagemJPG.exibir();
		imagemJPG.fechar();
		
		Imagem imagemBMP = ImagemFactory.getImagem("bmp");
		imagemBMP.carregar();
		imagemBMP.exibir();
		imagemBMP.fechar();
		
		
		
	}

}
