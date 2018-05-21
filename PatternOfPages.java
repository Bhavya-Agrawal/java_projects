import java.awt.*;
import java.awt.event.*;
class PatternOfPages implements ActionListener
{
	Frame f=new Frame();	Button b1,b2;	TextField tf1,tf2,tf3,tf4,tf14,tf15,tf16,tf24,tf25,tf26,tf34,tf35,tf36,tf44,tf45,tf46;
	Label l1,l14,l15,l16,l2,l24,l25,l26,l3,l34,l35,l36,l4,l44,l45,l46;		Panel p1,p2,p3,p4,p5,p6;
	CardLayout cl;
	public void actionPerformed(ActionEvent e)
	{
	
	if(e.getSource()==b1)
	{cl.previous(p2);}
	if(e.getSource()==b2)
	{cl.next(p2);}

	}

public PatternOfPages()
{
	
	
	f.setSize(400,400);
	
	p1=new Panel();
	
	p1.setLayout(new GridLayout(2,5));	//for last part of the layout
	 b1=new Button("Back");	 b2=new Button("Next");
	p1.add(new Label());		p1.add(b1);		p1.add(new Label());		p1.add(b2);
	
	b1.addActionListener(this);		b2.addActionListener(this);
	p1.add(new Label());		p1.add(new Label());		p1.add(new Label());		p1.add(new Label());		p1.add(new Label());
	p1.add(new Label());
	f.add(p1,"South");
	 p2=new Panel();	
	f.add(p2,"Center");
	
	 cl=new CardLayout();
	p2.setLayout(cl);

	 p3=new Panel();
	p3.setLayout(new GridBagLayout());
	Font fn=new Font("Arial",Font.BOLD,12);
	 l1=new Label("Name");
	l1.setFont(fn);
	GridBagConstraints gbc=new GridBagConstraints();
	gbc.gridx=0;		gbc.gridy=0;
	gbc.weightx=1.0;		gbc.weighty=1.0;
	p3.add(l1,gbc);	
		
	 tf1=new TextField(18);
	gbc.gridx=1;
	p3.add(tf1,gbc);

	 l2=new Label("Surname");
	l2.setFont(fn);
	gbc.gridx=0;		gbc.gridy=1;
	p3.add(l2,gbc);

	 tf2=new TextField(18);
	gbc.gridx=1;
	p3.add(tf2,gbc);

	 l3=new Label("Age");
	l3.setFont(fn);
	gbc.gridx=0;		gbc.gridy=2;
	p3.add(l3,gbc);

	tf3=new TextField(18);
	gbc.gridx=1;
	p3.add(tf3,gbc);

	 l4=new Label("Qualification");
	l4.setFont(fn);
	gbc.gridx=0;		gbc.gridy=3;
	p3.add(l4,gbc);

	 tf4=new TextField(18);
	gbc.gridx=1;
	p3.add(tf4,gbc);

	p2.add(p3);



//panel p4
	 p4=new Panel();
	p4.setLayout(new GridBagLayout());
	l14=new Label("H.No");		l14.setFont(fn);
	gbc.gridx=0;		gbc.gridy=0;	
	p4.add(l14,gbc);			
	gbc.gridx=1;
	 tf14=new TextField(18);
	p4.add(tf14,gbc);
	 l24=new Label("Colony");		l24.setFont(fn);
	gbc.gridx=0;		gbc.gridy=1;
	p4.add(l24,gbc);	
	gbc.gridx=1;
	 tf24=new TextField(18);
	p4.add(tf24,gbc);
	 l34=new Label("City");		l34.setFont(fn);
	gbc.gridx=0;		gbc.gridy=2;
	p4.add(l34,gbc);
	gbc.gridx=1;		tf34=new TextField(18);
	p4.add(tf34,gbc);
	l44=new Label("State");		l44.setFont(fn);
	gbc.gridx=0;		gbc.gridy=3;
	p4.add(l44,gbc);
	gbc.gridx=1;		 tf44=new TextField(18);
	p4.add(tf44,gbc);
	p2.add(p4);

	
// Panel 5
	p5=new Panel();
	p5.setLayout(new GridBagLayout());	
	l15=new Label("Phone");		l15.setFont(fn);
	gbc.gridx=0;		gbc.gridy=0;
	p5.add(l15,gbc);	
	gbc.gridx=1;		 tf15=new TextField(18);
	p5.add(tf15,gbc);
	 l25=new Label("Mobile");		l25.setFont(fn);
	gbc.gridx=0;		gbc.gridy=1;
	p5.add(l25,gbc);
	gbc.gridx=1;		 tf25=new TextField(18);
	p5.add(tf25,gbc);
	 l35=new Label("Email");		l35.setFont(fn);
	gbc.gridx=0;		gbc.gridy=2;
	p5.add(l35,gbc);
	gbc.gridx=1;		 tf35=new TextField(18);
	p5.add(tf35,gbc);
	 l45=new Label("Fax");		l45.setFont(fn);
	gbc.gridx=0;		gbc.gridy=3;
	p5.add(l45,gbc);
	gbc.gridx=1;		 tf45=new TextField(18);
	p5.add(tf45,gbc);
	p2.add(p5);
	
//panel 6
	p6=new Panel();
	p6.setLayout(new GridBagLayout());
	 l16=new Label("Salary");		l16.setFont(fn);
	gbc.gridx=0;		gbc.gridy=0;
	p6.add(l16,gbc);	
	gbc.gridx=1;		 tf16=new TextField(18);
	p6.add(tf16,gbc);
	 l26=new Label("HRA");		l26.setFont(fn);
	gbc.gridx=0;		gbc.gridy=1;
	p6.add(l26,gbc);
	gbc.gridx=1;		 tf26=new TextField(18);
	p6.add(tf26,gbc);
	 l36=new Label("TA");		l36.setFont(fn);
	gbc.gridx=0;		gbc.gridy=2;
	p6.add(l36,gbc);
	gbc.gridx=1;		tf36=new TextField(18);
	p6.add(tf36,gbc);
	 l46=new Label("DA");		l46.setFont(fn);
	gbc.gridx=0;		gbc.gridy=3;
	p6.add(l46,gbc);

	gbc.gridx=1;		tf46=new TextField(18);
	p6.add(tf46,gbc);

	p2.add(p6);
	f.setVisible(true);
	
	
		}

public static void main(String b[])
		{
PatternOfPages p=new PatternOfPages();
		}
}