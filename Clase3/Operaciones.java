/* ------------------------------------------------------------------------------------------------------
Programación Orientada a Objetos

      Uso de métodos
      Fecha:
   @Author: Diana Aviles

   @Param: 2 numeros
  @Salidas: Suma,resta,multiplicacion y DIvisión

  PROGRAMA 3
    ---------------------------------------------------------------------------------------------------*/

    //import java.util.Scanner;

public class Operaciones{

public void RealizaSuma(int a, int b){

  int reSuma= a + b ;
  System.out.println("EL resultado de la suma es:"+ reSuma);

}


public void RealizaResta(int a, int b){

  int reResta= a - b ;
  System.out.println("EL resultado de la resta es:"+ reResta);

}

public void RealizaMultiplicacion(int a, int b){

  int reMu= a * b ;
  System.out.println("EL resultado de la Multiplicacion es:"+ reMu);

}

public void RealizaDivision(float a, float b){

   float rediv= a / b ;
  System.out.println("EL resultado de la division es:"+ rediv);

}

}
