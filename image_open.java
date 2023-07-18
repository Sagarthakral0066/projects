
// Image opener into Java...

import javax.swing.*;
import java.awt.event.*;

class image_open extends JFrame 
{
	JLabel l;
	ImageIcon i;
	image_open(String fname)
	{
		super("Selected image is this.");
		i = new ImageIcon("Saved_Images//"+fname);
		l = new JLabel(i);
		add(l);
		setLayout(null);
		setSize(i.getIconWidth(),i.getIconHeight());
		l.setBounds(1,1,i.getIconWidth(),i.getIconHeight());
		setLocation(20,20);
		setVisible(true);
	}
}


