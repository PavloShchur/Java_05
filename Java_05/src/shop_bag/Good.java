package shop_bag;

import java.util.ArrayList;
import java.util.List;

public class Good {

	private String titleOfGood;
	private int price;

	public Good() {

	}

	public Good(String titleOfGood, int price) {
		super();
		this.titleOfGood = titleOfGood;
		this.price = price;
	}

	public String getTitleOfGood() {
		return titleOfGood;
	}

	public void setTitleOfGood(String titleOfGood) {
		this.titleOfGood = titleOfGood;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [titleOfGood=" + titleOfGood + ", price=" + price + "]";
	}

	public List<Good> addGood(String titleOFGood, int price) {
		Good good = new Good(titleOFGood, price);
		List<Good> goods = new ArrayList<Good>();
		goods.add(good);
		return goods;
	}

}
