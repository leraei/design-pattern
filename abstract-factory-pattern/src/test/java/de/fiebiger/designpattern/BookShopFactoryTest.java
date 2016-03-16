package de.fiebiger.designpattern;

import de.fiebiger.designpattern.factory.BookShopFactory;
import de.fiebiger.designpattern.factory.WebshopFactory;
import de.fiebiger.designpattern.model.Product;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
/**
 * Created by Timo on 15.03.16.
 */
public class BookShopFactoryTest {
    @Test
    public void testCreateBookShopProduct() {
            WebshopFactory bookShopFactory = new BookShopFactory();
            Product product = bookShopFactory.createProduct("Hammer");

            assertThat(Integer.valueOf(product.getArticleNumber()), lessThanOrEqualTo(101));
            assertThat(Integer.valueOf(product.getArticleNumber()), greaterThanOrEqualTo(0));
    }
}
