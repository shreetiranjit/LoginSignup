import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleInterest extends JFrame implements ActionListener{
    JLabel Principle;
    JLabel Time;
    JLabel Rate;
    JTextField entry1;
    JTextField entry2;
    JTextField entry3;
    JTextField entry4;
    JButton button1;

    public SimpleInterest(){
        setTitle("Simple Interest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 500, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        Principle = new JLabel("Enter the principle:");
        Principle.setBounds(10,100,150,30);
        add(Principle);

        Rate = new JLabel ("Enter the rate:");
        Rate.setBounds(10,150,200,30);
        add(Rate);

        Time = new JLabel ("Enter the time:");
        Time.setBounds(10,200,200,30);
        add(Time);

        entry1 = new JTextField("");
        entry1.setBounds(160,100,200,30);
        add(entry1);

        entry2 = new JTextField("");
        entry2.setBounds(180,150,200,30);
        add(entry2);

        entry3 = new JTextField("");
        entry3.setBounds(200,200,200,30);
        add(entry3);

        entry4 = new JTextField("");
        entry4.setBounds(200,250,200,30);
        entry4.setEditable(false);
        add(entry4);


        button1 = new JButton("Interest");
        button1.setBounds(20,250,150,30);
        add(button1);

        button1.addActionListener(this);

    }
    public static void main(String[] args) {
        new SimpleInterest().setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        double a = Double.parseDouble(entry1.getText());
        double b = Double.parseDouble(entry2.getText());
        double c = Double.parseDouble(entry3.getText());
        double d = 0 ;
        if (e.getSource().equals(button1)){
            d = (a*b*c)/100 ;
            entry4.setText(String.valueOf(d));
        }
        else {
            System.out.println("ERROR");
        }

    }
}
