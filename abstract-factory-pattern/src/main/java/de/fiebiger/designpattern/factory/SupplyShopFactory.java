package de.fiebiger.designpattern.factory;

import de.fiebiger.designpattern.model.Product;
import de.fiebiger.designpattern.model.SupplyShopCustomer;
import de.fiebiger.designpattern.model.Customer;
import de.fiebiger.designpattern.model.SupplyShopProduct;


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
