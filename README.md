# ☕ Java Learning & Reference Project

Welcome to the **Java Learning & Reference Project**! This is a highly structured, comprehensive, and educational repository designed to teach and reference core-to-advanced Java programming concepts. 

Every single file in this repository is fully functional, compiling, and heavily annotated with detailed comments, stack/heap memory visualizations, and sequential variations (e.g., `// Ex: 1`, `// Ex: 2`) to help you master how Java works under the hood.

---

## 📂 Repository Directory Catalog

The repository is organized topically into logical package directories:

| Component | Description | Highlights / Topics Covered |
| :--- | :--- | :--- |
| **`Basics`** | Fundamental syntax & types | Variables, Primitive vs. Reference Types, Operators, Type Casting, User Input/Output, Wrapper Classes, and Enums. |
| **`ControlStatements`** | Logic and loops | If-Else branches, Nested Conditions, Ternary Operators, Switch-Cases, While loops, For loops, and Break/Continue statements. |
| **`OOP`** | Core principles of OOP | Class Blueprints, Constructor Overloading, Multi-level Inheritance (`super`), Polymorphism, Dynamic (Runtime) Method Lookup, Anonymous Classes, Static variables, Composition, Interfaces, Encapsulation (Getters/Setters), and Aggregation. |
| **`Collections`** | Standard Data Structures | Dynamic ArrayLists, Linked Lists, HashMaps, LinkedHashMaps, TreeMaps, HashSets, LinkedHashSets, TreeSets, and Collection Iterators. |
| **`Methods`** | Execution scopes & arguments | Methods, Return Types, Variable Scope, Method Overloading, Lambda Expressions, and Varargs (Variable Arguments). |
| **`AdvancedConcepts`** | Advanced language features | Generics (Boxes, Products), Timer Classes, Maths API, and Date-Time APIs. |
| **`ExceptionHandling`** | Error handling scopes | Try-Catch blocks, Throw/Throws keywords, Custom Exception types, and Finally blocks. |
| **`FileHandling`** | File streams & systems | Writing Files, Reading Files, and binary Audio clips handling. |
| **`Multithreading`** | Concurrent execution | Thread Classes, Daemon Threads, Runnable Interfaces, and Synchronization locks. |

---

## 🧠 Educational Value: Stack vs. Heap Visualizations

Unlike typical code repos, this project explains **why** code behaves the way it does using inline memory models. For example, in reference data types (such as `Basics/DataTypes/DataTypes.java`), you'll find stack-to-heap pointer visualizations:

```java
// point1 --------> [ Point Object ]
//                      x = 1
//                      y = 1
Point point1 = new Point(1,1);

Point point2 = point1;
// point1 --------> 
//                     [ Point Object ]
// point2 -------->        x = 1
//                         y = 1
```

---

## 🛠️ How to Build and Run Examples

### 1. The Modern Way (Java 11+)
You can run any single file directly from the terminal without compiling it first:
```bash
java Basics/DataTypes/DataTypes.java
```

### 2. Standard Compilation (All Java Versions)
To compile the entire codebase and output the `.class` files into a unified build folder:

```bash
# Compile all files to the 'out' directory
find . -name "*.java" -not -path "./out/*" | xargs javac -d out
```

Once compiled, run any class using its fully qualified package path with the `-cp` (classpath) flag:
```bash
# Run the Polymorphism example
java -cp out OOP.Polymorphism.Polymorphism

# Run the DataTypes example
java -cp out Basics.DataTypes.DataTypes
```

---

## 📝 Coding Conventions & Guidelines

- **PascalCase for Class Names**: Main driver classes are named in PascalCase (e.g., `ArrayListExample.java`).
- **Encapsulated Packages**: Package declarations strictly match the directory path (e.g., `package OOP.Polymorphism.Dynamic;`).
- **Multi-Variation Files**: Variations are demarcated using `// Ex: 1`, `// Ex: 2` to show structural evolution.
- **Zero Warnings/Errors**: The repository builds and compiles with zero compilation errors and is 100% clean.
