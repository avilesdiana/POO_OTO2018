//Diana Laura Aviles Elizalde
import java.util.Random;

public class numerosAleatorios{
  public static void main(String[] args) {

    System.out.println("\033[H\033[2J");
    System.out.flush(); // Limpiar pantalla

    Random numerosA = new Random();

    Operacioness ejecutaOp =new Operacioness();

    double resultado;

    double valorAleatorio1 =numerosA.nextDouble();
    double valorAleatorio2 =numerosA.nextDouble();
    double valorAleatorio3 =numerosA.nextDouble();

    System.out.println("1: "+valorAleatorio1+"  2: "+valorAleatorio2+"  3: "+valorAleatorio3);

    resultado=ejecutaOp.maximos(valorAleatorio1,valorAleatorio2,valorAleatorio3);

    System.out.println("El maximo es: "+resultado);

  }
}
