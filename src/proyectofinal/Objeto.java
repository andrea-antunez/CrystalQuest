package proyectofinal;

public class Objeto {
    private String nombre;
    private String tipo;
    private int efecto;
    private int precio;

    public Objeto(String nombre, String tipo, int efecto, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.efecto = efecto;
        this.precio = precio;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return nombre + " | " + efecto + tipo + " | Precio: " + precio + " monedas";
    }
}
