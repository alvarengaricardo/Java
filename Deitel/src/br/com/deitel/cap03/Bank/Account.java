package br.com.deitel.cap03.Bank;

public class Account {
    private String name;

    public Account(String name){
        this.name = name;
    }

    public Account(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
