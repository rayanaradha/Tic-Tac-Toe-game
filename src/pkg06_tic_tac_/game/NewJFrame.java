package pkg06_tic_tac_.game;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
private String whose ="x"; 
int l,m;

Icon b = new ImageIcon(getClass().getResource("s.jpg"));
Icon c = new ImageIcon(getClass().getResource("t.png"));
Icon u = new ImageIcon(getClass().getResource("d.jpg"));
Icon o = new ImageIcon(getClass().getResource("nn.png"));
Icon v = new ImageIcon(getClass().getResource("v.jpg"));

int w1=0,w2=0,t=0,ww;
String n1,n2,x,pp;
int i1=0;
int i2=0;
int i3=0;
int i4=0;
int i5=0;
int i6=0;
int i7=0;
int i8=0;
int i9=0;
int i10=0;
int i11=0;
int i12=0;
int i13=0;
int i14=0;
int i15=0;
int i16=0;
int i17=0;
int i18=0;
int i19=0;
int i20=0;
int i21=0;
int i22=0;
int i23=0;
int i24=0;

int u1=1;
int u2=1;
int u3=1;
int u4=1;
int u5=1;
int u6=1;
int u7=1;
int u8=1;
int u9=1;
int u10=1;
int u11=1;
int u12=1;
int u13=1;
int u14=1;
int u15=1;
int u16=1;
int u17=1;
int u18=1;
int u19=1;
int u20=1;
int u21=1;
int u22=1;
int u23=1;
int u24=1;


        
    public NewJFrame() {
        initComponents();
        setSize(680, 580);
        setLocationRelativeTo(null);
        name();
    }
  
public void clearp(){
 name();
    w1=0; w2=0;t=0;
    clear();
jButton1.setIcon(null);
jButton2.setIcon(null);
jButton3.setIcon(null);
jButton4.setIcon(null);
jButton5.setIcon(null);
jButton6.setIcon(null);
jButton7.setIcon(null);
jButton8.setIcon(null);
jButton9.setIcon(null);
y1.setIcon(null);
y2.setIcon(null);
y3.setIcon(null);
y4.setIcon(null);
x1.setIcon(null);
x2.setIcon(null);
x3.setIcon(null);
}


public void name(){
n1 = JOptionPane.showInputDialog("player 1 name :");

n2 = JOptionPane.showInputDialog("player 2 name :");

pp= JOptionPane.showInputDialog("Wining Score:");
ww=Integer.parseInt(pp);
}
       
public void turn(){
if(whose.equalsIgnoreCase("x")){
whose= "0";
x=n2;
}
else
{
    whose = "x";
    x=n1;
}
gg.setText("   "+x +"   turn\n\n\n");
gg.append(n1 + " win : " +w1+ "\n\n\n");
gg.append(n2 + " win : " +w2+ "\n\n\n");
gg.append("played  : " +t+ "\n\n");

}

