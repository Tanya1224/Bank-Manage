import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class dashboard implements ActionListener{
JFrame f;
JPanel p;
Label l1;
Font ff,fff;
JButton b1,b2,b3,b4;
ImageIcon ic1;
double total=0.0;
dashboard(){
f=new JFrame();
p=new JPanel();
p.setBounds(5,5,790,790);
f.setLayout(null);
p.setLayout(null);
f.add(p);

ic1=new ImageIcon("bankimg6.gif");
b4=new JButton("",ic1);
b4.setBounds(150,50,450,260);
p.add(b4);

l1=new Label("WELCOME TO YOUR DASHBOARD");
l1.setBounds(50,400,680,40);
ff=new Font("Times new Roman",Font.BOLD,40);
fff=new Font("Times new Roman",Font.BOLD,25);
l1.setFont(ff);
l1.setBackground(Color.white);
p.add(l1);


b1=new JButton("Check Balance");
b1.setBounds(40,500,210,35);
b1.setFont(fff);
p.add(b1);
b1.addActionListener(this);

b2=new JButton("Withdraw Money");
b2.setBounds(290,500,220,35);
b2.setFont(fff);
p.add(b2);
b2.addActionListener(this);

b3=new JButton("Deposit Money");
b3.setBounds(550,500,210,35);
b3.setFont(fff);
p.add(b3);
b3.addActionListener(this);


f.setSize(800,800);
f.setVisible(true);
p.setBackground(Color.pink);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==b1){
JOptionPane.showMessageDialog(null,"Current Balance:"+total);
}

if(e.getSource()==b2){
if(total<0){
JOptionPane.showMessageDialog(null,
                    "Enter correct value");
}
else{
String s2=JOptionPane.showInputDialog(
                    "Enter Amount to withdraw");
if(Double.parseDouble(s2)>=total)
JOptionPane.showMessageDialog(null,"You dont have sufficient balance");
else{
total-=Double.parseDouble(s2);
}
}

}

if(e.getSource()==b3){
String s3=JOptionPane.showInputDialog(null,"Enter amount to deposit");

total+=Double.parseDouble(s3);

}
}

/*public static void main(String[] args){
dashboard obj=new dashboard();
}*/
}
