# Assignment 1: Builder Design Pattern

This project implements the **Builder Design Pattern** in Java for constructing `Email` objects, created for Assignment 1.

## Features & Structure
The implementation supports two distinct representations of an email constructed from the same building steps:
* **Email Object Representation** (`EmailObjectBuilder`): Creates an immutable `Email` object[cite: 1].
* **HTML Preview Representation** (`EmailHtmlPreviewBuilder`): Generates an HTML text preview of the email.

### Key Components:
* `Email.java`: Immutable domain model (private/package-private constructor, final fields, no setters).
* `EmailBuilder.java`: Builder interface declaring fluent API construction steps.
* `EmailObjectBuilder.java`: Concrete builder creating `Email` instances with state validation.
* `EmailHtmlPreviewBuilder.java`: Concrete builder producing HTML string previews[cite: 1].
* `EmailDirector.java`: Director managing predefined email configurations (e.g., `makeWelcomeEmail`).
* `Main.java`: Client demonstrating creation of both representations using the Director.

## How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/anrikki666/Assignment1.git](https://github.com/anrikki666/Assignment1.git)
   
