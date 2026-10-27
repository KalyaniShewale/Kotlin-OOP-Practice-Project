# Kotlin OOP Practice Project

A complete hands-on practice project for **Object-Oriented Programming (OOP) in Kotlin** using Android Studio.  
This project covers **Classes, Objects, Inheritance, Interfaces, Encapsulation, and Polymorphism** with ready-to-run code and outputs logged via `android.util.Log`.

---

## 📌 Project Overview

| Item | Details |
|------|---------|
| **Language** | Kotlin |
| **Platform** | Android (using Android Studio) |
| **Output Method** | `android.util.Log` (viewed in Logcat) |
| **Purpose** | Learn & practice OOP concepts |
| **Files Included** | 6 Kotlin files + MainActivity |

---


## 📋 Sections Covered

### 🔹 Section A: Basic OOP Practice
| # | Task | File |
|---|------|------|
| 1 | `Car` class with brand, model, price + 3 objects | `SectionA_Basics.kt` |
| 2 | `Student` class with `introduce()` function | `SectionA_Basics.kt` |
| 3 | `Rectangle` class with `area()` function | `SectionA_Basics.kt` |

**Concepts used:** Classes, Objects, Properties, Functions

---

### 🔹 Section B: Encapsulation
| # | Task | File |
|---|------|------|
| 4 | `BankAccount` — private balance, `deposit()`, `withdraw()`, `getBalance()` | `SectionB_Encapsulation.kt` |
| 5 | `Employee` — private salary, setter/getter with validation | `SectionB_Encapsulation.kt` |

**Concepts used:** `private` modifier, validation, data protection

---

### 🔹 Section C: Inheritance
| # | Task | File |
|---|------|------|
| 6 | `Animal` (base) → `Dog` (derived, adds `bark()`) | `SectionC_Inheritance.kt` |
| 7 | `Person` (base) → `Teacher`, `Student` | `SectionC_Inheritance.kt` |

**Concepts used:** `open` keyword, `:`, base/derived classes, `super`

---

### 🔹 Section D: Interfaces
| # | Task | File |
|---|------|------|
| 8 | `Playable` interface → `Cricket`, `Football` | `SectionD_Interfaces.kt` |
| 9 | `Shape` interface → `Circle`, `Rectangle2` | `SectionD_Interfaces.kt` |

**Concepts used:** `interface`, `override`, multiple implementations

---

### 🔹 Section E: Polymorphism
| # | Task | File |
|---|------|------|
| 10 | `Shape` base → overridden `area()` in `Circle`, `Rectangle`; list of shapes | `SectionE_Polymorphism.kt` |
| 11 | `Animal` list → `Dog`, `Cat`, `Cow` calling `makeSound()` | `SectionE_Polymorphism.kt` |

**Concepts used:** Method overriding, runtime polymorphism, `List<BaseType>`

---

### 🔹 Mini Assignment: Library System
| Feature | Description |
|--------|-------------|
| `Book` class | title, author |
| `Library` class | internal list of books |
| `addBook()` | Adds a book |
| `removeBook()` | Removes by title |
| `showBooks()` | Displays all books |

**Concepts used:** Encapsulation + OOP structure + collections

