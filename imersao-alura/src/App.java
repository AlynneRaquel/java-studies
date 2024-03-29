import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) throws Exception {
		
		//fazer uma conex�o HTTTP e buscar os top 250 filmes
		String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
		
		var http = new ClienteHttp();
		String json = http.buscaDados(url);
		
		//Exibir e manipular os dados
		ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();
		List<Conteudo> conteudos = extrator.extraiConteudos(json);
		
		var geradora = new GeradoraDeFigurinhas();
		
		for (int i = 0; i < 3; i++) {
		
			Conteudo conteudo = conteudos.get(i);

			InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
			String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

			geradora.cria(inputStream, nomeArquivo);

			System.out.println(conteudo.getTitulo());
			System.out.println();
		}
		
		
	
		
	}

}
