
// Home Page...

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import jaco.mp3.player.*;

class home_page extends JFrame implements ActionListener
{
	JButton b,b1,b2,b3;
	JPanel p;	
	Font f;
	JLabel l,l1,l2,l3,l4,l5;
	ImageIcon i,e1,e2,e3,e4,e5,e6,e7,fs_e1,fs_e2,fs_e3,fs_e4,fs_e5,fs_e6,fs_e7,n1,n2,n3,n4,n5,n6,lp1,lp2,lp3,lp4,lp5,lp6,i1;
	JComboBox jc,jnose,jear,jlips,jshape;
	JLabel shape,eye,nose,lips,l_title;
	int flag=0,index=-1,index1=-1;
	LineBorder lb,lb1;
	String s_shape,s_eye,s_nose,s_lips;
	JFileChooser fc;
	File f1=null;
	String fpath="";

	MP3Player p_welcome,pe,pn,pl,ps;	
	

	home_page()
	{
		super("Face Generation and Recognition.");
			
		pe = new MP3Player(new File("D:/Project_Coding/audio/eye.mp3"));
		pn = new MP3Player(new File("D:/Project_Coding/audio/nose.mp3"));
		pl = new MP3Player(new File("D:/Project_Coding/audio/lips.mp3"));
		ps = new MP3Player(new File("D:/Project_Coding/audio/shape.mp3"));
		p_welcome = new MP3Player(new File("D:/Project_Coding/audio/welcome.mp3"));

		p_welcome.play();
			
		p = new JPanel();
		l1 = new JLabel("Select Eye :");
		l2 = new JLabel("Select Nose :");
		l3 = new JLabel("Select Face Shape :");
		l4 = new JLabel("Select Lips :");
		l5 = new JLabel("Welcome User!");
		l_title = new JLabel("FACE GENERATION AND RECOGNITION"); 
		add(l1);	
		add(l2);
		add(l3);
		add(l4);
		add(l_title);
		add(l5);
		
		lb = new LineBorder(Color.red,4);
		lb1 = new LineBorder(Color.black,2);	
		i = new ImageIcon("photos//12.png");
		e1 = new ImageIcon("photos//e1.png");
		e2 = new ImageIcon("photos//e2.png");
		e3 = new ImageIcon("photos//e3.png");
		e4 = new ImageIcon("photos//e4.png");
		e5 = new ImageIcon("photos//e5.png");
		e6 = new ImageIcon("photos//e6.png");
		e7 = new ImageIcon("photos//e7.jpg");

		fs_e1 = new ImageIcon("photos//f1.png");
		fs_e2 = new ImageIcon("photos//f2.png");
		fs_e3 = new ImageIcon("photos//f3.png");
		fs_e4 = new ImageIcon("photos//f4.png");
		fs_e5 = new ImageIcon("photos//f5.png");
		fs_e6 = new ImageIcon("photos//f6.png");
		fs_e7 = new ImageIcon("photos//f7.png");
		//fs_e8 = new ImageIcon("photos//f3.png");

		n1 = new ImageIcon("photos//n1.png");
		n2 = new ImageIcon("photos//n2.png");
		n3 = new ImageIcon("photos//n3.png");
		n4 = new ImageIcon("photos//n4.png");
		n5 = new ImageIcon("photos//n5.png");
		n6 = new ImageIcon("photos//n6.png");

		lp1 = new ImageIcon("photos//l1.png");
		lp2 = new ImageIcon("photos//l2.png");
		lp3 = new ImageIcon("photos//l3.png");
		lp4 = new ImageIcon("photos//l4.png");
		lp5 = new ImageIcon("photos//l5.png");
		lp6 = new ImageIcon("photos//l6.png");

	
		l=new JLabel();
		l.setBorder(lb);
		add(p);
		
		jc = new JComboBox();
		jc.addItem("");
		jc.addItem(e1);
		jc.addItem(e2);
		jc.addItem(e3);
		jc.addItem(e4);
		jc.addItem(e5);
		jc.addItem(e6);
		jc.addItem(e7);
		
		add(jc);
		jc.setSelectedIndex(0);

		jnose = new JComboBox();
		jear = new JComboBox();
		jlips = new JComboBox();
		jshape = new JComboBox();

		jshape.addItem("");
		jshape.addItem(fs_e1);
		jshape.addItem(fs_e2);
		jshape.addItem(fs_e3);
		jshape.addItem(fs_e4);
		jshape.addItem(fs_e5);
		jshape.addItem(fs_e6);
		jshape.addItem(fs_e7);
		jshape.addItem(fs_e5);


		jnose.addItem("");
		jnose.addItem(n1);
		jnose.addItem(n2);
		jnose.addItem(n3);
		jnose.addItem(n4);
		jnose.addItem(n5);
		jnose.addItem(n6);

		jlips.addItem("");
		jlips.addItem(lp1);
		jlips.addItem(lp2);
		jlips.addItem(lp3);
		jlips.addItem(lp4);
		jlips.addItem(lp5);
		jlips.addItem(lp6);

		add(jnose);
		add(jlips);
		add(jshape);

		b = new JButton("Logout");
		b1 = new JButton("Browse Database...");
		b2 = new JButton("Save Face");
		b3 = new JButton("Clear Face");
		f = new Font("Sanserif",Font.BOLD,18);

		setLayout(null);

		add(b);
		add(b1);
		add(b2);
		add(b3);
		b1.setBounds(460,610,230,40);
		b2.setBounds(700,610,130,40);
		b3.setBounds(842,610,200,40);

		b.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);

