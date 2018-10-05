import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class VechleInterface extends MainVehicle implements WindowListener,ActionListener
{
	public VechleInterface()
	{
		super();
	}
	
	public void Frame6()
	{
		f1.setVisible(false);
		f6.addWindowListener(this); 
        b23.addActionListener(this);
        f6.setSize(1366,768);
        f6.setResizable(false);
        f6.setLayout(null); 
        l15.setBounds(0, 0,1360, 768);
     
        t5.setBounds(610,265,200,35);
        t5.setBackground(Color.white);
	    t5.setForeground(Color.red);
	    t5.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        
        f6.add(l6);
        l6.setBackground(Color.red);
	    l6.setForeground(Color.red);
	    l6.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
        f6.add(t5);
        l6.setBounds(450,50,550,200);
        l6.setVisible(false);
        
        l16.setBounds(145,85,200,200);
        l17.setBounds(1135,85,200,200);
        f6.add(l16);
        f6.add(l17);
        l16.setVisible(false);
        l17.setVisible(false);
   
        b24.setBounds(220,315,200,40);
        b24.setBackground(Color.green);
	    b24.setForeground(Color.green);
	    b24.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        b24.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            
            	music();
            	Start();
            	flag=1;
            	l6.setVisible(true);
            	
            }
        });
        f6.add(b24);
        
        b17.setBounds(474,360,200,40);
        b17.setBackground(Color.green);
	    b17.setForeground(Color.green);
	    b17.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        b17.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	Turnl(); 
            	 l16.setVisible(true);
            	 l17.setVisible(false);
            	
            }
        });
        f6.add(b17);
       
        b18.setBounds(765,360,200,40);
        b18.setBackground(Color.green);
	    b18.setForeground(Color.green);
	    b18.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        b18.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	Turnr(); 
            	 l17.setVisible(true);
            	 l16.setVisible(false);
            }
        });
        f6.add(b18);
        
        b19.setBounds(1000,315,200,40);
        b19.setBackground(Color.green);
	    b19.setForeground(Color.green);
	    b19.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        b19.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	
            	if(flag==1)
            	{
            		music();
                	SpeedUp();
            	}
            		
            	
            	
            	
            }
        });
        f6.add(b19);
        
        b20.setBounds(1000,403,200,40);
        b20.setBackground(Color.green);
	    b20.setForeground(Color.green);
	    b20.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        b20.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	
            		music();
                	SpeedDown() ; 
            	
            	
            }
        });
        f6.add(b20);
        
        b21.setBounds(507,495,400,40);
        b21.setBackground(Color.green);
	    b21.setForeground(Color.green);
	    b21.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        b21.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	Break();       
            }
        });
        f6.add(b21);
        
        b25.setBounds(220,403,200,40);
        b25.setBackground(Color.green);
	    b25.setForeground(Color.green);
	    b25.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        b25.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	Stop();   
            	flag=0;
            }
        });
        f6.add(b25);
        
        b22.setBounds(457, 625,200,50);
        b22.setBackground(Color.red);
	    b22.setForeground(Color.green);
	    b22.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
	    
        b22.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
                f6.setVisible(false);
                f1.setVisible(true);                
            }
        });
        f6.add(b22);
        
        b23.setBounds(726, 625,200,50);
        b23.setBackground(Color.red);
	    b23.setForeground(Color.red);
	    b23.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
	    
        b23.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	System.exit(0);           
            }
        });
        f6.add(b23);
        
        f6.add(l15);
        f6.setVisible(true);
        
        
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
