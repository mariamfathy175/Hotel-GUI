package hotel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Login class
public class Login extends JFrame implements ActionListener{
   
    JPanel p,p1,p2,p3,p4;
    JLabel l1,l2,image;
    JTextField f1;
    JPasswordField f2;
    JButton b1,b2,b3;
    static JMenuBar menu;

    public Login()
    {
    p = new JPanel();
    
    p1 = new JPanel();
    p1.setPreferredSize(new Dimension(700,300));
    image = new JLabel();
    image.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\hotel1.gif"));
    p1.add(image);
    
    p.add(p1);

    
    p2 = new JPanel(); 
    p2.setLayout(new GridLayout(2,1,20,20));

    l1 = new JLabel("UserName:");
    l1.setFont(new Font("Times",Font.ITALIC,18));
    f1 = new JTextField();
    f1.setColumns(20);
    f1.setFont(new Font("Times",Font.PLAIN,18));
    l2 = new JLabel("Password:");
    l2.setFont(new Font("Times",Font.PLAIN,18));
    f2 = new JPasswordField();
    f2.setColumns(20);
    f2.setFont(new Font("Times",Font.ITALIC,18));

    
    p2.add(l1);
    p2.add(f1);
    p2.add(l2);
    p2.add(f2);
  
    p.add(p2);


    p3 = new JPanel(); 
    p3.setPreferredSize(new Dimension(700,100));
    p3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));
    
    b1 = new JButton("Login");
    b1.setFont(new Font("Times",Font.ITALIC,16)); 
    b2 = new JButton("Reset");
    b2.setFont(new Font("Times",Font.ITALIC,16));
    b3 = new JButton("Close");
    b3.setFont(new Font("Times",Font.ITALIC,16));

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    p3.add(b1);
    p3.add(b2);
    p3.add(b3);
    
    p.add(p3);

    this.add(p);
    
    }
    
// home page class    
public class Home_Page extends JFrame implements ActionListener{
    JPanel pane1;
    JLabel l;
    JMenu m; 
    JTextArea d;
    JMenuItem Item1,Item2,Item3,Item4;
    public Home_Page(){
        
    Color c1 = new Color(242, 242, 242);
    
    menu = new JMenuBar();
    m = new JMenu("File");
    menu.setBackground(c1);
    m.setFont(new Font("Times",Font.ITALIC,18));

    JMenu sub= new JMenu("Home");
    sub.setFont(new Font("Times",Font.ITALIC,18));
    
    Item1= new JMenuItem("Reserve / Withdraw");
    Item1.setFont(new Font("Times",Font.ITALIC,18));
    Item2= new JMenuItem("Hotel Utilites");
    Item2.setFont(new Font("Times",Font.ITALIC,18));
    Item3= new JMenuItem("Room Information");
    Item3.setFont(new Font("Times",Font.ITALIC,18));
    
    Item1.addActionListener(this);
    Item2.addActionListener(this);
    Item3.addActionListener(this);
    
    sub.add(Item1);
    sub.add(Item2);
    sub.add(Item3);
    
    m.add(sub);
    menu.add(m);
    
    pane1 = new JPanel();
    pane1.setBackground(new Color(0,0,0,0));
    pane1.setBounds(0, 150, 1500, 500);
    d = new JTextArea("WELCOME TO IMPERIAL HOTEL");
    d.setFont(new Font("Algerian",Font.ITALIC+Font.BOLD,75));
    d.setForeground(Color.white);
    d.setBackground(new Color(0,0,0,0));    
    d.setCaretColor(new Color(0,0,0,0));
    d.setBounds(50, 50, 300, 30);
    pane1.add(d);

    ImageIcon image = new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\h2.jpg");
    Image i = image.getImage();
    Image modified =i.getScaledInstance(2500, 1000, java.awt.Image.SCALE_SMOOTH);
    image= new ImageIcon(modified);
    l = new JLabel(image);
    
    l.add(pane1);
    this.add(l);
  
}
    
 //Registeration form class   
    public class Registeration extends JFrame implements ActionListener
    {
      JPanel panel,panel1,panel2,panel3,p1,p2,p3,p4,p5,p6,p7,p8,p9;
      JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
      JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12;
      JButton b1,b2,b3,b4,b5,b6;                                                                                                                                                                                                                                                                                                                                                     
      JComboBox b;
      JTextArea a;
  
