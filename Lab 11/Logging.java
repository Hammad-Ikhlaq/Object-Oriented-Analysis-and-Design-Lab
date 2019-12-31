/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg10;

/**
 *
 * @author l164281
 */
public class Logging {
   private static Logging instance = new Logging();

   private Logging(){}

   public static Logging getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
