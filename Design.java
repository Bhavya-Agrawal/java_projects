import java.awt.*;
import java.awt.event.*;
class Design extends Frame implements MouseMotionListener,WindowListener
{
	Frame f;		
	int b1;		
	int x1,x2,y1,y2;			
	public Design()
	{
		f=new Frame();
		f.setSize(400,400);		f.addMouseMotionListener(this);	f.addWindowListener(this);
	
		f.setVisible(true);
	}
	public void mouseDragged(MouseEvent e)
	{
	
		Graphics g=f.getGraphics();		//as we are getting graphics from the frame
	
		 x1=e.getX();		  y1=e.getY();		
	
			
		if(b1==0)
			{
				x2=x1-1;		y2=y1-1;
				b1=1;				
		}
		g.drawLine(x1,y1,x2,y2);
		x2 = x1;
		y2 = y1;
	
	}
	public void mouseMoved(MouseEvent e2)
	{
			b1=0;
	}
	
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
		Design s=new Design();
	
	}
}