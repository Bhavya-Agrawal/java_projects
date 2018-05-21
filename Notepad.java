import java.io.*;
import java.util.regex.*;
import java.awt.*;
import java.awt.event.*;
class Notepad extends WindowAdapter implements ActionListener,MouseListener
{	
	Frame f;		TextArea ta;	MenuBar mb;	Menu m1,m2;	
	int i,j,x,position,position1,position2,counter,count1,count2,count3,count4,count5,count6,count7;	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;	TextField tf,tf1,tf2; 	Panel p,p1,p2,p3,p4,p5;		
	Label l,l1,l2;	Dialog di,di1,di2,di3;		String name,path,pathname,match="",result;				
	MenuItem nw,open,save,saveas,exit,find,fareplace;	
	

	public Notepad()
		{
	f=new Frame();		f.setSize(400,400);		f.addWindowListener(this);		f.setTitle("Untitled");
	f.addMouseListener(this);		
	
	ta=new TextArea();
	mb=new MenuBar();
	m1=new Menu("File");	m2=new Menu("Edit");
	nw=new MenuItem("New");		open=new MenuItem("Open");		save=new MenuItem("Save");
	saveas=new MenuItem("SaveAs");		exit=new MenuItem("Exit");	
	find=new MenuItem("Find");			fareplace=new MenuItem("FindAndReplace");	

	nw.addActionListener(this);		open.addActionListener(this);
	save.addActionListener(this);		saveas.addActionListener(this);
	exit.addActionListener(this);		find.addActionListener(this);
	fareplace.addActionListener(this);	
	
		
	m1.add(nw);	m1.add(open);	m1.add(save);	m1.add(saveas);	m1.addSeparator();		m1.add(exit);
	m2.add(find);	m2.add(fareplace);

	mb.add(m1);	mb.add(m2);	f.add(ta);

	f.setMenuBar(mb);			f.setVisible(true);		
	

	di=new Dialog(f,"Find");	di.setSize(300,150);				
	
	tf=new TextField(12);		b1=new Button("FindNext");		b2=new Button("Close");
	b1.addActionListener(this);		b2.addActionListener(this);		tf.addActionListener(this);
	di.setLayout(new BorderLayout());	p=new Panel();
	p.setLayout(new BorderLayout());	p.add(new Label("Findwhat"),"West");		p.add(tf,"Center");		di.add(p,"North");
	p1=new Panel();			p1.add(b1);	p1.add(b2);
	di.add(p1,"South");		di.addWindowListener(new DialogWindowClosing());		


	di1=new Dialog(f,"FindAndReplace");	di1.setSize(400,200);			di1.addWindowListener(new DialogWindowClosing());
	 l1=new Label("Find");			 tf1=new TextField(12);
	 l2=new Label("ReplaceWith");			 tf2=new TextField(12);
	 b3=new Button("FindNext");			 b4=new Button("Replace");
	 b5=new Button("ReplaceAll");			 b6=new Button("Close");
	b8=new Button("Save");	b9=new Button("Dont Save");			b10=new Button("Cancel");
	 p2=new Panel();		p2.setLayout(new BorderLayout());		p2.add(l1,"North");		p2.add(tf1,"South");
	 p3=new Panel();		p3.setLayout(new BorderLayout());		p3.add(l2,"North");		p3.add(tf2,"South");
	 p4=new Panel();		p4.add(b3);	p4.add(b4);	p4.add(b5);	p4.add(b6);
	di1.setLayout(new GridLayout(3,1));	di1.add(p2);	di1.add(p3);	di1.add(p4);
	b3.addActionListener(this);		b4.addActionListener(this);		b5.addActionListener(this);	b6.addActionListener(this);
	b8.addActionListener(this);		b9.addActionListener(this);		b10.addActionListener(this);
	tf1.addActionListener(this);		tf2.addActionListener(this);		
	di2=new Dialog(f,"Alert");		di2.setSize(200,150);		di2.setLayout(new BorderLayout());
	di2.addWindowListener(new DialogWindowClosing());
	di2.add(new Label("Entered text not found"),"North");	b7=new Button("Ok");	b7.addActionListener(this);
	di2.add(b7,"South");		
	di3=new Dialog(f,"Notepad");		di3.setSize(400,200);		di3.setLayout(new BorderLayout());
	di3.add(new Label("Do you want to save changes to "+f.getTitle()),"Center");
	 p5=new Panel();		p5.setLayout(new FlowLayout());
	p5.add(new Label());		p5.add(b8);	p5.add(new Label());		p5.add(b9);	p5.add(new Label());
	p5.add(b10);		di3.add(p5,"South");		di3.addWindowListener(new DialogWindowClosing());

		} 

