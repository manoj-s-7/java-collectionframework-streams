# Java Collection Framework & Streams

A comprehensive learning repository containing practical examples and demonstrations of Java Collection Framework, Stream API, and Java 8+ features.

[![Java](https://img.shields.io/badge/Java-8+-orange.svg)](https://www.oracle.com/java/)

---

## 📚 Study Notes (PDFs)

### ☕ Java Collection Framework & Stream API
- List, Set, Queue, Map
- Stream API (filter, map, reduce, collectors)
- Time Complexity (Big-O)
- Best practices & interview notes

🔗 [View / Download PDF](https://drive.google.com/file/d/1jgzbbyWXkKnMu9-jaguXPCrZuOzCn4QS/view?usp=sharing)


## 📋 Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
- [Topics Covered](#topics-covered)
- [Getting Started](#getting-started)
- [Learning Resources](#learning-resources)

---

## 🎯 Overview

This repository serves as a comprehensive practice and reference guide for Java developers looking to master:

- **Java Collection Framework** – Lists, Sets, Maps, Queues, and their implementations
- **Stream API** – Functional programming with streams, collectors, and operations
- **Java 8+ Features** – Lambda expressions, functional interfaces, and predicates
- **Concurrency Collections** – Thread-safe data structures and concurrent utilities

The code examples are designed to be:
- ✅ Easy to understand and well-commented
- ✅ Runnable as standalone classes
- ✅ Focused on practical, real-world scenarios
- ✅ Suitable for interview preparation and skill enhancement

---

## 📁 Repository Structure

```
src/
├── CollectionFramework/
│   ├── arraylist/              # ArrayList implementations and examples
│   │   ├── arraylist.java
│   │   ├── CopyOnWriteALDemo.java
│   │   └── Students.java
│   ├── linkedlist/             # LinkedList operations
│   │   └── bassiclinkedlist.java
│   ├── vector/                 # Vector and legacy collections
│   │   └── basicvector.java
│   ├── stack/                  # Stack data structure
│   │   └── StackDemo.java
│   ├── Set/                    # Set interface implementations
│   │   └── SetOverView.java
│   ├── map/                    # Map implementations
│   │   ├── HashMapDemo.java
│   │   ├── LinkedHashMapDemo.java
│   │   ├── ConcurrentHM.java
│   │   ├── WeakHashMapDemo.java
│   │   ├── IdentityHashmap.java
│   │   ├── EnumMapDemo.java
│   │   ├── ImmutableMapDemo.java
│   │   ├── SortedMapDemo.java
│   │   ├── LRUcache.java
│   │   └── mapDEMO.java
│   ├── queue/                  # Queue and Deque implementations
│   │   ├── QueueOverview.java
│   │   ├── PriorityQueueDemo.java
│   │   ├── DequeueDemo.java
│   │   ├── BlockingQueueDemo.java
│   │   ├── DelayQueueDemo.java
│   │   ├── SynchronousQueueDemo.java
│   │   └── TaskSubmissionSystem.java
│   ├── iterator/               # Iterator patterns
│   │   └── iteratorDemo.java
│   ├── Comparable/             # Comparable interface
│   │   └── ComperableDemo.java
│   └── comparator/             # Comparator implementations
│       ├── Mycomparator.java
│       └── Stringlengcomparator.java
│
├── Streams/                    # Stream API demonstrations
│   ├── StreamDemo.java
│   ├── IntermediateOperations.java
│   ├── TerminalOps.java
│   ├── CollectorsDemo.java
│   ├── ParallelStream.java
│   └── LazyEvaluationDemo.java
│
├── java8Features/              # Java 8+ features
│   ├── Lambda.java
│   ├── PredicateDemo.java
│   └── Mathoperation.java
│
├── javasteamsTests/            # Stream API practice problems
│   ├── Employee.java
│   ├── Person.java
│   ├── Project.java
│   ├── Business.java
│   ├── SteamTest.java
│   └── steams.java
│
└── Tests/                      # General practice and tests
    ├── basics.java
    ├── SyncTests.java
    ├── GC.java
    ├── Records.java
    ├── StdData.java
    └── SteramTests.java
```

---

## 📚 Topics Covered

### 🗂️ Collection Framework

#### **List Interface**
- `ArrayList` – Dynamic arrays, CRUD operations, iteration patterns
- `LinkedList` – Doubly-linked list implementation
- `Vector` – Synchronized list (legacy)
- `CopyOnWriteArrayList` – Thread-safe variant

#### **Set Interface**
- `HashSet` – Unique elements using hashing
- `LinkedHashSet` – Maintains insertion order
- `TreeSet` – Sorted set implementation

#### **Map Interface**
| Implementation | Use Case |
|----------------|----------|
| `HashMap` | General-purpose key-value storage |
| `LinkedHashMap` | Maintains insertion/access order |
| `TreeMap` | Sorted map by keys |
| `ConcurrentHashMap` | Thread-safe map for concurrent access |
| `WeakHashMap` | Garbage collection-friendly map |
| `IdentityHashMap` | Reference equality instead of value equality |
| `EnumMap` | Optimized for enum keys |
| **LRU Cache** | Custom implementation using LinkedHashMap |

#### **Queue Interface**
- `PriorityQueue` – Heap-based priority ordering
- `ArrayDeque` – Resizable array implementation
- `BlockingQueue` – Thread-safe producer-consumer pattern
- `DelayQueue` – Elements available after delay
- `SynchronousQueue` – Handoff between threads

#### **Utility Interfaces**
- `Iterator` – Traversing collections
- `Comparable` – Natural ordering of objects
- `Comparator` – Custom sorting logic

---

### 🌊 Stream API

#### **Stream Creation**
- From collections, arrays, and generators
- Infinite streams using `Stream.iterate()` and `Stream.generate()`

#### **Intermediate Operations**
- `filter()` – Conditional filtering
- `map()` – Transformation
- `flatMap()` – Flattening nested structures
- `sorted()` – Ordering elements
- `distinct()` – Removing duplicates
- `limit()` / `skip()` – Stream slicing

#### **Terminal Operations**
- `forEach()` – Iteration
- `collect()` – Gathering results
- `reduce()` – Aggregation
- `count()`, `min()`, `max()` – Statistical operations
- `anyMatch()`, `allMatch()`, `noneMatch()` – Boolean checks

#### **Collectors**
- `toList()`, `toSet()`, `toMap()`
- `groupingBy()` – Grouping elements
- `partitioningBy()` – Binary classification
- `joining()` – String concatenation
- Custom collectors

#### **Advanced Concepts**
- Parallel streams for performance
- Lazy evaluation and short-circuiting
- Stream pipelines and method chaining

---

### ⚡ Java 8+ Features

- **Lambda Expressions** – Functional programming syntax
- **Functional Interfaces** – `Predicate`, `Function`, `Consumer`, `Supplier`
- **Method References** – Concise lambda alternatives
- **Optional** – Null-safety
- **Date/Time API** – Modern date handling

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)
- Basic understanding of Java programming

### Running the Examples

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/java-collectionframework-streams.git
   cd java-collectionframework-streams
   ```

2. **Open in your IDE**
   - Import the project as a Java project
   - Ensure JDK 8+ is configured

3. **Run individual files**
   - Navigate to any `.java` file
   - Run the `main()` method
   - Observe console output and learn from examples

---

## 📖 Learning Resources & videos

### Official Documentation
- [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/)
- [Stream API Guide](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
- [Complete Java Collections Framework & Streams Masterclass 2024](https://youtu.be/92k5uokmW9o?si=DGjKodd64UjBO5RN)

---

## Acknowledgments

- Oracle Java Documentation
- Java Community Contributors
- Open Source Contributors

---
