package javaCollections;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
	private final String name;
	private final int weight;

	private final List<Product> products = new ArrayList<>();

	public int getWeight() {
		return weight;
	}

	public Supplier(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public List<Product> getProducts() {
		return products;
	}

	@Override
	public String toString() {
		return "Supplier{" + "name='" + name + '\'' + ", products=" + products + '}';
	}
}
