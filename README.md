# Sample Mockito Java

## Purpose

Question:
Is it possible to write a simple set of methods which mock out objects

Answer: Yes. In this example we will use Mockito (a well known Java library that can be used to mock out objects). We have:
* An interface called ExternalExampleEndpoint - this is pretending to be an external endpoint to this application
* A class called MyExampleEndpoint - this is an internal class that is using the external endpoint
* A single test class that uses mocks ExternalExampleEndpoint when both calling it directly or via MyExampleEndpoint

## Instructions
From the root directory of the project, run the following commands to run all the tests:
```
./gradlew clean test
```