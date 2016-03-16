package de.fiebiger.builder;

import de.fiebiger.file.Attribute;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



/**
 * Created by tfiebige on 16.03.16.
 */
public class JSONFormatManagerTest {

	@Test
	public void testAddAttribute() {
		Attribute attribute1 = new Attribute("name", "foo");
		Attribute attribute2 = new Attribute("gender", "bar");

		JSONFormatManager jsonFormatManager = new JSONFormatManager();
		jsonFormatManager.addAttribute(attribute1);
		jsonFormatManager.addAttribute(attribute2);

		ArrayList<Attribute> attributes = jsonFormatManager.getFile().getAttributes();
		assertThat(attributes.size(), is(2));
		assertThat(attributes.get(0), is(attribute1));
		assertThat(attributes.get(1), is(attribute2));
	}

	@Test
	public void testRender() {
		Attribute attribute1 = new Attribute("name", "foo");
		Attribute attribute2 = new Attribute("gender", "bar");

		JSONFormatManager jsonFormatManager = new JSONFormatManager();
		jsonFormatManager.addAttribute(attribute1);
		jsonFormatManager.addAttribute(attribute2);

		jsonFormatManager.render();

		assertThat(jsonFormatManager.getFile().getCode(), is("{\"name\":\"foo\",\"gender\":\"bar\"}"));
	}
}
