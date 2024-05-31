package com.mycompany.interfaces.being;

public class Human extends Being implements Move, Fly{
    private int height;
    private String name;

    public Human(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    
    
    @Override
    public void run(){
        System.out.println("Corriendo como Naruto");
    }
    @Override
    public void walk(){
        System.out.println("Está caminando erguido");
    }

    @Override
    public void fly() {
        System.out.println("Estoy volando!!!");
   }

    @Override
    public void crawl() {
        System.out.println("CRAWL");
    }
}
