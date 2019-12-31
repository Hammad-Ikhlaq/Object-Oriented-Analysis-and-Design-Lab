/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author l164281
 */
public class NumericOperand extends ArithmeticExpression{

    public NumericOperand() {
    }

    public NumericOperand(int op1, int op2, String op) {
        super(op1, op2, op);
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
        return op1/op2;
    }
    public int execute()
    {
        if(super.op.equals("+"))
        {
            return super.plus();
        }
        else if(super.op.equals("-"))
        {
            return super.minus();
        }
        else  if(super.op.equals("*"))
        {
            return super.multiply();
        }
        else 
        {
            return super.divide();
        }
    }
}
