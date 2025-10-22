# Project54 Jenkins Pipeline

Objective

The objective of this project is to implement a Jenkins build pipeline for a Java Maven project that combines compilation, testing, packaging, and code quality checks. This pipeline ensures automated builds, test execution, and report generation, demonstrating continuous integration in a DevOps workflow.

---

Tools and Technologies Used

- Java JDK 11/17
- Apache Maven 3.9.11
- Eclipse IDE for Enterprise Java Developers
- Jenkins
- JUnit (for testing)
- SonarQube or code quality tools (optional)
- Git & GitHub (for version control)

---

Project Structure
Project54/
├── src/main/java/com/example/App.java
├── src/test/java/com/example/AppTest.java
├── pom.xml
├── Jenkinsfile
└── target/projectt54-1.0-SNAPSHOT.jar

---

 How to Run

1. Build and Test Using Maven
```
mvn clean package
```
OUTPUT:
- Compiles code
- Runs JUnit tests
- Generates target/projectt54-1.0-SNAPSHOT.jar
- Test reports in target/surefire-reports/

2. Run the Application
```
java -jar target/projectt54-1.0-SNAPSHOT.jar
```
OUTPUT:
```
Hello, Jenkins Pipeline!
```

3. Jenkins Pipeline Execution
- The Jenkinsfile automates:
  - Java compilation
  - Running JUnit tests
  - Packaging the JAR
  - Optional code quality checks
- On successful execution, build status and test reports are available in Jenkins dashboard.

### 4. Source Code Examples
App.java
```java
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins Pipeline!");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
```

AppTest.java
```java
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSum() {
        App app = new App();
        assertEquals(15, app.sum(5, 10));
    }
}
```

---

👨‍💻 Author
Vijayalakshmi V
Contact: 8015664030
Email: vijayalakshmivenkatesan96@gmail.com
