/**
 * package example
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
 * method to greet
 * @author nagayacr
 * @param someone name
 * @return A string data type
 */
  public String greet(final String someone) {
    //return null;
	 String test = null;
	return String.format("Hello, %s!", someone);
  }
}
