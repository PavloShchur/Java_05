package shop_bag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Methods {
	static Map<Departments, List<Good>> shopMap = new HashMap<>();
	static Good good = new Good();
	static Departments departments;
	static Scanner s = new Scanner(System.in);

	public static void addDepartment() {
		boolean work = true;
		System.out.println("Please enter title of department.");
		String titleOfDepartment = s.next();
		for (Departments d : Departments.values()) {
			if (titleOfDepartment.toUpperCase().equals(d.toString())) {
				System.out.println("Please enter title of good.");
				String titleOFGood = s.next();
				System.out.println("Please enter price of good.");
				int priceOfGood = s.nextInt();
				shopMap.put(d, good.addGood(titleOFGood, priceOfGood));
				for (Map.Entry<Departments, List<Good>> entry : shopMap.entrySet()) {
					System.out.println(entry.getKey() + "/" + entry.getValue());
				}
			} else if (work) {
				System.out.println("Sorry, but we don't have such a department.");
				work = false;
			}
		}
	}

	public static void deleteDepartment() {
		System.out.println("Please enter title of department which you want tp delete.");
		String titleOfDepartment = s.next();
		for (Departments d : Departments.values()) {
			Iterator<Entry<Departments, List<Good>>> it = shopMap.entrySet().iterator();
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

	public static void showGoodsOfDepartment() {
		System.out.println("Enter 1 for BAKERY " + "/n" + "Enter 2 for  GROCERY " + "/n" + "Enter 3 for PETS.");
		String typeOfDepartment = s.next();
		for (Map.Entry<Departments, List<Good>> entry : shopMap.entrySet()) {
			if (typeOfDepartment.equalsIgnoreCase(entry.getKey().name())) {
				System.out.println(entry.getKey() + "/" + entry.getValue());
			} else {
				System.out.println("Sorry, but we don't have such a department.");
			}
		}
	}

	public static void showGoodsOfAllDepartments() {
		for (Map.Entry<Departments, List<Good>> entry : shopMap.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
	}

	public static void buyGood() {
		List<String> shopBag = new ArrayList<>();
		System.out.println("Enter title of good which you want to buy.");
		String wantedProduct = s.next();
		for (int i = 0; i < shopMap.size(); i++) {
			if (wantedProduct.equalsIgnoreCase(shopMap.get(i).toString())) {
				shopBag.add(shopMap.get(i).toString());
				shopMap.remove(shopMap.get(i).toString());
				System.out.println("Your goods are " + shopBag);
			}
		}

	}

}
