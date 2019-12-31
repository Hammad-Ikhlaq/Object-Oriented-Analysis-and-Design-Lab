/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author l164304
 */
public class Topping {
    String topping;
    Basic otherDetails;

    public Topping(String topping, Basic otherDetails) {
        this.topping = topping;
        this.otherDetails = otherDetails;
    }
}
