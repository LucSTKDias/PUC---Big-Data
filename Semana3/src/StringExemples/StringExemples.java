package StringExemples;

public class StringExemples {
	public static void main(String[] args) {
		String txt;
		
		txt = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
		System.out.println("Comprimento de [" + txt + "] = " + txt.length());
		
		txt = "Olá Mundo!";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		txt = "Localize a palavra 'eureka' neste texto!";
		System.out.println(txt.indexOf("eureka"));
	}

}
