package de.fiebiger.designpattern.file;

import java.util.ArrayList;



/**
 * This class is the model for our file we want to print in json or xml format
 * Created by tfiebige on 16.03.16.
 */
public class File {
	private ArrayList<Attribute> attributes = new ArrayList<Attribute>();

	private String code;


	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}


	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}
}
