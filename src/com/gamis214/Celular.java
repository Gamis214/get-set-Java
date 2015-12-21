package com.gamis214;

public class Celular extends DetalleMovil{

    private String nombre,color,serie;

    public Celular(String Pais, String TipoModelo, int NoRegion) {
        super(Pais, TipoModelo, NoRegion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}

