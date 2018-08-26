/* ------------------------------------------------------------------------------------------------------
Programación Orientada a Objetos

   Este programa suma dos números enteros ingresados por el usuario
   Fecha:
   @Author: Diana Aviles

   @Param: Dos números enteros
  @Salidas: La suma de ambos números.
    ---------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

public class jsumaEnteros{
   public static void main(String[] args){

      Scanner entrada = new Scanner(System.in);

      int numero1, numero2, suma;

     System.out.println("__________________________________");
     System.out.println("Programa que suma dos numeros enteros");
     System.out.println("By: Diana Aviles");

      System.out.print( "Escriba el primer entero: ");
      numero1=entrada.nextInt();

      System.out.print( "Escriba el segundo entero: ");
      numero2=entrada.nextInt();

      suma= numero1 + numero2;

      System.out.print(" La suma de " + numero1 + " + " + numero2 + " es:  \n");

      System.out.print(" La suma es: " + suma + "\n");
      System.out.println (" La suma es: " + suma);

    }
}