		jc.setFont(f);
		jnose.setFont(f);
		jlips.setFont(f);
		jshape.setFont(f);

		b.setBackground(Color.BLACK);
		//b.setBackground(new Color(247,147,152));

		b.setForeground(Color.white);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.white);	

		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		b.setBounds(1000,45,120,35);

		l1.setBounds(23,120,130,20);
		jc.setBounds(230,120,200,45);
		jc.setBackground(Color.white);

		l2.setBounds(23,210,130,20);
		jnose.setBounds(230,210,200,46);
		jnose.setBackground(Color.white);

		l4.setBounds(23,300,130,20);
		jlips.setBounds(230,300,200,38);
		jlips.setBackground(Color.white);

		l3.setBounds(23,390,180,20);
		jshape.setBounds(230,390,200,230);
		jshape.setBackground(Color.white);
		
		l_title.setBounds(100,2,800,120);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l_title.setFont(new Font("Sanserif",Font.BOLD,40));
		l_title.setForeground(Color.black);

		l5.setBounds(50,10,140,20);
		l5.setFont(f);
		l5.setForeground(new Color(28,147,64));
		
		add(l);
		l.setBounds(0,0,1173,662);
		setSize(1190,700);
		p.setBounds(630,120,430,430);
		p.setBorder(lb1);
		p.setLayout(null);
		p.setBackground(Color.white);

		/*************** Item Listener ******************/
		
		jshape.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				index=jshape.getSelectedIndex();
				System.out.println("\nIndex : "+index);
				s_shape = ""+jshape.getSelectedItem();
				shape = new JLabel(new ImageIcon(s_shape));
				p.add(shape);
							
				shape.setBounds(120,50,200,270);
				ps.play(); 
			}
		});
		
		jc.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				index=jc.getSelectedIndex();
				System.out.println("\nIndex : "+index);
				s_eye = ""+jc.getSelectedItem();
				eye = new JLabel(new ImageIcon(s_eye));
				p.add(eye);
							
				eye.setBounds(120,50,200,270);
				pe.play();
			}
		});

		
		jnose.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				index=jnose.getSelectedIndex();
				System.out.println("\nIndex : "+index);
				s_nose = ""+jnose.getSelectedItem();
				nose = new JLabel(new ImageIcon(s_nose));
				p.add(nose);
							
				nose.setBounds(118,80,200,270);
				pn.play();
			}
		});
		
		jlips.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				index=jnose.getSelectedIndex();
				System.out.println("\nIndex : "+index);
				s_lips = ""+jlips.getSelectedItem();
				lips = new JLabel(new ImageIcon(s_lips));
				p.add(lips);
							
				lips.setBounds(120,118,200,270);
				pl.play();
			}
		});


		/*************************************************/
	setLocation(
	(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
	(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2-20	
	);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{	
		Object o = ae.getSource();
		if(o==b)
		{
			new User_Authentication();
			this.dispose();
		}
		if(o==b1)
		{
	fc = new JFileChooser("D:/Project Work/Face Generation and Recognition/Project_Coding/Saved_Images");
			int i = fc.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION)
			{
				f1 = fc.getSelectedFile();	
				fpath = f1.getPath();
			}
			System.out.println("File : "+f1.getName());
			System.out.println("Path :"+fpath);
			new image_open(f1.getName());
			
		}
		if(o==b2)
		{
			try 
			{
           		Thread.sleep(120);
            		Robot r = new Robot();
  		
File folder = new File("D:/Project Work/Face Generation and Recognition/Project_Coding/Saved_Images");	
			String list[] = folder.list();
			String name = list[list.length-1];
			System.out.println("Old Name : "+name);	
			int t = Integer.parseInt(""+name.charAt(4));
			t++;
			String n_name = name.substring(0,4)+t;
			System.out.println("New Name :"+n_name);		

		
String path="D:/Project Work/Face Generation and Recognition/Project_Coding/Saved_Images/"+n_name+".jpg";	
      
			Rectangle capture=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
           	 	BufferedImage Image = r.createScreenCapture(capture);
            		ImageIO.write(Image, "jpg", new File(path));
            		System.out.println("Screenshot saved.");
JOptionPane.showMessageDialog(this,"Image Saved.","Ok Done",JOptionPane.INFORMATION_MESSAGE);
			new home_page();
			this.dispose();



        		}
        		catch (AWTException | IOException | InterruptedException ex) 
			{
            			System.out.println(ex);
        		}
		}
		if(o==b3)
		{
			new home_page();
			this.dispose();
		}


	}
	
	public static void main(String args[])
	{
		new home_page();		
	}
}