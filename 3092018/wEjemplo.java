import java.util.Scanner;

public class wEjemplo{

  public static void main (String [] args)
  {

      Scanner entrada= new Scanner (System.in);
    int contador=1;
    int limite=10;

   while(contador<=limite){

     System.out.println("Numero"+contador);
     contador=contador +1;

   }

   //System.out.println("\033[H\033[2J");
  //System.out.flush(); // Limpiar pantalla

  System.out.println("______________________________________________");

   System.out.print("Escribe numero o -1 paraa terminar: ");
   int parametro=entrada.nextInt();

   while(parametro != -3){
     System.out.println("Escriba numeros o -3 para terminar: ");
     parametro =entrada.nextInt();
   }
  }


}
