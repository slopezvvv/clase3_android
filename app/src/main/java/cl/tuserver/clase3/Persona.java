package cl.tuserver.clase3;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String correo;
    private int edad;
    private boolean isCasado;

    public Persona(){
        nombre = "";
        correo = "";
        edad = 0;
        isCasado = false;
    }

    public Persona(String nombre, String correo, int edad, boolean isCasado) {
        setNombre(nombre);
        setCorreo(correo);
        setEdad(edad);
        setCasado(isCasado);
    }

    // GET
    public String getNombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }

    public int getEdad(){
        return edad;
    }

    public boolean isCasado(){
        return isCasado;
    }

    public String getCasado(){
        return isCasado ? "Es casado" : "No es casado";
    }


    // SET
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCasado(boolean isCasado){
        this.isCasado = isCasado;
    }

    // CUSTOM
    public boolean validarRut(int rut){
        // valida rut
        return true;
    }
}
