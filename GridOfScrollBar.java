import java.awt.*;
import java.awt.event.*;
class GridOfScrollBar implements AdjustmentListener
{
	Frame f;	Panel p,p2;	Scrollbar sb1,sb2,sb3; 	TextField t1,t2,t3;	Label l1,l2,l3;	
public void adjustmentValueChanged(AdjustmentEvent e)
{
	int value1,value2,value3,ir=0,ig=0,ib=0;
	if(e.getSource()==sb1)
	{
	 value1=sb1.getValue();
	t1.setText(value1+"");
	 ir=Integer.parseInt(t1.getText());
	}
	if(e.getSource()==sb2)
	{
	 value2=sb2.getValue();
	t2.setText(value2+"");
	 ig=Integer.parseInt(t2.getText());	
	}
	if(e.getSource()==sb3)
	{
	 value3=sb3.getValue();
	t3.setText(value3+"");
	 ib=Integer.parseInt(t3.getText());	
	}

	Color mycolor=new Color(ir,ig,ib);
	f.setBackground(mycolor);
}

public GridOfScrollBar()
{
	
	 f=new Frame();
	f.setSize(400,400);
	sb1=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	sb1.setBackground(Color.red);
	sb1.setForeground(Color.gray);
	sb1.addAdjustmentListener(this);

	sb2=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	sb2.setBackground(Color.green);
	sb2.setForeground(Color.gray);
	sb2.addAdjustmentListener(this);

	sb3=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
	sb3.setBackground(Color.blue);
	sb3.setForeground(Color.gray);
	sb3.addAdjustmentListener(this);
	 p=new Panel();
	GridLayout gd=new GridLayout(1,3);
	p.setLayout(gd);
	p.add(sb1);	p.add(sb2);	p.add(sb3);
	f.add(p,"East");

	 p2=new Panel();		p2.setLayout(new GridLayout(2,8));
	l1=new Label("Red");	l2=new Label("Green");	l3=new Label("Blue");
	t1=new TextField(10);	t2=new TextField(10);	t3=new TextField(10);
	p2.add(l1);	p2.add(t1);	p2.add(new Label());		p2.add(l2);	p2.add(t2);	
	p2.add(new Label());		p2.add(l3);	p2.add(t3);	p2.add(new Label());		p2.add(new Label());	
	p2.add(new Label());		p2.add(new Label());		p2.add(new Label());		p2.add(new Label());		
	p2.add(new Label());		p2.add(new Label());	
	f.add(p2,"South");

	
	
	f.setVisible(true);

		
}
	
	public static void main(String b[])
	{
	GridOfScrollBar g=new GridOfScrollBar();
	
	}
}