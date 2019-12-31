/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg10;

/**
 *
 * @author l164281
 */
public class PrimeMinister {
   private static PrimeMinister instance = new PrimeMinister();

   private PrimeMinister(){}

   public static PrimeMinister getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
