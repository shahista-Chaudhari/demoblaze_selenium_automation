<!-- PROJECT HEADER -->
<p align="center">
  <!--PROJECT TITLE AND DESCRIPTION -->
 <h1 align="center">Automation of DemoBlaze Product Store Web Application Using Selenium and TestNG</h1>

  <p align="center">
    A web automation project to automate testing process Online Store built using Selenium & TestNG in Java.
    <br /><br/>
    <a href="https://www.linkedin.com/in/Shahista Chaudhari">
        <img src="https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555"
            alt="follow on LinkedIn"></a>
    <a href="">
  </p>
</p>
<hr>

<!-- ABOUT THE PROJECT -->

## About The Project
The objective of this project is to automate key functionalities of [DemoBlaze](https://www.demoblaze.com/index.html) product store web application using Selenium WebDriver integrated with TestNG for test management. The project covers automating user signup, login, adding products to the cart, and placing an order. TestNG is used for organizing and running test cases efficiently, generating detailed reports, and handling assertions for validating each functionality.

![Automation Demonstration](./demo.gif)


### Built With
* [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) as programming language
* [Maven](https://maven.apache.org/) for Package Management and Build Automation
* [Selenium](https://www.selenium.dev/) for Web Automation
* [TestNG](https://testng.org/) for Java testing framework that supports annotations, parallel execution, and detailed reporting for efficient test automation.

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites
  Basic understanding of Java with Maven, Selenium and TestNG.

### Running the project
Steps are listed below to get this project up and running in your development environment.

* Setup Java with JDK 1.8. For reference: Use this official [Tutorial](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-microsoft-windows-platforms.htm)

* Setup Maven. Follow this link: [Maven Setup](https://maven.apache.org/install.html)

* Clone this repository in your target folder.
```
git clone https://github.com/shahista-Chaudhari/demoblaze_selenium_automation.git
```

* Open _testautomation_ folder in Eclipse by selecting "File -> Import -> Maven -> Existing Maven Project" and select _testautomation_ folder. 
  
Optionally, run maven build command if you don't see "Maven Dependencies" folder:

```
mvn clean install
```

You can also right click the project, and select "Maven -> Update Project -> Check the 'Force Update of Snapshots/Releases' -> Ok". This will update the "Maven Dependencies" project.

* Execute the project using below maven command:

```
mvn clean test
```

* Optionally, after making any changes to the repository, you can package the code into a jar file:
  
```
mvn clean package
```
  
_Note: I have used JAR for packaging. If you want to build into the jar file, change the `<packaging>` inside pom.xml file to war._

```
 <packaging>jar</packaging>
```

Congrats !!! You are now able to run the project in your own development environment.

* You can run this project as _TestNG Suite_ by right clicking the project and select "Run As -> TestNG Suite".

_Note: I have place *testng.xml* file under src/test/resources folder._

## Authors

* **Shahista Chaudhari** - *Initial work* - [Shahista Chaudhari](https://github.com/shahista-Chaudhari/)

## Contact
![LinkedIn][linkedin-shield]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ Shahista Chaudhari/
