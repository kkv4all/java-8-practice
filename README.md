# Java 8 Practice (Draft)
Java 8 New feature practice

## Lambda Expression
 - Lambda Expression is Characterrize by the following:
   - Optional Type Declaration
   - Optional parenthesis around parameter
   - optional curly braces
   - optional return statement

## Method Reference
 - Method reference helps to point to methods by their names. A method reference is described using :: symbol.
 A method reference used to point the following type of methods - 
   - Static Methods 
   - Instance Methods
   - Constructor using new operator

## Functional Interface
 - An interface with exactly one abstract method is called Functional Interface. _@FunctionalInterface_ annotation is added so that we can mark an interface as functional interface.
 
Some of the useful java 8 functional interfaces are _**Consumer**_, _**Supplier**_, _**Function**_ and _**Predicate**_.

## Default Method
 - Java 8 introduced concept of default method implementation in interfaces. With default functions in interfaces, there is a possibility that a class is implementing two interfaces with same default methods.

##