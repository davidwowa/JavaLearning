package tests;

public class Modulo {
	public static void main(String[] args) {
		int start = -100;
		int end = 50;

		for (int i = start; i <= end; i++) {
			System.out.println(i + "\t : \t" + i % 25);
		}
	}
}