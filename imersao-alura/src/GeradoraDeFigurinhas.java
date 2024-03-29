import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradoraDeFigurinhas {
	
	void cria(InputStream inputStream, String nomeArquivo) throws Exception {
		
		//leitura imagem
		//InputStream inputStream = 
		//		new FileInputStream(new File("entrada/filme.jpg") );
//		InputStream inputStream = 
//				new URL("https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@.jpg")
//				.openStream();
		BufferedImage imagemOriginal = ImageIO.read(inputStream);
		
		//cria nova imagem em mem�ria com transpar�ncia e com tamanho novo
		int largura = imagemOriginal.getWidth();
		int altura = imagemOriginal.getHeight();
		int novaAltura = altura + 200;
		BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
		
		//copiar a imagem original para nova imagem (em mem�ria)
		Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
		graphics.drawImage(imagemOriginal, 0, 0, null);
		
		//configurar fonte
		var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
		graphics.setColor(Color.YELLOW);
		graphics.setFont(fonte);
		
		//escrever uma frase na nova imagem
		graphics.drawString("TOPZERA", 100, novaAltura - 100);
		
		//escrever nova imagem em um artigo
		ImageIO.write(novaImagem, "png", new File(nomeArquivo));
	}
	
}
