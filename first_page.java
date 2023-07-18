import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
    
class ProgressBarExample extends JFrame
{    
	JProgressBar jb;    
	int i=0,num=0; 
	JLabel l,l2,l3,l4,l5;    
	ImageIcon i1,i2;
	ProgressBarExample()
	{    
		l = new JLabel();
		l2 = new JLabel("Face Generation & Recognition");
		l3 = new JLabel("Please wait for few moments, Loading Modules...");
		add(l);
		l.setBorder(new LineBorder(Color.blue,2));
		jb=new JProgressBar(0,2000);    
		jb.setBounds(40,240,320,30); 
		  
		      
		jb.setValue(0);    
		jb.setStringPainted(true);    
		add(jb); 
		add(l2);  
		add(l3);

		i1 = new ImageIcon("photos//i.png");
		//i2 = new ImageIcon("photos//i1.gif");
		l4 = new JLabel(i1);
		//l5 = new JLabel(i2);
		add(l4);
		//add(l5);
		//l4.setLayout(null);
		l4.setBounds(90,30,200,200);
		
		//l5.setBounds(140,100,150,130);
		l2.setBounds(25,10,350,30);
		l3.setBounds(33,210,400,30);
		l2.setForeground(Color.red);
		l3.setForeground(Color.blue);
		l2.setFont(new Font("Sanserif",Font.BOLD,23)); 
		l3.setFont(new Font("Sanserif",Font.BOLD,14));

		setSize(400,300);  
		getContentPane().setBackground(Color.white);
		l.setBounds(0,0,400,300);  
		setLayout(null); 
		setLocation(
		(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
		(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
		);  
		setUndecorated(true);	
	}    
	public void iterate()
	{    
		while(i<=3000)
		{    
  			jb.setValue(i);    
  			i=i+20;    
  			try
			{
			Thread.sleep(50);
			}
			catch(Exception e)
			{}    
		} 
		this.dispose(); 
		new User_Authentication();
		  
	}    
	public static void main(String[] args) 
	{    
    		ProgressBarExample m=new ProgressBarExample();    
    		m.setVisible(true);    
    		m.iterate();
	}    
}  