import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionGui extends JFrame {

    private JPanel panel;

    private JLabel l1;

    private JLabel l2;

    private JLabel l3;

    private JTextField t1;

    private JTextField t2;

    private JButton b1;

    public void initComponents(){
        panel.setLayout(null);
        l1.setBounds(50,50,100,20);
        t1.setBounds(170,50,100,20);
        l2.setBounds(50,100,100,20);
        t2.setBounds(170,100,100,20);
        b1.setBounds(100,150,100,40);
        l3.setBounds(50,200,200,20);
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(b1);
        panel.add(l3);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=  Integer.parseInt(t1.getText());
                int b=  Integer.parseInt(t2.getText());
                int c =a+b;
                l3.setText("Sum of " +a+" ans "+b+" is "+c);

            }
        });
    }

    public AdditionGui(){
        initComponents();
        setContentPane(panel);
        setSize(400,400);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new AdditionGui();
    }
}

