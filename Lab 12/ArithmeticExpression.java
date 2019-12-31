/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author l164281
 */
public class ArithmeticExpression {
     int op1;
     int op2;
    String op;

    public ArithmeticExpression(int op1, int op2, String op) {
        this.op1 = op1;
        this.op2 = op2;
        this.op = op;
    }

    public ArithmeticExpression() {
    }
        public void add(ArithmeticExpression n)
    {
       
    }
    public void addOperation(String n)
    {
        
    }
    
    public int plus()
    {
        return op1+op2;
    }
        public int minus()
    {
        return op1-op2;
    }
       public int multiply()
    {
        return op1*op2;
    }
              public int divide()
    {
        return op1*op2;
    }
                public int execute()
    {
        return 0;
    }
}
