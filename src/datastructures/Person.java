package datastructures;

class Person {

    String name;
    int age;

    Person() {
        this("Unknown", 0);
    }

    Person(String name, int age) {
        this.name = name; //shadowing field
        this.age = age;
    }

    //Polymorphism - Overriding toString method
    public String toString() {
        return "name: " + name + " | age :" + age;
    }

}
