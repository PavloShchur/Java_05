package innerClasses;

public class My_class2 {

	public static void main(String[] args) {
		Outer_Demo1 outer = new Outer_Demo1();
		Outer_Demo1.Inner_Demo1 inner = outer.new Inner_Demo1();
		System.out.println(inner.getnum());
	}

}

class Outer_Demo1 {
	private int num = 175;

	public class Inner_Demo1 {
		public int getnum() {
			System.out.println("This is a getnum method of the inner class.");
			return num;
		}
	}
}