
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class Prac4 extends Applet
{
	public void init()
	{
		
		//setting data
		Object[][] data = {
				{"1","Alex","87.65" },
				{"2","Max","89.63" },
				{"3","Sam","91.25" },
				{"4","Tom","85.83" },
				{"5","Amy","95.48" },
				
		};
		
		//setting column headers
		String[] colhead = {"ID","Name","Percentage"};
		
		//creating table
		JTable t = new JTable(data,colhead);
		t.setSize(300, 300);
		add(t);
		setVisible(true);
		
		JScrollPane p = new JScrollPane(t);
		p.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		p.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(p,BorderLayout.CENTER);
	}

}
