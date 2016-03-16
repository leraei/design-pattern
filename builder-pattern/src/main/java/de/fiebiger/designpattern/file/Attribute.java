package de.fiebiger.designpattern.file;

/**
 * this is a attribute of our file
 * Created by tfiebige on 16.03.16.
 */
public class Attribute {
	private String key;
	private String value;


	public Attribute(String key, String value) {
		this.key = key;
		this.value = value;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}
}
