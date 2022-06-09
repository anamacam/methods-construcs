package ar.com.ada.oop.instantiation;

public class Persona {
    private String name;
    private String lastName;

    public Persona(){

    }
    public Persona(String name){
        this.name = name;

    }

    public Persona(String name, String lastName){
        this.name = name;
        this.lastName = lastName;

    }

    public String getName(){
        return this.name;

    }

    public String getLastName() {
        return this.lastName;

    }

    public void SetName(String name){
        this.name = name;

    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}
