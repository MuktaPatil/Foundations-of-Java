import javax.swing.*;
import javax.swing.tree.*;

public class TreeDemo
{
	TreeDemo()
	{
	JFrame x = new JFrame("Tree");
	//creating the nodes
	DefaultMutableTreeNode f = new DefaultMutableTreeNode("Font");
	DefaultMutableTreeNode c = new DefaultMutableTreeNode("Color");
	DefaultMutableTreeNode s = new DefaultMutableTreeNode("Style");
	f.add(c);
	f.add(s);
	
	//Add to color
	DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Red");
	DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Green");
	DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("Black");
	c.add(c1);
	c.add(c2);
	c.add(c3);
	
	//Add to style
	
	DefaultMutableTreeNode s1 = new DefaultMutableTreeNode("Times New Roman");
	DefaultMutableTreeNode s2 = new DefaultMutableTreeNode("Calibri");
	DefaultMutableTreeNode s3 = new DefaultMutableTreeNode("Arial");
	s.add(s1);
	s.add(s2);
	s.add(s3);
	
	//creating tree
	
	JTree t = new JTree(f);
	x.add(t);
	x.setSize(400, 500);
	x.setVisible(true);
	
	}
	public static void main(String[] args)
	{
		new TreeDemo();
	}

}
