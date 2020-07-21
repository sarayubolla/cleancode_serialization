package calc.calci_demo;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App extends Applet implements ActionListener {
/**
*
*/
private static final long serialVersionUID = 1L;
JButton b1;
JTextField t1,t2,t3,t4;
JLabel l1,l2,l3;
JPanel p;
public void init()
{
// TODO start asynchronous download of heavy resources

l1=new JLabel("Material_Standard");
l2=new JLabel("Total_Area");
l3=new JLabel("Fully_Automated");
b1=new JButton("Calculate the Cost");

t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();

this.setLayout(new GridLayout(4,2));
this.add(l1);
this.add(t1);
this.add(l2);
this.add(t2);
this.add(l3);
this.add(t3);
this.add(b1);
this.add(t4);
b1.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
{

String ms;
double totarea,totalcost=0.0;
int construction_cost;
String automated;
ms=t1.getText();
totarea=Double.parseDouble(t2.getText());
automated=t3.getText().toLowerCase();

if (ae.getSource()==b1)
{
if(ms.equals("standard")) {
construction_cost=1200;
totalcost=construction_cost*totarea;
}
else if(ms.equals("above standard")) {
construction_cost=1500;
totalcost=construction_cost*totarea;
}
else if(ms.equals("high standard")) {
construction_cost=1800;
totalcost=construction_cost*totarea;
}
else if(ms.equals("high standard") && (automated.equals("yes") || automated.equals("true"))) {
construction_cost=2500;
totalcost=construction_cost*totarea;
}
t4.setText(Double.toString(totalcost));
}
}

}
