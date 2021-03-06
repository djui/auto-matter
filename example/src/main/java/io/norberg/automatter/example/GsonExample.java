package io.norberg.automatter.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import io.norberg.automatter.gson.AutoMatterTypeAdapterFactory;

import static java.lang.System.out;

public class GsonExample {

  public static void main(final String... args) throws IOException {
    // Register the AutoMatterTypeAdapterFactory to handle deserialization
    Gson gson = new GsonBuilder()
        .registerTypeAdapterFactory(new AutoMatterTypeAdapterFactory())
        .create();

    Foobar foobar = new FoobarBuilder()
        .bar(17)
        .foo("hello world")
        .build();

    String json = gson.toJson(foobar);
    out.println("json: " + json);

    Foobar parsed = gson.fromJson(json, Foobar.class);
    out.println("parsed: " + parsed);

    out.println("equals: " + foobar.equals(parsed));
  }
}