		public void mouseClicked(MouseEvent e2)
		{
			x=e2.getX();
			position=x;
		}


		public void actionPerformed(ActionEvent e) 
			{
	String str=e.getActionCommand();
	
			if(str.equals("New"))
			{
		count4=1;			
		 if(ta.getText().equals(match))
		{ta.setText("");		f.setTitle("Untitled");}

		else if(!ta.getText().equals(match))
			{
			di3.setVisible(true);	
			}
		
		/*else if(ta.getText().equals("")&&count1==1){di3.setVisible(true);}*/
		if(f.getTitle().equals("Untitled")&&(count5==1|count7==1)){ta.setText("");	match=ta.getText();}		
		match=ta.getText();				i=0;	
			}	
			
			if(e.getSource()==b8)
			{
		count7=1;		
			if(count1==1&(count5==1|count6==1)){count5=0;		count6=0;}
			if(f.getTitle().equals(pathname))
				{
		di3.setVisible(false);		di3.dispose();
		try{
			
		File fl=new File(path,name);
		FileOutputStream fos=new FileOutputStream(fl);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s=ta.getText();		char ch[]=s.toCharArray();
			for(j=0;j<ch.length;j++)
				{
			bos.write(ch[j]);
				}
		bos.close();	
			
			}
		catch(IOException e5){System.out.println(e5.getMessage());}				
		
				}
			else if(!f.getTitle().equals(pathname))
				{
				try{
		di3.setVisible(false);		di3.dispose();
		FileDialog fd=new FileDialog(f,"SAVE",FileDialog.SAVE);		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		
		File fl=new File(path,name);	
		 pathname=fl.getName();
		f.setTitle(pathname);
		if(path.equals("")||name.equals("")){pathname=pathname;}		
		FileOutputStream fos=new FileOutputStream(fl);
		BufferedOutputStream bos=new BufferedOutputStream(fos);		
		String s=ta.getText();		char ch[]=s.toCharArray();
			for(j=0;j<ch.length;j++)
				{
			bos.write(ch[j]);
				}
		bos.close();
				
		}
		catch(IOException e4){System.out.println(e4.getMessage());}
		
		}
		match=ta.getText();		i=1;		
		if(count2==1|count3==1){System.exit(1);}
		 else if(count4==1){f.setTitle("Untitled");		ta.setText("");	count4=0;		i=0;}
		
		
			}
			
			if(e.getSource()==b9)
			{
		di3.setVisible(false);		di3.dispose();		//ta.setText("");	f.setTitle("Untitled");
		if(count2==1|count3==1){count2=0;	count3=0;		System.exit(1);}
		else if(count4==1){count4=0;		ta.setText("");		f.setTitle("Untitled");		}
		 else if(count1==1)	
			{
		try{
		FileDialog fd=new FileDialog(f,"SELECT",FileDialog.LOAD);
		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();		
		
		File fl=new File(path,name);		 pathname=fl.getName();
		if(path.equals("")||name.equals("")){pathname=pathname;}
		if(fl.exists()){i=1;}
		f.setTitle(pathname);
		FileInputStream fis=new FileInputStream(fl);		
		BufferedInputStream bis=new BufferedInputStream(fis);
		int ch;		String s=ta.getText();		s="";	ta.setText(s);
		while((ch=bis.read())!=-1)
		{
		ta.append((char)ch+"");
		}
		bis.close();
		}
		catch(IOException e3)
		{
		System.out.println(e3.getMessage());
		
		}
		
			}
		else
		{ta.setText("");	f.setTitle("Untitled");}	
				count5=1;					
		match=ta.getText();
			}		

			if(e.getSource()==b10)
			{
			match=ta.getText();
			di3.setVisible(false);		di3.dispose();			
		if(count2==1|count3==1){System.exit(1);}
		else if(count4==1){	ta.setText(match);			count4=0;		}
		else if(count1==1)

				{
		try{
		FileDialog fd=new FileDialog(f,"SELECT",FileDialog.LOAD);
		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();		
		
		File fl=new File(path,name);		 pathname=fl.getName();
		if(path.equals("")||name.equals("")){pathname=pathname;}		
		if(fl.exists()){i=1;}
		f.setTitle(pathname);
		FileInputStream fis=new FileInputStream(fl);		
		BufferedInputStream bis=new BufferedInputStream(fis);
		int ch;		String s=ta.getText();		s="";	ta.setText(s);
		while((ch=bis.read())!=-1)
		{
		ta.append((char)ch+"");
		}
		bis.close();
		}
		catch(IOException e3)
		{
		System.out.println(e3.getMessage());
		
		}
		}	
			match=ta.getText();		count6=1;	
			//match="-1";					
			}		

			if(str.equals("Open"))
			{
		if(count5==1){di3.setVisible(true);	}
		//if(count5==1){match=ta.getText();		count5=0;}
		else if(count6==1){	count6=0;		di3.setVisible(true);
				}
		if(ta.getText().equals(match)&&count5!=1){
		
		try{
		FileDialog fd=new FileDialog(f,"SELECT",FileDialog.LOAD);
		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();		
		
		File fl=new File(path,name);		 pathname=fl.getName();
		if(path.equals("")||name.equals("")){pathname=pathname;}		
		if(fl.exists()){i=1;}
		f.setTitle(pathname);
		FileInputStream fis=new FileInputStream(fl);		
		BufferedInputStream bis=new BufferedInputStream(fis);
		int ch;		String s=ta.getText();		s="";	ta.setText(s);
		while((ch=bis.read())!=-1)
		{
		ta.append((char)ch+"");
		}
		bis.close();
		}
		catch(IOException e3)
		{
		System.out.println(e3.getMessage());
		
		}match=ta.getText();	
		}	
		else  if(!ta.getText().equals(match)){			di3.setVisible(true);	}
			count1=1;		i=1;		match=ta.getText();
		
		
		}
	
			if(str.equals("Save"))
			{
		//match=ta.getText();		
		if(i==0){
		if(!f.getTitle().equals(pathname))
			{
		try{
		
		FileDialog fd=new FileDialog(f,"SAVE",FileDialog.SAVE);		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		File fl=new File(path,name);		 pathname=fl.getName();
		f.setTitle(pathname);
		if(path.equals("")||name.equals("")){pathname=pathname;}		
		FileOutputStream fos=new FileOutputStream(fl);
		BufferedOutputStream bos=new BufferedOutputStream(fos);		
		String s=ta.getText();		char ch[]=s.toCharArray();
			for(j=0;j<ch.length;j++)
				{
			bos.write(ch[j]);
				}
		bos.close();
		
		}
		catch(IOException e4){System.out.println(e4.getMessage());}
		i=1;	}	
		}

		 else if(i==1){
						
			try{
			File fl=new File(path,name);		 pathname=fl.getName();
		f.setTitle(pathname);
		FileOutputStream fos=new FileOutputStream(fl);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s=ta.getText();		char ch[]=s.toCharArray();
			for(j=0;j<ch.length;j++)
				{
			bos.write(ch[j]);
				}
		bos.close();	
			
			}
		catch(IOException e5){System.out.println(e5.getMessage());}
			
		}
		match=ta.getText();		
		}


			if(str.equals("SaveAs"))
			{
		//match=ta.getText();	
		try{
		
		FileDialog fd=new FileDialog(f,"SaveAs",FileDialog.SAVE);		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		File fl=new File(path,name);		pathname=fl.getName();	f.setTitle(pathname);
		if(path.equals("")||name.equals("")){pathname=pathname;}
		FileOutputStream fos=new FileOutputStream(fl);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s=ta.getText();		char ch[]=s.toCharArray();
			for(j=0;j<ch.length;j++)
				{
			bos.write(ch[j]);
				}
		bos.close();
		i=1;
		}
		catch(IOException e4){System.out.println(e4.getMessage());}
		match=ta.getText();
			}
		
			if(str.equals("Find"))
			{
		di.setVisible(true);			
		
			}
		
			if(e.getSource()==b1)
			{
		f.toFront();
		
		String s=tf.getText();		
		String str1=ta.getText();	
		StringBuffer sb=new StringBuffer(s);		int j=str1.indexOf(s,position);		System.out.println(j);	
		
		
			if(position<str1.lastIndexOf(s))
				{
				ta.select(j,j+s.length());			
				}
			else 
				{
				di2.setVisible(true);
				
				}		
			for(int count=0;count<str1.length();count++)
				{
				if(str1.charAt(count)=='\n')
					{
					
					position=position+2;
					
					 System.out.println(position);
					}
				else
					{
					position=j+s.length()-1;	System.out.println(position);
					}
				}		
			if(j==-1){di2.setVisible(true);		position=str1.lastIndexOf(s)+1;}
						
			}
	
			if(str.equals("Close"))
			{
		
		di.setVisible(false);		di.dispose();	
			}


			if(str.equals("FindAndReplace"))
			{
		tf1.setText("");		tf2.setText("");
		di1.setVisible(true);
			}

			if(e.getSource()==b3)
			{
			f.toFront();		
		String s=tf1.getText();		
		String str1=ta.getText();	
		StringBuffer sb=new StringBuffer(s);		int j=str1.indexOf(s,position1);

		
			if(position1<str1.lastIndexOf(s))
				{
				ta.select(j,j+s.length());				
				}
			else 
				{
				di2.setVisible(true);
				
				}		
			//position1=j+s.length()-1;		
			
				
				for(int count=0;count<str1.length();count++)
				{
				if(str1.charAt(count)=='\n')
					{
					position1=j+s.length();
					}
				else
					{
					position1=j+s.length()-1;
					}
				}
			if(j==-1){di2.setVisible(true);		position1=str1.lastIndexOf(s)+1;}
			}

		
			if(e.getSource()==b7)
				{
			di2.setVisible(false);		di2.dispose();
				}

			if(e.getSource()==b4)
			{
		
		String s=tf1.getText();	String s1=tf2.getText();	String str1=ta.getText();
		StringBuffer sb=new StringBuffer(s);			 int j=str1.indexOf(s,position2);
		
			if(position2<str1.lastIndexOf(s))
				{
				ta.replaceText(s1,j,j+s.length());				
				}
			else 
				{
				di2.setVisible(true);
				
				}		
			for(int count=0;count<str1.length();count++)
				{
				if(str1.charAt(count)=='\n')
					{
					position2=j+s.length();
					}
				else
					{
					position2=j+s.length()-1;
					}
				}		
			if(j==-1){di2.setVisible(true);		position2=str1.lastIndexOf(s)+1;}

			}

			if(e.getSource()==b5)
			{
		String s=tf1.getText();		String str1=ta.getText();	String s1=tf2.getText();
		Pattern p=Pattern.compile(s);		Matcher m=p.matcher(str1);
		
			if(m.find())
			{
			result=m.replaceAll(s1);	
			}
			
			ta.setText(result);
			}

			if(e.getSource()==b6)
			{
		di1.setVisible(false);		di1.dispose();
		
			}

			if(str.equals("Exit"))
			{
		if(!ta.getText().equals(match)){
		di3.setVisible(true);
		count2=1;	
			}
		else{f.setVisible(false);		f.dispose();		System.exit(1);}
			}
	
			}

	public void windowClosing(WindowEvent e1)
		{
	Window w=e1.getWindow();
	if(!ta.getText().equals(match))
		{
		di3.setVisible(true);
		}
	
	else{
	w.setVisible(false);		w.dispose();	System.exit(1);
	}count3=1;	}
		
	public void mouseEntered(MouseEvent e){}	
	public void mouseReleased(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseExited(MouseEvent e){}


	public static void main(String b[])
		{
	
	Notepad n=new Notepad();
	
		}
}

		