import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class sign extends JFrame  implements ActionListener{
    JLabel title1;
    JLabel title2;
    JLabel username;
    JLabel email;
    JLabel password;
    JLabel confirm_password;
    JTextField username_entry;
    JTextField email_entry;
    JPasswordField password_entry;
    JPasswordField confirmpassword_entry;
    JButton login_button;
    JButton showpassword_button;

    public sign(){
        setTitle(" Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 500, 500);
        setLayout(null);
        setLocationRelativeTo(null);

        //Label
        title1 = new JLabel("WELCOME!!");
        title1.setFont(new Font("Serif", Font.BOLD, 23));
        title1.setForeground(Color.DARK_GRAY);
        title1.setBounds(170, 20,200,20);
        add(title1);

        title2 = new JLabel("Please fill up the boxes to create an account.");
        title2.setFont(new Font("Serif", Font.PLAIN, 20));
        title2.setForeground(Color.DARK_GRAY);
        title2.setBounds(120, 60,350,20);
        add(title2);

        username = new JLabel ("Enter Username");
        username.setFont(new Font("Serif", Font.PLAIN, 16));
        username.setBounds(100, 100, 200, 30);
        add(username);

        email = new JLabel ("Enter Email");
        email.setFont(new Font("Serif", Font.PLAIN, 16));
        email.setBounds(100, 160, 200, 30);
        add(email);

        password = new JLabel("Enter password");
        password.setFont(new Font("Serif", Font.PLAIN, 16));
        password.setBounds(100, 220,200,30);
        add(password);

        confirm_password = new JLabel("Confirm your password");
        confirm_password.setFont(new Font("Serif", Font.PLAIN, 16));
        confirm_password.setBounds(100, 280,200,30);
        add(confirm_password);

        //entry
        username_entry = new JTextField("");
        username_entry.setBounds(100,130,300,30);
        // username_entry.setText();
        username_entry.setFont(new Font ("Serif", Font.PLAIN ,20));
        // username_entry.setBorder(new EmptyBorder(10,10,10,10));
        LineBorder line = new LineBorder(Color.black, 2, true);
        username_entry.setBorder(line);
        username_entry.setBackground(Color.lightGray);
        add(username_entry, BorderLayout.CENTER);

        email_entry = new JTextField("");
        email_entry.setBounds(100,190,300,30);
        email_entry.setFont(new Font ("Serif", Font.PLAIN ,20));
        email_entry.setBorder(line);
        email_entry.setBackground(Color.lightGray);
        add(email_entry, BorderLayout.CENTER);

        password_entry = new JPasswordField("");
        password_entry.setBounds(100, 250,300,30);
        // password_entry.setBorder(new EmptyBorder(10,10,10,10));
        password_entry.setBorder(line);
        password_entry.setBackground(Color.lightGray);
        add(password_entry, BorderLayout.CENTER);

        confirmpassword_entry = new JPasswordField("");
        confirmpassword_entry.setBounds(100, 310,300,30);
        // password_entry.setBorder(new EmptyBorder(10,10,10,10));
        confirmpassword_entry.setBorder(line);
        confirmpassword_entry.setBackground(Color.lightGray);
        add(confirmpassword_entry, BorderLayout.CENTER);

        //button 
        login_button = new JButton("LogIn");
        login_button.setBounds(180, 350, 150,30);
        login_button.setBackground(Color.BLACK);
        add(login_button);
        login_button.addActionListener(this);

        showpassword_button = new JButton("S");
        showpassword_button.setBounds(400, 250, 60, 30);
        showpassword_button.setBackground(Color.BLACK);
        add(showpassword_button);

        showpassword_button.addActionListener(this);
        setVisible(true);

    }

    public static void main(String[] args) {
        new login();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource().equals(showpassword_button)){
            if(showpassword_button.getText()=="S"){
                password_entry.setEchoChar((char) 0);
                showpassword_button.setText("H");
            }else{
                showpassword_button.setText("S");
                password_entry.setEchoChar('*');
            }
        }
        if (e.getSource().equals(login_button)){
            JOptionPane username;
            username =  new JOptionPane();
            JOptionPane.showMessageDialog(username, username_entry.getText());
            // dispose();
        }
    }
}