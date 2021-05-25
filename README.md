# Functional Programming

## Introducing Functional Programming
Java defines a *functional interface* as a interface that contains a single abstract method. Functional interfaces are used as the basis for lambda expressions in functional programming. A *lambda expression* is a block of code that gets passed around, like an anonymous method.

The [example code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/introduction) uses the lambda expression `a -> a.canHoop();` where the arrow separates the parameter (a) from the body (a.canHoop()). The same expression could be also definded as `(Animal a) -> {return a.canHoop()};`

## Built-In Functional Interfaces
The functional interfaces below were introduced in the `java.util.function` package with Java 8.
| Functional interface	| #Parameters	| Return Type	| Single Abstract Method	| Example code	|
| :----: | :----: | :----: | :----: | :----: |
| Supplier\<T\>	| 0	| T	| get	| [supplier code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces01)	|
| Consumer\<T\>	| 1 (T)	| void	| accept	| [consumer code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces02)	|
| BiConsumer\<T,U\>	| 2 (T,U)	| void	| accept	| [biConsumer code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces03)	|
| Predicate\<T\>	| 1 (T)	| boolean	| test	| [predicate code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces04)	|
| BiPredicate\<T,U\>	| 2 (T,U)	| boolean	| test	| [biPredicate code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces05)	|
| Function\<T,R\>	| 1 (T)	| R	| apply	| [function code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces06)	|
| BiFunction\<T,U,R\>	| 2 (T,U)	| R	| apply	| [biFunction code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces07)	|
| UnaryOperator\<T\>	| 1 (T)	| T	| apply	| [unary operator code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces08)	|