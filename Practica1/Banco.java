/* ------------------------------------------------------------------------------------------------------
Programación Orientada a Objetos


   Fecha: 29/08/2018
   @Author: Diana Aviles

   Instancias

  PROGRAMA 7
    ---------------------------------------------------------------------------------------------------*/
  import java.util.Scanner;

    public class Banco{

      public static void main(String[] args){


       int compraRealizada;
       int resultado;

      Scanner entrada = new Scanner(System.in);


        System.out.println("\033[H\033[2J");
        System.out.flush(); // Limpiar pantalla

        System.out.println("_________________________________________");
        System.out.println("Saldo y Compras");
        System.out.println("By: Diana Aviles");
        System.out.println("_________________________________________\n");
        System.out.println(" Tu saldo es: $15,000.00\n");
        System.out.println("Ingresa la cantidad de la compra: (Redondeado)\n");
        compraRealizada=entrada.nextInt();

        OperacionesBanco ejecutaOperac =new OperacionesBanco(15000);//inicializar constructor

        resultado=ejecutaOperac.RealizaCompra(compraRealizada);

         System.out.println("Tu saldo final es: "+resultado);

      }


    }
