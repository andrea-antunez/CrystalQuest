package proyectofinal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProyectoFinal {
    
    public static ArrayList <Personaje> personajes = new ArrayList();
    public static ArrayList <Enemigo> enemigos = new ArrayList();
    public static ArrayList <Enemigo> jefes = new ArrayList();
    public static ArrayList <Objeto> objetos = new ArrayList();
    public static Objeto [][] mochila = new Objeto[3][5];
    public static String [] clases = {"Barbaro", "Bardo", "Brujo", "Clerigo", "Druida", "Explorador", "Guerrero", "Hechicero", "Mago", "Monje", "Paladin", "Picaro"};
    public static String [] razas = {"Draconido", "Elfo", "Enano", "Gnomo", "Halfling", "Humano", "Orco", "Tiefling"};
    public static int nivel = 1;
    public static Scanner leer = new Scanner(System.in);
    public static Random azar = new Random();
    
    public static void main(String[] args) {
        //Personajes default
        personajes.add(new Personaje("Lyra", "Druida", "Elfo", 32, 10, 3));
        personajes.add(new Personaje("Arin", "Guerrero", "Humano", 40, 8, 6));
        personajes.add(new Personaje("Dorn", "Ladrón", "Enano", 30, 7, 5));
        crear();
    }
    
    public static void crear(){
        //Estadisticas base
        int vida = 30;
        int ataque = 6;
        int defensa = 3;
        
        String nombre;
        do{
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de su heroe");
            if (nombre.equals("")){
                JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (nombre.equals(""));
        
        //Estadisticas que agregan las clases
        String descClases = """
                            Barbaro: +3 ATQ, +3 VIDA
                            Bardo: +2 ATQ, +2 DEF, +1 VIDA
                            Brujo: +4 ATQ, -1 DEF
                            Clerigo: +2 ATQ, +3 DEF
                            Druida: +2 ATQ, +2 DEF
                            Explorador: +3 ATQ, +1 DEF
                            Guerrero: +3 ATQ, +2 DEF
                            Hechicero: +4 ATQ, +1 DEF
                            Mago: +5 ATQ, -2 DEF
                            Monje: +2 ATQ, +2 DEF
                            Paladin: +3 ATQ, +3 DEF
                            Picaro: +3 ATQ, +1 DEF""";
        JOptionPane.showMessageDialog(null, descClases, "Clases disponibles", JOptionPane.INFORMATION_MESSAGE);
        int clase = JOptionPane.showOptionDialog(null, "Seleccione una clase:", "Clase", 0, JOptionPane.QUESTION_MESSAGE, null, clases, clases[5]);
        
        //Estadisticas que agregan las razas
        String descRazas = """
                           Draconido: +4 ATQ, +2 VIDA
                           Elfo: +3 ATQ, +1 DEF
                           Enano: +4 DEF, +2 VIDA
                           Gnomo: +2 ATQ, +1 DEF
                           Halfling: +3 DEF, +1 VIDA
                           Humano: +1 ATQ, +1 DEF, +2 VIDA
                           Orco: +5 ATQ, -1 DEF
                           Tiefling: +3 ATQ, +1 DEF""";
        JOptionPane.showMessageDialog(null, descRazas, "Razas disponibles", JOptionPane.INFORMATION_MESSAGE);
        int raza = JOptionPane.showOptionDialog(null, "Seleccione una raza:", "Raza", 1, JOptionPane.QUESTION_MESSAGE, null, razas, razas[5]);
        
        String [] opciones = {"Manual", "Azar", "Default"};
        int opcion = JOptionPane.showOptionDialog(null, "Que metodo desea utilizar para las estadisticas?", "Estadisticas", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones [2]);
        
        if (opcion == 0){
            String vida_temp = "";
            boolean val = false;
            do{
                val = true;
                vida_temp = JOptionPane.showInputDialog(null, "Ingrese los puntos de vida de su heroe (20-40):");
                if (vida_temp == ""){
                    continue;
                }
                for(int i = 0; i < vida_temp.length(); i++){
                    if (vida_temp.charAt(i) < '0' || vida_temp.charAt(i) > '9'){
                        val = false;
                        JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros.");
                        break;
                    }
                }
                if (val){
                    vida = Integer.parseInt(vida_temp);
                    if (vida > 40 || vida < 20){
                        val = false;
                        JOptionPane.showMessageDialog(null, "Tiene que ingresar numeros entre 20 y 40.");
                    }
                }
            } while (vida_temp.equals("") || val != true);
            
            String ataque_temp = "";
            do{
                val = true;
                ataque_temp = JOptionPane.showInputDialog(null, "Ingrese el ataque (4-10):");
                if (ataque_temp == ""){
                    continue;
                }
                for(int i = 0; i < ataque_temp.length(); i++){
                    if (ataque_temp.charAt(i) < '0' || ataque_temp.charAt(i) > '9'){
                        val = false;
                        JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros.");
                        break;
                    }
                }
                if (val){
                    ataque = Integer.parseInt(ataque_temp);
                    if (ataque > 10 || ataque < 4){
                        val = false;
                        JOptionPane.showMessageDialog(null, "Tiene que ingresar numeros entre 4 y 10.");
                    }
                }
            } while (ataque_temp.equals("") || val != true);
            
            String defensa_temp = "";
            do{
                val = true;
                defensa_temp = JOptionPane.showInputDialog(null, "Ingrese la defensa (1-6):");
                if (defensa_temp == ""){
                    continue;
                }
                for(int i = 0; i < defensa_temp.length(); i++){
                    if (defensa_temp.charAt(i) < '0' || defensa_temp.charAt(i) > '9'){
                        val = false;
                        JOptionPane.showMessageDialog(null, "Debe ingresar solo numeros.");
                        break;
                    }
                }
                if (val){
                    defensa = Integer.parseInt(defensa_temp);
                    if (defensa > 6 || defensa < 1){
                        val = false;
                        JOptionPane.showMessageDialog(null, "Tiene que ingresar numeros entre 1 y 6.");
                    }
                }
            } while (defensa_temp.equals("") || val != true);
            
            JOptionPane.showMessageDialog(null, "Estas son las estadisticas que ingreso: \n"+"Vida: "+vida+"\n"+ "Ataque: "+ataque+"\n"+"Defensa: "+defensa);
        }
        else if (opcion == 1){
            int conf = 0;
            do{
                vida = azar.nextInt(20,41);
                ataque = azar.nextInt(4,11);
                defensa = azar.nextInt(1,7);
                conf = JOptionPane.showConfirmDialog(null, "Esta conforme con las siguientes estadisticas? \n"+"Vida: "+vida+"\n"+ "Ataque: "+ataque+"\n"+"Defensa: "+defensa);
            }while (conf == 1);
        }
        
        switch (clase){
            case 0:
                ataque += 3;
                vida += 3;
                break; 
            
            case 1:
                ataque += 2;
                defensa += 2;
                vida += 1;
                break;
            
            case 2:
                ataque += 4;
                defensa -= 1;
                break;
            
            case 3:
                ataque += 2;
                defensa += 3;
                break;
            
            case 4:
                ataque += 2;
                defensa += 2;
                break;
            
            case 5:
                ataque += 3;
                defensa += 1;
                break;
            
            case 6:
                ataque += 3;
                defensa += 2;
                break;
            
            case 7:
                ataque += 4;
                defensa += 1;
                break;
            
            case 8:
                ataque += 5;
                defensa += -2;
                break;
            
            case 9:
                ataque += 2;
                defensa += 2;
                break;
            
            case 10:
                ataque += 3;
                defensa += 3;
                break;
            
            case 11:
                ataque += 3;
                defensa += 1;
                break;  
        }
        
        switch (raza){
            case 0:
                ataque += 4;
                vida += 2;
                break;
                
            case 1:
                ataque += 3;
                defensa += 1;
                break;
            
            case 2:
                ataque += 4;
                vida += 2;
                break;
            
            case 3:
                ataque += 2;
                defensa += 1;
                break;
            
            case 4:
                defensa += 3;
                vida += 1;
                break;
            
            case 5:
                ataque += 1;
                defensa += 1;
                vida += 2;
                break;
            
            case 6:
                ataque += 5;
                defensa -= 1;
                break;
            
            case 7:
                ataque += 3;
                defensa += 1;
                break;
        }
        JOptionPane.showMessageDialog(null, "Estas son sus estadisticas con las modificaciones: \n"+"Vida: "+vida+"\n"+ "Ataque: "+ataque+"\n"+"Defensa: "+defensa);
        personajes.add(new Personaje(nombre, clases[clase], razas[raza], vida, ataque, defensa));
        JOptionPane.showMessageDialog(null, "Ha creado su personaje!");
    }
}
