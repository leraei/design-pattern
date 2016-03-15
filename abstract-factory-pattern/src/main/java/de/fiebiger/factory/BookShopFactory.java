package de.fiebiger.factory;

import de.fiebiger.model.BookShopCustomer;
import de.fiebiger.model.BookShopProduct;
import de.fiebiger.model.Customer;
import de.fiebiger.model.Product;



/**
 * Created by tfiebige on 15.03.16.
 */
public class BookShopFactory extends WebshopFactory {

	@Override public Customer createCustomer(String email) {
		return new BookShopCustomer(email);
	}


	@Override public Product createProduct(String name) {
		return new BookShopProduct(name);
	}
}
