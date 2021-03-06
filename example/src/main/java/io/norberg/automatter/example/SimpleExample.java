package io.norberg.automatter.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class SimpleExample {

  public static void main(final String... args) throws IOException {
    Foobar foobar = new FoobarBuilder()
        .foo("hello world")
        .bar(17)
        .build();

    out.println("bar: " + foobar.bar());
    out.println("foo: " + foobar.foo());
    out.println("foobar: " + foobar);

    Foobar modified = foobar.builder()
        .bar(18)
        .build();

    out.println("modified: " + modified);

    List<String> foo = new ArrayList<String>();
    List<String> bar = new ArrayList<String>(foo);
  }
}
