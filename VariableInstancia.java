/* ------------------------------------------------------------------------------------------------------
Programación Orientada a Objetos


   Fecha: 27/08/2018
   @Author: Diana Aviles

   Instancias

  PROGRAMA 5
    ---------------------------------------------------------------------------------------------------*/


public class VariableInstancia{
  private String nombrePersona;
  //variable de instancia, puede usarse o modificarse // en cualquier momento
  public VariableInstancia (String nombre) {
    nombrePersona = nombre;
  }

  public void setNombre(String nombre){
    nombrePersona=nombre;

  }

  public String getNombre(){
    return nombrePersona;
  }

  public void muestraNombre(){
    System.out.println("El nombre de la personas es:"+getNombre() );
  }
}
