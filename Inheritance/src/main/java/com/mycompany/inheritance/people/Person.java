
package com.mycompany.inheritance.people;

public class Person {
    private String ID;
    private String name;
    private int age;
    
    public void fingerPrintRegistry(){
        System.out.println("Registrando huella digital");
    }

    public Person(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
