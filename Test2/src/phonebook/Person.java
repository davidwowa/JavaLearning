package phonebook;

public class Person {
	String name;
	String vorname;
	String telNr;

	@Override
	public String toString() {
		return "Person [name=" + name + ", vorname=" + vorname + ", telNr=" + telNr + "]";
	}
}