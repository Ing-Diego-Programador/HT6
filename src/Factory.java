/**
 * Diego Vásquez 211628
 * Cristian Guevara 22742
 * Hoja de trabajo 6 - Algoritmos y estructura de datos.
 */

public class Factory
{
  //Factory de la implementacion
public IOperaciones op(String op)
{
    IOperaciones temp=null;

      if(op.equals("1")){

      temp = new OurH4shM4p();

    } else if(op.equals("2")) {

      temp = new Tree();

    } else if(op.equals("3")) {

      temp = new Linked();
      
    }

    return temp;
  }

}