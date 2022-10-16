import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class PersonalDetails extends Frame implements
ActionListener
{String msg;
 Button b1=new Button("submit");
 Button b2=new Button("reset");
 Label l11=new Label("Personal Details",Label.CENTER);
 Label l1=new Label("Name:",Label.LEFT);
 Label l2=new Label("Address:",Label.LEFT);
 Label l3=new Label("Email_Id:",Label.LEFT);
 Label l4=new Label("PhoneN_N0:",Label.LEFT);
 Label l5=new Label("Gender:",Label.LEFT);
 Label l6=new Label("Country:",Label.LEFT);
 Label l7=new Label("Qualification:",Label.LEFT);
 Label l8=new Label("Hobbies:",Label.LEFT);
 Label l9=new Label("",Label.RIGHT);
 TextField t1=new TextField();
 Choice c1=new Choice();
 CheckboxGroup cbg=new CheckboxGroup();
 Checkbox ck1=new Checkbox("Male",false,cbg);
 Checkbox ck2=new Checkbox("Female",false,cbg);
 TextArea t2=new
 TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
 Choice country=new Choice();
 Choice qualification=new Choice();
 CheckboxGroup cbg1=new CheckboxGroup();
 Checkbox ck3=new Checkbox("Singing",false,cbg);
 Checkbox ck4=new Checkbox("Dancing",false,cbg);
 Checkbox ck5=new Checkbox("Acting",false,cbg);
public PersonalDetails()
 {addWindowListener(new myWindowAdapter());
 setBackground(Color.cyan);
 setForeground(Color.black);
 setLayout(null);
 add(l11);
 add(l1);
 add(l2);
 add(l3);
 add(l4);
 add(l5);
 add(l6);
 add(l7);
 add(l8);
 add(l9);
 add(t1);
 add(t2);
 add(ck1);
 add(ck2);
 add(country);
 add(qualification); 
 add(ck1);
 add(ck2);
 add(ck3);
 b1.addActionListener(this);
 add(b1);
 country.add("India");
 country.add("Nepal");
 country.add("Bangladesh");
 country.add("Brazil");
 country.add("England");
 qualification.add("BSc");
 qualification.add("MSc");
 qualification.add("10th");
 qualification.add("12th");
 qualification.add("PHd");
 l1.setBounds(25,65,90,20);
 l2.setBounds(25,65,90,20);
 l3.setBounds(25,120,90,20);
 l4.setBounds(25,185,90,20);
 l5.setBounds(25,260,90,20);
 l6.setBounds(25,265,90,20);
 l7.setBounds(25,260,90,20);
 l8.setBounds(25,260,90,20);
 l9.setBounds(25,290,90,20);
 l11.setBounds(10,40,280,20);
 t1.setBounds(120,65,170,20);
 t2.setBounds(120,185,170,60);
 ck1.setBounds(120,120,50,20);
 ck2.setBounds(170,120,60,20);
 country.setBounds(120,260,100,20);
 qualification.setBounds(120,290,50,20);
 ck3.setBounds(120,120,50,20);
 ck4.setBounds(170,120,60,20);
 ck5.setBounds(200,120,60,20);
 b1.setBounds(120,350,50,30);
}

{
 System.exit(0);
 }
 
}
 
 
 
 
 
 
 
 