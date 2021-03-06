package de.fiebiger.designpattern.model;

/**
 * Baseclass for all existing Forrestplants
 * Created by tfiebige on 17.03.16.
 */
public abstract class Plant implements Cloneable{
	private int age;

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
}
