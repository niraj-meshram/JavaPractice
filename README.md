Java Practice Projects

Overview

- This repository contains small, focused Java practice projects. Each folder is a self-contained demo exploring a specific language concept.
  - AbstractClasses: Demonstrates abstract classes and inheritance (`Animal`, `Dog`, `Fish`, `Horse`).
  - Interface: Demonstrates interfaces and polymorphism (`Animal`, `Bird`, `Jet`, `Truck`).
  - LambdaIntro: Simple examples using lambdas and functional-style code.
  - AbstractChallange: A small store/product example (`Store`, `ProductForSale`, `ArtObject`).

Requirements

- Java 11 or newer (JDK). Verify with `java -version` and `javac -version`.
- A terminal (PowerShell on Windows is fine) or an IDE (IntelliJ IDEA / VS Code with Java extensions).

Quick Start (CLI)

Compile and run each module independently to avoid class name collisions (several modules use a `Main` class in the default package).

- AbstractClasses
  - Compile: `javac -d .\\AbstractClasses\\out .\\AbstractClasses\\src\\*.java`
  - Run: `java -cp .\\AbstractClasses\\out Main`

- Interface
  - Compile: `javac -d .\\Interface\\out .\\Interface\\src\\*.java`
  - Run: `java -cp .\\Interface\\out Main`

- LambdaIntro
  - Compile: `javac -d .\\LambdaIntro\\out .\\LambdaIntro\\src\\*.java`
  - Run: `java -cp .\\LambdaIntro\\out Main`

- AbstractChallange
  - Compile: `javac -d .\\AbstractChallange\\out .\\AbstractChallange\\src\\*.java`
  - Run: `java -cp .\\AbstractChallange\\out Main`

Notes

- The code uses the default package (no `package` declarations). Compiling each module to its own `out` folder keeps `Main.class` files separate.
- On macOS/Linux, change path separators accordingly, for example:
  - `javac -d ./AbstractClasses/out ./AbstractClasses/src/*.java`
  - `java -cp ./AbstractClasses/out Main`

Project Layout

- `AbstractClasses/src` — Abstract class demo + `Main.java`
- `Interface/src` — Interface and polymorphism demo + `Main.java`
- `LambdaIntro/src` — Lambda intro + `Main.java`
- `AbstractChallange/src` — Store/products mini example + `Main.java`

Recommended Improvements

- Add package names to classes (e.g., `package abstractclasses;`) to avoid default-package collisions.
- Adopt a build tool for easier compile/run:
  - Gradle (single multi-project build) or Maven (modules).
- Add basic unit tests (e.g., JUnit) for examples that have business logic.

IDE Tips

- IntelliJ IDEA: Open the repo as a project. Mark each `src` as a Source Root (right-click folder → Mark Directory As → Sources Root) and run each `Main` directly.
- VS Code: Install Extension Pack for Java, then use the Java project explorer to run `Main` classes.

