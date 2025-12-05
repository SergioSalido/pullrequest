package pullrequest;

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
 }
}
