
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class ImagePanel extends JPanel {

  private Image img;
  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }
  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }
  @Override
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
}
public class Quiz extends JFrame implements ActionListener{

    private JTabbedPane tab1;
   // ImagePanel ;
    private JPanel panel1,panel2,panel3,panel4,panel5,panel6;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label22,label23;
    private JRadioButton radio1,radio2,radio3,radio4,radio5,radio6,radio7,radio8,radio9,radio10,radio11,radio12;
    private ButtonGroup group1,group2,group3,group4,group5,group6;
    private JButton confirm;
   
            
    public static void main(String[] args)
    {
        String title="GUI Quiz";
        
       Quiz fr=new Quiz("GUI Quiz");
       
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Quiz\\src\\quiz\\275087963_479889333808094_1889654457505635730_1.png");  
        // set image Icon on frame titleBar
        fr.setIconImage(icon); 
        fr.setFont(new Font("Arial", Font.ITALIC, 25));
      
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
         
        
    }

    public Quiz(String t)
    {
       
        javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.RED);
        
       
        //labels replaced with questions
        label1=new JLabel("What is a container object in GUI programming?\n");
        label1.setBorder(blackline);
        label2=new JLabel();
        label3=new JLabel("What is the one component that nearly all GUI programs will have?\n");
         label3.setBorder(blackline);
        label4=new JLabel();
        label5=new JLabel("The fundamental classes for GUI programming are contained in the:");
         //label1=new JLabel("What is a container object in GUI programming?\n");
        label5.setBorder(blackline);
       
      
        label6=new JLabel();
        label7=new JLabel("The three main parts of a GUI program are:");
         label7.setBorder(blackline);
        label8=new JLabel();
        label9=new JLabel("When the user clicks on a button, what is generated?");
         label9.setBorder(blackline);
        label10=new JLabel();
        label11=new JLabel("The class that is the ultimate ancestor of all the other classes is the class called;");
         label11.setBorder(blackline);
        label12=new JLabel();
        label12.setBounds(10, 10, 300, 20);
        //replace answer with the real answer
        radio1=new JRadioButton("A container is a GUI component that has other GUI components placed inside of it.");
        radio1.setActionCommand("A container is a GUI component that has other GUI components placed inside of it.");

        radio2=new JRadioButton("A container is any class that is made up of other classes.");
        radio2.setActionCommand("A container is any class that is made up of other classes.");

        radio3=new JRadioButton("Button");
        radio3.setActionCommand("Button");

        radio4=new JRadioButton("Window");
        radio4.setActionCommand("Window");
        radio3.setBounds(10, 150, 80, 30);
        radio4.setBounds(10, 240, 80, 30);
        radio5=new JRadioButton("Graphics Event Toolkit");
        radio5.setActionCommand("Graphics Event Toolkit");

        radio6=new JRadioButton("Abstract Windowing Toolkit");
        radio6.setActionCommand("Abstract Windowing Toolkit");
        radio5.setBounds(10, 150, 80, 30);
        radio6.setBounds(10, 240, 80, 30);
        radio7=new JRadioButton("GUI Components, Graphics, Code");
        radio7.setActionCommand("GUI Components, Graphics, Code");

        radio8=new JRadioButton("Frames, Code, Events");
        radio8.setActionCommand("Frames, Code, Events");
radio7.setBounds(10, 150, 80, 30);
        radio8.setBounds(10, 240, 80, 30);
        radio9=new JRadioButton("An event");
        radio9.setActionCommand("An event");

        radio10=new JRadioButton("A container");
        radio10.setActionCommand("A container");
radio9.setBounds(10, 150, 80, 30);
        radio10.setBounds(10, 240, 80, 30);
        radio11=new JRadioButton("Object");
        radio11.setActionCommand("Object");

        radio12=new JRadioButton("Container");
        radio12.setActionCommand("Container");
        radio11.setBounds(300, 250, 100, 30);
        radio12.setBounds(100, 280, 80, 30);
        //the panels to store labels and buttons per tab
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        panel5=new JPanel();
        panel6=new JPanel();


       
        //only one tab defined to handle multiple tab
        tab1=new JTabbedPane();
        tab1.setBounds(20,20,50,400);
        
     
        tab1.setBackground(Color.WHITE);
        tab1.setForeground(Color.cyan);
        //add all panels to the tab
        tab1.add("Q1",panel1);
        tab1.add("Q2",panel2);
        tab1.add("Q3",panel3);
        tab1.add("Q4",panel4);
        tab1.add("Q5",panel5);
        tab1.add("Q6",panel6);
       // tab1.setBackground(Color.WHITE);
        confirm=new JButton("Confirm");
        confirm.addActionListener(this);
       
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Quiz\\src\\quiz\\275087963_479889333808094_1889654457505635730_n_2.png");
 
     
 
