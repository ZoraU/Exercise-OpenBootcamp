package org.example;

public class Main {
    public static void main(String[] args) {

        Persona objPerson = new Persona();

        objPerson.setEdadPersona(18);
        objPerson.setNombrePersona("Juan");
        objPerson.setTelefonoPersona(8313484);

        System.out.println(objPerson.getEdadPersona());
        System.out.println(objPerson.getNombrePersona());
        System.out.println(objPerson.getTelefonoPersona());
    }
}

class Persona {
    private int edadPersona;
    private int telefonoPersona;
    private String nombrePersona;


    public int getEdadPersona() {
        return edadPersona;
    }
    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public int getTelefonoPersona() {
        return telefonoPersona;
    }
    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
}