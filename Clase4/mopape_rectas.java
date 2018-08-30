/* ------------------------------------------------------------------------------------------------------
Programación Orientada a Objetos

      Uso de métodos
      Fecha:
   @Author: Diana Aviles

   @Param: 4 coordenadas , calcula si son rectas parelelas o perpendiculares
  @Salidas: Suma,resta,multiplicacion y DIvisión

  PROGRAMA 4
    ---------------------------------------------------------------------------------------------------*/
    import java.util.Scanner;

    public class mopape_rectas{

      public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        PendienteOrdenada ejecutaRecta = new PendienteOrdenada();

        float x1,x2,y2,y1,x3,x4,y3,y4,m1,m2;

        System.out.println("_________________________________________");
        System.out.println("Programa que calcula si las recta son paraleas o\n perpendiculares");
        System.out.println("By: Diana Aviles");
        System.out.println("_________________________________________");
        System.out.flush();
        System.out.print( "Escriba x1:");
        x1=entrada.nextFloat();
        System.out.print( "Escriba y1:");
        y1=entrada.nextFloat();
        System.out.print( "Escriba x2:");
        x2=entrada.nextFloat();
        System.out.print( "Escriba y2:");
        y2=entrada.nextFloat();

        m1= ejecutaRecta.RealizaPendiente(x1,y1,x2,y2);


        System.out.flush();
        System.out.println(" Escriba las otras coordenadas:¿");


        System.out.print( "Escriba x1:");
        x3=entrada.nextFloat();
        System.out.print( "Escriba y1:");
        y3=entrada.nextFloat();
        System.out.print( "Escriba x2:");
        x4=entrada.nextFloat();
        System.out.print( "Escriba y2:");
        y4=entrada.nextFloat();

        m2= ejecutaRecta.RealizaPendiente(x3,y3,x4,y4);

        if(m1==m2){
          System.out.print("Paraelas ");

        }
        else {
          System.out.print("Perpendiculares");
        }

      }
    }
