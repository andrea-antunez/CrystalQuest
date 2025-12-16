package proyectofinal;

import java.util.Random;


public class Combate {
    private Personaje jugador;
    private Enemigo enemigo;
    private boolean defendiendo;
    private boolean terminado;
    private boolean ganado;
    private boolean perdido;

    public Combate(Personaje jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
        this.defendiendo = false;
        this.terminado = false;
        this.ganado = false;
        this.perdido = false;
    }

    public Personaje getJugador() {
        return jugador;
    }

    public void setJugador(Personaje jugador) {
        this.jugador = jugador;
    }

    public Enemigo getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public boolean isDefendiendo() {
        return defendiendo;
    }

    public void setDefendiendo(boolean defendiendo) {
        this.defendiendo = defendiendo;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public boolean isGanado() {
        return ganado;
    }

    public void setGanado(boolean ganado) {
        this.ganado = ganado;
    }

    public boolean isPerdido() {
        return perdido;
    }

    public void setPerdido(boolean perdido) {
        this.perdido = perdido;
    }
    
    public String estadoActual() {
        return "Jugador: " + jugador.getNombre()+ "\n" +
                "Vida: " + jugador.getVida() + "\n\n" +
                "Enemigo: " + enemigo.getNombre() + "\n" +
                "Vida: " + enemigo.getVida() + "\n";
    }
    
    public static Random azar = new Random();
    
    public String turnoEnemigo() {
        int dañoEnemigo = enemigo.getAtaque() - jugador.getDefensa();
        String texto = "";
        if (defendiendo) {
            int chance = jugador.getDefensa() * 4;
            int num = azar.nextInt(101);
            if (num < chance){
                texto += "¡Bloqueaste y devolviste el ataque!\n";
                enemigo.setVida(enemigo.getVida()-dañoEnemigo);
                dañoEnemigo = 0;
            }
            else{
                texto += "¡No logró bloquear el ataque!\n";
            }
            dañoEnemigo /= 2;
            defendiendo = false;
        }

        if (dañoEnemigo > 0 && dañoEnemigo < 1) {
            dañoEnemigo = 1;
        }
        else if (dañoEnemigo < 0){
            dañoEnemigo = 1;
        }

        jugador.setVida(jugador.getVida() - dañoEnemigo);

        texto += "El enemigo ataca y hace " + dañoEnemigo + " de daño.\n";

        if (jugador.getVida() <= 0) {
            jugador.setVida(0);
            terminado = true;
            texto += "Has sido derrotado...\n";
            perdido = true;
        }
        return texto;
    }
    
    public String atacar() {
        if (terminado) {
            return "El combate ya terminó.\n";
        }
        
        int dañoJugador = jugador.getAtaque() - enemigo.getDefensa();
        if (dañoJugador < 1) {
            dañoJugador = 1;
        }
        enemigo.setVida(enemigo.getVida() - dañoJugador);
        
        String texto = "Atacas y haces " + dañoJugador + " de daño.\n";

        if (enemigo.getVida() <= 0) {
            enemigo.setVida(0);
            terminado = true;
            texto += "¡Has derrotado al enemigo!\n";
            ganado = true;
            return texto;
        }
        texto += turnoEnemigo();
        return texto;
    }
    
    public String defender() {
        if (terminado) {
            return "El combate ya terminó.\n";
        }
        defendiendo = true;
        String texto = "Te preparas para defender.\n";
        texto += turnoEnemigo();
        return texto;
    }
}
