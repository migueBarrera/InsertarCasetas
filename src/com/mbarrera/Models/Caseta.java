package com.mbarrera.Models;

public class Caseta implements Comparable<Caseta>{
    private String Titulo;
    private String Calle;
    private String Numero;
    private String Modulos;
    private String Clase;
    private String Entidad;
    private String Id;
    private String Id_Calle;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getModulos() {
        return Modulos;
    }

    public void setModulos(String modulos) {
        Modulos = modulos;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String clase) {
        Clase = clase;
    }

    public String getEntidad() {
        return Entidad;
    }

    public void setEntidad(String entidad) {
        Entidad = entidad;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getId_Calle() {
        return Id_Calle;
    }

    public void setId_Calle(String id_Calle) {
        Id_Calle = id_Calle;
    }


    @Override
    public String toString() {
        return "Caseta nº:"+getNumero()+" , con ID:"+getId();
    }

    @Override
    public int compareTo(Caseta o) {
        if (Integer.parseInt(getId()) < Integer.parseInt(o.getId())) {
            return -1;
        }
        if (Integer.parseInt(getId()) > Integer.parseInt(o.getId())) {
            return 1;
        }
        return 0;
    }
}
