package shop_bag;

public class Menu {
	public void roleOfMan() {
		System.out.println("Enter 1 if you administrator " + "\n" + "Enter 2 if you are client.");
	}

	public void adminMenu() {
		System.out.println("Enter 1 for adding a department. " + "\n" + "Enter 2 for deleting a department. " + "\n"
				+ "Enter 3 for buying" + "\n" + "Enter 4 for main menu. ");

	}

	public void clientMenu() {
		System.out.println("Enter 1 for showing all goods of some department. " + "\n"
				+ "Enter 2 for showing all goods all departments." + "\n" + "Enter 3 for EXIT. " + "\n"
				+ "Enter 3 for buying some goods." + "\n" + "Enter 4 for main menu");

	}

}
