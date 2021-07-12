import jdk.dynalink.beans.StaticClass;
import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class Perro extends Canino{
    //Atributos
    //public, private, protected
    private boolean perseguirCola = true;
    private String orinar;
    private String nombre;
    private int edad;
    public static int contadorPerros = 0; //La variable va a ser compartida por todos. Atributos Compartidos de Clase
    public static final String formaDientes = "Colmillos";

    //Constructor
    public Perro(String nombre, String orinar, int edad, boolean perseguirCola){

        super("Guau", "Omnivoros");
        this.nombre = nombre;
        this.edad = edad;
        this.orinar = orinar;
        this.perseguirCola = perseguirCola;
        contadorPerros ++;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrinar() {
        return orinar;
    }

    public void setOrinar(String orinar) {
        this.orinar = orinar;
    }

    public boolean isPerseguirCola() {
        return perseguirCola;
    }

    public void setPerseguirCola(boolean perseguirCola) {
        this.perseguirCola = perseguirCola;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    /*Los metodos estaticos no requieren de un 
    objeto para ser llamados
     */
    public static void oler(){
        System.out.println("Sniff");
    }

}
