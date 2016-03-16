package de.fiebiger.builder;

import de.fiebiger.file.Attribute;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;



/**
 * Created by tfiebige on 16.03.16.
 */
public class FormatterTest {

	ArrayList<Attribute> attributes;


	@Before
	public void init() {
		attributes = new ArrayList<Attribute>();
		attributes.add(new Attribute("name", "foo"));
		attributes.add(new Attribute("gender", "bar"));
	}

	@Test
	public void testDoFormatForJson() {
		Formatter formatter = new Formatter(attributes);
		formatter.doFormat(new JSONFormatManager());
		assertThat(formatter.getFileContent(), is("{\"name\":\"foo\",\"gender\":\"bar\"}"));
	}

	@Test
	public void testDoFormatForXML() {
		Formatter formatter = new Formatter(attributes);
		formatter.doFormat(new XMLFormatManager());
		assertThat(formatter.getFileContent(), is(is("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><name>foo</name><gender>bar</gender>")));

	}

}
