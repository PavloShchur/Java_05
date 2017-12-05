package innerClasses;

public class Outer {
	static class Nested_Demo {
		public void my_method() {
			System.out.println("This is my nested class.");
		}
	}
		public static void main(String[] args) {
			Outer.Nested_Demo nested_Demo = new Outer.Nested_Demo();
			nested_Demo.my_method();
		}
}