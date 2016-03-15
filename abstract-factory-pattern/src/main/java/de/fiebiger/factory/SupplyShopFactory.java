package de.fiebiger.factory;

import de.fiebiger.model.Customer;
import de.fiebiger.model.Product;



/**
 * Created by tfiebige on 15.03.16.
 */
public class SupplyShopFactory extends WebshopFactory {

	@Override public Customer createCustomer() {
		return null;
	}


	@Override public Product createProduct() {
		return null;
	}
}
