# Functional Programming

## Introducing Functional Programming
Java defines a *functional interface* as a interface that contains a single abstract method. Functional interfaces are used as the basis for lambda expressions in functional programming. A *lambda expression* is a block of code that gets passed around, like an anonymous method.

The [example code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/introduction) uses the lambda expression `a -> a.canHoop();` where the arrow separates the parameter (a) from the body (a.canHoop()). The same expression could be also definded as `(Animal a) -> {return a.canHoop()};`