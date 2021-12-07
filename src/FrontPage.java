import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FrontPage extends JFrame implements ActionListener {
    JButton login_Button;
    JButton signup_Button;
    JButton SimpleInterest_Button;

    public FrontPage(){
        setTitle("choose one");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        login_Button = new JButton("Login");
        login_Button.setBounds(120,100,150,30);
        login_Button.setBackground(Color.BLACK);
        login_Button.setBorder(null);
        add(login_Button);
        login_Button.addActionListener(this);

        signup_Button = new JButton("SignUp");
        signup_Button.setBounds(120,180,150,30);
        signup_Button.setBackground(Color.BLACK);
        signup_Button.setBorder(null);
        add(signup_Button);
        signup_Button.addActionListener(this);

        SimpleInterest_Button = new JButton("Simple Interest");
        SimpleInterest_Button.setBounds(120,250,150,30);
        SimpleInterest_Button.setBackground(Color.BLACK);
        SimpleInterest_Button.setBorder(null);
        add(SimpleInterest_Button);
        SimpleInterest_Button.addActionListener(this);


    }


    public static void main(String[] args) {
        new FrontPage().setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource().equals(login_Button)){
            dispose();
            new login().setVisible(true);
        }
        if (e.getSource().equals(signup_Button)){
            dispose();
            new sign().setVisible(true);
        }
        if (e.getSource().equals(SimpleInterest_Button)){
            dispose();
            new SimpleInterest().setVisible(true);
        }

    }
}