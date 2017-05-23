package inheritance;

public class Subclass extends Superclass {

	Subclass(int age) {
		super(age);
	}

	public static void main(String[] args) {
		Subclass subclass = new Subclass(24);
		subclass.getAge();

	}

}
