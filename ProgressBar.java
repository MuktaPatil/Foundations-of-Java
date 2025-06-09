import javax.swing.*;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.color.*;
import java.awt.event.*;

public class Prac5 {
	static Timer timer;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("ProgressBar Demo");
		frame.setBounds(100,100, 394, 269);
		frame.setVisible(true);
		
		//creating and adding progress_bar
		JProgressBar p = new JProgressBar();
		p.setBounds(100, 50, 145, 30);
		p.setForeground(Color.GREEN);
		p.setBackground(Color.LIGHT_GRAY);
		p.setBorder(new LineBorder(Color.DARK_GRAY));
		p.setVisible(true);
		frame.add(p);
		
		//creating toggle button for on and off
		JToggleButton o = new JToggleButton("On / Off");
		o.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				if(o.isSelected())
					timer.start();
				else
					timer.stop();
			}
				});
		o.setBounds(146, 88, 100, 29);
		frame.add(o);
		
		//timer to count time
		timer = new Timer(100,new ActionListener() {

			private int x = 0;
			public void actionPerformed(ActionEvent arg0)
			{
				p.setValue(x++);
				
				if(x==100)
				{
					timer.stop();
					JOptionPane.showMessageDialog(null, "Progress Complete!");
					x = 0;
				}
			}
		});
		

	}

}
