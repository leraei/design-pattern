package de.fiebiger.designpattern;

/**
 * Singleton class for creating new orderNumbers.
 * Note: This class is final to be safe against inheritance
 * Created by tfiebige on 14.03.16.
 */
public final class OrderNumberGenerator {

	private static OrderNumberGenerator instance;

	private int orderNumber;


	/**
	 * The singleton pattern needs the constructor to be private
	 */
	private OrderNumberGenerator() {
		/* For this demo i decided to initialize the ordernumber always with 0.
		You will run into problems when rebooting if you don't persist this value. */
		orderNumber = 0;
	}


	/**
	 * Call this static method to get an instance of this class. It will always be the same
	 *
	 * @return the singleton instance of this class
	 */
	public static OrderNumberGenerator getInstance() {
		if (instance == null) {
			instance = new OrderNumberGenerator();
		}
		return instance;
	}


	/**
	 * This method generates a new and unique orderNumber
	 *
	 * @return the generated orderNumber
	 */
	public int generateNewOrderNumber() {
		return ++orderNumber;
	}

}
