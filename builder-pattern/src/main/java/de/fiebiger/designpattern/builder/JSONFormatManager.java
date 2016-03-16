package de.fiebiger.designpattern.builder;

import de.fiebiger.designpattern.file.Attribute;



/**
 * This manager offers functionality to create a json string out of a File object
 * Created by tfiebige on 16.03.16.
 */
public class JSONFormatManager extends FileFormatManager {

	@Override
	public void addAttribute(Attribute attribute) {
		getFile().getAttributes().add(attribute);
	}


	@Override
	public void render() {
		getFile().setCode(renderJsonFromAttributes());
	}


	/**
	 * renders a valid json file from the attributes
	 * @return a valid json
	 */
	private String renderJsonFromAttributes() {
		StringBuilder json = new StringBuilder("{");
		for (Attribute attribute : getFile().getAttributes()) {
			if (json.length() != 1) {
				json.append(",");
			}
			json.append("\"").append(attribute.getKey()).append("\":\"").append(attribute.getValue()).append("\"");
		}
		json.append("}");
		return json.toString();
	}
}
