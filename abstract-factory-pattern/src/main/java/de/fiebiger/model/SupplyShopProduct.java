package de.fiebiger.model;

import java.util.UUID;



/**
 * Created by tfiebige on 15.03.16.
 */
public class SupplyShopProduct extends Product {

	public SupplyShopProduct(String name) {
		super(name);
	}


	/**
	 * The supply shop generate its order numbers by a UUID
	 * @return a fresh generated UUID
	 */
	@Override
	public String generateArticleNumber() {
		return UUID.randomUUID().toString();
	}
}
