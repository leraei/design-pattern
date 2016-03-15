package de.fiebiger;

import de.fiebiger.factory.BookShopFactory;
import de.fiebiger.factory.SupplyShopFactory;
import de.fiebiger.factory.WebshopFactory;
import de.fiebiger.model.Product;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Timo on 15.03.16.
 */
public class SupplyShopFactoryTest {
    @Test
    public void testCreateSupplyShopProduct() {
        WebshopFactory supplyShopFactory = new SupplyShopFactory();
        Product product = supplyShopFactory.createProduct("Hammer");

        String uuidRegExp = "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}";
        assertThat(product.getArticleNumber().matches(uuidRegExp), is(true));
    }

}
