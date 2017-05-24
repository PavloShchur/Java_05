package polymorphism;

public class Salary extends Employee {

	private double salary;

	public Salary(String name, String adress, int number, double salary) {
		super(name, adress, number);
		this.salary = salary;
	}

	public void mailCheck() {
		System.out.println("Within mailCheck of salary class.");
		System.out.println("Mailng check to " + getName() + " with salary " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalry) {
		if (newSalry >= 0.0) {
			salary = newSalry;
		}
	}

	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary / 52;
	}

}
