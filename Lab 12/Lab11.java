/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author l164281
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArithmeticExpression a = new NumericOperand(4,5,"+");
        ArithmeticExpression b = new NumericOperand(6,0,"*");
		
        ArithmeticExpression c = new CompositeOperand();
		c.add(a);
		c.add(b);
		c.addOperation("*");
        
        ArithmeticExpression d = new NumericOperand(2,2,"*"); 
        ArithmeticExpression e = new NumericOperand(6,4,"-");
		
        ArithmeticExpression f = new CompositeOperand(e,d,"+"); // values can also set in constructors       
        ArithmeticExpression g = new CompositeOperand(c,f,"*");
        System.out.println(g.execute());
    }
	
	//whole expression will be
	// [(4+5) * (6+0)] * [(2*2) + (6-4)] = 324
}
