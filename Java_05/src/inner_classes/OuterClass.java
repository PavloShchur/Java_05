package inner_classes;

public class OuterClass {

	void my_Method() {
		int num = 23;
		class MethodInner_Demo {
			public void print() {
				System.out.println("This is method inner class " + num + " .");
			}
		}

		MethodInner_Demo methodInner_Demo = new MethodInner_Demo();
		methodInner_Demo.print();

	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.my_Method();
	}

}
