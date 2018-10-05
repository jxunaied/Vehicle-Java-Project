import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class SpecificType extends MainVehicle implements WindowListener,ActionListener
{
	String in="";
	public SpecificType()
	{
		super();
	}
	
	public void Frame3()
	{
		f1.setVisible(false);
		f3.addWindowListener(this);
        b8.addActionListener(this);
        f3.setSize(1366,768);
        f3.setResizable(false);
        f3.setLayout(null);
        
        l12.setBounds(0, 0,1360, 768);
	    
        l4.setBounds(212, 209,300,40);
        l4.setBackground(Color.white);
	    l4.setForeground(Color.green);
	    l4.setFont(new Font("Sans Serif", Font.BOLD, 17));
        f3.add(l4);
        
        ch1.setBounds(212,290,100, 50);
        ch1.setBackground(Color.white);
	    ch1.setForeground(Color.darkGray);
	    ch1.setFont(new Font("Sans Serif", Font.BOLD, 17));
        f3.add(ch1);
        
        ch2.setBounds(212,370, 100, 50);
        ch2.setBackground(Color.white);
	    ch2.setForeground(Color.darkGray);
	    ch2.setFont(new Font("Sans Serif", Font.BOLD, 17));
        f3.add(ch2);
        
        ch3.setBounds(212,450,100,50);
        ch3.setBackground(Color.white);
	    ch3.setForeground(Color.darkGray);
	    ch3.setFont(new Font("Sans Serif", Font.BOLD, 17));
        f3.add(ch3);
        
        b26.setBounds(212, 530,200, 50);
        b26.setBackground(Color.green);
	    b26.setForeground(Color.GREEN);
	    b26.setFont(new Font("Sans Serif", Font.BOLD, 17));
        b26.addActionListener(new ActionListener() 
        {
            @SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) 
            {
            	music();
                if(ch1.isSelected())
                {
                	music();
                	try {
                		
						d2=new BufferedReader (new FileReader("My File1.txt"));
						in = new Scanner(d2).useDelimiter("//My File1.txt").next();
	        			t2.append(in);
	        			t2.append("\n");
	        			d2.close();
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}

        			
                }
                
                if(ch2.isSelected())
                {
                	music();
                	try {
						d2=new BufferedReader (new FileReader("My File2.txt"));
						in = new Scanner(d2).useDelimiter("//My File2.txt").next();
	        			t2.append(in);
	        			t2.append("\n");
	        			d2.close();
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}	
        			
                }
                
                if(ch3.isSelected())
                {
                	music();
                	try {
						d2=new BufferedReader (new FileReader("My File3.txt"));
						in = new Scanner(d2).useDelimiter("//My File3.txt").next();
	        			t2.append(in);
	        			t2.append("\n");
	        			d2.close();
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}	
                	
        			
                }
                
            }
        });       
        f3.add(b26);
        
        b27.setBounds(958,615, 200, 40);
        b27.setBackground(Color.green);
	    b27.setForeground(Color.green);
	    b27.setFont(new Font("Sans Serif", Font.BOLD, 17));
        b27.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
                t2.setText("");                
            }
        });
        f3.add(b27);
        t2.setBounds(960, 200, 350, 400);
        t2.setBackground(Color.white);
	    t2.setForeground(Color.black);
	    t2.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f3.add(t2);
        
        b7.setBounds(457, 615,200,50);
        b7.setBackground(Color.red);
	    b7.setForeground(Color.green);
	    b7.setFont(new Font("Verdana", Font.BOLD,17));
        b7.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	//music();
                f3.setVisible(false);
                f1.setVisible(true);                
            }
        });
        f3.add(b7);
        
        b8.setBounds(726, 615,200,50);
        b8.setBackground(Color.red);
	    b8.setForeground(Color.red);
	    b8.setFont(new Font("Verdana", Font.BOLD,17));
        b8.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	System.exit(0);        
            }
        });
        f3.add(b8);
        f3.add(l12);
        f3.setVisible(true);
       
	}
	
	 	public void actionPerformed(ActionEvent e) 
	    {
	        
	    }
	    
	    public void windowClosing(WindowEvent e) 
	    {
	        System.exit(0);
	    }

	    public void windowOpened(WindowEvent e) {}
	   
	    public void windowClosed(WindowEvent e) {}

	    public void windowIconified(WindowEvent e) {}

	    public void windowDeiconified(WindowEvent e) {}

	    public void windowActivated(WindowEvent e) {}

	    public void windowDeactivated(WindowEvent e) {}

}
