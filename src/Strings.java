
public class Strings {

	public static void main(String[] args) {
		/*
		=== FUNCOES PARA STRING ===
		- Formatar para minusculo/ maiusculo: toLowerCase(), toUpperCase()
		- Remover espacos: trim();
		- Substituir: Replace(char, char) ou Replace(string, string)
		- Buscar: indexOf, lastIndexOf
		- str.split(""): separar de acordo com o separador
		- substring(index) : Cria uma nova string a partir do index fornecido
		*/
		String original = " abcde FGHIJ ABC DEFG  ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(3);
		String s05 = original.substring(3, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int k = original.lastIndexOf("bc");		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(3): -" + s04 + "-");
		System.out.println("substring(3, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("indexOf('bc'): -" + i + "-");
		System.out.println("lastIndexOf('bc'): -" + k + "-");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

	}

}
