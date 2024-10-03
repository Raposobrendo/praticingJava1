package estruturaDeRepeticao;

public class StringFunctions {
	public static void main(String[] Args) {
		String original = "abcde FGHIJ ABC abc DEFG       ";
		
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("repalce('a', 'x'): -" + s06 + "-");
		System.out.println("repalce('abc', 'xy'): -" + s07 + "-");
		System.out.println("indexOf: -" + i + "-");
		System.out.println("lastIndexOf: -" + j + "-");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(s);
		System.out.println("-" + word1 + "-");
		System.out.println("-" + word2 + "-");
		System.out.println("-" + word3 + "-");
		
		
		
	}
}

/**
 * Formatar: toLowerCase(), toUpperCase(), trim()
 * Recortar: substring(inicio), substring(inicio, fim)
 * Substituir: Replace(char, char), Replace(string, string)
 * Buscar: IndexOf, LastIndexOf
 * str.Split("") 
 * 
 */
