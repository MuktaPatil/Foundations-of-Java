import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class Practical2 extends Applet implements ActionListener
{
	JLabel l1,l2;
	JComboBox<?> j1;
	JButton b1;
	
	
	public void init()
	{
		//adding the labels to display information
		l1 = new JLabel("Select your preffered language");
		l2 = new JLabel();
		
		//The JComboBox
		String lang[] = {"English","Hindi","Marathi","Sanskrit"};
		j1 = new JComboBox<Object>(lang);
		j1.setBounds(50, 50,90,20);
		
		//Adding button and actionlistener to it 
		b1 = new JButton("Submit");
		b1.addActionListener(this);
	        
		
		//Adding the components to frame
		add(l1);
		add(j1);
		add(b1);
		add(l2);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String msg = (String) j1.getSelectedItem();
		if(e.getSource()==b1)
			l2.setText("Selected Language :"+msg);
	}
	
}
