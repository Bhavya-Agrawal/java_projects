import java.awt.*;
import java.awt.event.*;
class DialogWindowClosing extends WindowAdapter
		{
	
	public void windowClosing(WindowEvent e)
		{
	Window w1=e.getWindow();	
	w1.setVisible(false);		w1.dispose();
		}
	
	
		}	