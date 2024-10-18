package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textaadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    int formno;

    Signup2(int formno){

        super ("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,20,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,30));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion  :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String Religion[] = {"Hindu","Muslim","Sikh","Christian","Others"};
        comboBox=new JComboBox(Religion);
        comboBox.setBackground(new Color(222,255,228));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[] = {"General","EWS","OBC(NCL)","SC/ST","Other"};
        comboBox2=new JComboBox(Category);
        comboBox2.setBackground(new Color(222,255,228));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income[] = {"Null","Less than 1.5Lac","Less than 2.5Lac","5Lac","Upto 10Lac","Above 10Lac"};
        comboBox3=new JComboBox(Income);
        comboBox3.setBackground(new Color(222,255,228));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String Educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others",};
        comboBox4=new JComboBox(Educational);
        comboBox4.setBackground(new Color(222,255,228));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String Occupation[] = {"Employeed","Government Employeed","Self-Employeed","Business","Student","Retired","Others"};
        comboBox5=new JComboBox(Occupation);
        comboBox5.setBackground(new Color(222,255,228));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN NUMBER :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,14));
        textPan.setBounds(350,370,320,30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,180,30);
        add(l9);

        textaadhar = new JTextField();
        textaadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textaadhar.setBounds(350,420,320,30);
        add(textaadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,470,180,30);
        add(l10);
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(460,470,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,520,180,30);
        add(l11);
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(350,520,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(460,520,100,30);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r3);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(650,10,150,30);
        add(l12);

        JLabel l13 = new JLabel(String.valueOf(formno));
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(740,10,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(222,255,228));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int formNo = formno;
        String Religion = (String) comboBox.getSelectedItem();
        String Category = (String) comboBox2.getSelectedItem() ;
        String Income = (String) comboBox3.getSelectedItem();
        String Educational = (String) comboBox4.getSelectedItem();
        String Occupation = (String) comboBox5.getSelectedItem() ;
        String textpan = textPan.getText();
        String textadhar = textaadhar.getText();
        String seniorcit = null;
        if(r1.isSelected()){
            seniorcit  = "Yes";
        } else if (r2.isSelected()) {
            seniorcit = "No";
        }

        String existingacc = null;
        if(r3.isSelected()){
            existingacc  = "Yes";
        } else if (r4.isSelected()) {
            existingacc = "No";
        }
        try{
            if(textPan.getText().equals("") || textaadhar.getText().equals("") ){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con1 c1 = new Con1();
                String q = "insert into signup2 values('"+formNo+"','"+Religion+"','"+Category+"','"+Income+"','"+Educational+"','"+Occupation+"','"+textpan+"','"+textadhar+"','"+seniorcit+"','"+existingacc+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);

            }
            if(next.isSelected()){
                new Signup3(formno);
            }

        }catch(Exception E){
            E.printStackTrace();

        }
}

    public static void main(String[] args) {
        new Signup2(0);
    }
}
