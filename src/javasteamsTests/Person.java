package javasteamsTests;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+name+" | "+"Age:"+age);
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
}