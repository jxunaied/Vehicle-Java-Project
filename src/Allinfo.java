import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Allinfo extends MainVehicle implements WindowListener,ActionListener
{
	String in2="";
	
	public Allinfo()
	{
		super();
	}
	
	@SuppressWarnings("resource")
	public void Frame4()
	{
		f1.setVisible(false);
		f4.addWindowListener(this);
        b9.addActionListener(this);
        f4.setSize(1366,768);
        f4.setResizable(false);
        f4.setLayout(null);
        l13.setBounds(0, 0,1360, 768);
        
        try {
			d3=new BufferedReader (new FileReader("My File4.txt"));			
			in2 = new Scanner(d3).useDelimiter("//My File4.txt").next();
					
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
        
        
        t3.setBounds(900,120,350,500);
        t3.setBackground(Color.white);
	    t3.setForeground(Color.black);
	    t3.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        t3.setText(in2);
        f4.add(t3);
        
        b9.setBounds(290,140,205,35);
		b9.setBackground(Color.red);
	    b9.setForeground(Color.green);
	    b9.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
	    b10.setBounds(290,185,205,35);
		b10.setBackground(Color.red);
	    b10.setForeground(Color.red);
	    b10.setFont(new Font("Sans Serif", Font.BOLD, 20));
        
        b9.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
                f4.setVisible(false);
                f1.setVisible(true);                
            }
        });
        f4.add(b9);
        
        b10.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	System.exit(0);        
            }
        });
        
        f4.add(b10);
        f4.add(l13);
        f4.setVisible(true);
       
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
