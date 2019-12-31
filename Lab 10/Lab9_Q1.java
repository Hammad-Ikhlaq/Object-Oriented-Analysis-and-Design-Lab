/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9_Q1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author l164281
 */
public class Lab9_Q1
{
    JLabel SystemName;
    JButton Home,Update,Delete,Search;
    JLabel FName,LName,Session,RollNo,Branch,Year,Semester,DOB,Address;
    JComboBox Sessionc,branchc,yearc,semesterc;
    JTextField FNameb,LNameb,Sessionb,RollNob,Branchb,Yearb,Semesterb,DOBb,Addressb;
    JPanel p1,p2,p3;
    JFrame myFrame;
    JButton Button;
    
    RecordStudent students;
        List<Student> l=new ArrayList<Student>();

    public void initGUI () 
    {  
        SystemName= new JLabel();
        Home= new JButton();
        Update= new JButton();
        Delete= new JButton();
        Search= new JButton();

        myFrame=new JFrame();

        p1=new JPanel();
        p1.setLayout( new FlowLayout() );
        p2=new JPanel();
        p2.setLayout( new FlowLayout() );

        Container c = myFrame.getContentPane();
        c.setLayout(  new GridLayout(3,1) );

        SystemName.setText("STUDENT INFORMATION SYSTEM");
        SystemName.setFont(new Font("Monaco", Font.PLAIN, 20));
        SystemName.setForeground(Color.blue);

        Home.setText("Home   ");
        Home.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                myFrame.setVisible(false);
                initGUI();
            }
        });

        Update.setText("Update   ");
        Update.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                myFrame.setVisible(false);
                updateGUI();
            }
        });
        Delete.setText("Delete   ");
                Delete.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                myFrame.setVisible(false);
                deleteGUI();
            }
        });
        Search.setText("Search");
                Search.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                myFrame.setVisible(false);
               searchGUI();
            }
        });

        p1.add(SystemName);
        p2.add(Home);
        p2.add(Update);
        p2.add(Delete);
        p2.add(Search);


        c.add(p1);
        c.add(p2);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(700,750);
        myFrame.setVisible(true);
    }
    public void updateGUI ( )
    {
            Button= new JButton("Update");  
            SystemName= new JLabel();
            Home= new JButton();
            Update= new JButton();
            Delete= new JButton();
            Search= new JButton();

            FName= new JLabel();
            LName= new JLabel();
            Session= new JLabel();
            RollNo= new JLabel();
            Branch= new JLabel();
            Year= new JLabel();
            Semester= new JLabel();
            DOB= new JLabel();
            Address= new JLabel();
            Button= new JButton("Update");
            Button.addActionListener(new ActionListener(

        ) {
            //String Firstname, String LastName, int Session, String RollNumber, String Branch, int Year, int Semester, String Date_of_birth, String Address
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean b=students.Update_Student(FName.getText(), LName.getText(), Integer.valueOf(Session.getText()), RollNob.getText(), Branch.getText(), Integer.valueOf(Year.getText()), Integer.valueOf(Semester.getText()), DOB.getText(), Address.getText());
                if(b)
                {
                    JOptionPane.showMessageDialog(null,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Failed.","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        });

            FNameb= new JTextField(10);
            LNameb= new JTextField(10);
            Sessionb= new JTextField(10);

            String s[]={"2012","2013","2014","2015","2016","2017","2018"};
            Sessionc=new JComboBox(s);
            Sessionb.add(Sessionc);


            Branchb= new JTextField(10);
            RollNob= new JTextField(10);
            String q[]={"Lahore","Karachi","Islamabad"};
            branchc=new JComboBox(q);
            Branchb.add(branchc);

            Yearb= new JTextField(10);

            String w[]={"2012","2013","2014","2015","2016","2017","2018"};
            yearc=new JComboBox(w);

            Yearb.add(yearc);

            Semesterb= new JTextField(10);

            String z[]={"1","2","3","4","5","6","7","8"};
            semesterc=new JComboBox(z);
            Semesterb.add(semesterc);

            DOBb= new JTextField(10);
            Addressb= new JTextField(10);

            myFrame=new JFrame();

            p1=new JPanel();
            p1.setLayout( new FlowLayout() );
            p2=new JPanel();
            p2.setLayout( new FlowLayout() );
            p3=new JPanel();
            p3.setLayout( new GridLayout(10,2) );

            Container c = myFrame.getContentPane();
            c.setLayout(  new GridLayout(3,1) );

            SystemName.setText("STUDENT INFORMATION SYSTEM");
            SystemName.setFont(new Font("Monaco", Font.PLAIN, 20));
            SystemName.setForeground(Color.blue);
            Home.setText("Home   ");
            Home.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                myFrame.setVisible(false);
                initGUI();
            }
        });
            Update.setText("Update   ");
            Update.addActionListener(new ActionListener(

                ) {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        myFrame.setVisible(false);
                        updateGUI();
                    }
                });
        Delete.setText("Delete   ");
                Delete.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                myFrame.setVisible(false);
                deleteGUI();
            }
        });
        Search.setText("Search");
                Search.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                myFrame.setVisible(false);
               searchGUI();
            }
        });

            FName.setText("FIRST NAME");
            LName.setText("LAST NAME");
            Session.setText("SESSION");
            RollNo.setText("ROLL NUMBER");
            Branch.setText("BRANCH");
            Year.setText("YEAR");
            Semester.setText("SEMESTER");
            DOB.setText("DATE-OF-BIRTH");
            Address.setText("ADDRESS");

            p1.add(SystemName);
            p2.add(Home);
            p2.add(Update);
            p2.add(Delete);
            p2.add(Search);

            p3.add(FName);
            p3.add(FNameb);
            p3.add(LName);
            p3.add(LNameb);
            p3.add(Session);
            p3.add(Sessionc);
            p3.add(RollNo);
            p3.add(RollNob);
            p3.add(Branch);
            p3.add(branchc);
            p3.add(Year);
            p3.add(yearc);
            p3.add(Semester);
            p3.add(semesterc);
            p3.add(DOB);
            p3.add(DOBb);
            p3.add(Address);
            p3.add(Addressb);
            p3.add(Button);

            c.add(p1);
            c.add(p2);
            c.add(p3);

            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setSize(700,750);
            myFrame.setVisible(true);    
        }
        public void deleteGUI ( )
    {
            Button= new JButton("Delete");  
            Button.addActionListener(new ActionListener(

        ) {
            //String Firstname, String LastName, int Session, String RollNumber, String Branch, int Year, int Semester, String Date_of_birth, String Address
            @Override
            public void actionPerformed(ActionEvent ae) {
               boolean b=students.Delete_Student(RollNob.getText());
                               if(b)
                {
                    JOptionPane.showMessageDialog(null,"Successfully Deleted.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Failed.","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
            SystemName= new JLabel();
            Home= new JButton();
            Update= new JButton();
            Delete= new JButton();
            Search= new JButton();

            RollNo= new JLabel();

            RollNob= new JTextField(10);

            myFrame=new JFrame();

            p1=new JPanel();
            p1.setLayout( new FlowLayout() );
            p2=new JPanel();
            p2.setLayout( new FlowLayout() );
            p3=new JPanel();
            p3.setLayout( new GridLayout(10,2) );

            Container c = myFrame.getContentPane();
            c.setLayout(  new GridLayout(3,1) );

            SystemName.setText("STUDENT INFORMATION SYSTEM");
            SystemName.setFont(new Font("Monaco", Font.PLAIN, 20));
            SystemName.setForeground(Color.blue);
            Home.setText("Home   ");
            Home.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                initGUI();
            }
        });
            Update.setText("Update   ");
            Update.addActionListener(new ActionListener(

                ) {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        updateGUI();
                    }
                });
        Delete.setText("Delete   ");
                Delete.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                deleteGUI();
            }
        });
        Search.setText("Search");
        Search.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
               searchGUI();
            }
        });

            RollNo.setText("ROLL NUMBER");


            p1.add(SystemName);
            p2.add(Home);
            p2.add(Update);
            p2.add(Delete);
            p2.add(Search);

            p3.add(RollNo);
            p3.add(RollNob);
            p3.add(Button);

            c.add(p1);
            c.add(p2);
            c.add(p3);

            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setSize(700,750);
            myFrame.setVisible(true);    
        }
                public void searchGUI ( )
    {
            Button= new JButton("Search"); 
            Button.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
               boolean b=students.Search(RollNob.getText());
                 if(b)
                {
                    JOptionPane.showMessageDialog(null,"Yes it is present.","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Not Present.","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
            SystemName= new JLabel();
            Home= new JButton();
            Update= new JButton();
            Delete= new JButton();
            Search= new JButton();

            RollNo= new JLabel();

            RollNob= new JTextField(10);

            myFrame=new JFrame();

            p1=new JPanel();
            p1.setLayout( new FlowLayout() );
            p2=new JPanel();
            p2.setLayout( new FlowLayout() );
            p3=new JPanel();
            p3.setLayout( new GridLayout(10,2) );

            Container c = myFrame.getContentPane();
            c.setLayout(  new GridLayout(3,1) );

            SystemName.setText("STUDENT INFORMATION SYSTEM");
            SystemName.setFont(new Font("Monaco", Font.PLAIN, 20));
            SystemName.setForeground(Color.blue);
            Home.setText("Home   ");
            Home.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                initGUI();
            }
        });
            Update.setText("Update   ");
            Update.addActionListener(new ActionListener(

                ) {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        updateGUI();
                    }
                });
        Delete.setText("Delete   ");
                Delete.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
                deleteGUI();
            }
        });
        Search.setText("Search");
                Search.addActionListener(new ActionListener(

        ) {
            @Override
            public void actionPerformed(ActionEvent ae) {
               searchGUI();
            }
        });

            RollNo.setText("ROLL NUMBER");


            p1.add(SystemName);
            p2.add(Home);
            p2.add(Update);
            p2.add(Delete);
            p2.add(Search);

            p3.add(RollNo);
            p3.add(RollNob);
            p3.add(Button);

            c.add(p1);
            c.add(p2);
            c.add(p3);

            myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myFrame.setSize(700,750);
            myFrame.setVisible(true);    
        }
public Lab9_Q1 () 
{
        Student s=new Student("Hammad","Ikhlaq",2016,"16L-4281","Lahore",3,8,"20-10-1996","Islampura");
        l.add(s);
        Student s1=new Student("Fakhar","Alam",2016,"16L-4284","Lahore",3,8,"20-07-1997","Dentist Society");
        l.add(s1);
        Student s2=new Student("Badar","Qutab",2016,"16L-4304","Lahore",3,8,"01-03-1998","Westwood socity");
        l.add(s2);
        
        students=new RecordStudent(l,l.size());
        initGUI ();
}

    public static void main (String args[ ]) {
    Lab9_Q1 gui = new Lab9_Q1();
    }
}
