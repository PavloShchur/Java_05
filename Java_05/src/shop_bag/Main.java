package shop_bag;

import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Methods methods = new Methods();
		boolean work = true;
		boolean work2 = true;
		boolean work3 = true;
		Menu menu = new Menu();
		menu.roleOfMan();
		while (work) {
			String choice = s.next();
			switch (choice) {
			case "1":
				menu.adminMenu();
				while (work2) {
					String adminChoice = s.next();
					switch (adminChoice) {
					case "1":
						methods.addDepartment();
						break;
					case "2":
						methods.deleteDepartment();
						break;
					case "3":
						menu.roleOfMan();
						break;
					}
				}
			case "2":
				menu.clientMenu();
				while (work3) {
					String clientChoice = s.next();
					switch (clientChoice) {
					case "1":
						methods.showGoodsOfDepartment();
						break;
					case "2":
						methods.showGoodsOfAllDepartments();
						break;
					case "3":
						methods.buyGood();
						break;
					case "4":
						menu.roleOfMan();
						break;
					default:
						break;
					}
				}
			case "3":
				System.exit(0);
				break;
			}
		}
	}

}
