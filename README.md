# Comprehensive Java Journey: Basics to Advanced ☕

Welcome to my Java learning repository! This project tracks my progress from foundational programming building blocks all the way to advanced enterprise-level Java features. It serves as a practical codebase, reference tool, and showcase of clean Java development.

---

## 📁 Repository Directory Structure

```text
├── 01-basics/                  # Phase 1: Core Fundamentals
│   ├── concepts/               # Conceptual code files
│   │   ├── Variables.java      # Syntax, primitives, type casting
│   │   ├── ControlFlow.java    # If/else, switch-case, loops
│   │   ├── Methods.java        # Scopes, parameters, return types
│   │   └── ArrayStrings.java   # Array manipulation, StringBuilder
│   └── practice/               # Solved programs & assignments
│       ├── Calculator.java
│       ├── Fibonacci.java
│       └── Palindrome.java
│
├── 02-oop/                     # Phase 2: Object-Oriented Programming
│   ├── concepts/
│   │   ├── Encapsulation.java  # Access modifiers, getters/setters
│   │   ├── Inheritance.java    # extends keyword, super keyword
│   │   ├── Polymorphism.java   # Overloading vs Overriding
│   │   └── Abstraction.java    # Abstract classes & Interfaces
│   └── practice/
│       ├── LibrarySystem/      # Multi-class inheritance practice
│       └── BankingApp/         # Encapsulation & transaction handling
│
├── 03-collections/             # Phase 3: Intermediate Java Mechanics
│   ├── concepts/
│   │   ├── ExceptionDemo.java  # Try-catch, throw, custom exceptions
│   │   ├── ListsAndSets.java   # ArrayList, LinkedList, HashSet
│   │   ├── MapsDemo.java       # HashMap, TreeMap key-value handling
│   │   └── FileIODemo.java     # FileReader, FileWriter, java.nio
│   └── practice/
│       ├── StudentDatabase/    # CRUD operations using Collections
│       └── LogParser/          # Exception safety and text file scanner
│
└── 04-advanced/                # Phase 4: Advanced Java Concepts
    ├── concepts/
    │   ├── MultiThreading.java # Thread class, Runnable, synchronization
    │   ├── StreamAPI.java      # Lambdas, Filters, Maps, Reduces
    │   └── ModernJava.java     # Records, Sealed classes, Pattern matching
    └── practice/
        ├── WebScraper/         # Parallel/Concurrent URL fetcher
        └── DataTransformer/    # Processing CSV dataset using Streams
```

---

## 🗺️ Roadmap, Concepts & Practice Assignments

### 🪴 Phase 1: Core Fundamentals (Basics)
* **Core Concepts to Implement:**
  * Primitives vs. Reference data types.
  * Explicit and implicit type-casting (`int` to `double` and vice-versa).
  * Optimizing structural logic using `switch` expressions.
  * Mutable strings using `StringBuilder` to save heap memory.
* **🏋️ Practice Problems to Solve:**
  1. `Calculator.java`: Build a terminal calculator handling addition, subtraction, multiplication, and division with invalid input filtering.
  2. `Fibonacci.java`: Generate a Fibonacci sequence up to $N$ terms using both iteration (`for` loop) and recursion.
  3. `Palindrome.java`: Take a string input and check if it reads the same backwards, ignoring case sensitivity and special symbols.

### 🏛️ Phase 2: Object-Oriented Programming (OOP)
* **Core Concepts to Implement:**
  * Constructor overloading and managing instance variables using `this`.
  * Securing sensitive fields by marking them `private` (Encapsulation).
  * Achieving compile-time flexibility (Overloading) and runtime customization (Overriding).
  * Designing pure architectural blueprints using pure `interface` classes.
* **🏋️ Practice Problems to Solve:**
  1. `BankingApp`: Create a system with an abstract `Account` class, inherited by `SavingsAccount` and `CheckingAccount`, validating balances during transactions.
  2. `LibrarySystem`: Implement an inventory structure tracking `Book` and `Magazine` subclasses under a unified item tracking protocol.

### ⚙️ Phase 3: Intermediate Java Mechanics
* **Core Concepts to Implement:**
  * Differentiating checked exceptions from unchecked runtime issues.
  * When to utilize index-backed lists (`ArrayList`) vs structural maps (`HashMap`).
  * Utilizing try-with-resources to cleanly release streaming memory blocks automatically.
* **🏋️ Practice Problems to Solve:**
  1. `StudentDatabase`: Build a mini management layout where users can add, delete, update, and sort student records stored within a `HashMap`.
  2. `LogParser`: Read a mock system server `.txt` file, catch formatting flags using exception handling, and sort error patterns out into a summary file.

### 🚀 Phase 4: Advanced Java Concepts
* **Core Concepts to Implement:**
  * Resolving multithreaded data corruption using thread `synchronization` blocks.
  * Replacing bulky boilerplate declarations with compact data objects using `record`.
  * Migrating legacy operational data pipelines over into functional, chainable `.stream()` syntax pipelines.
* **🏋️ Practice Problems to Solve:**
  1. `WebScraper`: Create an asynchronous download model executing multiple fetch threads tracking active tasks safely.
  2. `DataTransformer`: Process a structured table of data, filter out null attributes, modify values via a lambda mapping function, and collect metrics into a new database view using the Stream API.

---

## 🛠️ Setup & Running

### Prerequisites
* **Java Development Kit (JDK)**: Version 17 or higher recommended.
* **IDE**: IntelliJ IDEA, Eclipse, or VS Code.

### Compiling and Running
To manually check code architecture from the command line interface, step inside the root folder and run:
```bash
# Example for compiling and running a conceptual file
javac 01-basics/concepts/Variables.java
java 01-basics.concepts.Variables

# Example for compiling and running a practice problem
javac 01-basics/practice/Calculator.java
java 01-basics.practice.Calculator
```

---

## 📜 License
This project is open-source and available under the [MIT License](LICENSE).
