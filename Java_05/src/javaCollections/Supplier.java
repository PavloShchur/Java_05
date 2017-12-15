package javaCollections;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

	private String name;
	private int weight;

	private final List<Product> products = new ArrayList<>();

	public int getWeight() {
		return weight;
	}

	public Supplier(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public Supplier(String name) {
		super();
		this.name = name;
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
