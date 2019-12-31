/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

/**
 *
 * @author asad.ullah
 */
//Step 1: import packages
import java.awt.*;
import javax.swing.*;
public class GUITest {
JFrame myFrame ;
JTextField tf;
JButton b1;
public void initGUI ( ) { //method used for setting layout of GUI
//Step 2: setup the top level container
myFrame= new JFrame();
//Step 3: Get the component area of top-level container
Container c = myFrame.getContentPane();
//Step 4: Apply layouts
c.setLayout( new FlowLayout( ) );

//Step 5: create & add components
JTextField tf = new JTextField(10);
JButton b1 = new JButton("My Button");
c.add(tf);
c.add(b1);
//Step 6: set size of frame and make it visible
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myFrame.setSize(200,150);
myFrame.setVisible(true);
} //end init method
public GUITest () { // constructor
initGUI ();
}

public static void main (String args[ ]) {
GUITest gui = new GUITest();
}
} //