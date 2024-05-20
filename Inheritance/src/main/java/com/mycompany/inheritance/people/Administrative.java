
package com.mycompany.inheritance.people;

public class  Administrative extends Person {
    
    private String dependency;

    public Administrative(String dependency, String ID, String name, int age) {
        super(ID, name, age);
        this.dependency = dependency;
    }
    
    public void seeData(){
        System.out.println("");
    }
    public void fingerPrintRegistry(){
        System.out.println("Administrativo, registrando huella");
    }
}
