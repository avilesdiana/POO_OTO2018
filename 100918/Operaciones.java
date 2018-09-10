public class Operaciones{

  public static void imprimir(int arreglo[][])
  {
    for(int fila=0; fila<arreglo.length;fila++)
    {
      for(int columna=0;columna<arreglo[fila].length;columna++)
      System.out.print(arreglo[fila][columna]+" ");
      System.out.println();
    }
  }

  public void suma(int arreglo[][])
  {
    int suma=0;

    for(int fila=0; fila<arreglo.length;fila++)
    {

      for(int columna=0;columna<arreglo[fila].length;columna++)

        suma=arreglo[fila][columna]+suma;
      System.out.println();
      System.out.println("Fila "+ fila +": "+suma);
      suma=0;
    }

  }
  public void sumac(int arreglo[][])
  {
    int suma=0;

    for(int columna=0;columna<=arreglo.length;columna++)
    {
    suma=0;
      for(int fila=0; fila<arreglo.length;fila++)

      suma=arreglo[fila][columna]+suma;
      System.out.println();
      System.out.println("Columna "+ columna +": "+suma);

    }

  }

}
