/* ------------------------------------------------------------------------------------------------------
Programación Orientada a Objetos


   Fecha: 27/08/2018
   @Author: Diana Aviles

   Instancias

  PROGRAMA 5
    ---------------------------------------------------------------------------------------------------*/


public class OperacionesInst{

  private float a;
  private float b;
  //variable de instancia, puede usarse o modificarse // en cualquier momento

  public OperacionesInst(float numero1, float numero2) {
    a=numero1;
    b=numero2;
  }



  public void RealizaSuma(){

    float reSuma= a + b ;
    System.out.println("EL resultado de la suma es:"+ reSuma);

  }


  public void RealizaResta(){

    float reResta= a - b ;
    System.out.println("EL resultado de la resta es:"+ reResta);

  }

  public void RealizaMultiplicacion(){

    float reMu= a * b ;
    System.out.println("EL resultado de la Multiplicacion es:"+ reMu);

  }

  public void RealizaDivision(){

     float rediv= a / b ;
    System.out.println("EL resultado de la division es:"+ rediv);

  }
}
