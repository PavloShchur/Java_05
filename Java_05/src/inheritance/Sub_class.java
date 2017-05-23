package inheritance;

public class Sub_class extends Super_class {

	int num = 10;

	public void display() {
		System.out.println("This is the display method of subclass.");
	}

	public void my_method() {
		Sub_class sub_class = new Sub_class();
		sub_class.display();
		super.display();

		System.out.println("value of the variable named num in the subcass: " + sub_class.num);
		System.out.println("value of the variable named num in the subcass: " + super.num);

	}

	public static void main(String[] args) {
		Sub_class sub_class = new Sub_class();
		sub_class.my_method();
	}

}
