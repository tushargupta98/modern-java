# Standard Functional Interfaces in Java

Java provides a set of standard functional interfaces in the java.util.function package, designed to facilitate functional programming. These interfaces are primarily used in lambda expressions and method references.

### Function<T, R>

Represents a function that takes one argument of type T and produces a result of type R.

Example: ``Function<String, Integer> parseInt = Integer::parseInt;``

### BiFunction<T, U, R>

Represents a function that takes two arguments of types T and U and produces a result of type R.

Example: ``BiFunction<String, String, Integer> concatLength = (s1, s2) -> (s1 + s2).length();``

### Consumer<T>

Represents an operation that takes a single argument of type T and returns no result (void).

Example: ``Consumer<String> print = System.out::println;``

### BiConsumer<T, U>

Represents an operation that takes two arguments of types T and U and returns no result (void).

Example: ``BiConsumer<String, Integer> printKeyValue = (key, value) -> System.out.println(key + ": " + value);``

### Supplier<T>

Represents a function that provides a result of type T without taking any input.

Example: ``Supplier<Double> randomValue = Math::random;``

### Predicate<T>

Represents a function that takes one argument of type T and returns a boolean value.

Example: ``Predicate<String> isEmpty = String::isEmpty;``

### BiPredicate<T, U>

Represents a function that takes two arguments of types T and U and returns a boolean value.

Example: ``BiPredicate<String, String> equalsIgnoreCase = String::equalsIgnoreCase;``

### UnaryOperator<T>

A specialization of Function<T, T>; takes a single argument of type T and returns a result of the same type.

Example: ``UnaryOperator<Integer> square = x -> x * x;``

### BinaryOperator<T>

A specialization of BiFunction<T, T, T>; takes two arguments of the same type T and returns a result of the same type.

Example: ``BinaryOperator<Integer> add = Integer::sum;``

### Conclusion

These functional interfaces are crucial in Java Streams and lambda expressions, enabling more concise and readable code by embracing functional programming concepts.

