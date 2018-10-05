import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
//import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.*;
import java.util.Random;

public class MainVehicle implements OperateCar,WindowListener, ActionListener {

	JFrame f1;
	JButton b1, b2, b3, b4,b11,b16;	
	JLabel l5;
	int tt;
	ImageIcon front;
	int flag=0;
	Timer time;
	int seconds = 0;
	
	JScrollPane scroll;
	JFrame f2;
	JButton b5,b6;
	TextArea t1;
	JLabel l11;
	BufferedReader d1,d2,d3;
	ImageIcon da;
	
	JFrame f3;
	Label l4;
	JCheckBox ch1,ch2,ch3;
	JButton b7,b8,b26,b27;
	TextArea t2;
	JLabel l12;
	ImageIcon st;
	
	JFrame f4;
	JButton b9,b10;
	TextArea t3;
	JLabel l13;
	ImageIcon all;
	
	JFrame f5;
	JButton b12,b13,b14,b15;
	TextArea t4;//Not Use
	Label l1,l2,l3,l7,l8,l9,l10,l20,l21,l22,l23;
	JLabel l14;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
	ImageIcon add;
	
	ImageIcon car,left,right;
	JFrame f6;
	JButton b17,b18,b19,b20,b21,b22,b23,b24,b25;
	JTextArea t5;
	JLabel l6,l15,l16,l17;
	ImageIcon inn;
 
