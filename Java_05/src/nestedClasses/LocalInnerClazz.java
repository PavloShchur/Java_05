package nestedClasses;

public class LocalInnerClazz {

	void someMethod() {
		int Number = 30;
		class MethodClass {
			public void showWord() {
				System.out.println("Some word" + " " + Number);
			}
		}

		MethodClass methodClass = new MethodClass();
		methodClass.showWord();
	}
}
