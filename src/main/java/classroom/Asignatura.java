package classroom;

public class Asignatura{

    String nombre;
    int codigoInterno;
    int codigoExterno;
    
    
    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }
    Asignatura(int codigoExterno) {
        this("Sin nombre", 0, codigoExterno);
    }

    Asignatura() {
        this("Sin nombre");
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }


    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = (int) codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}