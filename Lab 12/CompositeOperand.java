/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import java.util.ArrayList;

/**
 *
 * @author l164281
 */
public class CompositeOperand extends ArithmeticExpression{

    ArithmeticExpression a1=null;
    ArithmeticExpression a2=null;
    String o;
    
    public CompositeOperand() {
    }

    public CompositeOperand(ArithmeticExpression a1, ArithmeticExpression a2, String o) {
        this.a1 = a1;
        this.a2 = a2;
        this.o = o;
    }

    
    public void add(ArithmeticExpression n)
    {
        if(a1==null)
        {
            a1=n;
        }
        else
        {
            a2=n;
        }
    }
        public void addOperation(String n)
    {
        o=n;
    }
   
    public int execute()
    {
        int a,b,c;
        a=a1.execute();
        b=a2.execute();
        if(o.equals("+"))
        {
            c=a+b;
           
        }
        else if(o.equals("-"))
        {
             c=a-b;
        }
        else  if(o.equals("*"))
        {
             c=a*b;
        }
        else 
        {
             c=a/b;
        }
        return c;
    }
}
