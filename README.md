
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Ratan Jagath Naik          |
| Date         | 03/19/2024                 |
| Course       | Spring 2024                |
| Assignment # | 4                          |

# Assignment Overview

The core objective of this assignment is to leverage the Adapter Design Pattern to ensure seamless integration between a legacy USB-based customer data retrieval system and a newer HTTPS-based interface. My approach involves crafting an adapter that serves as a bridge, facilitating communication and data access between the disparate systems without altering their existing implementations. Through this exercise, I aim to demonstrate my proficiency in applying design patterns to solve real-world software architecture challenges, focusing on compatibility and future-proofing. By implementing targeted unit tests, I also validate the effectiveness and robustness of my solution, ensuring the adapter not only accurately delegates method calls but also adheres to the principles of good software design.

# GitHub Repository Link:
https://github.com/RatanJN/665_Assignment4.git

# Implementation Description 


For each assignment, please answer the following:

- Explain the level of flexibility in your implementation, including how new object types can
be easily added or removed in the future.

Ans: My implementation of the Adapter Design Pattern inherently offers high flexibility. By abstracting the interface between the new HTTPS system and the legacy USB system, adding or removing new object types becomes straightforward. Future adaptations—whether to integrate additional legacy systems or to extend the system's capabilities with new data sources—require minimal changes. New adapters can be introduced without altering the existing client code or the underlying systems, showcasing the implementation's scalability and adaptability.

- Discuss the simplicity and understandability of your implementation, ensuring that it is
easy for others to read and maintain.

Ans: The simplicity of the design lies in its adherence to the Single Responsibility Principle. Each component—be it an adapter, the new system interface, or the legacy system—has a clear, well-defined role. This separation of concerns not only makes the codebase easier to understand but also facilitates easier maintenance. By documenting the purpose and functionality of each component and using meaningful naming conventions, I've ensured that the implementation is accessible and straightforward for other developers.

- Describe how you have avoided duplicated code and why it is important.

Ans:Duplicated code has been meticulously avoided through the strategic use of the Adapter Pattern. Instead of replicating logic to accommodate the interaction between the new and legacy systems, a single adapter encapsulates the necessary conversions and mappings. This approach not only reduces the codebase's complexity but also minimizes the risk of inconsistencies and bugs, making the system more reliable and easier to update. Avoiding duplication is crucial for maintaining code quality and efficiency, ensuring that any changes or bug fixes are centralized and thus more manageable.

- If applicable, mention any design patterns you have used and explain why they were
chosen.

Ans: The Adapter Design Pattern was chosen for its ability to reconcile differences between incompatible interfaces, allowing them to communicate without direct modifications. This pattern was ideal for integrating the modern HTTPS interface with the legacy USB system, providing a unified access point for client code. The choice of this pattern was driven by its potential to enhance system compatibility and extensibility, enabling seamless integration of disparate systems with minimal impact on existing codebases.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




