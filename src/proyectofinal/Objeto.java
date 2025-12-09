package proyectofinal;

public class Objeto {
    private String nombre;
    private String tipo;
    private int efecto;

    public Objeto(String nombre, String tipo, int efecto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.efecto = efecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEfecto() {
        return efecto;
    }

    public void setEfecto(int efecto) {
        this.efecto = efecto;
    }
}
