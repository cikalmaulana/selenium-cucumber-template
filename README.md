# Selenium Cucumber Template
This repository contains a template for using Selenium with Cucumber in a Java project. The template is designed to automate web testing using the Selenium WebDriver library and Cucumber framework.

# Prerequisites
Before getting started, make sure you have the following prerequisites installed:

* Java SDK 17
* Chrome browser
* ChromeDriver executable

# Folder Structure
The folder structure of the project is organized as follows:

* src/main/java/Pages: Contains page object classes that represent the different pages of the web application under test.
* src/main/java/Runner: Contains the TestRunner class that executes the Cucumber tests.
* src/main/java/StepDefinition: Contains the step definition classes that define the mapping between Cucumber feature files and the corresponding automation steps.
* src/main/java/Utils: Contains utility classes or helper methods that can be used across the test framework.
* src/main/resources/properties: Contains the browser.properties file where the base URL of the web application is defined.
* src/main/resources/scenario: Contains the Cucumber feature files that define the test scenarios.
* drivers: Should contain the ChromeDriver executable.

# Getting Started
1. Clone the repository to your local machine.
2. Download and install Java SDK 17 from the official website: Java SE Development Kit 17 Downloads.
3. Download the ChromeDriver executable and place it in the drivers folder.
4. Open the browser.properties file located in src/main/resources/properties and update the base.url property to the desired base URL of the web application under test (e.g., http://the-internet.herokuapp.com/login).

# Running the Tests
To run the tests, follow these steps:

1. Open the TestRunner class located in src/main/java/Runner.
2. Right-click on the file and select "Run" or "Run As" > "Java Application".
3. The test execution will start, and the specified base URL will be automatically opened in the Chrome browser.
4. Please note that this template assumes you are using Selenium with the Chrome browser. If you intend to use a different browser, make sure to download the appropriate driver and update the configuration accordingly.

Feel free to customize the template according to your specific testing requirements and add additional features or enhancements as needed.

Happy testing!