public void clear(){
whose = "0";

jButton1.setText(null);
jButton2.setText(null);
jButton3.setText(null);
y1.setText(null);
jButton4.setText(null);
jButton5.setText(null);
jButton6.setText(null);
y2.setText(null);
jButton7.setText(null);
jButton8.setText(null);
jButton9.setText(null);
y3.setText(null);
y4.setText(null);
x1.setText(null);
x2.setText(null);
x3.setText(null);

jButton1.setEnabled(true);
jButton2.setEnabled(true);
jButton3.setEnabled(true);
y1.setEnabled(true);
jButton4.setEnabled(true);
jButton5.setEnabled(true);
jButton6.setEnabled(true);
y2.setEnabled(true);
jButton7.setEnabled(true);
jButton8.setEnabled(true);
jButton9.setEnabled(true);
y3.setEnabled(true);
y4.setEnabled(true);
x1.setEnabled(true);
x2.setEnabled(true);
x3.setEnabled(true);
}

    public void tie(){
    String p1 = jButton1.getText();
    String p2 = jButton2.getText();
    String p3 = jButton3.getText();
    String p4 = jButton4.getText();
    String p5 = jButton5.getText();
    String p6 = jButton6.getText();
    String p7 = jButton7.getText();
    String p8 = jButton8.getText();
    String p9 = jButton9.getText();  
    String p10 = y1.getText();
    String p11 = y2.getText();
    String p12 = y3.getText();
    String p13 = y4.getText();
    String p14 = x1.getText();
    String p15 = x2.getText();
    String p16 = x3.getText();
    
    
    if((p1=="x"|| p1=="0") && (p2=="x"|| p2=="0") && (p3=="x"|| p3=="0") && (p4=="x"|| p4=="0") && (p5=="x"|| p5=="0")
            &&(p6=="x"|| p6=="0") && (p7=="x"|| p7=="0") && (p8=="x"|| p8=="0") && (p9=="x"|| p9=="0")
            &&(p10=="x"|| p10=="0") && (p11=="x"|| p11=="0") && (p12=="x"|| p12=="0") && (p13=="x"|| p13=="0")
            && (p14=="x"|| p14=="0")&&(p15=="x"|| p15=="0") && (p16=="x"|| p16=="0") )
    {
 i1=0;
 i2=0;
 i3=0;
 i4=0;
 i5=0;
 i6=0;
 i7=0;
 i8=0;
i9=0;
i10=0;
i11=0;
i12=0;
i13=0;
i14=0;
i15=0;
i16=0;
i17=0;
 i18=0;
i19=0;
 i20=0;
 i21=0;
i22=0;
 i23=0;
 i24=0;

u1=1;
u2=1;
 u3=1;
 u4=1;
 u5=1;
 u6=1;
 u7=1;
 u8=1;
 u9=1;
 u10=1; u11=1;
u12=1;
 u13=1;
 u14=1;
 u15=1;
 u16=1;
 u17=1;
 u18=1;
u19=1; u20=1;
 u21=1;
 u22=1;
 u23=1; u24=1;
     JOptionPane.showMessageDialog(null,"new tic-tac-toe","Tie",JOptionPane.PLAIN_MESSAGE, c);
     clear();
     t++;
    }}

public void image(){
jButton1.setIcon(u);
jButton2.setIcon(u);
jButton3.setIcon(u);
jButton4.setIcon(u);
jButton5.setIcon(u);
jButton6.setIcon(u);
jButton7.setIcon(u);
jButton8.setIcon(u);
jButton9.setIcon(u);
y1.setIcon(u);
y2.setIcon(u);
y3.setIcon(u);
y4.setIcon(u);
x1.setIcon(u);
x2.setIcon(u);
x3.setIcon(u);

}    
    
public void finish(){
if(w1==ww){
    clear();
    image();
    JOptionPane.showMessageDialog(null,"Congratulation...!!! "+n1+" Win...Game Over..","win",JOptionPane.PLAIN_MESSAGE,o);
}
else if(w2==ww){
    clear();
    image();
    JOptionPane.showMessageDialog(null,"Congratulation...!!! "+n2+" Win...Game Over..","win",JOptionPane.PLAIN_MESSAGE,o);
}

}    
    
    
    
public void msg1(){
JOptionPane.showMessageDialog(null,"Congratulation...!!! "+n1+" Win","win",JOptionPane.PLAIN_MESSAGE,b);
//clear();
w1++;
}

public void msg2(){
JOptionPane.showMessageDialog(null,"Congratulation...!!! "+n2 +" Win","win",JOptionPane.PLAIN_MESSAGE,b);
//clear();
w2++;
}
        
