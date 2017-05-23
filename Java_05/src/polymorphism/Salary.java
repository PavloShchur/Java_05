package polymorphism;

public class Salary extends Employee {

	private double salary;

	public Salary(String name, String adress, int number, double salary) {
		super(name, adress, number);
		this.salary = salary;
	}

	public void mailCheck() {

	}

	public static void main(String[] args) {

	}

}
