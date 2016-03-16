package de.fiebiger.builder;

import de.fiebiger.file.Attribute;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



/**
 * Created by tfiebige on 16.03.16.
 */
public class XMLFormatManagerTest {
	@Test
	public void testAddAttribute() {
		Attribute attribute1 = new Attribute("name", "foo");
		Attribute attribute2 = new Attribute("gender", "bar");

		XMLFormatManager xmlFormatManager = new XMLFormatManager();
		xmlFormatManager.addAttribute(attribute1);
		xmlFormatManager.addAttribute(attribute2);

		ArrayList<Attribute> attributes = xmlFormatManager.getFile().getAttributes();
		assertThat(attributes.size(), is(2));
		assertThat(attributes.get(0), is(attribute1));
		assertThat(attributes.get(1), is(attribute2));
	}

	@Test
	public void testRender() {
		Attribute attribute1 = new Attribute("name", "foo");
		Attribute attribute2 = new Attribute("gender", "bar");

		XMLFormatManager xmlFormatManager = new XMLFormatManager();
		xmlFormatManager.addAttribute(attribute1);
		xmlFormatManager.addAttribute(attribute2);

		xmlFormatManager.render();

		assertThat(xmlFormatManager.getFile().getCode(), is("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><name>foo</name><gender>bar</gender>"));
	}

}
