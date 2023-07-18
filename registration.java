import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import java.io.*;
import jaco.mp3.player.*;


class registration extends JFrame implements ActionListener
{
		JButton b1,b2,b3,b4;
		JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
		JTextField t3,t4,t5,t6;
		JPasswordField p1,p2;
		ImageIcon i;
		LineBorder lb;
		Font f,f1,f2;
		MP3Player pr;

		Connection con;
		PreparedStatement ps;
		
	
		registration()
		{
		super("REGISTRATION");
		lb = new LineBorder(Color.red,5);				
		
		pr = new MP3Player(new File("registration.mp3"));
		pr.play();

		i = new ImageIcon("images/reg.png");
		l = new JLabel(i);
		l.setBorder(lb);
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		p1 = new JPasswordField();
		p2 = new JPasswordField();
		
		b1=new JButton("SUBMIT");
		b2=new JButton("BACK");

		//c=new JCheckBox("VIEW");
		//c.setForeground(Color.cyan);
		f = new Font("Constantia",Font.BOLD,20);
		f1 = new Font("Constantia",Font.BOLD,15);
		f2 = new Font("Copper Black",Font.BOLD,18);

		l1=new JLabel("NAME*");
		l1.setForeground(Color.white);

		l2=new JLabel("EMAIL*");
		l2.setForeground(Color.white);

		l3=new JLabel("PHONE NO*");
		l3.setForeground(Color.white);
		
		l4=new JLabel("Username*");
		l4.setForeground(Color.white);

		l5=new JLabel("PASSWORD*");
		l5.setForeground(Color.white);

		l6=new JLabel("CONFIRM PASSWORD*");
		l6.setForeground(Color.white);

		t3.setBackground(Color.white);
		t3.setForeground(Color.black);

		t4.setBackground(Color.white);
		t4.setForeground(Color.black);

		t5.setBackground(Color.white);
		t5.setForeground(Color.black);

		t6.setBackground(Color.white);
		t6.setForeground(Color.black);

		p1.setBackground(Color.white);
		p1.setForeground(Color.black);

		p2.setBackground(Color.white);
		p2.setForeground(Color.black);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		l5.setFont(f);
		l6.setFont(f);

		t3.setForeground(Color.yellow);
		t4.setForeground(Color.yellow);
		t5.setForeground(Color.yellow);
		t6.setForeground(Color.yellow);
		p1.setForeground(Color.yellow);
		p2.setForeground(Color.yellow);

		t3.setFont(f);
		t4.setFont(f);
		t5.setFont(f);
		t6.setFont(f);
		p1.setFont(f);
		p2.setFont(f);		
	

		b1.setFont(f2);
		b2.setFont(f2);
		//button(back/sumbit)
		b1.setBounds(620,490,350,40);
		b1.setBackground(Color.gray);
		b1.setForeground(Color.white);
		b1.setBorderPainted(true);

		b2.setBounds(620,550,350,40);
		b2.setBackground(Color.gray);
		b2.setForeground(Color.white);
		b2.setBorderPainted(true);

		l1.setBounds(623,50,350,30);
		l2.setBounds(623,120,350,30);
		l3.setBounds(623,190,350,30);
		l4.setBounds(623,260,350,30);
		l5.setBounds(623,330,350,30);
		l6.setBounds(623,400,350,30);
		
		t3.setBounds(620,80,350,40);
		t4.setBounds(620,150,350,40);
		t5.setBounds(620,220,350,40);
		t6.setBounds(620,290,350,40);
		p1.setBounds(620,360,350,40);
		p2.setBounds(620,430,350,40);

		b1.setOpaque(false);
		b2.setOpaque(false);
		
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(p1);
		add(p2);

		add(l);
		l.setBounds(0,0,i.getIconWidth(),i.getIconHeight());

		setLayout(null);

		t3.setOpaque(false);
		t4.setOpaque(false);
		t5.setOpaque(false);
		t6.setOpaque(false);
		p1.setOpaque(false);
		p2.setOpaque(false);

		setResizable(false);
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		}
		catch(Exception e)
		{
		}


		setSize(1000,700);
		setLocation(
	(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,	(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
	);
		setUndecorated(true);
		setVisible(true);
			
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object o = ae.getSource();
		if(o==b1)
		{
			String name=t3.getText();
			String email=t4.getText();
			String cno=t5.getText();
			String uname=t6.getText();
			String pass=p1.getText();
			
			try	
			{
			ps=con.prepareStatement("insert into login values (?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,cno);
			ps.setString(4,uname);			
			ps.setString(5,pass);

			int i = ps.executeUpdate();

			if(i>0)
			{		
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			p1.setText("");
			p2.setText("");
	JOptionPane.showMessageDialog(this,"User Registered","Done",JOptionPane.INFORMATION_MESSAGE);
			new User_Authentication();
			this.dispose();
			}			


			else
	JOptionPane.showMessageDialog(this,"Some issue.","Sorry",JOptionPane.ERROR_MESSAGE);			

			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		}
		if(o==b2)
		{
			new User_Authentication();
			this.dispose();
		}		
	}	

	public static void main(String args[])
	{
		new registration();		
	}
	
}
	