package calc.calci_demo;






import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


	
	public class simple_compound extends Applet implements ActionListener {
	
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	JButton b1;
	JButton b2;
	JTextField t1,t2,t3,t4,t5;
	JLabel l1,l2,l3;
	JPanel p;
	public void init()
	{

	l1=new JLabel("Principle Amount");
	l2=new JLabel("Time Period");
	l3=new JLabel("Rate of Interest");
	b1=new JButton("simple interest");
	b2=new JButton("compound interest");

	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	this.setLayout(new GridLayout(5,2));
	this.add(l1);
	this.add(t1);
	this.add(l2);
	this.add(t2);
	this.add(l3);
	this.add(t3);
	this.add(b1);
	this.add(t4);
	this.add(b2);
	this.add(t5);
	b1.addActionListener(this);
	b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
	double principle_amount,time_period,rateof_interest,simple_interest,compound_interest;
	principle_amount=Double.parseDouble(t1.getText());
	time_period=Double.parseDouble(t2.getText());
	rateof_interest=Double.parseDouble(t3.getText());

	if (ae.getSource()==b1)
	{
	simple_interest=(principle_amount*time_period*rateof_interest)/100.0;
	t4.setText(String.valueOf(simple_interest));
	}
	else if(ae.getSource()==b2)
	{
	compound_interest=(principle_amount*(Math.pow((1+(rateof_interest/100.0)),time_period)));
	t5.setText(String.valueOf(compound_interest));
	}
	}
	}

