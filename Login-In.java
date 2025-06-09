// Implementation of Applets- Now depreciated

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Practical1 extends Applet implements ActionListener
{
	JButton b1,b2;
	JTextField t1;
	JLabel l1,l2,l3,l4,l5;
	JPasswordField j1;
	public void init()
	{
		//Creating required Components
		ImageIcon i = new ImageIcon("/home/marilyn/Downloads/fb logo.png");
		 l1 = new JLabel("Facebook Login\n");
		l2 = new JLabel("Username ");
		 t1 = new JTextField(20);
		l3 = new JLabel("\nPassword");
		j1 = new JPasswordField("*",10);
		l4 = new JLabel(i);
		 b1 = new JButton("Login");
		 b2 = new JButton("Cancel");
		 l5 = new JLabel();
		
		
		//Adding Components
		add(l4);
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(j1);
		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);
		add(l5);
		
	}
	
public void actionPerformed(ActionEvent e)
{

 if(e.getSource()==b1)
	 l5.setText("Login successful");
 else
	 l5.setText("Login cancelled");
	 
	
}
}
