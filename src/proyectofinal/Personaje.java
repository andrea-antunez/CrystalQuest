package proyectofinal;

public class Personaje {
    private String nombre;
    private String clase;
    private String raza;
    private int vida;
    private int vidaMax;
    private int nivel;
    private int exp;
    private int ataque;
    private int defensa;
    boolean [] cristales = new boolean [5];
    
    public Personaje(String nombre, String clase, String raza, int vidaMax, int ataque, int defensa) {
        this.nombre = nombre;
        this.clase = clase;
        this.raza = raza;
        this.vida = vidaMax;
        this.vidaMax = vidaMax;
        this.nivel = 1;
        this.exp = 0;
        this.ataque = ataque;
        this.defensa = defensa;
        for (int i = 0; i < cristales.length; i++){
            this.cristales[i] = false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean[] getCristales() {
        return cristales;
    }

    public void setCristales(boolean[] cristales) {
        this.cristales = cristales;
    }
}
