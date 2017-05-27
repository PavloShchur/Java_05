package shop_bag;

import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Methods methods = new Methods();
		boolean work = true;
		Menu menu = new Menu();
		menu.roleOfMan();
		while (work) {
			String choice = s.next();
			switch (choice) {
			case "1":
				menu.adminMenu();
				String adminChoice = s.next();
				switch (adminChoice) {
				case "1":
					methods.addDepartment();
					break;
				case "2":
					methods.deleteDepartment();
					break;
				case "3":
					System.exit(0);
					break;
				default:
					break;
				}
			case "2":
				menu.clientMenu();
				String clientChoice = s.next();
				switch (clientChoice) {
				case "1":
					methods.showGoodsOfDepartment();
					break;
				case "2":
					methods.showGoodsOfAllDepartments();
					break;
				case "3":

					break;

				default:
					break;
				}
				break;
			case "3":
				System.exit(0);
				break;
			}
		}
	}

}
