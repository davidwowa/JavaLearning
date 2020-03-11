package phonebook;

import java.util.Scanner;

public class PhoneBookMain {
	// Create
	// Read
	// Update
	// Delete
	public static void main(String[] args) {
		// 0. set enviroment
		Scanner scanner = new Scanner(System.in);
		// 1. create phonebook as array
		Person[] phoneBook = new Person[3];
		// 2. user data input
		for (int index = 0; index < phoneBook.length; index++) {

			Person person = new Person();

			System.out.println("Bitte Name eingeben:\n");
			person.name = scanner.next();
			System.out.println("Bitte Vorname eingeben:\n");
			person.vorname = scanner.next();
			System.out.println("Bitte TelefonNr eingeben:\n");
			person.telNr = scanner.next();

			phoneBook[index] = person;
		}

		scanner.close();
		// 3. show data on console
		for (int index = 0; index < phoneBook.length; index++) {
			System.out.println(phoneBook[index].toString());
		}
	}
}