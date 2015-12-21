package com.gamis214;

public class Main {

    public static void main(String[] args) {

        //-->FORMA NO.1 PARA DECLARAR UN OBJETO CELULAR
        Celular celular = new Celular("MEXICO","HE",2356);
        celular.setNombre("LG");
        celular.setColor("ROJO");
        celular.setSerie("12345");

        //-->FORMA NO.2 PARA DECLARAR UN OBJETO CELULAR
        Celular2 celular2 = new Celular2("MOTOROLA","AZUL","36987","HOLANDA","MG",5897);

        //-->Impresion de objeto celular 1
        System.out.println("-------------------------------------------------");
        System.out.println("PAIS: " + celular.getPais() + " Modelo: "+celular.getTipoModelo()+" Region: "+ celular.getNoRegion());
        System.out.println("NOMBRE: " + celular.getNombre() + " COLOR: "+celular.getColor()+" SERIE: "+ celular.getNombre());
        System.out.println("-------------------------------------------------");

        //-->Impresion de objeto celular 2
        System.out.println("-------------------------------------------------");
        System.out.println("PAIS: " + celular2.getPais() + " Modelo: "+celular2.getTipoModelo()+" Region: "+ celular2.getNoRegion());
        System.out.println("NOMBRE: " + celular2.getNombre() + " COLOR: "+celular2.getColor()+" SERIE: "+ celular2.getNombre());
        System.out.println("-------------------------------------------------");

    }
}
