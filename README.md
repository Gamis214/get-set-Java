# get set Herencia en Java
Ejemplo sencillo aplicando GET, SET & HERENCIA en Java

##Ejemplo
Como se vio en el ejercicio: [POO en java](https://github.com/Gamis214/POO)

Utilizaremos los parametros **GET** y **SET** para poder acceder a las variables de nuestro objeto.

###SET
```java
public void setNombre(String nombre) {
        this.nombre = nombre;
    }
```
El **SET** permite registrar en nuestro objeto la variable que le asignemos a nuestro metodo, en este caso es una variable tipo **String**
y la cual sera asignada de la siguiente manera dentro de nuestro **Main:**
```java
celular.setNombre("LG");
```

###GET
```java
public String getNombre() {
        return nombre;
    }
```
El **GET** permite obtener las propiedades del objeto en este caso la obtenemos de la siguiente manera:
```java
celular.getNombre();
```
###HERENCIA
La **Herencia** nos permite acceder a los metodos y parametros que nuestras clases u objetos a crear tengan propiedades en comun,
en este caso creamos una clase llamada: **DetalleMovil** y contiene la siguiente estructura:
```java
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
```

Cada **Objeto Celular** que creemos esta debera llevar:
* Pais
* TipoModelo
* NoRegion

Estos datos son almacenados por herencia de la clase **DetalleMovil** y nuestra clase **Celular** pedira los siguientes datos:
* Nombre
* Color
* Serie

Lo cual quedara de la siguiente manera nuestra clase **Celular:**

```java
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
```
Existe otra manera de declarar los **SET** para ello se ha creado una clase llamada **Celular2** para hacer uso de ella:
```java
public class Celular2 extends DetalleMovil {

    private String nombre,color,serie;

    public Celular2(String nombre,String color,String serie,String Pais,String TipoModelo,int NoRegion){
        super(Pais, TipoModelo, NoRegion);
        this.nombre = nombre;
        this.color = color;
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getSerie() {
        return serie;
    }
}
```

Una vez aplicado nuestra clase de **Herencia - DetalleMovil**, nuestra clase **Celular** y **Celular2** las utilizaremos en el **Main** 
para hacer uso de ellas:

###Main
```java
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
```

Una vez ejecutado el codigo **Main** el resultado es el siguiente:
```
-------------------------------------------------
PAIS: MEXICO Modelo: HE Region: 2356
NOMBRE: LG COLOR: ROJO SERIE: LG
-------------------------------------------------
-------------------------------------------------
PAIS: HOLANDA Modelo: MG Region: 5897
NOMBRE: MOTOROLA COLOR: AZUL SERIE: MOTOROLA
-------------------------------------------------
```




