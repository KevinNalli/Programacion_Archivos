
package com.mycompany.inheritance;

import com.mycompany.inheritance.people.Administrative;
import com.mycompany.inheritance.people.Person;

public class Inheritance {

    public static void main(String[] args) {
        Person person = new Person("asd1", "Ana", 30);
        System.out.println("Hola tu nombre es: " + person.getName());
        System.out.print("Persona:");
        person.fingerPrintRegistry();
        
        
        
        Administrative admin = new Administrative("Ingenierias","asd2", "Pedro", 30);
        System.out.println("Hola, lo hemos identificado como:" + admin.getName());
        System.out.print("Administrativo: ");
        admin.fingerPrintRegistry();
    }
}
