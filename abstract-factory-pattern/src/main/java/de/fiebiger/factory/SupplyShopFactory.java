package de.fiebiger.factory;

import de.fiebiger.model.Customer;
import de.fiebiger.model.Product;
import de.fiebiger.model.SupplyShopCustomer;
import de.fiebiger.model.SupplyShopProduct;


/**
 * Created by tfiebige on 15.03.16.
 */
public class SupplyShopFactory extends WebshopFactory {

	@Override public Customer createCustomer(String email) {
		return new SupplyShopCustomer(email);
	}


	@Override public Product createProduct(String name) {
		return new SupplyShopProduct(name);
	}
}
