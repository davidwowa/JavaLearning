package wordgenerator;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		char[] word = new char[4];
		for (int i = 0; i < 10000000; i++) {
			for (int j = 0; j < word.length; j++) {
				int r = random.nextInt(127);
				while (r < 97 || r > 122) {
					r = random.nextInt(127);
				}
				word[j] = (char) r;
			}
			String testWord = new String(word);
			System.out.println(i + " : " + testWord);
			if (testWord.equals("baum")) {
				System.out.println("habe " + i + " mal probiert bis wort baum generiert wurde");
				System.exit(0);
			}
		}
	}
}