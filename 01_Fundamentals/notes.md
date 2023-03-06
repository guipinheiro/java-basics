# Java

## Basic Stuff

### 1. Each java program must have a main method, and every main method must contain the parameters String[] args

- *Args*: an array of strings that is passed to the program when it's run

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world, my name is " + args[0] + "!"); // This will read the first string of the array args
  }
}
```

- Not every single file of a java program must contain the method main (i.e. if your program has multiple files, some may not have the main method)
- The main() method holds all of instructions for our program and every java program starts with a method

### 2. Java does not have functions, only methods

### 3. Printing

The method println will end with a new line

```java
System.out.print("I'm first!");
System.out.println("I'm second!");
System.out.print("I'm third!");
```

This will result:
```text
I'm first!I'm second!
I'm third!
```


