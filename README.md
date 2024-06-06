
# First-Test-Automation-Project

Welcome to the First-Test-Automation-Project! This project is designed to automate various testing scenarios for booking flights, filling in blanks, and login functionalities using Java and Selenium.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contact](#contact)

## Project Overview
The First-Test-Automation-Project encompasses automated tests for:
- Booking flights
- Filling in blank fields
- Logging into a system

These automated tests ensure the reliability and functionality of the specified features.

## Technologies Used
- **Java**
- **Selenium WebDriver**

## Installation
To get started with the project, follow these steps:

1. **Clone the repository**
   ```sh
   git clone https://github.com/your-username/First-Test-Automation-Project.git
   cd First-Test-Automation-Project
   ```

2. **Set up your environment**
   - Ensure you have Java installed. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - Install Selenium WebDriver. You can download it from [here](https://www.selenium.dev/downloads/).

3. **Add dependencies**
   - Include the Selenium WebDriver JAR files in your project's build path.

## Usage
To run the tests, execute the test files using your preferred IDE or build tool.

Example using the command line:
```sh
javac -cp .;path\to\selenium-server-standalone-x.xx.x.jar; First-Test-Automation-Project/*.java
java -cp .;path\to\selenium-server-standalone-x.xx.x.jar; First-Test-Automation-Project.BookaFlight
```

## Project Structure
Here is an overview of the project structure:

```
First-Test-Automation-Project/
├── BookaFlight.java       # Automates flight booking functionality
├── FillTheBlank.java      # Automates filling in blank fields
├── LoginTests.java        # Automates login functionality
├── ZAl_Badr.java          # Additional test file
├── extra.java             # Additional test file
├── ll.java                # Additional test file
├── tests.java             # Additional test file
```

### Description of Key Files
- **BookaFlight.java**: Contains scripts to automate booking a flight.
- **FillTheBlank.java**: Contains scripts to automate filling in blank fields.
- **LoginTests.java**: Contains scripts to automate login functionality.
- **ZAl_Badr.java, extra.java, ll.java, tests.java**: Additional test files for various scenarios.

## Contributing
Contributions are welcome! 


## Contact
For any questions or inquiries, please contact:
- Ahmed Elgebali: [LinkedIn](https://linkedin.com/in/ahmedelgebali/) | [Email](elgebalia34@gmail.com)

Thank you for checking out the First-Test-Automation-Project! Happy testing!
