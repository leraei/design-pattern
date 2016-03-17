package de.fiebiger.designpattern.model;

/**
 * Created by tfiebige on 17.03.16.
 */
public class Flower extends Plant {

	private FlowerType type;
	private String color;


	public Flower(FlowerType type) {
		this.type = type;
	}


	@Override public Flower clone() {
		return (Flower)super.clone();
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public FlowerType getType() {
		return type;
	}


	public void setType(FlowerType type) {
		this.type = type;
	}
}
