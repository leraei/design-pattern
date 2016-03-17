package de.fiebiger.designpattern.model;

/**
 * Created by tfiebige on 17.03.16.
 */
public class Tree extends Plant {

	private TreeType type;
	private int height;


	public Tree(TreeType type) {
		this.type = type;
	}


	@Override public Tree clone() {
		return (Tree)super.clone();
	}

	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public TreeType getType() {
		return type;
	}


	public void setType(TreeType type) {
		this.type = type;
	}
}
