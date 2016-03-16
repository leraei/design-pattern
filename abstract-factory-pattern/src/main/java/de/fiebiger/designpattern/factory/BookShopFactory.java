package de.fiebiger.designpattern.factory;

import de.fiebiger.designpattern.model.BookShopCustomer;
import de.fiebiger.designpattern.model.Product;
import de.fiebiger.designpattern.model.BookShopProduct;
import de.fiebiger.designpattern.model.Customer;


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
