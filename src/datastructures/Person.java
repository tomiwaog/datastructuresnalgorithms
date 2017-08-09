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

    public static void main(String[] args) {
        PersonStack newPStack = new PersonStack(2); //New Stack Bucket
        Person person1 = new Person("Tomiwa", 28);
        newPStack.push(person1);
        
        newPStack.printStack();
    }

}