public void win(){
    String p1 = jButton1.getText();
    String p2 = jButton2.getText();
    String p3 = jButton3.getText();
    String p4 = jButton4.getText();
    String p5 = jButton5.getText();
    String p6 = jButton6.getText();
    String p7 = jButton7.getText();
    String p8 = jButton8.getText();
    String p9 = jButton9.getText();
    String p10 = y1.getText();
    String p11 = y2.getText();
    String p12 = y3.getText();
    String p13 = y4.getText();
    String p14 = x1.getText();
    String p15 = x2.getText();
    String p16 = x3.getText();
    
    
    if(p1=="x" && p2=="x" && p3=="x")
    { while(i1==0){        
      msg1();
      i1++;
    }}
    
   if(p4=="x" && p5=="x" && p6=="x")
     { while(i2==0){        
      msg1();
      i2++;
    }}
    
    if(p7=="x" && p8=="x" && p9=="x")
      { while(i3==0){        
      msg1();
      i3++;
    }}
   
   if(p1=="x" && p4=="x" && p7=="x")
     { while(i4==0){        
      msg1();
      i4++;
    }}
    
    if(p2=="x" && p5=="x" && p8=="x")
     { while(i5==0){        
      msg1();
      i5++;
    }}
    if(p3=="x" && p6=="x" && p9=="x")
      { while(i6==0){        
      msg1();
      i6++;
    }}
   
     if(p1=="x" && p5=="x" && p9=="x")
     { while(i7==0){        
      msg1();
      i7++;
    }}
   
   if(p3=="x" && p5=="x" && p7=="x")
     { while(i8==0){        
      msg1();
      i8++;
    }}
     
   if(p10=="x" && p2=="x" && p3=="x")
    { while(i9==0){        
      msg1();
      i9++;
    }}
    
      if(p10=="x" && p11=="x" && p12=="x")
    { while(i10==0){        
      msg1();
      i10++;
    }}
      
       if(p10=="x" && p6=="x" && p8=="x")
   { while(i11==0){        
      msg1();
      i11++;
    }}
       
    if(p11=="x" && p5=="x" && p6=="x")
    { while(i12==0){        
      msg1();
      i12++;
    }}
       
     if(p11=="x" && p12=="x" && p13=="x")
   { while(i13==0){        
      msg1();
      i13++;
    }}
      
   if(p11=="x" && p9=="x" && p15=="x")
   { while(i14==0){        
      msg1();
      i14++;
    }}
       
   if(p8=="x" && p9=="x" && p12=="x")
   { while(i15==0){        
      msg1();
      i15++;
    }}
       
     if(p12=="x" && p6=="x" && p2=="x")
    { while(i16==0){        
      msg1();
      i16++;
    }}
      
    if(p13=="x" && p16=="x" && p15=="x")
  { while(i17==0){        
      msg1();
      i17++;
    }}
      
    if(p13=="x" && p5=="x" && p9=="x")
   { while(i18==0){        
      msg1();
      i18++;
    }} 
       
     if(p16=="x" && p9=="x" && p6=="x")
     { while(i19==0){        
      msg1();
      i19++;
    }}
       
    if(p16=="x" && p15=="x" && p14=="x")
    { while(i20==0){        
      msg1();
      i20++;
    }}
      
    if(p4=="x" && p8=="x" && p16=="x")
    { while(i21==0){        
      msg1();
      i21++;
    }}
      
     if(p5=="x" && p8=="x" && p15=="x")
    { while(i22==0){        
      msg1();
      i22++;
    }}
       
     if(p14=="x" && p7=="x" && p4=="x")
    { while(i23==0){        
      msg1();
      i23++;
    }}   
       
     if(p14=="x" && p6=="x" && p8=="x")
    { while(i24==0){        
      msg1();
      i24++;
    }}  
       
    if(p1=="0" && p2=="0" && p3=="0")
     { while(u1==1){        
      msg2();
      u1++;
    }}
    
   if(p4=="0" && p5=="0" && p6=="0")
     { while(u2==1){        
      msg2();
      u2++;
    }}
    
   if(p7=="0" && p8=="0" && p9=="0")
    { while(u3==1){        
      msg2();
      u3++;
    }}
    
   if(p1=="0" && p4=="0" && p7=="0")
    { while(u4==1){        
      msg2();
      u4++;
    }}
    
  if(p2=="0" && p5=="0" && p8=="0")
   { while(u5==1){        
      msg2();
      u5++;
    }}
    
    if(p3=="0" && p6=="0" && p9=="0")
    { while(u6==1){        
      msg2();
      u6++;
    }}
   
   if(p1=="0" && p5=="0" && p9=="0")
    { while(u7==1){        
      msg2();
      u7++;
    }}
    
    if(p3=="0" && p5=="0" && p7=="0")
    { while(u8==1){        
      msg2();
      u8++;
    }}
       
    if(p10=="0" && p2=="0" && p3=="0")
     { while(u9==1){        
      msg2();
      u9++;
    }}
      
    if(p10=="0" && p11=="0" && p12=="0")
     { while(u10==1){        
      msg2();
      u10++;
    }}
      
   if(p10=="0" && p6=="0" && p8=="0")
   { while(u11==1){        
      msg2();
      u11++;
    }}
       
    if(p11=="0" && p5=="0" && p6=="0")
     { while(u12==1){        
      msg2();
      u12++;
    }}
      
   if(p11=="0" && p12=="0" && p13=="0")
   { while(u13==1){        
      msg2();
      u13++;
    }}
       
    if(p11=="0" && p9=="0" && p15=="0")
   { while(u14==0){        
      msg2();
      u14++;
    }}
       
     if(p8=="0" && p9=="0" && p12=="0")
   { while(u15==1){        
      msg2();
      u15++;
    }}
      
    if(p12=="0" && p6=="0" && p2=="0")
     { while(u16==1){        
      msg2();
      u16++;
    }}
      
    else if(p13=="0" && p16=="0" && p15=="0")
    { while(u17==1){        
      msg2();
      u17++;
    }}
      
     if(p13=="0" && p5=="0" && p9=="0")
   { while(u18==1){        
      msg2();
      u18++;
    }}
       
    if(p16=="0" && p9=="0" && p6=="0")
   { while(u19==1){        
      msg2();
      u19++;
    }}
      
    if(p16=="0" && p15=="0" && p14=="0")
    { while(u20==1){        
      msg2();
      u20++;
    }}
       
    if(p4=="0" && p8=="0" && p16=="0")
    { while(u21==1){        
      msg2();
      u21++;
    }}  
       
   if(p5=="0" && p8=="0" && p15=="0")
     { while(u22==1){        
      msg2();
      u22++;
    }}
       
       
     if(p14=="0" && p7=="0" && p4=="0")
    { while(u23==1){        
      msg2();
      u23++;
    }}  
       
     if(p14=="0" && p6=="0" && p8=="0")
     { while(u24==1){        
      msg2();
      u24++;
    }}
     } 
      
      
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gg = new javax.swing.JTextArea();
        tt = new javax.swing.JButton();
        g = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        y1 = new javax.swing.JButton();
        p5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        p6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        p7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        p8 = new javax.swing.JPanel();
        y2 = new javax.swing.JButton();
        p9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        p10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        p11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        p12 = new javax.swing.JPanel();
        y3 = new javax.swing.JButton();
        p13 = new javax.swing.JPanel();
        x1 = new javax.swing.JButton();
        p14 = new javax.swing.JPanel();
        x2 = new javax.swing.JButton();
        p15 = new javax.swing.JPanel();
        x3 = new javax.swing.JButton();
        p16 = new javax.swing.JPanel();
        y4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New game");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        gg.setBackground(new java.awt.Color(0, 204, 255));
        gg.setColumns(11);
        gg.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        gg.setRows(8);
        jPanel1.add(gg, java.awt.BorderLayout.LINE_END);

        tt.setBackground(new java.awt.Color(204, 0, 204));
        tt.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        tt.setForeground(new java.awt.Color(255, 255, 255));
        tt.setText("NR tic tac toe game");
        tt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ttMouseDragged(evt);
            }
        });
        tt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ttMousePressed(evt);
            }
        });
        tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttActionPerformed(evt);
            }
        });
        jPanel1.add(tt, java.awt.BorderLayout.PAGE_START);

        g.setBackground(new java.awt.Color(0, 102, 153));
        g.setLayout(new java.awt.GridLayout(4, 4, 1, 1));

        p1.setBackground(new java.awt.Color(51, 255, 0));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        p1.add(jButton1, java.awt.BorderLayout.CENTER);

        g.add(p1);

        p2.setBackground(new java.awt.Color(51, 255, 0));
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p2.add(jButton2, java.awt.BorderLayout.CENTER);

        g.add(p2);

        p3.setBackground(new java.awt.Color(51, 255, 0));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(new java.awt.Color(102, 255, 255));
        jButton3.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        p3.add(jButton3, java.awt.BorderLayout.CENTER);

        g.add(p3);

        p4.setBackground(new java.awt.Color(51, 255, 0));
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.setLayout(new java.awt.BorderLayout());

        y1.setBackground(new java.awt.Color(102, 255, 255));
        y1.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });
        p4.add(y1, java.awt.BorderLayout.CENTER);

        g.add(p4);

        p5.setBackground(new java.awt.Color(51, 255, 0));
        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p5.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        p5.add(jButton4, java.awt.BorderLayout.CENTER);

        g.add(p5);

        p6.setBackground(new java.awt.Color(51, 255, 0));
        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p6.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(102, 255, 255));
        jButton5.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        p6.add(jButton5, java.awt.BorderLayout.CENTER);

        g.add(p6);

        p7.setBackground(new java.awt.Color(51, 255, 0));
        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p7.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(new java.awt.Color(102, 255, 255));
        jButton6.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        p7.add(jButton6, java.awt.BorderLayout.CENTER);

        g.add(p7);

        p8.setBackground(new java.awt.Color(51, 255, 0));
        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p8.setLayout(new java.awt.BorderLayout());

        y2.setBackground(new java.awt.Color(102, 255, 255));
        y2.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y2ActionPerformed(evt);
            }
        });
        p8.add(y2, java.awt.BorderLayout.CENTER);

        g.add(p8);

        p9.setBackground(new java.awt.Color(51, 255, 0));
        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p9.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(102, 255, 255));
        jButton7.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        p9.add(jButton7, java.awt.BorderLayout.CENTER);

        g.add(p9);

        p10.setBackground(new java.awt.Color(51, 255, 0));
        p10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p10.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(new java.awt.Color(102, 255, 255));
        jButton8.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        p10.add(jButton8, java.awt.BorderLayout.CENTER);

        g.add(p10);

        p11.setBackground(new java.awt.Color(51, 255, 0));
        p11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p11.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(new java.awt.Color(102, 255, 255));
        jButton9.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        p11.add(jButton9, java.awt.BorderLayout.CENTER);

        g.add(p11);

        p12.setBackground(new java.awt.Color(51, 255, 0));
        p12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p12.setLayout(new java.awt.BorderLayout());

        y3.setBackground(new java.awt.Color(102, 255, 255));
        y3.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y3ActionPerformed(evt);
            }
        });
        p12.add(y3, java.awt.BorderLayout.CENTER);

        g.add(p12);

        p13.setBackground(new java.awt.Color(51, 255, 0));
        p13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p13.setLayout(new java.awt.BorderLayout());

        x1.setBackground(new java.awt.Color(102, 255, 255));
        x1.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        p13.add(x1, java.awt.BorderLayout.CENTER);

        g.add(p13);

        p14.setBackground(new java.awt.Color(51, 255, 0));
        p14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p14.setLayout(new java.awt.BorderLayout());

        x2.setBackground(new java.awt.Color(102, 255, 255));
        x2.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });
        p14.add(x2, java.awt.BorderLayout.CENTER);

        g.add(p14);

        p15.setBackground(new java.awt.Color(51, 255, 0));
        p15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p15.setLayout(new java.awt.BorderLayout());

        x3.setBackground(new java.awt.Color(102, 255, 255));
        x3.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });
        p15.add(x3, java.awt.BorderLayout.CENTER);

        g.add(p15);

        p16.setBackground(new java.awt.Color(51, 255, 0));
        p16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p16.setLayout(new java.awt.BorderLayout());

        y4.setBackground(new java.awt.Color(102, 255, 255));
        y4.setFont(new java.awt.Font("Viner Hand ITC", 1, 90)); // NOI18N
        y4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y4ActionPerformed(evt);
            }
        });
        p16.add(y4, java.awt.BorderLayout.CENTER);

        g.add(p16);

        jPanel1.add(g, java.awt.BorderLayout.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg06_tic_tac_/game/images-5.jpeg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           turn();
        jButton1.setText(whose);
       jButton1.setEnabled(false);
      
       if(whose.equalsIgnoreCase("x")) 
       {
       jButton1.setForeground(Color.red);
       }
       else{
       jButton1.setForeground(Color.BLUE);}
         win();
     
        tie();
  
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             turn(); 
        jButton2.setText(whose);
           jButton2.setEnabled(false);
           
       if(whose.equalsIgnoreCase("x")) 
       {
       jButton2.setForeground(Color.red);
       }
       else{
       jButton2.setForeground(Color.BLUE);}
         win();
          tie();
     
       finish();
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             turn();  
        jButton3.setText(whose);
            jButton3.setEnabled(false);
            
       if(whose.equalsIgnoreCase("x")) 
       {
       jButton3.setForeground(Color.red);
       }
       else{
       jButton3.setForeground(Color.BLUE);}
           win();
        tie();
     
    finish();
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
             turn(); 
        y1.setText(whose);
           y1.setEnabled(false);
           
         if(whose.equalsIgnoreCase("x")) 
       {
       y1.setForeground(Color.red);
       }
         else{
       y1.setForeground(Color.BLUE);}
        win();
        tie();  
     
      finish();
       
    }//GEN-LAST:event_y1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         turn();  
        jButton4.setText(whose);
            jButton4.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       jButton4.setForeground(Color.red);
       }
          else{
       jButton4.setForeground(Color.BLUE);
          }win();
   
        tie();   
      
     finish();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
             turn(); 
        jButton5.setText(whose);
            jButton5.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       jButton5.setForeground(Color.red);
       }
          else{
       jButton5.setForeground(Color.BLUE);
          }win();
           tie();
  
     finish();
     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         turn(); 
        jButton6.setText(whose);
            jButton6.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       jButton6.setForeground(Color.red);
       }
          else{
       jButton6.setForeground(Color.BLUE);
          }win();
           tie();
      
     finish();
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y2ActionPerformed
            turn();
        y2.setText(whose);
            y2.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       y2.setForeground(Color.red);
       }
          else{
       y2.setForeground(Color.BLUE);
          }win();
           tie();
   
      finish();
      
    }//GEN-LAST:event_y2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            turn(); 
        jButton7.setText(whose);
            jButton7.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       jButton7.setForeground(Color.red);
       }
          else{
       jButton7.setForeground(Color.BLUE);
          }     
       win();
           tie();
   
    finish();
  
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ttMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation(x-l, y-m);
    }//GEN-LAST:event_ttMouseDragged

    private void ttMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttMousePressed
       l= evt.getX();
       m= evt.getY();
    }//GEN-LAST:event_ttMousePressed

    private void ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttActionPerformed
     
    }//GEN-LAST:event_ttActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        clearp();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
          turn();
        jButton8.setText(whose);
            jButton8.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       jButton8.setForeground(Color.red);
       }
       else
          {   jButton8.setForeground(Color.BLUE);
    }
    win();
           tie();
       finish();        
    
     
     
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
           turn(); 
        jButton9.setText(whose);
            jButton9.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       jButton9.setForeground(Color.red);
       }
       else
          {  jButton9.setForeground(Color.BLUE);
    }   
          win();
      
           tie();
         finish();   
    
    }//GEN-LAST:event_jButton9ActionPerformed

    private void y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y3ActionPerformed
             turn();  
        y3.setText(whose);
            y3.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       y3.setForeground(Color.red);
       }
          else{
       y3.setForeground(Color.BLUE);
          }win();
           tie();
      
      finish();
  
    }//GEN-LAST:event_y3ActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
          turn(); 
        x1.setText(whose);
            x1.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       x1.setForeground(Color.red);
       }
          else{
       x1.setForeground(Color.BLUE);
    }
       win();
       tie();
     
     finish();
     
    }//GEN-LAST:event_x1ActionPerformed

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
          turn();  
        x2.setText(whose);
            x2.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       x2.setForeground(Color.red);
       }
       else
          {x2.setForeground(Color.BLUE);
          } 
          win(); 
            tie();
          
     finish();
     
    }//GEN-LAST:event_x2ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
         turn(); 
        x3.setText(whose);
           x3.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       x3.setForeground(Color.red);
       }
          else{
       x3.setForeground(Color.BLUE);
          }
           win(); 
           tie();
          
     finish();   
     
    }//GEN-LAST:event_x3ActionPerformed

    private void y4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y4ActionPerformed
        turn(); 
        y4.setText(whose);
            y4.setEnabled(false);
            
          if(whose.equalsIgnoreCase("x")) 
       {
       y4.setForeground(Color.red);
       }
          else{
       y4.setForeground(Color.BLUE);}
           
           win();
           tie();
           
      finish(); 
      
    }//GEN-LAST:event_y4ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel g;
    private javax.swing.JTextArea gg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p10;
    private javax.swing.JPanel p11;
    private javax.swing.JPanel p12;
    private javax.swing.JPanel p13;
    private javax.swing.JPanel p14;
    private javax.swing.JPanel p15;
    private javax.swing.JPanel p16;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JButton tt;
    private javax.swing.JButton x1;
    private javax.swing.JButton x2;
    private javax.swing.JButton x3;
    private javax.swing.JButton y1;
    private javax.swing.JButton y2;
    private javax.swing.JButton y3;
    private javax.swing.JButton y4;
    // End of variables declaration//GEN-END:variables
}
