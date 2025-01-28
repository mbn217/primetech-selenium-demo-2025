# Selenium WebDriver Examples

This project contains examples of using Selenium WebDriver with Java to automate web browser interactions. The examples demonstrate basic browser operations, form interactions, and navigation.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven or Gradle for dependency management
- Google Chrome browser
- ChromeDriver executable

## Setup

1. **Install ChromeDriver**:
    - Download the ChromeDriver from [here](https://sites.google.com/a/chromium.org/chromedriver/downloads).
    - Ensure the ChromeDriver executable is in your system's PATH.

2. **Add Selenium Dependency**:
    - Add jar file for selenium dependency in your project.

## Project Structure

- `src/day3/DriverFunctionsExamples.java`: Demonstrates basic WebDriver functions like opening a URL, getting the title, and quitting the browser.
- `src/day3/TestCase1Example.java`: Automates the login process on Facebook by filling in the email and password fields and clicking the login button.
- `src/day3/TestCase2Example.java`: Automates the account creation process on Facebook by filling in the registration form and submitting it.

## Running the Examples

1. **Compile the project**:
    - TBD

2. **Run the Java classes**:
    - Use your IDE to run the `main` method in each Java class.
    - Alternatively, use the command line:
      ```sh
      java -cp target/classes day3.DriverFunctionsExamples
      java -cp target/classes day3.TestCase1Example
      java -cp target/classes day3.TestCase2Example
      ```

## Notes

- Ensure that the ChromeDriver version matches your installed Chrome browser version.
- The `Thread.sleep` calls are used to pause execution for demonstration purposes. In real-world scenarios, consider using WebDriver's explicit waits.

## License

This project is licensed under the MIT License.


