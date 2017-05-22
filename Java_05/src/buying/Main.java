package buying;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Map<Departments, List<Good>> map = new HashMap<>();
	static Good good = new Good();
	static Departments departments;

	public static void main(String[] args) {
		addDepartment();
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

}
