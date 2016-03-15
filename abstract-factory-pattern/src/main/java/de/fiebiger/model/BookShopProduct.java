package de.fiebiger.model;

/**
 * Created by tfiebige on 15.03.16.
 */
public class BookShopProduct extends Product {

	public BookShopProduct(String name) {
		super(name);
	}


	/**
	 * The Book Shop asks the Databse for the next free ID
	 * @return the next free Order number
	 */
	@Override String generateArticleNumber() {
		return getNextIdFromDatabase();
	}


	private String getNextIdFromDatabase() {
		return String.valueOf((int)(Math.random() * 100));
	}
}
