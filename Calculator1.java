import java.awt.*;
import java.awt.event.*;

class Calculator1 extends WindowAdapter implements ActionListener
{	Frame f;	 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;  	TextField tf;
	boolean f_press=true;	
	String s1;		int p=0,gett1=1,sign=0;				
	
		double total=0;
public void actionPerformed(ActionEvent e)
{
	String str=e.getActionCommand();
	if(str.equals("1"))
		{
	String s1=tf.getText();		tf.setText(s1+1);
		}
	if(str.equals("2"))
		{
	String s1=tf.getText();		tf.setText(s1+2);
		}
	if(str.equals("3"))
		{
	String s1=tf.getText();		tf.setText(s1+3);
		}
	if(str.equals("4"))
		{
	String s1=tf.getText();		tf.setText(s1+4);
		}
	if(str.equals("5"))
		{
	String s1=tf.getText();		tf.setText(s1+5);
		}
	if(str.equals("6"))
		{
	String s1=tf.getText();		tf.setText(s1+6);
		}
	if(str.equals("7"))
		{
	String s1=tf.getText();		tf.setText(s1+7);
		}
	if(str.equals("8"))
		{
	String s1=tf.getText();		tf.setText(s1+8);
		}
	if(str.equals("9"))
		{
	String s1=tf.getText();		tf.setText(s1+9);
		}
	if(str.equals("0"))
		{
	String s1=tf.getText();		tf.setText(s1+0);
		}

	if(str.equals("+"))
	{			
	String s=tf.getText();
	if(s.equals("")){total=total;}
	else if(!s.equals("")){
	tf.setText("");	double d=Double.parseDouble(s);
		if(f_press==true)
	{
	total=d;		f_press=false;}
	//tf.setText(total+"");
	else if(f_press==false)
	{
		if(sign==1){total=total+d;	}	//sign 1 is for +
		if(sign==2){total=total-d;	}	//sign 2 is for -	
		if(sign==3){total=total*d;	}	//sign 3 is for *
		if(sign==4){total=total/d;	}	//sign 4 is for /
		if(sign==5){total=total;	}	//sign 5 is for ==
	}
	}
	sign=1;
	}
	if(str.equals("-"))
	{	
	String s=	tf.getText();	
	if(s.equals("")){total=total;}
	else if(!s.equals("")){
	tf.setText("");	double d=Double.parseDouble(s);
	if(f_press==true)
	{	total=d;		f_press=false;
				
	}
	else if(f_press==false){
	if(sign==1){total=total+d;	}
	if(sign==2){total=total-d;	}
	if(sign==3){total=total*d;	}
	if(sign==4){total=total/d;	}
	if(sign==5){total=total;	}
	}
	}
	sign=2;
	}
	if(str.equals("*"))
	{	
	String s=	tf.getText();	
	if(s.equals("")){total=total;}
	else if(!s.equals("")){
	tf.setText("");	double d=Double.parseDouble(s);
	if(f_press==true)
	{	total=d;		f_press=false;
	//tf.setText(total+"");
	}
	else if(f_press==false)
		{
	if(sign==1){total=total+d;	}
	if(sign==2){total=total-d;	}
	if(sign==3){total=total*d;	}
	if(sign==4){total=total/d;	}
	if(sign==5){total=total;	}
		}
	}
	sign=3;
	}
	if(str.equals("/"))
	{	
	String s=tf.getText();	
	if(s.equals("")){total=total;}
	else if(!s.equals("")){
	tf.setText("");	double d=Double.parseDouble(s);
	if(f_press==true){
	total=d;		f_press=false;
	//tf.setText(total+"");
	}
	else if(f_press==false)
		{
	if(sign==1){total=total+d;	}
	if(sign==2){total=total-d;	}
	if(sign==3){total=total*d;	}
	if(sign==4){total=total/d;	}
	if(sign==5){total=total;	}
		}
	}
	sign=4;
	}
	if(str.equals("C"))
	{
	tf.setText("");	total=0;		f_press=true;
	}
	if(str.equals("="))
		{
	String s=tf.getText();	
	if(!s.equals("")){	double d=Double.parseDouble(s);
	if(f_press==true)
	{	total=d;		f_press=false;	tf.setText(d+"");
				
	}
	else if(f_press==false){
		if(sign==1){total=total+d;	tf.setText(total+"");}
		if(sign==2){total=total-d;	tf.setText(total+"");}
		if(sign==3){total=total*d;	tf.setText(total+"");}
		if(sign==4){total=total/d;	tf.setText(total+"");}
	
			}
	}
	sign=5;
}	
}

public Calculator1()
{
	
	GridLayout gl1=new GridLayout(5,1);
	 tf=new TextField();
	 f=new Frame();
	f.setSize(400,400);
	f.setLayout(gl1);
	Panel p1=new Panel();  	Panel p2=new Panel();	Panel p3=new Panel();	Panel p4=new Panel();
	
	f.add(tf);							
	GridLayout gl2=new GridLayout(1,4);
	p1.setLayout(gl2); 		p2.setLayout(gl2);		p3.setLayout(gl2);		p4.setLayout(gl2);		
	
	 b1=new Button("1");	b1.addActionListener(this);	b2=new Button("2");
	b2.addActionListener(this);		 b3=new Button("3");	b3.addActionListener(this);
	 b4=new Button("+");	b4.addActionListener(this);	 b5=new Button("4");	b5.addActionListener(this);
	 b6=new Button("5");	b6.addActionListener(this);	 b7=new Button("6");	b7.addActionListener(this);
		 b8=new Button("-");		b8.addActionListener(this);			 b9=new Button("7");
	b9.addActionListener(this);	b10=new Button("8");	b10.addActionListener(this);
		 b11=new Button("9");	b11.addActionListener(this);		 b12=new Button("*");	b12.addActionListener(this);
	 b13=new Button("C");	b13.addActionListener(this);	 b14=new Button("0");	b14.addActionListener(this);
	 b15=new Button("/");	b15.addActionListener(this);
	b16=new Button("=");	b16.addActionListener(this);		f.addWindowListener(this);
	
	p1.add(b1);	p1.add(b2);	p1.add(b3);	p1.add(b4);
	p2.add(b5);	p2.add(b6);	p2.add(b7);	p2.add(b8);
	p3.add(b9);	p3.add(b10);	p3.add(b11);	p3.add(b12);
	p4.add(b13);	p4.add(b14);	p4.add(b15);	p4.add(b16);

	f.add(p1);		f.add(p2);		f.add(p3);		f.add(p4);	

	f.setVisible(true);
}		

	public void windowClosing(WindowEvent e)
		{
	Window w=e.getWindow();
	w.setVisible(false);		w.dispose();	System.exit(1);

		}
	public static void main(String b[])
	{	

		Calculator1 c=new Calculator1();
	}
}


		