    public Registeration(){
    Color c = new Color(0,0,0,0);

    panel = new JPanel();
    panel.setBackground(c);
    
    panel1 = new JPanel();
    panel1.setBackground(c);
    panel1.setPreferredSize(new Dimension(1100,350));

    panel1.setLayout(new GridLayout(7,1));

    p1 = new JPanel();
    p1.setPreferredSize(new Dimension(1100,100));
    p1.setBackground(c);
    l = new JLabel("Reservation Form");
    l.setFont(new Font("Times",Font.BOLD,30));
    
    p2 = new JPanel();
    p2.setBackground(c);
    l1 = new JLabel("Guest FirstName");
    l1.setFont(new Font("Times",Font.ITALIC,18));
    f1 = new JTextField();
    f1.setColumns(20);  
    f1.setFont(new Font("Times",Font.PLAIN,16));
    l2 = new JLabel("Guest LastName");
    l2.setFont(new Font("Times",Font.ITALIC,18));
    f2 = new JTextField();
    f2.setColumns(20);
    f2.setFont(new Font("Times",Font.PLAIN,16));
    
    p3 = new JPanel();
    p3.setBackground(c);
    l3 = new JLabel("Email Address");
    l3.setFont(new Font("Times",Font.ITALIC,18));
    f3 = new JTextField();
    f3.setColumns(20);
    f3.setFont(new Font("Times",Font.PLAIN,16));
    l4 = new JLabel("Phone Number");
    l4.setFont(new Font("Times",Font.ITALIC,18));
    f4 = new JTextField();
    f4.setColumns(20);
    f4.setFont(new Font("Times",Font.PLAIN,16));
    
    p4 = new JPanel();
    p4.setBackground(c);
    l5 = new JLabel("Room Number");
    l5.setFont(new Font("Times",Font.ITALIC,18));
    f5 = new JTextField();
    f5.setColumns(20);
    f5.setFont(new Font("Times",Font.PLAIN,16));
    l6 = new JLabel("Room type");
    l6.setFont(new Font("Times",Font.ITALIC,18));    
    b = new JComboBox();
    b.addItem("Single");
    b.addItem("Double");
    b.addItem("Triple");
    b.addItem("Suite");
    b.addItem("Connecting Rooms");
    b.addItem("King size Rooms");
    b.setFont(new Font("Times",Font.ITALIC,18));

    
    p5 = new JPanel();
    p5.setBackground(c);    
    l7 = new JLabel("Number of adults");
    l7.setFont(new Font("Times",Font.ITALIC,18));
    f7 = new JTextField();
    f7.setColumns(10);
    f7.setFont(new Font("Times",Font.PLAIN,16));    
    b3 = new JButton("+");
    b3.setFont(new Font("Times",Font.ITALIC,14));
    b3.addActionListener(this);
    b4 = new JButton("-");
    b4.setFont(new Font("Times",Font.ITALIC,14));
    b4.addActionListener(this);    
    l8 = new JLabel("Number of Children");
    l8.setFont(new Font("Times",Font.ITALIC,18));
    f8 = new JTextField();
    f8.setColumns(10);
    f8.setFont(new Font("Times",Font.PLAIN,16));    
    b5 = new JButton("+");
    b5.setFont(new Font("Times",Font.ITALIC,14));
    b5.addActionListener(this);
    b6 = new JButton("-");
    b6.setFont(new Font("Times",Font.ITALIC,14));
    b6.addActionListener(this);    
    
    p6 = new JPanel();
    p6.setBackground(c);
    l9 = new JLabel("Checkin Date");
    l9.setFont(new Font("Times",Font.ITALIC,18));
    f9 = new JTextField();
    f9.setColumns(20);
    f9.setFont(new Font("Times",Font.PLAIN,16));    
    l10 = new JLabel("Check out Date");
    l10.setFont(new Font("Times",Font.ITALIC,18));
    f10 = new JTextField();
    f10.setColumns(20);
    f10.setFont(new Font("Times",Font.PLAIN,16));
    
    p7 = new JPanel();
    p7.setBackground(c);
    l11 = new JLabel("Number of Days");
    l11.setFont(new Font("Times",Font.ITALIC,18));
    f11 = new JTextField();
    f11.setColumns(20);
    f11.setFont(new Font("Times",Font.PLAIN,16));    
    l12 = new JLabel("Room Rate");
    l12.setFont(new Font("Times",Font.ITALIC,18));
    f12 = new JTextField();
    f12.setColumns(20);   
    f12.setFont(new Font("Times",Font.PLAIN,16));    

    p9 = new JPanel();
    a= new JTextArea (); 
    a.setFont(new Font("Times",Font.ITALIC,16));     
    a.setColumns(60);
    a.setRows(15);

    panel3 = new JPanel(); 
    panel3.setBackground(c);  
    panel3.setPreferredSize(new Dimension(1100,100));
    p8 = new JPanel();
    p8.setBackground(c);
    b1 = new JButton("Reserve");
    b1.setFont(new Font("Times",Font.ITALIC,16)); 
    b1.addActionListener(this);
    b2 = new JButton("Withdraw");
    b2.setFont(new Font("Times",Font.ITALIC,16)); 
    b2.addActionListener(this);    
    
    p1.add(l,BorderLayout.CENTER);
    
    p2.add(l1);
    p2.add(f1);
    p2.add(l2);
    p2.add(f2);
    
    p3.add(l3);
    p3.add(f3);
    p3.add(l4);
    p3.add(f4);
    
    p4.add(l5);
    p4.add(f5);
    p4.add(l6);
    p4.add(b);
    
    p5.add(l7);
    p5.add(f7);
    p5.add(b3);
    p5.add(b4);
    p5.add(l8);
    p5.add(f8);
    p5.add(b5);
    p5.add(b6);
    
    p6.add(l9);
    p6.add(f9);
    p6.add(l10);
    p6.add(f10);
    
    p7.add(l11);
    p7.add(f11);
    p7.add(l12);
    p7.add(f12);
  
    
    p8.add(b1);
    p8.add(b2);
    
    panel1.add(p1);    
    panel1.add(p2);
    panel1.add(p3);
    panel1.add(p4);
    panel1.add(p5);
    panel1.add(p6);
    panel1.add(p7);

    panel2 = new JPanel();    
    panel2.setBackground(c);   
    panel2.setPreferredSize(new Dimension(1100,300));
    a= new JTextArea (); 
    a.setFont(new Font("Times",Font.ITALIC,16));     
    a.setColumns(60);
    a.setRows(15);
    
    panel2.add(a); 
    panel3.add(p8);

    panel.add(panel1);
    panel.add(panel2);
    panel.add(panel3);
    
    this.add(panel);
    }
// action performed on registeration form buttons
            @Override
            public void actionPerformed(ActionEvent ae) {
           
            int counter=0;
            
            switch(ae.getActionCommand()){
                case "+":
                    counter++;
                    f7.setText(Integer.toString(counter));
                break;
                
                case "-":
                    counter--;
                    f7.setText(Integer.toString(counter));

                break;

             }
         switch(ae.getActionCommand()){ 
                
         case "Reserve":
         a.setText("FirstName : "+f1.getText()+"\n" +"LastName : "+f2.getText()+"\n" 
         +"Email Address : "+f3.getText()+"\n" +"Phone Number : "+f4.getText()+"\n" +"Room Number : "+f5.getText()+"\n"
         +"Room type : "+b.getSelectedItem().toString()+"\n" +"No of Adults : "+f7.getText()+"\n"+"No of Children : "+f8.getText()+"\n" 
         +"Check in Date : "+f9.getText()+"\n"+"Check out Date : "+f10.getText()+"\n"+"Number of Days : "+f11.getText()+"\n"+
           "Room Rate : "+f12.getText()+"\n"); 
         break;
         
         case "Withdraw":
         a.setText("");
         break;

            }
    }
    }    
//hotel utilites class    
public class Utilites extends JFrame{
    JPanel panl,panl1,panl2,panl3,panl4,panl5,panl6,panl7,panl8;
    JLabel img,img2,img3,img4,img5,img6,img7,img8;
    JTextArea ar1,ar2,ar3,ar4,ar5,ar6,ar7,ar8;
    public Utilites(){
    
    panl = new JPanel();
    panl.setLayout(new GridLayout(4,2));
    
    panl1 = new JPanel();
    img = new JLabel();
    img.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\gym2.jpg"));
    img.setPreferredSize(new Dimension(300,200));
    ar1 = new JTextArea("    Al guests over the age of 16 are\n"
                        + "    invited to use our in-house hotel\n"
                        + "    gym to exercise With a mix of\n"
                        + "    equipment and weights,our hotel\n"
                        + "    gym will cater to you whether you\n"
                        + "    want to do a cardio workout or if\n,"
                        + "    you want to give your muscles\n"
                        + "    some strength training or toning\n"
                        + "    exercises");
    
    ar1.setFont(new Font("Times",Font.ITALIC,16));
    ar1.setBackground(new Color(0,0,0,0));
    ar1.setCaretColor(new Color(0,0,0,0));    
    panl1.add(img);
    panl1.add(ar1);
    panl.add(panl1);
    
    panl2 = new JPanel();
    img2 = new JLabel();
    img2.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\tennis2.jpg"));
    img2.setPreferredSize(new Dimension(300,200));

    ar2 = new JTextArea("    There are six public floodlit\n"
                        + "    tennis courts registered with the\n"
                        + "    Lawn Tennis Association at the\n"
                        + "    centre");
    
    ar2.setFont(new Font("Times",Font.ITALIC,16));
    ar2.setBackground(new Color(0,0,0,0));    
    ar2.setCaretColor(new Color(0,0,0,0));    
    panl2.add(img2);
    panl2.add(ar2);
    panl.add(panl2);
    
    panl3 = new JPanel();
    img3 = new JLabel();
    img3.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\bzar.jpg"));
    img3.setPreferredSize(new Dimension(300,200));
    

    ar3 = new JTextArea("    The Imperial hotel offers all what\n"
                      + "    what you will need in your vaction\n"
                      + "    you can buy anything you want in\n"
                      + "    any time from our shops also you\n"
                      + "    buy gifts and souvenirs for all\n"
                      + "    your friends and family.");
     
    ar3.setFont(new Font("Times",Font.ITALIC,16));
    ar3.setBackground(new Color(0,0,0,0));  
    ar3.setCaretColor(new Color(0,0,0,0));
    panl3.add(img3);
    panl3.add(ar3);
    panl.add(panl3);
    
    panl4 = new JPanel();
    img4 = new JLabel();
    img4.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\sauna2.jpg"));
    img4.setPreferredSize(new Dimension(300,200));

    ar4 = new JTextArea("    At temperatures of 90°C you will\n"
                        + "    experience holistic recreation for\n"
                        + "    body, mind and soul. A positive\n"
                        + "    side effect of a sauna is how it\n"
                        + "    strengthens the immune system,\n"
                        + "    stimulates the circulation system");
    
    ar4.setFont(new Font("Times",Font.ITALIC,16));
    ar4.setBackground(new Color(0,0,0,0));    
    ar4.setCaretColor(new Color(0,0,0,0));    
    panl4.add(img4);
    panl4.add(ar4);
    panl.add(panl4);
    
    panl5 = new JPanel();
    img5 = new JLabel();
    img5.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\kids.jpg"));
    img5.setPreferredSize(new Dimension(300,200));

    ar5 = new JTextArea("    Children are never bored at our\n"
                        + "    Hotel In addition to our wonderful\n"
                        + "    playrooms,extensive pool area\n"
                        + "    and outdoor playground,Imperial\n"
                        + "    Hotel offers a wide range of \n"
                        + "    activities for children at the\n"
                        + "    weekends and during school \n"
                        + "    holidays");
     
    ar5.setFont(new Font("Times",Font.ITALIC,16));
    ar5.setBackground(new Color(0,0,0,0));    
    ar5.setCaretColor(new Color(0,0,0,0));    
    panl5.add(img5);
    panl5.add(ar5);
    panl.add(panl5);
    
    panl6 = new JPanel();
    img6 = new JLabel();
    img6.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\performance2.jpg"));
    img6.setPreferredSize(new Dimension(300,200));

    ar6 = new JTextArea("    Imperial Hotel consists of a well\n"
                        + "    trained animation team that makes\n"
                        + "    a very special activities on the\n"
                        + "    beach and the pool in the morning\n"
                        + "    and alive performances at night");
   
    ar6.setFont(new Font("Times",Font.ITALIC,16));
    ar6.setBackground(new Color(0,0,0,0));    
    ar6.setCaretColor(new Color(0,0,0,0));    
    panl6.add(img6);
    panl6.add(ar6);
    panl.add(panl6);
    
    panl7 = new JPanel();
    img7 = new JLabel();
    img7.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\restaurants2.jpg"));
    img7.setPreferredSize(new Dimension(300,200));

    ar7 = new JTextArea("    breakfast buffet available daily\n"
                         +"    from 6:30 AM–9:30 AM\n"
                         +"    6 restaurants and 1 coffee shop\n"  
                         +"    8 bars/lounges,1 beach bar and\n"
                         +"    1 poolside bar\n" 
                         +"    24-hour room service\n" 
                         +"    Coffee/tea in common area(s)");

    ar7.setFont(new Font("Times",Font.ITALIC,16));
    ar7.setBackground(new Color(0,0,0,0));    
    ar7.setCaretColor(new Color(0,0,0,0));    
    panl7.add(img7);
    panl7.add(ar7);
    panl.add(panl7);
    
    panl8 = new JPanel();
    img8 = new JLabel();
    img8.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\0002.jpg"));
    img8.setPreferredSize(new Dimension(300,200));

    ar8 = new JTextArea("    There are also three large pools\n"
                        + "    including a heated one all with\n"
                        + "    loungers and umbrellas. A small\n"
                        + "    water park has several waterslides\n"
                        + "    and serves as a dedicated kid's pool.\n"
                        + "    The adult pools also have children's\n"
                        + "    areas.");
    ar8.setFont(new Font("Times",Font.ITALIC,16));
    ar8.setBackground(new Color(0,0,0,0));  
    ar8.setCaretColor(new Color(0,0,0,0));    
    panl8.add(img8);
    panl8.add(ar8);
    panl.add(panl8);
    
    this.add(panl);
    }    
}

// Room information class
public class Room_infromation extends JFrame{
     
