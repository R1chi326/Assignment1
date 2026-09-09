# Assignment 1: Builder Design Pattern

This project implements the **Builder Design Pattern** in Java for constructing `Email` objects, created for Assignment 1[cite: 1].

## Features & Structure
The implementation supports two distinct representations of an email constructed from the same building steps[cite: 1]:
* **Email Object Representation** (`EmailObjectBuilder`): Creates an immutable `Email` object[cite: 1].
* **HTML Preview Representation** (`EmailHtmlPreviewBuilder`): Generates an HTML text preview of the email[cite: 1].

### Key Components:
* `Email.java`: Immutable domain model (private/package-private constructor, final fields, no setters)[cite: 1].
* `EmailBuilder.java`: Builder interface declaring fluent API construction steps[cite: 1].
* `EmailObjectBuilder.java`: Concrete builder creating `Email` instances with state validation[cite: 1].
* `EmailHtmlPreviewBuilder.java`: Concrete builder producing HTML string previews[cite: 1].
* `EmailDirector.java`: Director managing predefined email configurations (e.g., `makeWelcomeEmail`)[cite: 1].
* `Main.java`: Client demonstrating creation of both representations using the Director[cite: 1].

## How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/anrikki666/Assignment1.git](https://github.com/anrikki666/Assignment1.git)
   
