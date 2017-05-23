package buying;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static Map<Departments, List<Good>> map = new HashMap<>();
	static Good good = new Good();
	static Departments departments;

	public static void main(String[] args) {
		boolean work = true;
		try (Scanner s = new Scanner(System.in)) {
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
						addDepartment();
						break;
					case "2":
						addDepartment();
						break;
					case "3":
						addDepartment();
						break;
					default:
						break;
					}
				case "2":
					menu.clientMenu();
					break;
				case "3":
					System.exit(0);
					break;
				}
			}
		}

	}

	public static void addDepartment() {
		try (Scanner s = new Scanner(System.in)) {
			boolean work = true;
			System.out.println("Please enter title of department.");
			String titleOfDepartment = s.next();
			for (Departments d : Departments.values()) {
				if (titleOfDepartment.toUpperCase().equals(d.toString())) {
					System.out.println("Please enter title of good.");
					String titleOFGood = s.next();
					System.out.println("Please enter price of good.");
					int priceOfGood = s.nextInt();
					map.put(d, good.addGood(titleOFGood, priceOfGood));
					for (Map.Entry<Departments, List<Good>> entry : map.entrySet()) {
						System.out.println(entry.getKey() + "/" + entry.getValue());
					}
					work = true;
				} else {
					System.out.println("Sorry, but we don't have such a department.");

				}
			}

		}
	}

	public static void deleteDepartment() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Please enter title of department which you want tp delete.");
			String titleOfDepartment = s.next();
			for (Departments d : Departments.values()) {
				Iterator<Entry<Departments, List<Good>>> it = map.entrySet().iterator();
				while (it.hasNext()) {
					it.next();
					if (titleOfDepartment.toUpperCase().equals(d.toString())) {
						it.remove();
						showGoodsOfAllDepartments();
					} else {
						System.out.println("Sorry, but we don't have such a department.");

					}
				}

			}
		}
	}

	public static void showGoodsOfDepartment() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter 1 for BAKERY " + "/n" + "Enter 2 for  GROCERY " + "/n" + "Enter 3 for PETS.");
			String typeOfDepartment = s.next();
			for (Map.Entry<Departments, List<Good>> entry : map.entrySet()) {
				if (typeOfDepartment.equalsIgnoreCase(entry.getKey().name())) {
					System.out.println(entry.getKey() + "/" + entry.getValue());
				} else {
					System.out.println("Sorry, but we don't have such a department.");

				}

			}
		}
	}

	public static void showGoodsOfAllDepartments() {
		for (Map.Entry<Departments, List<Good>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}

}
