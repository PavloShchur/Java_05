package nestedClasses;

public class InnerClazz {

	private int n = 99;

	class Inner {

		public int showNumber() {
			System.out.println("Your number is " + n);
			return n;
		}

		public void someWord() {
			System.out.println("some word");
		}
	}

	public void takeAWord() {
		Inner inner = new Inner();
		inner.someWord();
	}
}
