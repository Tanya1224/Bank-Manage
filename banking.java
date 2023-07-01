import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class banking implements ActionListener{
JFrame f;
JPanel p;
Label l1,l2,l3;
JTextField t1,t2,t3;
Font ff,fff;
JButton b1,b2;
ImageIcon ic1;
banking(){
f=new JFrame();
p=new JPanel();
p.setBounds(5,5,790,790);
f.setLayout(null);
p.setLayout(null);
f.add(p);
l1=new Label("WELCOME");
l1.setBounds(300,150,250,40);
ff=new Font("Times new Roman",Font.BOLD,45);
fff=new Font("Times new Roman",Font.BOLD,30);
l1.setFont(ff);
p.add(l1);


l2=new Label("Enter Email");
l2.setBounds(150,250,180,30);
l2.setFont(fff);
p.add(l2);

l3=new Label("Enter Password");
l3.setBounds(150,380,230,30);
l3.setFont(fff);
p.add(l3);

t1=new JTextField(10);
t1.setBounds(420,250,180,25);
t1.setFont(fff);
p.add(t1);

t2=new JTextField(10);
t2.setBounds(420,380,180,25);
t2.setFont(fff);
p.add(t2);


b1=new JButton("LOGIN");
b1.setBounds(300,500,150,25);
b1.setFont(fff);
p.add(b1);
b1.addActionListener(this);


ic1=new ImageIcon("moneyimg4.jpg");
b2=new JButton("",ic1);
b2.setBounds(550,530,200,200);
p.add(b2);



f.setSize(800,800);
f.setVisible(true);
p.setBackground(Color.lightGray);
}

public void actionPerformed(ActionEvent e){
String a=t1.getText();
String b=t2.getText();
if(a.equals("admin@gmail.com") && b.equals("12345")){
if(e.getSource()==b1){
new dashboard();
}
}
else{
JOptionPane.showMessageDialog(null,"Failed");
}
}

public static void main(String[] args){
banking obj=new banking();
}
}