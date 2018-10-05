import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class DisplayAll extends MainVehicle implements WindowListener,ActionListener
{	
	String in1="";
	
	public DisplayAll()
	{
		super();
	}
	
	@SuppressWarnings("resource")
	public void Frame2() throws CheckListException
	{
		
		f1.setVisible(false);
		f2.addWindowListener(this); 
        b6.addActionListener(this);
        f2.setSize(1366,768);
        f2.setResizable(false);
        f2.setLayout(null); 
        l11.setBounds(0, 0,1360, 768);
       
        
        b5.setBounds(295,120,305,35);
		b5.setBackground(Color.red);
	    b5.setForeground(Color.green);
	    b5.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
	    b6.setBounds(342,165,205,35);
		b6.setBackground(Color.red);
	    b6.setForeground(Color.red);
	    b6.setFont(new Font("Sans Serif", Font.BOLD, 20));
        
        try {
			d1=new BufferedReader (new FileReader("My File.txt"));	
			in1 = new Scanner(d1).useDelimiter("//My File.txt").next();
			
					
			} 
        catch (IOException e1) 
        	{
			
			e1.printStackTrace();
			} 
        
        t1.setBounds(700,120,400,400);
        t1.setBackground(Color.black);
	    t1.setForeground(Color.white);
	    t1.setFont(new Font("Sans Serif", Font.BOLD, 20));
        f2.add(t1);
        t1.setText(in1);
        
        b5.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	
                f2.setVisible(false);
                music();
                f1.setVisible(true);                
            }
        });
        f2.add(b5);
        
        b6.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	System.exit(0);        
            }
        });    
        f2.add(b6);
        
        f2.add(l11);
        f2.setVisible(true);
       
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