	public MainVehicle()
	{
		
		
		try //Better Look
		{ 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		
		//front = new ImageIcon("front.jpg");  //For Current Class
		//l5 = new JLabel(front);
		f1 = new JFrame("Vehicle Menu");
		f1.setResizable(false);
		b1 = new JButton("Display All Vehicle");		
		b2 = new JButton("Display Special Type of Vehicle");	
		b3 = new JButton("Details of Specific Type of Vehicle");	
		b11 = new JButton("Add Vehicle");		
		b16 = new JButton("Vehicle Interface");		
		b4 = new JButton("Exit");
		time=new Timer();
		

		f2 = new JFrame("Display All Info");  //For DisplayyAll Class
		t1 = new TextArea(15,20);
		scroll = new JScrollPane (t1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		b5 = new JButton(" Main Menu");
		b6 = new JButton("Exit");
		da = new ImageIcon("da.jpg");
		l11 = new JLabel(da);
		
				
		f3 = new JFrame("Display All Info");  //For SpecialType Class
		l4 = new Label(" Search For Sports/Luxary/Normal ");
		ch1=new JCheckBox("Sports");
		ch2=new JCheckBox("Luxury");
		ch3=new JCheckBox("Normal");
		t2 = new TextArea(10,20);		
		b26=new JButton("Enter");
		b27=new JButton("Clear TextArea");
		b7 = new JButton("Main Menu");
		b8 = new JButton("Exit");
		st = new ImageIcon("st.jpg");
		l12 = new JLabel(st);
		
			
		f4 = new JFrame("Display All Info");  //For Allinfo Class
		t3 =new TextArea(10,40);		
		b9 = new JButton("Main Menu");
		b10 = new JButton("Exit");
		all = new ImageIcon("all.jpg");
		l13 = new JLabel(all);
	
		
		
		f5 = new JFrame("Add Vehicle");  //For Addvehicle Class
		b12 = new JButton("Main Menu");
		b13 = new JButton("Exit");
		b14 = new JButton("Enter");
		b15=new JButton("");
		t4 = new TextArea(10,30);
		l1=new Label("Enter Vechale Name");		
		l2=new Label("Enter Vechale Type");	
		l3=new Label("Enter Vechale Top Speed");
		l7=new Label("Enter Made Date");
		l8=new Label("Enter Vechale Acceleration");
		l9=new Label("Enter Vechale Handling");
		
		l20=new Label("Enter Vechal  Handling");
		l21=new Label("Enter Vechal  Handling");
		l22=new Label("Enter Vechal  Handling");
		l23=new Label("Enter Vechal  Handling");
		l10=new Label("Enter Vechale Other Info");
		tf1=new JTextField(40);
		tf2=new JTextField("Sports/Luxury/Normal/Other");	
		tf3=new JTextField(33);
		tf4=new JTextField(30);
		tf5=new JTextField(30);
		tf6=new JTextField(30);
		tf7=new JTextField(200);
		tf8=new JTextField(50);
		tf9=new JTextField(50);
		tf10=new JTextField(50);
		tf11=new JTextField(50);
		
		add = new ImageIcon("add.jpg");
		l14 = new JLabel(add);
		
		
		f6=new JFrame("Vechle Interface");  //For VecleInterface Class
		t5=new JTextArea(10,20);	
		car = new ImageIcon("car.gif");
		l6=new JLabel(car);
		b24=new JButton("Start");
		b17=new JButton("Turn Left");
		b18=new JButton("Turn Right");
		b19=new JButton("Speed Up");
		b20=new JButton("Speed Down");
		b25=new JButton("STop");
		b21=new JButton("Brake");
		b22=new JButton("Main Menu");
		b23=new JButton("Exit");
		inn = new ImageIcon("inn.jpg");
		left = new ImageIcon("left.gif");
		right = new ImageIcon("right.gif");
		l15 = new JLabel(inn);
		l16 = new JLabel(left);
		l17 = new JLabel(right);
		
		/*
		f1.getContentPane().setBackground(Color.YELLOW);
		b1.setBackground(Color.BLACK);  //For BackGround Color
		b2.setBackground(Color.BLACK);
		b3.setBackground(Color.BLACK);
		b11.setBackground(Color.BLACK);
		b16.setBackground(Color.BLACK);
		b4.setBackground(Color.BLACK);
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.BLUE); 
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.BLUE); 
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.BLUE); 
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.BLUE); 
		l1.setBackground(Color.BLACK);
		l2.setBackground(Color.BLACK);
		l3.setBackground(Color.BLACK);
		tf1.setForeground(Color.WHITE);
		tf1.setBackground(Color.BLACK);
		tf2.setForeground(Color.BLUE);
	    tf2.setBackground(Color.BLACK);
	    tf3.setForeground(Color.BLUE);
		tf3.setBackground(Color.BLACK);*/
		
		f1.addWindowListener(this);
		b4.addActionListener(this);		
		f1.setSize(1366,768);
		f1.setLayout(null); 
		front = new ImageIcon("front.gif");  //For Current Class
		l5 = new JLabel(front);
		
		
		l5.setBounds(0, 0,1360, 768);
		
		b1.setBounds(290,320,205,35);
		b1.setBackground(Color.green);
	    b1.setForeground(Color.green);
	    b1.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
	    b2.setBounds(900,380,330,35);
		b2.setBackground(Color.green);
	    b2.setForeground(Color.green);
	    b2.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
	    b3.setBounds(70,380,370,35);
		b3.setBackground(Color.green);
	    b3.setForeground(Color.green);
	    b3.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
	    b11.setBounds(830,320,205,35);
		b11.setBackground(Color.green);
	    b11.setForeground(Color.green);
	    b11.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
	    b16.setBounds(830,440,205,35);
		b16.setBackground(Color.green);
	    b16.setForeground(Color.green);
	    b16.setFont(new Font("Sans Serif", Font.BOLD, 20));
	    
	    b4.setBounds(290,440,205,35);
		b4.setBackground(Color.green);
	    b4.setForeground(Color.red);
	    b4.setFont(new Font("Sans Serif", Font.BOLD, 20));
			
		//...............Its for Interface Button.............................

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f1.setVisible(false);	
				music();
				DisplayAll da = new DisplayAll();
				try {
					da.Frame2();
				} catch (CheckListException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		f1.add(b1);

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				music();
				f1.setVisible(false);
				SpecificType st=new SpecificType();
				st.Frame3();
				
			}
		});
		f1.add(b2);

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				music();
				f1.setVisible(false);
				Allinfo ai=new Allinfo();
				ai.Frame4();

			}
		});
		f1.add(b3);
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				music();
				f1.setVisible(false);
				Addvehicle add=new Addvehicle();
				add.Frame5();

			}
		});
		f1.add(b11);
		
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				music();
				f1.setVisible(false);
				VechleInterface vi=new VechleInterface();
				vi.Frame6();
				
			}
		});
		f1.add(b16);
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				music();
				System.exit(0);

			}
		});
		f1.add(b4);
		
		f1.addMouseListener(new MouseAdapter() {
			
			
			public void mouseClicked(MouseEvent e){
				System.out.println(e.getX()+"..."+e.getY());
			}
		});
		
		/*f1.addMouseListener(new MouseAdapter() { //Its for Using Mouse
			
			
			public void mouseClicked(MouseEvent e){
				if(e.getX()>=197 && e.getX()<=298 && e.getY()>=307 && e.getY()<=347)
				{
					System.exit(0);
				}
				if(e.getX()>=147 && e.getX()<=347 && e.getY()>=60 && e.getY()<=90)
				{
					f1.setVisible(false);			
					DisplayAll da = new DisplayAll();
					try {
						da.Frame2();
					} catch (CheckListException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				if(e.getX()>=149 && e.getX()<=358 && e.getY()>=109 && e.getY()<=137)
				{
					f1.setVisible(false);
					SpecificType st=new SpecificType();
					st.Frame3();
				}
				if(e.getX()>=147 && e.getX()<=350 && e.getY()>=158 && e.getY()<=184)
				{
					f1.setVisible(false);
					Allinfo ai=new Allinfo();
					ai.Frame4();
				}
				if(e.getX()>=182 && e.getX()<=308 && e.getY()>=204 && e.getY()<=230)
				{
					f1.setVisible(false);
					Addvehicle add=new Addvehicle();
					add.Frame5();
				}
				if(e.getX()>=157 && e.getX()<=339 && e.getY()>=251 && e.getY()<=280)
				{
					f1.setVisible(false);
					VechleInterface vi=new VechleInterface();
					vi.Frame6();
				}
			}
		});*/
		f1.add(l5);
		f1.setVisible(true);

	}
	
	public void music()
	{
		Clip clip;
		try
	    {
			AudioInputStream audio = AudioSystem.getAudioInputStream(new File("sound.wav"));
			clip = AudioSystem.getClip();
			clip.open(audio);
			clip.start();
	    }
		catch(Exception uae)
		{
	    	System.out.println(uae);
	    }
	
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();

		if (s.equals("Exit")) 
		{
			System.exit(0);
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public static void main(String[] args) 
	{

		new MainVehicle();

	}

	@Override
	public void Start()
	{
		Random t=new Random();
		 l16.setVisible(false);
		 l17.setVisible(false);
    	tt=t.nextInt(20);
    	if(tt<=3)
    	{
    		tt=4;
    	}
    	t5.setText("Speed : "+Integer.toString(tt)+" Km/h");
    	
    	/*while (seconds < 100)
    	{
    		if(seconds==5)
    		{
    			tt++;
    			t5.setText("Speed : "+Integer.toString(tt)+" Kmp/h");
    		}
    		
    	}*/
		t5.setFont(new Font("Serif",Font.PLAIN,20));
    	
		
	}

	public void Turnl()
	{
		t5.setFont(new Font("Serif",Font.PLAIN,20));
		t5.setText("Turning Left");	
	}
	
	public void Turnr()
	{
		t5.setFont(new Font("Serif",Font.PLAIN,20));
		t5.setText("Turning Right");	
	}

	@Override
	public void SpeedUp() 
	{
		if(tt<80)
		{
			tt=tt+3;
			t5.setFont(new Font("Serif",Font.PLAIN,20));
			t5.setText("Speed : "+Integer.toString(tt)+" Km/h");
		}
		
	}
	
	public void SpeedDown() 
	{
		tt=tt-3;
		if(tt<0)
		{
			tt=0;
			l6.setVisible(false);
			 l16.setVisible(false);
			 l17.setVisible(false);
			flag=0;
		}
		t5.setFont(new Font("Serif",Font.PLAIN,20));
		t5.setText("Speed : "+Integer.toString(tt)+" Km/h");
	}

	@Override
	public void Stop() 
	{
		tt=0;
		l6.setVisible(false);
		 l16.setVisible(false);
		 l17.setVisible(false);
		t5.setFont(new Font("Serif",Font.PLAIN,20));
		t5.setText("Speed : "+Integer.toString(tt)+" Km/h");		
	}

	@Override
	public void Break() 
	{
		
		tt=tt-10;
		if(tt<0)
		{
			tt=0;
			l6.setVisible(false);
			 l16.setVisible(false);
			 l17.setVisible(false);
			flag=0;
		}
		t5.setFont(new Font("Serif",Font.PLAIN,20));
		t5.setText("Speed : "+Integer.toString(tt)+" Km/h");
		
	}

}
