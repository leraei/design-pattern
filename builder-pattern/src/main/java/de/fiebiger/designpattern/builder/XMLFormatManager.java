package de.fiebiger.designpattern.builder;

import de.fiebiger.designpattern.file.Attribute;


/**
 * This manager offers functionality to create a xml string out of a File object
 * Created by tfiebige on 16.03.16.
 */
public class XMLFormatManager extends FileFormatManager{

	@Override
	public void addAttribute(Attribute attribute) {
		getFile().getAttributes().add(attribute);
	}


	@Override
	public void render() {
		getFile().setCode(renderXMLFromAttributes());
	}

	/**
	 * renders a valid xml file from the attributes
	 * @return a valid xml
	 */
	private String renderXMLFromAttributes() {
		StringBuilder json = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
		for (Attribute attribute : getFile().getAttributes()) {
			json.append("<").append(attribute.getKey()).append(">")
					.append(attribute.getValue())
					.append("</").append(attribute.getKey()).append(">");
		}
		return json.toString();
	}

}
