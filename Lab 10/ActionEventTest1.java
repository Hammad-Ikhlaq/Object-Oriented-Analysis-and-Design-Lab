/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actioneventtest1;

/**
 *
 * @author asad.ullah
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ActionEventTest1 implements ActionListener{
JFrame frame;
JButton bHello;
public void initGUI () {
frame = new JFrame ();
// Event Generator
bHello= new JButton("Hello");
Container con = frame.getContentPane();
con.add(bHello);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(200,200);
frame.setVisible(true );
// Event Registration
bHello.addActionListener(this);
}//end initGUI
public void actionPerformed (ActionEvent ae){
JOptionPane.showMessageDialog(frame, "A basic JOptionPane message dialog");
}
public ActionEventTest1( ) {
initGUI ();
}
public static void main (String args [ ]) {
ActionEventTest1 aeTest = new ActionEventTest1();
}
}//end