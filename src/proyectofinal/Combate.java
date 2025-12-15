package proyectofinal;


public class Combate {
    private Personaje jugador;
    private Enemigo enemigo;
    private boolean defendiendo;
    private boolean terminado;

    public Combate(Personaje jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
        this.defendiendo = false;
        this.terminado = false;
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
    
    public String estadoActual() {
        return "Jugador: " + jugador.getNombre()+ "\n" +
                "Vida: " + jugador.getVida() + "\n\n" +
                "Enemigo: " + enemigo.getNombre() + "\n" +
                "Vida: " + enemigo.getVida() + "\n";
    }
    
    private String turnoEnemigo() {
        int dañoEnemigo = enemigo.getAtaque() - jugador.getDefensa();

        if (defendiendo) {
            dañoEnemigo /= 2;
            defendiendo = false;
        }

        if (dañoEnemigo < 1) {
            dañoEnemigo = 1;
        }

        jugador.setVida(jugador.getVida() - dañoEnemigo);

        String texto = "El enemigo ataca y hace " + dañoEnemigo + " de daño.\n";

        if (jugador.getVida() <= 0) {
            jugador.setVida(0);
            terminado = true;
            texto += "Has sido derrotado...\n";
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

        String resultado = "Atacas y haces " + dañoJugador + " de daño.\n";

        if (enemigo.getVida() <= 0) {
            enemigo.setVida(0);
            terminado = true;
            resultado += "¡Has derrotado al enemigo!\n";
            return resultado;
        }

        resultado += turnoEnemigo();
        return resultado;
    }
    
    public String defender() {
        if (terminado) {
            return "El combate ya terminó.\n";
        }

        defendiendo = true;
        String resultado = "Te preparas para defender.\n";
        resultado += turnoEnemigo();
        return resultado;
    }
}
