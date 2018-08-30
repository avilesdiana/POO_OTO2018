/* ------------------------------------------------------------------------------------------------------
Programación Orientada a Objetos

      Uso de métodos
      Fecha:
   @Author: Diana Aviles

   @Param: 2 numeros
  @Salidas: Suma,resta,multiplicacion y DIvisión

  PROGRAMA 3
    ---------------------------------------------------------------------------------------------------*/

public class ImplementaOperaciones {

public static void main(String[] args){

  Operaciones ejecutaOperac =new Operaciones();

  System.out.println("_________________________________________");
  System.out.println("Suma,Resta,Multiplicacion,Division");
  System.out.println("By: Diana Aviles");
  System.out.println("_________________________________________\n");
  ejecutaOperac.RealizaSuma(3,7);
  ejecutaOperac.RealizaResta(4,3);
  ejecutaOperac.RealizaMultiplicacion(4,5);
  ejecutaOperac.RealizaDivision(4,6);
  System.out.println("\n");
}
}
