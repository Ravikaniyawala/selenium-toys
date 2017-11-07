package de.hauschild.selenium.toys;

import org.openqa.selenium.WebDriver;

/**
 * A web driver factory creates a web driver and initializes it.
 */
interface WebDriverFactory {

  /**
   * Creates the web driver and initializes it.
   * 
   * @param testClass the test class
   * @return the initialized web driver
   */
  WebDriver create(Class<?> testClass);

}
