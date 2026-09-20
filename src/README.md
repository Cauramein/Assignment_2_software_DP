# Logistics Application - Factory Patterns

## Purpose
This project demonstrates the Factory Method and Abstract Factory design patterns in Java. It simulates a logistics application that supports road and sea delivery (Factory Method) while rendering UI components for Windows or macOS environments (Abstract Factory). 

## Package Structure
- `logistics`: Contains the Factory Method implementation (Transport products and Logistics creators).
- `gui`: Contains the Abstract Factory implementation (Button/Checkbox products and GUI factories).
- `app`: Contains the client (`DeliveryApplication`) and startup validation logic (`Main`).

## Prerequisites
- Java Development Kit (JDK) 17

## Build and Run Instructions
1. Open a terminal and navigate to the project root directory.
2. Navigate into the `src` folder:
```bash
   cd src
```

3. Compile all Java files:
```bash
javac app/*.java gui/*.java logistics/*.java
```


4. Run the application:
```bash
java app.Main

```



## Supported Input Values

* **Delivery mode**: `ROAD` or `SEA`
* **UI platform**: `WINDOWS` or `MACOS`

## Sample Run

```text
Delivery mode (ROAD/SEA): ROAD
UI platform (WINDOWS/MACOS): WINDOWS

Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse by road.

```