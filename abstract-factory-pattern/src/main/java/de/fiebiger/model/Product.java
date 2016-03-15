package de.fiebiger.model;

/**
 * Created by tfiebige on 15.03.16.
 */
public abstract class Product {
	private String articleNumber;
	private String name;

	abstract String generateArticleNumber();


	public Product(String name) {
		this.name = name;
		this.articleNumber = generateArticleNumber();
	}


	public String getArticleNumber() {
		return articleNumber;
	}


	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}
}
