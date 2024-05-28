package radioo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class main extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JButton btnLogin;

	public main(JFrame frame) {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(80, 116, 68, 13);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(65, 213, 76, 13);
		add(lblNewLabel_1);
		
		txtUser = new JTextField();
		txtUser.setBounds(158, 113, 95, 19);
		add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(151, 210, 102, 19);
		add(txtPass);
		
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtUser.getText();
				String pass = new String(txtPass.getPassword());
				
				if (user.equals("laguardia") && pass.equals("luis123")) {
					radio window1 = new radio();
					window1.setVisible(true);
					frame.dispose();
				} else {
					// Optional: Show an error message
					JLabel lblError = new JLabel("Invalid username or password.");
					lblError.setBounds(120, 250, 200, 13);
					add(lblError);
					revalidate();
					repaint();
				}
			}
		});
		btnLogin.setBounds(200, 150, 85, 21);
		add(btnLogin);
	}
}
