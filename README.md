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

## Stream
 - Stream represents a sequence of objects from a source, with supports aggregate operations like _filter_, _map_, _limit_, _reduce_, _find_, _match_ and so on.
 - Collection interface has two methods to generate a stream --
 	- _**stream()**_ - returns a sequential stream considering collection as its source.
 	- _**parallelStream()**_ - Returns  parallel Stream considering collection as its source.
 	
## Optional
 - Optional is a container object which is used to contain not-null objects. 
 - It is used to represent null with absent value. 
 - It has various utility methods to facilitate code to handle values as 'available' or 'not available' instead of checking null.

## Nashorn Engine (jjs)
 With Java 8, Nashorn, a much improved javascript engine is introduced, to replace the existing Rhino. Nashorn provides 2 to 10 times better performance, as it directly compiles the code in memory and passes the bytecode to JVM. Nashorn uses invoke dynamics feature, introduced in Java 7 to improve performance.

## New Date API
Old Date API (java.util.Date) had some drawback:
 - Not thread safe
 - Poor Design
 - Difficult time zone handling
New Date API Java8(java.time) provides some classes:
 - Local - Simplified date-time API with no complexity of timezone handling.
 - Zoned - Specialized date-time API to deal with various timezones.
 
## 