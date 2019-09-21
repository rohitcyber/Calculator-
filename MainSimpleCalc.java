import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SimpleCalc extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t3,t2;
	JButton b1,b2,b3,b4,b5,b6;
	
	SimpleCalc(String s)
	{
		super(s);
		setLayout(null);
		
		l1=new JLabel("First No:");
		l1.setFont(new Font("cooper",Font.BOLD,20));
		l1.setBounds(150,250,100,40);
		add(l1);
		
		l2=new JLabel("Second No:");
		l2.setFont(new Font("cooper",Font.BOLD,20));
		l2.setBounds(150,310,120,40);
		add(l2);
		
		l3=new JLabel("Result:");
		l3.setFont(new Font("cooper",Font.BOLD,20));
		l3.setBounds(150,370,100,40);
		add(l3);
		
		t1=new JTextField();
		t1.setFont(new Font("cooper",Font.BOLD,20));
		t1.setBounds(300,250,200,50);
		add(t1);
		
		t2=new JTextField();
		t2.setFont(new Font("cooper",Font.BOLD,20));
		t2.setBounds(300,310,200,50);
		add(t2);
		
		t3=new JTextField();
		t3.setFont(new Font("cooper",Font.BOLD,20));
		t3.setBounds(300,370,200,50);
		add(t3);
		
		b1=new JButton("ADD");
		b1.setFont(new Font("cooper",Font.BOLD,20));
		b1.setToolTipText("Click to add");
		b1.setBounds(100,430,100,50);
		add(b1);
		
		b2=new JButton("SUB");
		b2.setFont(new Font("cooper",Font.BOLD,20));
		b2.setBounds(210,430,100,50);
		add(b2);
		
		b3=new JButton("MUL");
		b3.setFont(new Font("cooper",Font.BOLD,20));
		b3.setBounds(320,430,100,50);
		add(b3);
		
		b4=new JButton("DIV");
		b4.setFont(new Font("cooper",Font.BOLD,20));
		b4.setBounds(430,430,100,50);
		add(b4);
		
		b5=new JButton("MOD");
		b5.setFont(new Font("cooper",Font.BOLD,20));
		b5.setBounds(540,430,100,50);
		add(b5);
		
		b6=new JButton("EXIT");
		b6.setFont(new Font("cooper",Font.BOLD,20));
		b6.setBounds(650,430,100,50);
		add(b6);
		
		l4=new JLabel("CALCULATOR");
		l4.setFont(new Font("Forte",Font.BOLD,50));
		l4.setForeground(Color.red);
		l4.setBounds(250,100,350,100);
		add(l4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c;
		try
		{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		}
		catch(Exception e)
		{
			a=5;
			b=10;
		}
		if(ae.getSource()==b6)
		{
			System.exit(0);
		}
		else if(ae.getSource()==b1)
		{
			c=a+b;
			t3.setText(String.valueOf(c));
			
		}
		else if(ae.getSource()==b2)
		{
			c=a-b;
			t3.setText(String.valueOf(c));
		}
		else if(ae.getSource()==b3)
		{
			c=a*b;
			t3.setText(String.valueOf(c));
		}
		else if(ae.getSource()==b4)
		{
			c=a/b;
			t3.setText(String.valueOf(c));
		}
		else if(ae.getSource()==b5)
		{
			c=a%b;
			t3.setText(String.valueOf(c));
		}

		
	}
}
class MainSimpleCalc
{
	public static void main(String args[])
	{
		SimpleCalc frm=new SimpleCalc("My Swing Frame");
		frm.setSize(900,900);
		frm.show();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}