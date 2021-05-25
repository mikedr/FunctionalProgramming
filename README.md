# Functional Programming

## Introducing Functional Programming
Java defines a *functional interface* as a interface that contains a single abstract method. Functional interfaces are used as the basis for lambda expressions in functional programming. A *lambda expression* is a block of code that gets passed around, like an anonymous method.

The [example code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/introduction) uses the lambda expression `a -> a.canHoop();` where the arrow separates the parameter (a) from the body (a.canHoop()). The same expression could be also definded as `(Animal a) -> {return a.canHoop()};`

## Built-In Functional Interfaces
The functional interfaces below were introduced in the `java.util.function` package with Java 8.
| Functional interface	| #Parameters	| Return Type	| Single Abstract Method	| Example code	|
| :----: | :----: | :----: | :----: | :----: |
| Supplier\<T\>	| 0	| T	| get	| [supplier code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces01)	|
| Consumer\<T\>	| 1 (T)	| void	| accept	| [supplier code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces02)	|
|	|	|	|	|