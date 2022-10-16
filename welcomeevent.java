import java.awt.*;
import java.awt.event.*;
class welcomeevent extends Frame implements ActionListener
{
 TextField tf;
 Button b;
 welcomeevent()
  {
   
   super("Program");
   setVisible(true);
   setLayout(null);
   setSize(500,450);
   setBackground(Color.yellow);
   
   tf=new TextField();
   b=new Button("Click here");
  
   tf.setBounds(60,50,170,20);
   b.setBounds(100,120,80,30);
   
   b.addActionListener(this);
  
   add(tf);
   add(b);
  } 
  public void actionPerformed(ActionEvent e)
  {
   tf.setText("Welcome");
   tf.setBackground(Color.green);
  }
  public static void main(String s[])
  {
   new welcomeevent();
  }
 }
