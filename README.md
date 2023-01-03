# kiwi-java
[![Release](https://jitpack.io/v/kausko/kiwi-java.svg)](https://jitpack.io/#kausko/kiwi-java)

A Java port of the [Kiwi C++](https://github.com/nucleic/kiwi) implementation of the Cassowary constraint solving algorithm

## Installation

### Maven
In `pom.xml`, add the following at the end of the `<repositories>` section:

    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>

Then, add the following to the `<dependencies>` section:

    <dependency>
        <groupId>com.github.kausko</groupId>
        <artifactId>kiwi-java</artifactId>
        <version>master-SNAPSHOT</version>
    </dependency>

### Gradle
In `build.gradle`, add the following at the end of the `repositories` section:

    maven { url 'https://jitpack.io' }

Then, add the following to the `dependencies` section:

    implementation 'com.github.kausko:kiwi-java:master-SNAPSHOT'

**Notes:** 
- The `master-SNAPSHOT` version is the latest commit on the master branch. You can replace it with a specific commit hash or tag.
- For Kotlin DSL, use `url = uri("https://jitpack.io")` and `implementation(...)`.

## Example usage

```java
import no.birkett.kiwi.*;

public class Example {
    public static void main(String[] args) {
        Solver solver = new Solver();
        Variable x = new Variable("x");
        Variable y = new Variable("y");

        // x = 20
        solver.addConstraint(Symbolics.equals(x, 20));

        // x + 2 == y + 10
        solver.addConstraint(Symbolics.equals(Symbolics.add(x,2), Symbolics.add(y, 10)));

        solver.updateVariables();

        System.out.println("x " + x.getValue() + " y " + y.getValue());
        // x == 20
        // y == 12
    }
}
```

## Background
This project was created by porting [Kiwi](https://github.com/nucleic/kiwi) line for line to Java. The objective is to create a faster Java implementation of the Cassowary constraint solving algorithm.

## History

The initial porting work was done in a weekend in at the end of January 2015 by Alex Birkett without a deep understanding of the Cassowary algorithm.
At that time, the tests ported from the [java cassowary project](https://github.com/pybee/cassowary-java), did not pass.
The project was forgotten about until early 2016 when [yonsunCN](https://github.com/yongsunCN) found it and fixed it.

As of January 2016, the tests ported from [java cassowary project](https://github.com/pybee/cassowary-java) now pass.

## Contributors

* [Alex Birkett](https://github.com/alexbirkett) Initial port from Kiwi C++
* [yonsunCN](https://github.com/yongsunCN) Fixed initial port
* [Sam Twidale](https://github.com/Tw1ddle) Multiple bug fixes
* [Kaustubh Odak](https://github.com/kausko) Updated gradle build for jitpack.io compatibility

# Links
* [Kiwi](https://github.com/nucleic/kiwi)
* [Java Cassowary](https://github.com/pybee/cassowary-java)
* [Haxe-Kiwi](https://github.com/Tw1ddle/haxe-kiwi)



