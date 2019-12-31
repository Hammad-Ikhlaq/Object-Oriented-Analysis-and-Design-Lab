/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l164304
 */
public class GreenLight implements Reciever {
@Override
public void on() {
System.out.println("Swithcing on green light");
}
@Override
public void off() {
System.out.println("Swithcing off green light");
}
}
