package GUI;
import File.FileIO;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginPage extends JFrame implements ActionListener,MouseListener{

	JButton loginButton ;
	JButton registerButton;
	JTextField userField=new JTextField();
	JPasswordField passField=new JPasswordField();
	
	

    Font font20 = new Font("cambria",Font.BOLD,20);
	Font font25 = new Font("cambria",Font.BOLD,25);
	Font font30 = new Font("cambria",Font.BOLD,30);





	public LoginPage(){
		super("Login Page");
	
		JLabel userName=new JLabel("User Name");
		userName.setBounds(500,90,160,25);
		userName.setFont(font25);
			JLabel passID=new  JLabel("Password");

		passID.setBounds(500,190,160,25);
		passID.setFont(font25);
		

		
	


		 loginButton =new JButton("login");
		loginButton.setBounds(500,300,100,25);
		loginButton.addActionListener(this);
		loginButton.setFont(font25);
		loginButton.setBackground(Color.BLUE);
		loginButton.setForeground(Color.WHITE);
		loginButton.addMouseListener(this);
	
		
		
		registerButton=new JButton("register");
		registerButton.setBounds(650,300,140,25);
		registerButton.setFont(font25);
		registerButton.setBackground(new Color(200,200,150));
		registerButton.setForeground(Color.WHITE);
		registerButton.addActionListener(this);
		
		userField.setBounds(500,150,200,25);
		userField.setFont(font25);
		userField.setBackground(new Color(31,242,149));
		passField.setBounds(500,250,200,25);
		passField.setFont(font25);
		passField.setBackground(new Color(31,242,149));
		
		
		
		this.add(loginButton);
		this.add(registerButton);
	    this.add(userName);
		this.add(passID);
		this.add(userField);
		this.add(passField);
		 this.setTitle("Clothing Store Management System Login");
		 this.setSize(500,500);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.getContentPane().setBackground( Color.MAGENTA);
		
		
		
	
		
		
		
		this.setLayout(null);
		
		this.setVisible(true);
		 
		 
	}
	
		public void mouseEntered(MouseEvent e){
		if(e.getSource() == loginButton){
			loginButton.setBackground(Color.RED);
			loginButton.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent e){
		if(e.getSource() == loginButton){
			loginButton.setBackground(Color.BLUE);
			loginButton.setForeground(Color.WHITE);
		}
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	
	
	
	
	 public void actionPerformed(ActionEvent e) {
        String userName = userField.getText();
        String userPass = String.valueOf(passField.getPassword());

        if (e.getSource() == loginButton) {
            // Login logic
            if (FileIO.checkUser(userName, userPass)) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                ClothesApp cltapp = new ClothesApp();
				this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == registerButton) {
            // Registration logic
            if (userName.isEmpty() || userPass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (FileIO.registerUser(userName, userPass)) {
                    JOptionPane.showMessageDialog(this, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Registration Failed.", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
}
