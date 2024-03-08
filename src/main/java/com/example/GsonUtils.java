package com.example;

import com.google.gson.Gson;

public class GsonUtils {
    private static Gson gson = new Gson();

    public static String serialize(Object object) {
        return gson.toJson(object);
    }

    public static <T> T deserialize(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    public static void main(String[] args) {
        // Example usage
        Person person = new Person("John", 25);
        String json = serialize(person);
        System.out.println(json);
        
        Person deserializedPerson = deserialize(json, Person.class);
        System.out.println(deserializedPerson.getName());
        System.out.println(deserializedPerson.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
