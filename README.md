# Efficiency Showcase

This repository contains algorithmic implementations written in multiple languages. It is designed to show coding best practices for coding in the language, adding testing, and adding CI integration with GitHub Actions.

The current languages and algorithms available are:
- Java:
    - Fibonacci

## Java Module Overview

**Location:** `java_code/`

The Java portion of this project is a self-contained Maven module that showcases:
- Clean project structure (`src/main/java`, `src/test/java`)
- JUnit 5 testing
- A simple performance comparison example

### Current Implementations

#### Fibonacci
Located at `src/main/java/com/github/mark_platts/fibonacci/Fibonacci.java`

Provides:
- **Naive recursive version:** logically simple, but inefficient for large inputs  
- **Memoized recursive version:** optimized with caching for faster results

Unit tests are located in:
`src/test/java/com/github/mark_platts/fibonacci/FibonacciTest.java`
Simple comparative performance test is located at:
`src/test/java/com/github/mark_platts/fibonacci/FibonacciPerformanceTest.java`

## Build & Run

Requires:
- **Java 21** (Temurin or equivalent)
- **Apache Maven 3.9+**

### Build
```bash
cd java_code # all Maven commands should be run from this folder

# build
mvn clean compile

# run
mvn exec:java -Dexec.mainClass="com.github.mark_platts.fibonacci.Fibonacci"

# test
mvn test
```
