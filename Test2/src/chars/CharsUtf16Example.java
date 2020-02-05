package chars;

public class CharsUtf16Example {

	public static void main(String[] args) {
		// typ variableName = value;
		char d = (char) 100;
		char dd = 'd';
		
		String euro = "\u20AC";
		String e = "\u0404";
		String f = "Ф";
		
		String test = "üäö";
		
		System.out.println(d);
		System.out.println(dd);
		System.out.println(euro);
		System.out.println(e);
		System.out.println(f);
		System.out.println(test);
	}
}