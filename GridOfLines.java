import java.awt.*;
import java.awt.event.*;
class GridOfLines extends Frame implements MouseMotionListener,WindowListener
{
Frame f;	Dimension d;				
		public GridOfLines()
	{
	f=new Frame();
	f.setSize(400,400);		
	f.addMouseMotionListener(this);	f.addWindowListener(this);
	
		f.setVisible(true);
	}
		public void mouseMoved(MouseEvent e)
	{
	int x,y,x1,y1;
	x=e.getX();		 y=e.getY();		
	d=f.getSize();
	x1=d.width;		y1=d.height;
	
	
	Graphics g=f.getGraphics();
	g.setColor(Color.red);
	g.drawLine(0,0,x,y);
	g.setColor(Color.green);
	g.drawLine(x1,0,x,y);
	g.setColor(Color.blue);
	g.drawLine(0,y1,x,y);
	g.setColor(Color.yellow);
	g.drawLine(x1,y1,x,y);
	
	}
		public void mouseDragged(MouseEvent e2)
	{}
		public void windowClosing(WindowEvent e3)
	{
	Window w=e3.getWindow();		w.setVisible(false);		w.dispose();		System.exit(1);
	
	}
		public void windowActivated(WindowEvent e4){}
		public void windowDeactivated(WindowEvent e5){}
		public void windowClosed(WindowEvent e6){}
		public void windowIconified(WindowEvent e7){}
		public void windowDeiconified(WindowEvent e8){}
		public void windowOpened(WindowEvent e9){}
	
	public static void main(String b[])
	{
	GridOfLines s=new GridOfLines();
	
	}
}