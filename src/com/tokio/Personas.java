package com.tokio;

public class Personas {

    private String nombre;
    private String apellido;
    private int edad;
    private String pais;

    public Personas(String nombre, String apellido, int edad, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais =pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String nada(){
       return "hola";
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                '}';
    }
}