      label23 = new JLabel("", icon, JLabel.CENTER);
  
     
        this.add(tab1);
         setTitle(t);
  
        //make all radio button be in a group for eventlistener
        group1=new ButtonGroup();
        
        group2=new ButtonGroup();
        group3=new ButtonGroup();
        group4=new ButtonGroup();
        group5=new ButtonGroup();
        group6=new ButtonGroup();
        label2.setBounds(10, 100, 80, 30);
        
        radio1.setBounds(10, 150, 80, 30);
        radio2.setBounds(10, 240, 80, 30);
        //add all elements to the panel
        panel1.add(label1);
        group1.add(radio1);
        radio1.setBackground(Color.WHITE);
       radio2.setBackground(Color.WHITE);
        group1.add(radio2);
        panel1.add(radio1);
        panel1.add(radio2);
        panel1.add(label2);
        panel1.setBackground(Color.WHITE);
         radio3.setBackground(Color.WHITE);
        radio4.setBackground(Color.WHITE);
        radio5.setBackground(Color.WHITE);
        radio6.setBackground(Color.WHITE);
        radio7.setBackground(Color.WHITE);
        radio8.setBackground(Color.WHITE);
        radio9.setBackground(Color.WHITE);
        radio10.setBackground(Color.WHITE);
        radio11.setBackground(Color.WHITE);
        radio12.setBackground(Color.WHITE);
        confirm.setBounds(100, 300, 5, 3);
       //setLayout for all panels
         panel1.setLayout(new GridLayout(12,1));
          panel2.setLayout(new GridLayout(12,1));
        panel3.setLayout(new GridLayout(12,1));
        panel4.setLayout(new GridLayout(12,1));
        panel5.setLayout(new GridLayout(12,1));
        panel6.setLayout(new GridLayout(12,24));
        panel2.add(label3);
        // setBackground colors to panels
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.WHITE);
        panel4.setBackground(Color.WHITE);
        panel5.setBackground(Color.WHITE);
        panel6.setBackground(Color.WHITE);
        // add radiobuttons in groups
        group2.add(radio3);
        group2.add(radio4);
        panel2.add(radio3);
        panel2.add(radio4);
        panel2.add(label4);

        panel3.add(label5);
        group3.add(radio5);
        group3.add(radio6);
        panel3.add(radio5);
        panel3.add(radio6);
        panel3.add(label6);

        panel4.add(label7);
        group4.add(radio7);
        group4.add(radio8);
        panel4.add(radio7);
        panel4.add(radio8);
        panel4.add(label8);

        panel5.add(label9);
        group5.add(radio9);
        group5.add(radio10);
        panel5.add(radio9);
        panel5.add(radio10);
        panel5.add(label10);

        panel6.add(label11);
        group6.add(radio11);
        group6.add(radio12);
        panel6.add(radio11);
        panel6.add(radio12);
        panel6.add(label12);
        panel6.add(confirm);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        JFrame f1=new JFrame();
        int count=0;
        
        
        if(e.getActionCommand().equals("Confirm"))
        {

            //if else to determine answer and add points
            //answer replaced by the correct answer 
            //count to test that the score is added up 
            if(group1.getSelection().getActionCommand()=="A container is a GUI component that has other GUI components placed inside of it."){
            count++;
            label2.setText("Yes, the answer is A container is a 'GUI component that has other GUI components placed inside of it'.");
            }
            if(group2.getSelection().getActionCommand()=="Window"){
            count++;
            label4.setText("Yes, the anwer is 'Window'.");
            }
            if(group3.getSelection().getActionCommand()=="Abstract Windowing Toolkit"){
            count++;
            label6.setText("Yes, the answer is 'Abstract Windowing Toolkit'.");
            }
            if(group4.getSelection().getActionCommand()=="Frames, Code, Events"){
            count++;
            label8.setText("Yes, the answer is 'Frames, Code, Events'.");
            }
            if(group5.getSelection().getActionCommand()=="An event"){
            count++;
            label10.setText("Yes, the answer is 'An event'.");
            }
            if(group6.getSelection().getActionCommand()=="Object"){
            count++;
            label12.setText("Yes, the answer is 'Object'.");
            }
            /*Categorising marks whether failed, fair or ace
           and storing the classification in String signature below
            */
 
            String signature ="";
            if(count == 0){
                signature = "Poor review again";
            }else if(count > 0 && count <3){
                signature="Bad review again";
            }else if((count > 2) && (count < 6)){
                signature="Not bad review again";
            }else if(count > 5){
                signature = "Great! keep it up";
            }
            //Defining the alert popup dialog
             JOptionPane.showMessageDialog(this,
    signature+"\n Scored : "+count+" points",
    "Your Points",
    JOptionPane.PLAIN_MESSAGE);

        }

    }

}
