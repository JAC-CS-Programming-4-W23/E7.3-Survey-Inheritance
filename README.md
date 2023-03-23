# Exercise 7.1 - 📝 Survey with Inheritance

## 🎯 Objectives

- **Replace** an interface implementation using inheritance.

## 🔨 Setup

1. Clone the repo (or download the zip) for this exercise, which you can find [here](https://github.com/JAC-CS-Programming-4-W23/E7.1-Survey-Inheritance).
2. Start IntelliJ, go to `File -> Open...`, and select the cloned/downloaded folder.
3. If at the top it says "Project JDK is not defined", click "Setup JDK" on the top right, and select the JDK version you have installed on your machine.

   ![Setup JDK](./images/Setup-JDK.png)

## 🔍 Context

The very [first exercise](https://github.com/JAC-CS-Programming-4-W23/E1.1-Survey) we did was about reviewing interfaces while answering a short survey. The goal here will be to replace that interface with a superclass.

## 🚦 Let's Go

1. Remove the `Questionable` interface and replace it with a `Question` superclass that all question subclasses will extend.
   - Create a `Question` class and determine which fields and methods it should have by seeing what is common among the question subclasses.
2. Make sure to call `super()` in all question subclass constructors and pass up the values for the `title`, `question`, and `isRequired` fields.
3. Just like the interface implementation, the inheritance implementation should have methods which are overridden in the subclasses like `prompt()` and `isValidQuestion()`.
4. Replace all instances of `Questionable` in `Main` with `Question`.

## 🔬 Observations

- From an architecture point of view, which do you prefer, the interface or inheritance implementation? Why?
- What are the advantages/disadvantages of interfaces vs. inheritance?
