package pullrequest;

import java.util.Scanner;

public class Personaje {
    private String nom;
    private int dinero;

    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
    }

    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$.");
    }

    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();

        // Actualizamos el dinero del jugador llamando a la función
        jugador.dinero = gastarDinero(jugador.dinero);

        jugador.mostrarInfo(); // MOSTRARÁ EL DINERO TRAS GASTAR
    }

    public static int gastarDinero(int dineroActual) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Cuánto dinero quieres gastar?");
        int dineroGastado = miScanner.nextInt();

        int dineroRestante = dineroActual - dineroGastado;

        System.out.println("Trevor gasta " + dineroGastado + "$ en armas.");
        System.out.println("Se queda con: " + dineroRestante + "$");
        miScanner.close();
        return dineroRestante;
    }
}

