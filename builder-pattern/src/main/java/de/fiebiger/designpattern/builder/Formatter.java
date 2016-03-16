package de.fiebiger.designpattern.builder;

import de.fiebiger.designpattern.file.Attribute;
import de.fiebiger.designpattern.file.File;

import java.util.ArrayList;



/**
 * Use this class to get the final object you want to create
 * Created by tfiebige on 16.03.16.
 */
public class Formatter {

	private ArrayList<Attribute> attributes;
	private File file;

	public Formatter(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}


	/**
	 * With this method you can create the file object
	 * @param formatManager your desired format manager (xml or json)
	 */
	public void doFormat(FileFormatManager formatManager) {
		for (Attribute attribute : attributes) {
			formatManager.addAttribute(attribute);
		}
		formatManager.render();
		file = formatManager.getFile();
	}

	public String getFileContent() {
		return file.getCode();
	}
}
