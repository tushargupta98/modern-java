# Java Streams API Overview

Java's Streams API provides a powerful and flexible way to work with sequences of elements. Below is an overview of key interfaces, classes, and methods in the Streams API.

## Key Interfaces

### `Stream<T>`

The core interface representing a sequence of elements supporting sequential and parallel aggregate operations.

- **Key Methods:**
    - `filter()`
    - `map()`
    - `flatMap()`
    - `reduce()`
    - `collect()`
    - `forEach()`
    - `sorted()`
    - `distinct()`
    - `limit()`
    - `skip()`

### `IntStream`, `LongStream`, `DoubleStream`

Specialized versions of `Stream` for handling primitive types (`int`, `long`, `double`) to avoid boxing overhead.

- **Key Methods:**
    - `mapToInt()`
    - `mapToLong()`
    - `mapToDouble()`
    - `average()`
    - `sum()`
    - `min()`
    - `max()`

### `Stream.Builder<T>`

A mutable builder for creating a `Stream`.

### `Collector<T, A, R>`

A strategy for collecting elements of a stream into a result, such as a collection or a single value.

- **Key Methods:**
    - `supplier()`
    - `accumulator()`
    - `combiner()`
    - `finisher()`
    - `characteristics()`

### `Collectors`

Utility class providing common `Collector` implementations.

- **Key Methods:**
    - `toList()`
    - `toSet()`
    - `toMap()`
    - `joining()`
    - `groupingBy()`
    - `partitioningBy()`
    - `counting()`
    - `summarizingInt()`
    - `summarizingDouble()`
    - `summarizingLong()`
    - `reducing()`

### `Predicate<T>`

Represents a predicate (boolean-valued function) of one argument.

- **Key Methods:**
    - `test()`
    - `and()`
    - `or()`
    - `negate()`

### `Function<T, R>`

Represents a function that takes one argument and produces a result.

- **Key Methods:**
    - `apply()`
    - `compose()`
    - `andThen()`

### `Consumer<T>`

Represents an operation that takes a single argument and returns no result (void).

- **Key Methods:**
    - `accept()`
    - `andThen()`

### `Supplier<T>`

Represents a supplier of results.

- **Key Methods:**
    - `get()`

### `UnaryOperator<T>`

A specialization of `Function` for operations on a single operand.

- **Key Methods:**
    - `apply()`

### `BinaryOperator<T>`

A specialization of `BiFunction` for operations on two operands of the same type.

- **Key Methods:**
    - `apply()`

### `BiFunction<T, U, R>`

Represents a function that takes two arguments and produces a result.

- **Key Methods:**
    - `apply()`

### `BiConsumer<T, U>`

Represents an operation that takes two arguments and returns no result.

- **Key Methods:**
    - `accept()`

### `BiPredicate<T, U>`

Represents a predicate that takes two arguments and returns a boolean.

- **Key Methods:**
    - `test()`

## Key Classes

### `StreamSupport`

Utility class for creating `Stream` instances from various sources, like `Iterable`, `Spliterator`, etc.

### `Spliterator<T>`

An interface that provides a way to traverse and partition elements of a source.

- **Key Methods:**
    - `tryAdvance()`
    - `forEachRemaining()`
    - `trySplit()`

## Key Methods and Concepts

### Intermediate Operations

Operations that return a new stream and do not modify the source.

- Examples: `filter()`, `map()`, `flatMap()`, `sorted()`, `distinct()`

### Terminal Operations

Operations that produce a result or a side-effect and terminate the stream pipeline.

- Examples: `collect()`, `forEach()`, `reduce()`, `count()`, `anyMatch()`, `allMatch()`, `noneMatch()`

### Lazy Evaluation

Streams are evaluated lazily. Intermediate operations are not processed until a terminal operation is invoked.

### Parallel Streams

Streams can be processed in parallel by using `parallel()` or `parallelStream()`, allowing for concurrent execution of stream operations.

---

This overview provides a comprehensive guide to the essential components of Java's Streams API.
