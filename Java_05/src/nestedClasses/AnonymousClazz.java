package nestedClasses;

interface Message {
	String greetings();
}

abstract class Anon {
	public abstract void someMethod();

	public abstract void someMethod1();

	public abstract void someMethod2();

	public abstract void someMethod3();
}

public class AnonymousClazz {
	public void innerMethod() {
		Anon anon = new Anon() {

			@Override
			public void someMethod() {
				System.out.println("some word from anonymous class");
			}

			@Override
			public void someMethod1() {
				System.out.println("someMethod1");
			}

			@Override
			public void someMethod2() {
				System.out.println("someMethod2");

			}

			@Override
			public void someMethod3() {
				System.out.println("someMethod3");

			}
		};
		// from abstract class you do not have to use all methods
		anon.someMethod();
	}

	public void showMessage(Message message) {
		System.out.println(message.greetings() + "Good day");
	}

	public void innerClassAsArgument() {
		AnonymousClazz anonymousClazz = new AnonymousClazz();
		anonymousClazz.showMessage(new Message() {

			@Override
			public String greetings() {
				return "friends";
			}
		});
	}

}
