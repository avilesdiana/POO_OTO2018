import java.util.Scanner;

public class calificaciones{

public static void main(String[] args) {

   Scanner entrada =new Scanner(System.in);

    int totalCal,resultado;

    Promedios ejecutaProm =new Promedios();

    System.out.println("Ingrese el total de calificaciones:");
    totalCal=entrada.nextInt();
    ejecutaProm.determinarPromedioClase(totalCal);

    ejecutaProm.imprimeSumaTotal();
    ejecutaProm.imprimePromedio();





  }
}
