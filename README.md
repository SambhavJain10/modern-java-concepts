# ☕ java-concepts

A structured, hands-on reference repository covering modern Java features from **Java 8 through Java 25** — built for SDET / QA automation engineers who want to stay sharp on the language underneath their test stacks.

---

## 📖 About

Each Java version has its own module with:
- **Concept demos** — annotated examples explaining the feature clearly
- **Real-world usage** — grounded in test automation contexts (Selenium, REST Assured, etc.)
- **JUnit 5 exercises** — practice stubs with solutions to reinforce learning

---

## 🗂️ Project Structure

```
java-concepts/
├── src/
│   ├── main/java/concepts/
│   │   ├── java8/          # Lambdas, Streams, Optional, Date-Time API
│   │   ├── java10/         # var / LVTI
│   │   ├── java14/         # Enhanced Switch, yield
│   │   ├── java16/         # Records
│   │   ├── java17/         # Sealed Classes
│   │   ├── java21/         # Pattern Matching, Virtual Threads, Sequenced Collections
│   │   ├── java22/         # Unnamed Variables
│   │   ├── java24/         # Stream Gatherers
│   │   └── java25/         # Latest finalized & preview features
│   └── test/java/exercises/
│       └── ...             # JUnit 5 exercise stubs + solutions
├── pom.xml
└── README.md
```

---

## 🚀 Topics Covered

| Java Version | Features |
|---|---|
| **Java 8** | Lambdas, Functional Interfaces, Stream API, Optional, Method References, `java.time` |
| **Java 10** | Local Variable Type Inference (`var`) |
| **Java 14** | Enhanced Switch Expressions, `yield` |
| **Java 16** | Records |
| **Java 17** | Sealed Classes & Interfaces |
| **Java 21** | Pattern Matching (switch), Virtual Threads, Sequenced Collections, Text Blocks |
| **Java 22** | Unnamed Variables (`_`) |
| **Java 24** | Stream Gatherers |
| **Java 25** | Latest preview & finalized features |

---

## ⚙️ Prerequisites

- **JDK 21+** (Oracle or OpenJDK)
- **Maven 3.8+**
- **IntelliJ IDEA** (recommended)

---

## 🏃 Running the Project

**Compile:**
```bash
mvn compile
```

**Run all tests / exercises:**
```bash
mvn test
```

**Run a specific exercise class:**
```bash
mvn test -Dtest=ClassName
```

> **Note:** You may see `sun.misc.Unsafe` warnings during compile — these come from IntelliJ's bundled Maven/Guice and are safe to ignore. Your build is fine if it ends with `BUILD SUCCESS`.

---

## 🛠️ Tech Stack

- Java 21 (baseline SDK)
- Maven
- JUnit 5 (Jupiter)
- IntelliJ IDEA

---

## 🎯 Who This Is For

- **SDET / QA engineers** upskilling on modern Java alongside frameworks like Selenium, Playwright, REST Assured, and Appium
- Developers preparing for Java interviews or OCP certification
- Anyone who wants a version-by-version, code-first Java reference

---

## 📌 Status

> 🚧 Work in progress — concepts and exercises added incrementally by version.

---

## 👤 Author

**Sambhav Jain**  
SDET Lead | QA Automation | Java | Selenium | TypeScript | Playwright | REST Assured  
[LinkedIn](https://www.linkedin.com/in/) · [GitHub](https://github.com/)
