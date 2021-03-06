package de.fiebiger.designpattern;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;



/**
 * Created by tfiebige on 14.03.16.
 */
public class OrderNumberGeneratorTest {




	@Test
	public void testGenerateNewOrderNumber() {
		OrderNumberGenerator orderNumberGenerator = OrderNumberGenerator.getInstance();
		int firstOrder = orderNumberGenerator.generateNewOrderNumber();
		assertThat(firstOrder, is(1));

		orderNumberGenerator = OrderNumberGenerator.getInstance();
		int secondOrder = orderNumberGenerator.generateNewOrderNumber();
		assertThat(secondOrder, is(2));

		orderNumberGenerator = OrderNumberGenerator.getInstance();
		int thirdOrder = orderNumberGenerator.generateNewOrderNumber();
		assertThat(thirdOrder, is(3));
	}



}
