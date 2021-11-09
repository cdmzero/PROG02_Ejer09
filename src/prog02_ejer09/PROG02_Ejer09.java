
package prog02_ejer09;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class PROG02_Ejer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner( System.in );
    int i,x=0;
    String NumTexto;
    // pedimos por teclado un número de 5 dígitos positivo
    while (x<10000 || x>99999){
      System.out.print( "Introduzca un número: " );
      x = teclado.nextInt();
    }
    NumTexto = String.valueOf(x);
    // hacemos un bucle tantas veces como carácteres tenga el string
    for (i=0;i<NumTexto.length();i++){
      // accedemos al caracter i hasta (i+1)
      System.out.print(NumTexto.substring(i,(i+1)));
      System.out.print(" ");
    }   
  }
    
}
