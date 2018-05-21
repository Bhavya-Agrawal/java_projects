import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener
{	Frame f;	 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;  	TextField tf;	
	String s1,str1,total;		int p=0,gett1=1;				Stack s=new Stack();
	int add=0,sub=0,temp=0,temp1=0,tempp1=0;
		double div=1.0,mul=1.0;
public void actionPerformed(ActionEvent e)
	{
if(e.getSource()==b1)
{	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=1;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+1);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}
}
if(e.getSource()==b2)
{
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+2);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}	
		
}
if(e.getSource()==b3)
{
	
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+3);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}		
}
if(e.getSource()==b4)
{		p=1;
		
		tf.setText("");
}
	
if(e.getSource()==b5)
{
	
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+4);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}
}
if(e.getSource()==b6)
{
	
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+5);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}
}		
if(e.getSource()==b7)
{
	
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+6);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}
}
if(e.getSource()==b8)
	{p=2;
	tf.setText("");
	
	}
if(e.getSource()==b9)
{
	
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+7);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}		
}
if(e.getSource()==b10)
{
	
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+8);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}
}
if(e.getSource()==b11)
{
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+9);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}
}
if(e.getSource()==b12)
	{p=3;
	tf.setText("");
	}
if(e.getSource()==b13)
{
		
		if(s.empty()==false){s.pop();}
		tf.setText("");
}
if(e.getSource()==b14)
{
	
	String local=tf.getText();
	
	if(local.equals(""))
	{gett1=0;}
	else
	{
	 gett1=Integer.parseInt(local);
	}
	if(s.empty()==false)
	{str1=(String)s.pop();	temp1=Integer.parseInt(str1);}
	
	tf.setText(local+0);		s1=tf.getText();	temp=Integer.parseInt(s1);	s.push(s1);	
					
	if(p==1)
	{temp1=temp1-gett1;		add=temp1+temp;		String st=add+"";		s.push(st);			}	
	if(p==2)
	{temp1=temp1+gett1;		sub=temp1-temp;		String st=sub+"";		s.push(st);		}
	if(p==3)
	{temp1=temp1/gett1;		mul=temp1*temp;		String st=mul+"";		s.push(st);		}
	if(p==4)
	{temp1=temp1*gett1;		div=temp1/temp;		String st=sub+"";		s.push(st);			}

}
	if(e.getSource()==b15)						
						
	{p=4;
	tf.setText("");
	}
if(e.getSource()==b16)
	{	
		tf.setText("");
		total=(String)s.pop();				
		tf.setText(total);
	}

}

public Calculator()
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
	b16=new Button("=");	b16.addActionListener(this);
	
	p1.add(b1);	p1.add(b2);	p1.add(b3);	p1.add(b4);
	p2.add(b5);	p2.add(b6);	p2.add(b7);	p2.add(b8);
	p3.add(b9);	p3.add(b10);	p3.add(b11);	p3.add(b12);
	p4.add(b13);	p4.add(b14);	p4.add(b15);	p4.add(b16);

	f.add(p1);		f.add(p2);		f.add(p3);		f.add(p4);	

	f.setVisible(true);
}		


	public static void main(String b[])
	{	

		Calculator c=new Calculator();
	}
}


		