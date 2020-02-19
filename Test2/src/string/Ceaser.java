package string;

public class Ceaser {

	public static void main(String[] args) {
		String test = "babatututut";
		System.out.println("text : " + test);
		char[] clearText = test.toCharArray();
		
		// TODO homework
		int key = -10;

		char[] encrypted = new char[clearText.length];

		for (int index = 0; index < clearText.length; index++) {
			encrypted[index] = encryptChar(key, clearText[index]);
		}
		System.out.println("encrypted : " + new String(encrypted));

		for (int index = 0; index < encrypted.length; index++) {
			System.out.print(decryptChar(key, encrypted[index]));
		}
	}

	static char decryptChar(int key, char ch) {
		int index = getIndexTo(ch);
		// TODO homework
		int value = (Math.abs(25 - (key - index)) % 25);
//		int value = (Math.abs((25 - (key - index) % 25)));

		return getCharTo(value);
	}

	static char encryptChar(int key, char ch) {
		int index = getIndexTo(ch);
		int value = (key + index) % 25;

		return getCharTo(value);
	}

	static int getIndexTo(char ch) {
		char[] alphabet = getAlphabet();
		for (int index = 0; index < alphabet.length; index++) {
			if (ch == alphabet[index]) {
				return index;
			}
		}
		return -1;
	}

	static char getCharTo(int index) {
		char[] alphabet = getAlphabet();

		// TODO possible solution
//		return alphabet[index];

		for (int idx = 0; idx < alphabet.length; idx++) {
			if (idx == index) {
				return alphabet[idx];
			}
		}
		return '~';
	}

	static char[] getAlphabet() {
		// 1d char array
		char[] alphabet = new char[26];

		int counter = 97;
		for (int index = 0; index < alphabet.length; index++) {
//			System.out.println("set index to " + index);
			if (counter >= 97 && counter <= 122) {
//				System.out.println("set counter " + counter + " char is " + (char) counter);
				alphabet[index] = (char) counter;
			}
			counter++;
		}

		return alphabet;
	}
}