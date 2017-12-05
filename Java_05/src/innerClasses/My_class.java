package innerClasses;

public class My_class {

	public static void main(String[] args) {
		Outer_demo demo = new Outer_demo();
		demo.display_inner();
	}
}

class Outer_demo {
	int num;

	private class Inner_demo {
		public void print() {
			System.out.println("This is an inner class.");
		}
	}

	void display_inner() {
		Inner_demo inner_demo = new Inner_demo();
		inner_demo.print();
	}
}
