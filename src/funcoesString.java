
public class funcoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ Abc abc DEFG -  ";
		
		String converterParaMinuscula = original.toLowerCase();
		String converterParaMaiuscula = original.toUpperCase();
		String eliminaEspaco = original.trim();
		String substituirString = original.substring(2);
		String substituirStringIniFim = original.substring(2, 9);
		String trocaCaracter = original.replace('a', 'x');
		String trocaSubstring = original.replace("abc", "xy");
		
		int posicaoDaLetra = original.indexOf("bc");
		int posicaoFinalDaLetra = original.lastIndexOf("bc");
		
		System.out.println(original);
		System.out.println(converterParaMinuscula);
		
		System.out.println(original);
		System.out.println(converterParaMaiuscula);
		
		System.out.println(original);
		System.out.println(eliminaEspaco);
		
		System.out.println(original);
		System.out.println(substituirString);
		
		System.out.println(original);
		System.out.println(substituirStringIniFim);
		
		System.out.println(original);
		System.out.println(trocaCaracter);
		
		System.out.println(original);
		System.out.println(trocaSubstring);
		
		System.out.println(original);
		System.out.println("Index Of bc - Inicial : " + posicaoDaLetra + " Last Index Of: " + posicaoFinalDaLetra );
		
		
		
				

	}

}
