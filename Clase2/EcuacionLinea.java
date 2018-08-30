/* ------------------------------------------------------------------------------------------------------
Programación Orientada a Objetos

   Obtiene la ecuación de la recta
   Fecha:
   @Author: Diana Aviles

   @Param: 2 coordenadas (X1,Y1), (Y2,x2)
  @Salidas: La ecuación de la recta

  PROGRAMA 2
    ---------------------------------------------------------------------------------------------------*/
    import java.util.Scanner;

    public class EcuacionLinea{

        public static void main(String[] args){

          Scanner entrada = new Scanner(System.in);

          double x1,x2,y1,y2, m, b,e;

          System.out.println("_________________________________________");
          System.out.println("Programa que calcula la ecuacion de la recta");
          System.out.println("By: Diana Aviles");
          System.out.println("_________________________________________\n");
          System.out.print(" COORDENADAS (X1, Y1), (X2, Y2) \n");
          System.out.print( "Escriba x1 (entero +): ");
          x1=entrada.nextInt();
          System.out.print( "Escriba y1 (entero +): ");
          y1=entrada.nextInt();
          System.out.print( "Escriba x2 (entero +): ");
          x2=entrada.nextInt();
          System.out.print( "Escriba y2 (entero +): ");
          y2=entrada.nextInt();

          m= (y2-y1)/(x2-x1);
          e= (m*x1)*-1;
          b=e + y1;

          System.out.println("_________________________________________");
          System.out.print("\n\nLa ecuacion es: y = "+m+"x + "+b+ "\n");
          System.out.println("_________________________________________\n");


        }
    }
