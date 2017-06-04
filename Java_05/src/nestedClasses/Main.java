package nestedClasses;

public class Main {

	public static void main(String[] args) {

		// nested class
		InnerClazz innerClazz = new InnerClazz();
		innerClazz.takeAWord();

		InnerClazz.Inner inner = new InnerClazz().new Inner();
		System.out.println(inner.showNumber());

		// local inner class
		LocalInnerClazz localInnerClazz = new LocalInnerClazz();
		localInnerClazz.someMethod();

		// nested static inner class
		SaticInnerClazz.StaticInner inner2 = new SaticInnerClazz.StaticInner();
		inner2.showWord();

		// nested anonymous class
		AnonymousClazz anonymousClazz = new AnonymousClazz();
		anonymousClazz.innerMethod();

		anonymousClazz.innerClassAsArgument();

	}
}
