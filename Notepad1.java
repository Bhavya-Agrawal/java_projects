import java.io.*;
import java.util.regex.*;
import java.awt.*;
import java.awt.event.*;
class Notepad1 extends WindowAdapter implements ActionListener
{	
	Frame f;		TextArea ta;	MenuBar mb;	Menu m1,m2;		StringBuffer sb;	
	int i,j,x,position,position1,position2,counter,count1,count2,count3,count4,count5,count6,count7,count8,count9;	
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;	TextField tf,tf1,tf2; 	Panel p,p1,p2,p3,p4,p5;		
	Label l,l1,l2;	Dialog di,di1,di2,di3;		String name,path,pathname,match="",result,path1,name1,s,str1,s2,value;				
	MenuItem nw,open,save,saveas,exit,find,fareplace;	
	

	public Notepad1()
		{
	f=new Frame();		f.setSize(400,400);		f.addWindowListener(this);		f.setTitle("Untitled");
			
	
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
	b8=new Button("save");	b9=new Button("Dont Save");			b10=new Button("Cancel");
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


		public void actionPerformed(ActionEvent e) 
			{
		

	String str=e.getActionCommand();
	
			if(str.equals("New"))
			{
		count1=1;			count6=0;		
		 if(ta.getText().equals(match))
		{ta.setText("");		f.setTitle("Untitled");}

		else if(!ta.getText().equals(match))
			{
			di3.setVisible(true);	
			}
		
				
		match=ta.getText();				
			}	
			
			if(e.getSource()==b8)
			{
			
		if(count1==1)
			{		value=f.getTitle();		f.setTitle("Untitled");
		if(!value.equals(pathname))
			{
		
		di3.setVisible(false);		di3.dispose();
		try{
		name1=name;		path1=path;
		FileDialog fd=new FileDialog(f,"SAVE",FileDialog.SAVE);		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		if(path==""&&name=="")
		{
			name=name1;	path1=path;
		}
		
		File fl=new File(path,name);
		 pathname=fl.getName();
		
				
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
		catch(NullPointerException n){count8=1;}		
		
				
		count1=0;			count6=0;	
		if(count8==1){match="-1";		}
		else{ta.setText("");		match="";		count8=0;}		
		}
					
		
		 else if(value.equals(pathname))
		{
		
						
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
		catch(NullPointerException n){count8=1;}
		
		di3.setVisible(false);		di3.dispose();
		if(count8==1){match="-1";	}
		else
		{ta.setText("");		match="";		count8=0;}
		
									
		count1=0;
		count6=0;				
		}	
				
		
	}		
					
		else if(count6==1)
			{
		if(!f.getTitle().equals(pathname))
			{
		try{
		path1=path;		name1=name;
		di3.setVisible(false);		di3.dispose();

		
		FileDialog fd=new FileDialog(f,"SAVE",FileDialog.SAVE);		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		if(path==""&&name=="")
		{
			path=path1;	name=name1;
		}
		
		File fl=new File(path,name);
		 pathname=fl.getName();
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
		catch(IOException e4){System.out.println(e4.getMessage());}
		catch(NullPointerException n){count8=1;}		
		i=1;		count1=0;		count6=0;	
		if(count8==1){match="-1";		}
		else
		{match=ta.getText();		count8=0;}
		}	
		
		 else if(f.getTitle().equals(pathname))
		{
		di3.setVisible(false);		di3.dispose();				
			try{
		File fl=new File(path,name);		
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
		catch(NullPointerException n){}		
		

		try
		{
		path1=path;		name1=name;
		try{
		FileDialog fd=new FileDialog(f,"SELECT",FileDialog.LOAD);
		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		}
		catch(NullPointerException n){}		
		if(name==""&&path=="")
		{
			path=path1;	name=name1;
		}
		
		File fl=new File(path,name);	
		
		 pathname=fl.getName();
		
		f.setTitle(pathname);
				
		if(fl.exists()){i=1;}
		
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
		catch(NullPointerException n){}
		i=1;		count1=0;		count6=0;		
				
		match=ta.getText();	
		}				
			
			}

		
		else if(count5==1|count7==1)
	{
		  if(!f.getTitle().equals(pathname)){
		
			try{
		path1=path;		name1=name;
		di3.setVisible(false);		di3.dispose();		
		FileDialog fd=new FileDialog(f,"SAVE",FileDialog.SAVE);		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		if(path==""&&name=="")
		{
		
			path=path1;	name=name1;
		}
		
		File fl=new File(path,name);
		 pathname=fl.getName();
		
				
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
		catch(NullPointerException n){count8=1;}
		if(count8==1){match="-1";	}	
			//match=ta.getText();
		else{count8=0;		System.exit(1);}
		count1=0;			count6=0;	
		}
					
		
		 else if(f.getTitle().equals(pathname)){
		
			di3.setVisible(false);		di3.dispose();				
			try{
			
			File fl=new File(path,name);		 pathname=fl.getName();
			
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
		catch(NullPointerException n){count8=1;}
		if(count8==1){match="";}					
		//match=ta.getText();	
		
		
		else
		{System.exit(1);}
		count1=0;		count6=0;			
		}	
						
		
	}	
		
				count2=1;			
		//match=ta.getText();
		
			}
			
			if(e.getSource()==b9)
			{
		count3=1;
		if(count1==1){
		di3.setVisible(false);		di3.dispose();
		f.setTitle("Untitled");		ta.setText("");		count1=0;
		count6=0;		
		}		
		
		else if(count6==1)
			{
		di3.setVisible(false);		di3.dispose();
		try{
		path1=path;		name1=name;
		FileDialog fd=new FileDialog(f,"SELECT",FileDialog.LOAD);
		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();		
		if(path==""&&name=="")
		{
				path=path1;	name=name1;
		}
	
		File fl=new File(path,name);	
		 pathname=fl.getName();
				
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
		catch(NullPointerException n){}
		match=ta.getText();			count6=0;		count1=0;		
		
			}
		else if(count5==1|count7==1){System.exit(1);}

		count1=0;			count6=0;		count5=0;		count7=0;		
		match=ta.getText();
			
			}		

			if(e.getSource()==b10)
			{
			count4=1;
			if(count1==1){count1=0;		match="-1";		count6=0;		count5=0;		count7=0;}
	
			else if(count6==1)
			{
			count6=0;		match="-1";		count1=0;		count5=0;		count7=0;
			}
			
		else if(count5==1|count7==1){count6=0;		match="-1";		count1=0;		count7=0;		count5=0;	}							
		di3.setVisible(false);		di3.dispose();			
		
			}		

			if(str.equals("Open"))
			{
		count1=0;		count6=1;		count5=0;		count7=0;
		path1=path;		name1=name;
		System.out.println(path1+" "+name1);
		if(ta.getText().equals(match)){
		
		try{
		
		FileDialog fd=new FileDialog(f,"SELECT",FileDialog.LOAD);
		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		if(name.equals("")&&path.equals(""))	
			{
				name=name1;		path=path1;	pathname="";
			}	
		else{}
		File fl=new File(path,name);
		 pathname=fl.getName();
		
		
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
		
		catch(NullPointerException n){}
		match=ta.getText();	
		}	
		else  if(!ta.getText().equals(match)){			di3.setVisible(true);	}
				i=1;		match=ta.getText();
		
			
		}
	
			if(str.equals("Save"))
			{
			
		if(i==0){
		if(!f.getTitle().equals(pathname))
			{
		try{
		path1=path;		name1=name;	
		FileDialog fd=new FileDialog(f,"SAVE",FileDialog.SAVE);		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		if(path.equals("")&&name.equals(""))
		{		
					name=name1;		path=path1;
		}
		
		File fl=new File(path,name);
		 pathname=fl.getName();
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
		catch(IOException e4){System.out.println(e4.getMessage());}
		catch(NullPointerException n){count8=1;}
		if(count8==1){match="-1";}
		i=1;	}	
		}

		 else if(i==1){
						
			try{
			if(path.equals("")&&name.equals(""))
		{			
					name=name1;		path=path1;
		}
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
		catch(NullPointerException n){count8=1;}
		}
		if(count8==1){match="-1";}
		else{match=ta.getText();}		
		//match="";
		}


			if(str.equals("SaveAs"))
			{
		
		try{
		path1=path;		name1=name;		
		FileDialog fd=new FileDialog(f,"SaveAs",FileDialog.SAVE);		fd.setVisible(true);
		 name=fd.getFile();			 path=fd.getDirectory();
		if(path==""&&name=="")
		{
			path=path1;	name=name1;
		}
		
		File fl=new File(path,name);	
		pathname=fl.getName();	f.setTitle(pathname);
		
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
		catch(NullPointerException n){count8=1;}
		if(count8==1){match="-1";}
		else{match=ta.getText();	count8=0;}
			}
		
			if(str.equals("Find"))
			{
		position = 0;
		di.setVisible(true);			
			}					
			if(e.getSource()==b1)
			{
		
		f.toFront();
		
		if(ta.getSelectedText().equals("")){position=ta.getCaretPosition();}
		 s=tf.getText();		
		 str1=ta.getText();		str1=str1.replace('\r','\n');	

		 sb=new StringBuffer(str1);	
			for(int count=0;count<sb.length();count++)
				{
				if(sb.charAt(count)=='\n')
					{		
					sb.deleteCharAt(count);
					}		
				}			
				j=sb.indexOf(s,position);
			if(position<sb.lastIndexOf(s))
				{			 	
				ta.select(j,j+s.length());
				position=j+s.length()-1;			
				}
			else 
				{
				di2.setVisible(true);	
				position=sb.lastIndexOf(s);			//to avoid agin marking if we have reached the end of the page
				}
			//position=j+s.length()-1;
									
		}
	
			if(str.equals("Close"))
			{
		
		di.setVisible(false);		di.dispose();	
			}


			if(str.equals("FindAndReplace"))
			{
		position1=0;		
		tf1.setText("");		tf2.setText("");
		di1.setVisible(true);
			}

			if(e.getSource()==b3)
			{
			f.toFront();					
		count9=1;		
		if(ta.getSelectedText().equals("")){position1=ta.getCaretPosition();}
		
		System.out.println("in find block"+position1);
		 s=tf1.getText();		
		 str1=ta.getText();		str1=str1.replace('\r','\n');	
		
		 sb=new StringBuffer(str1);
			for(int count=0;count<sb.length();count++)
				if(sb.charAt(count)=='\n')
					{		
					sb.deleteCharAt(count);
					}	
				
			 j=sb.indexOf(s,position1);	
			
			if(position1<sb.lastIndexOf(s))
				{
				
				ta.select(j,j+s.length());			
				position1=j+s.length()-1;
				//position1=j+s.length()-s2.length();
				}
			else 
				{
				di2.setVisible(true);	
				position1=sb.lastIndexOf(s);
				}
			//position1=j+s.length()-1;		
					
			}

		
			if(e.getSource()==b7)
				{
			di2.setVisible(false);		di2.dispose();
				}

			if(e.getSource()==b4)
			{				
		 s2=tf2.getText();		
		if(count9==0)
		{
			if(ta.getSelectedText().equals("")){position2=ta.getCaretPosition();}
			else{position2=j;}			
			System.out.println("in replace block"+position2);
			s=tf1.getText();		
			 str1=ta.getText();		str1=str1.replace('\r','\n');	

			 sb=new StringBuffer(str1);
			for(int count=0;count<sb.length();count++)
				{

				if(sb.charAt(count)=='\n')
					{		
					sb.deleteCharAt(count);
					}		
				}

			
			 j=sb.indexOf(s,position2);	
		
			if(position2<sb.lastIndexOf(s))
				{
				
				ta.select(j,j+s.length());
				ta.replaceText(s2,j,j+s.length());
				//ta.replaceText(s2,j,j+s.length()-s2.length());			
				//position2=j+s.length()-1;
				position2=j+s.length()-s2.length();
				}
			else 
				{
				di2.setVisible(true);	
				position2=sb.lastIndexOf(s);
				}
			

				
		}
		else{ta.replaceText(s2,j,j+s.length());	j=position2;		count9=0;}	
		
			}

			if(e.getSource()==b5)
			{
		String s=tf1.getText();		String str1=ta.getText();	String s1=tf2.getText();
		Pattern p=Pattern.compile(s);		Matcher m=p.matcher(str1);
		
			if(m.find())
			{
			result=m.replaceAll(s1);


			if(ta.getText().equals(result))		//to check if the textarea is already what we want
			{ta.setText(result);}
			else				//in both cases we want the same replaceall text to be shown on the textarea
			ta.setText(result);
	
			}
			
			//ta.setText(result);
			
			}

			if(e.getSource()==b6)
			{
		di1.setVisible(false);		di1.dispose();
		
			}

			if(str.equals("Exit"))
			{
		if(!ta.getText().equals(match)){
		di3.setVisible(true);
		count5=1;		count1=0;		count6=0;		count7=0;		
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
	}count7=1;	count1=0;		count6=0;		count5=0;	}
		
	


	public static void main(String b[])
		{
	
	Notepad1 n=new Notepad1();
	
		}
}

		