    JPanel pan,pan1,pan2,pan3,pan4,pan5,pan6;
    JLabel img,img2,img3,img4,img5,img6;
    JTextArea area1,area2,area3,area4,area5,area6;
    
    public Room_infromation(){
    
    pan = new JPanel();
    pan.setLayout(new GridLayout(3,2));
    
    pan1 = new JPanel();
    img = new JLabel();
    img.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\single2.jpg"));
    img.setPreferredSize(new Dimension(300,200));
    area1 = new JTextArea("    Single room, size 9,5-13m², is a small\n"
                        + "    and simple room offering everything\n"
                        + "    necessary for a comfortable stay : \n"
                        + "    1 single bed, free WiFi, TV, a work \n"
                        + "    desk and a private bathroom with shower.");
    
    area1.setFont(new Font("Times",Font.ITALIC,16));
    area1.setBackground(new Color(0,0,0,0));
    area1.setCaretColor(new Color(0,0,0,0));    
    pan1.add(img);
    pan1.add(area1);
    pan.add(pan1);
    
    pan2 = new JPanel();
    img2 = new JLabel();
    img2.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\double2.jpg"));
    img2.setPreferredSize(new Dimension(300,200));

    area2 = new JTextArea("    Double rooms, 11-18m², are compact\n"
                        + "    and cozy featuring everything necessary\n"
                        + "    for a comfortable stay : 1 double bed,\n"
                        + "    complimentary WiFi, TV, a work desk and\n"
                        + "    a private bathroom with shower.");
    
    area2.setFont(new Font("Times",Font.ITALIC,16));
    area2.setBackground(new Color(0,0,0,0));    
    area2.setCaretColor(new Color(0,0,0,0));    
    pan2.add(img2);
    pan2.add(area2);
    pan.add(pan2);
    
    pan3 = new JPanel();
    img3 = new JLabel();
    img3.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\TripleRoom2.jpg"));
    img3.setPreferredSize(new Dimension(300,200));
    

    area3 = new JTextArea("    Deluxe Triple Rooms in our hotel are\n"
                        + "    perfectly equipped for traveling\n"
                        + "    friends or business partners. an\n"
                        + "    elegant bathroom with shower is \n"
                        + "    included in the room All our rooms\n"
                        + "    are equipped with LCD High Definition\n"
                        + "    TV with interactive system, internet\n"
                        + "    and Wi-Fi, safe and minibar with a\n"
                        + "    selection of soft drinks and snacks.\n");
    area3.setFont(new Font("Times",Font.ITALIC,16));
    area3.setBackground(new Color(0,0,0,0));  
    area3.setCaretColor(new Color(0,0,0,0));
    pan3.add(img3);
    pan3.add(area3);
    pan.add(pan3);
    
    pan4 = new JPanel();
    img4 = new JLabel();
    img4.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\suite-room_2.jpeg"));
    img4.setPreferredSize(new Dimension(300,200));

    area4 = new JTextArea("     A Hotel Suite give you access to additional\n"
                        + "     services such as a kitchen area that coubld\n"
                        + "     be useful to you depending on the reasons \n"
                        + "     for your travel Some luxury suites may \n"
                        + "     resemble a standard hotel room while offering\n"
                        + "     more space and more luxurious furniture,\n"
                        + "     appliances and services");
                      
   
    area4.setFont(new Font("Times",Font.ITALIC,16));
    area4.setBackground(new Color(0,0,0,0));    
    area4.setCaretColor(new Color(0,0,0,0));    
    pan4.add(img4);
    pan4.add(area4);
    pan.add(pan4);
    
    pan5 = new JPanel();
    img5 = new JLabel();
    img5.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\connecting-room2.jpg"));
    img5.setPreferredSize(new Dimension(300,200));

    area5 = new JTextArea("     connecting rooms have a door on the\n"
                        + "     inside that connects them, without\n"
                        + "     having to step out into the hallway\n"
                        + "     and then into the other room");
     
    area5.setFont(new Font("Times",Font.ITALIC,16));
    area5.setBackground(new Color(0,0,0,0));    
    area5.setCaretColor(new Color(0,0,0,0));    
    pan5.add(img5);
    pan5.add(area5);
    pan.add(pan5);
    
        pan6 = new JPanel();
    img6 = new JLabel();
    img6.setIcon(new ImageIcon("H:\\fue 2019 second semster\\advanced programming\\hotel\\src\\icons\\king_room2.jpg"));
    img6.setPreferredSize(new Dimension(300,200));

    area6 = new JTextArea("     Our Deluxe king size room has a seating\n"
                        + "     area, ample storage, digital safe, minibar\n"
                        + "     and luxurious duck down bedding. This room\n"
                        + "     can also be configured with an extra roll-away\n"
                        + "     bed for families of 3.");
     
    area6.setFont(new Font("Times",Font.ITALIC,16));
    area6.setBackground(new Color(0,0,0,0));    
    area6.setCaretColor(new Color(0,0,0,0));    
    pan6.add(img6);
    pan6.add(area6);
    pan.add(pan6);
   
    this.add(pan);

}
}
//Action performed when clicking on menu     
        @Override
        public void actionPerformed(ActionEvent c) {
            
            Registeration frame2 = new Registeration();
            Utilites frame3 = new Utilites(); 
            Room_infromation frame4 = new Room_infromation();
            
            switch(c.getActionCommand()){
            
            case "Reserve / Withdraw":    
            frame2.setLocation(500, 225);
            frame2.setTitle("Register Guest");
            frame2.setSize(1100, 775);
            frame2.setVisible(true); 
            break;
            
            case "Hotel Utilites":    
            frame3.setLocation(250,80);
            frame3.setTitle("Hotel Utilites");
            frame3.setSize(1400,950);
            frame3.setVisible(true); 
            break;
            
            case "Room Information":    
            frame4.setLocation(250, 80);
            frame4.setTitle("Room Informations");
            frame4.setSize(1400,950);
            frame4.setVisible(true); 
            break;
            
            }
        }
    }
//Action performed when clicking login button from login page
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Home_Page frame=new Home_Page();
        switch(e.getActionCommand()){
        
            case "Login":
            String user = f1.getText();
            String password = f2.getText();
                
            if(user.equals("admin")&&password.equals("123")){
            JOptionPane.showMessageDialog(null, "Succesfull Login", "Welcome", JOptionPane.INFORMATION_MESSAGE);    
            frame.setJMenuBar(menu);
            frame.setTitle("Hotel");
            frame.setSize(1500, 950);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
            frame.setVisible(true);
    
      
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            Dimension frameSize = frame.getSize();
            int x = (screenWidth - frameSize.width) / 2;
            int y = (screenHeight - frameSize.height) / 2;
    
            frame.setLocation(x, y);
            }
            else{
            
            JOptionPane.showMessageDialog(null, "Incorect Email or Password", "Error", JOptionPane.ERROR_MESSAGE);

            }
            break;
            
            case "Reset":
            f1.setText("");
            f2.setText("");
            break; 
            
            case"Close":
                System.exit(0);
            break;
            
        }
    }
}

