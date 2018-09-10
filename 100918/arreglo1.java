
import java.util.Scanner;

public class arreglo1{
  public static void main(String[] args) {

    System.out.println("\033[H\033[2J");
  	System.out.flush(); // Limpiar pantalla

   System.out.println("______________________________________________");
   System.out.println("By: Diana Aviles\n\n");

   int arreglo2[][]={{1,7,3}, {4,1,9}};


   Operaciones ejecuta =new Operaciones();

   ejecuta.imprimir(arreglo2);
   System.out.println("______________________________________________");
   ejecuta.suma(arreglo2);
   System.out.println("______________________________________________");
   ejecuta.sumac(arreglo2);
   System.out.println();

  }
}
