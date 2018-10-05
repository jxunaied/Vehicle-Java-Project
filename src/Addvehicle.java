import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;

public class Addvehicle extends MainVehicle implements WindowListener,ActionListener
{
	String inn;
	public Addvehicle()
	{
		super();
	}
	
	public void Frame5()
	{
		f1.setVisible(false);
		f5.addWindowListener(this);
        b13.addActionListener(this);
        f5.setSize(1366,768);
        f5.setResizable(false);
        f5.setLayout(null);
        l14.setBounds(0, 0,1366, 768);
        
        //f5.add(t4);
        l1.setBounds(150,40,300,50);
	    l1.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(l1);
        tf1.setBounds(950, 40, 300, 50);
        tf1.setBackground(Color.white);
	    tf1.setForeground(Color.black);
	    tf1.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(tf1);
        
        l2.setBounds(150, 120,300,50);
        l2.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(l2);
        tf2.setBounds(950, 120, 300,50);
        tf2.setBackground(Color.white);
	    tf2.setForeground(Color.black);
	    tf2.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(tf2);
        
        l3.setBounds(150,200,300,50);
        l3.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(l3);
        tf3.setBounds(950, 200, 300,50);
        tf3.setBackground(Color.white);
	    tf3.setForeground(Color.black);
	    tf3.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(tf3);
        
        l7.setBounds(150, 280,300,50);
        l7.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(l7);
        tf4.setBounds(950, 280, 300,50);
        tf4.setBackground(Color.white);
	    tf4.setForeground(Color.black);
	    tf4.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(tf4);
        
        l8.setBounds(150, 360,300,50);
        l8.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(l8);
        tf5.setBounds(950, 360, 300,50);
        tf5.setBackground(Color.white);
	    tf5.setForeground(Color.black);
	    tf5.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(tf5);
        
        l9.setBounds(150, 440,300,50);
        l9.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(l9);
        tf6.setBounds(950, 440, 300,50);
        tf6.setBackground(Color.white);
	    tf6.setForeground(Color.black);
	    tf6.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(tf6);
        
        l10.setBounds(150, 520,300,50);
        l10.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(l10);
        tf7.setBounds(950, 520, 300,50);
        tf7.setBackground(Color.white);
	    tf7.setForeground(Color.black);
	    tf7.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC,17));
        f5.add(tf7);  
        
        //f5.add(b15);
        b14.setBounds(958,615, 200, 40);
        b14.setBackground(Color.green);
	    b14.setForeground(Color.green);
	    b14.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    //tf2.();
	    
	    tf2.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e){
				//tf2.disable();
				tf2.setText("");
		}
		});
	    
	    
	    
        b14.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	
            	try {
					    BufferedWriter fileOut1 = new BufferedWriter(new FileWriter("My File1.txt",true));
					    BufferedWriter fileOut2 = new BufferedWriter(new FileWriter("My File2.txt",true));
					    BufferedWriter fileOut3 = new BufferedWriter(new FileWriter("My File3.txt",true));
					    BufferedWriter fileOut4 = new BufferedWriter(new FileWriter("My File4.txt",true));
					    BufferedWriter fileOut = new BufferedWriter(new FileWriter("My File.txt",true));
					    //true(Boolean Append Built in)
					    
					    String myString1 =tf1.getText();
					    String myString2 =tf2.getText();
					    String myString3 =tf3.getText();
					    String myString4 =tf4.getText();
					    String myString5 =tf5.getText();
					    String myString6 =tf6.getText();
					    String myString7 =tf7.getText();
					    
					    tf1.setText("");
					    tf2.setText("");
					    tf3.setText("");
					    tf4.setText("");
					    tf5.setText("");
					    tf6.setText("");
					    tf7.setText("");
					    
					    if(myString2.equals("Sports"))
					    {
					    	 fileOut1.write("Name : "+myString1);
							 fileOut1.write("\n");
							 fileOut1.write("Type : "+myString2);
							 fileOut1.write("\n");
							 fileOut1.write("Speed: "+myString3+" Km/h");
							 fileOut1.write("\n");
							 fileOut1.write("\n");	
					    	
					    }
					    if(myString2.equals("Luxury"))
					    {
					    	 fileOut2.write("Name : "+myString1);
							 fileOut2.write("\n");
							 fileOut2.write("Type : "+myString2);
							 fileOut2.write("\n");
							 fileOut2.write("Speed: "+myString3+" Km/h");
							 fileOut2.write("\n");
							 fileOut2.write("\n");	
					    	
					    }
					    if(myString2.equals("Normal"))
					    {
					    	 fileOut3.write("Name : "+myString1);
							 fileOut3.write("\n");
							 fileOut3.write("Type : "+myString2);
							 fileOut3.write("\n");
							 fileOut3.write("Speed: "+myString3+" Km/h");
							 fileOut3.write("\n");
							 fileOut3.write("\n");	
					    	
					    }
					    
					     fileOut.write("Name : "+myString1);
						 fileOut.write("\n");
						 fileOut.write("Type : "+myString2);
						 fileOut.write("\n");
						 fileOut.write("Speed: "+myString3+" Km/h");
						 fileOut.write("\n");
						 fileOut.write("\n");
						 
						 fileOut4.write("Name : "+myString1);
						 fileOut4.write("\n");
						 fileOut4.write("Type : "+myString2);
						 fileOut4.write("\n");
						 fileOut4.write("Speed: "+myString3+" Km/h");
						 fileOut4.write("\n");
						 fileOut4.write("Relese Date: "+myString4);
						 fileOut4.write("\n");
						 fileOut4.write("Acceleration: "+myString5);
						 fileOut4.write("\n");
						 fileOut4.write("Handling: "+myString6);
						 fileOut4.write("\n");
						 fileOut4.write("Other Info: "+myString7);
						 fileOut4.write("\n");						 
						 fileOut4.write("\n");
					    
					    
					    fileOut1.close();
					    fileOut2.close();
					    fileOut3.close();
					    fileOut.close();
					    fileOut4.close();
					  
					  
	                
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} 	
            
            }
        });
        f5.add(b14);
        
        b12.setBounds(457, 625,200,50);
        b12.setBackground(Color.red);
	    b12.setForeground(Color.green);
	    b12.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
        b12.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
                f5.setVisible(false);
                f1.setVisible(true);                
            }
        });
        f5.add(b12);
        
        b13.setBounds(726, 625,200,50);
        b13.setBackground(Color.red);
	    b13.setForeground(Color.red);
	    b13.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
        b13.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
            	music();
            	System.exit(0);            
            }
        });
        f5.add(b13);
        
        f5.add(l14);
        f5.setVisible(true);
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
