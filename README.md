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
| BinaryOperator\<T\>	| 2 (T,T)	| T	| apply	| [binary operator code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/functionalInterfaces09)	|

## Streams
A *stream* in Java is a sequence of data. A *stream pipeline* is the operations that run on a stream to produce a result. We can think of a stream pipeline as an assembly line in a factory.
There are three parts to a stream pipeline:
* *Source:* Where the stream comes from.
* *Intermediate operations:* Transforms the stream into another one. There can be as few or as a many intermediate  operations as you'd like.
* *Terminal operation:* Actually produces a result.

### Creating Stream Sources
In Java, the Stream interface is the `java.util.stream` package. There are a few ways to create a finite stream:

1. `Stream<String> empty = Stream.empty();` it creates an empty stream.
2. `Stream<Integer> singleElement = Stream.of(1);` it creates a stream with a single element.
3. `Stream<Integer> fromArray = Stream.of(1,2,3);` it creates a stream from an array.

Java also provides a convenient way to convert from a list to a stream:

4. `List<String> list = Arrays.asList("a","b","c");`
5. `Stream<String> fromList = list.stream();`

We can't create an infinite list, though, which makes streams more powerful:

6. `Stream<Double> randoms = Stream.generate(Math::randonm);` it creates an infinite stream of random numbers.
7. `Stream<Integer> oddNumbers = Stream.iterate(1,n -> n+2);` it generates odd numbers as long as you need them.

### Using Common Terminal Operations
It's possible to perform a terminal operation without any intermediate operations but not the other way around.

| Method	| What happends for infinite streams	| Return value	| Reduction	| Example code	|
| :----: | :----: | :----: | :----: | :----: |
| count()	| Does not terminate	| long	| Yes	| [count code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/streams/terminalOperations01)	|
| min()/max()	| Does not terminate	| Optional\<T\>	| Yes	| [min code](https://github.com/mikedr/FunctionalProgramming/tree/main/src/streams/terminalOperations02)	|