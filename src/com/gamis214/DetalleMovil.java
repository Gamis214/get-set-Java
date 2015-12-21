package com.gamis214;


public class DetalleMovil {
    String Pais,TipoModelo;
    int NoRegion;

    public DetalleMovil(String Pais,String TipoModelo,int NoRegion){
        this.Pais = Pais;
        this.TipoModelo = TipoModelo;
        this.NoRegion = NoRegion;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public void setTipoModelo(String tipoModelo) {
        TipoModelo = tipoModelo;
    }

    public void setNoRegion(int noRegion) {
        NoRegion = noRegion;
    }

    public String getPais() {
        return Pais;
    }

    public String getTipoModelo() {
        return TipoModelo;
    }

    public int getNoRegion() {
        return NoRegion;
    }
}
