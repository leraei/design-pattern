package de.fiebiger;

import de.fiebiger.factory.BookShopFactory;
import de.fiebiger.factory.WebshopFactory;
import de.fiebiger.model.Product;
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
