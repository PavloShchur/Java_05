package polymorphism;

public class Employee {

	private String name;
	private String adress;
	private int number;

	public Employee(String name, String adress, int number) {
		System.out.println("Constructing an employee");
		this.name = name;
		this.adress = adress;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", adress=" + adress + ", number=" + number + "]";
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.adress);
	}

}
