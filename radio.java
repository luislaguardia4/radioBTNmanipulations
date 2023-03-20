package manipulation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class radio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel earlPass;
	private JLabel luisPass;
	private JLabel jmPass;
	private JLabel kenFail;
	private JLabel tashFail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radio frame = new radio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public radio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton ken = new JRadioButton("Kent Faulve");
		ken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ken.isSelected()){
					kenFail.setText("Failed");
				}
				if (!ken.isSelected()){
					kenFail.setText(null);
				}
			}
		});
		ken.setBounds(66, 96, 94, 21);
		contentPane.add(ken);
		
		JRadioButton luis = new JRadioButton("Luis Laguardia");
		luis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (luis.isSelected()){
					luisPass.setText("Passed");
				}
				if (!luis.isSelected()){
					luisPass.setText(null);
				}
			}
		});
		luis.setBounds(66, 119, 122, 21);
		contentPane.add(luis);
		
		JRadioButton jm = new JRadioButton("Jeremie Molina");
		jm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (jm.isSelected()){
					jmPass.setText("Passed");
				}
				if (!jm.isSelected()){
					jmPass.setText(null);
				}
			}
		});
		jm.setBounds(66, 142, 122, 21);
		contentPane.add(jm);
		
		JRadioButton tash = new JRadioButton("Tash Bequio");
		tash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tash.isSelected()){
					tashFail.setText("Failed");
				}
				if (!tash.isSelected()){
					tashFail.setText(null);
				}
			}
		});
		tash.setBounds(66, 165, 103, 21);
		contentPane.add(tash);
		
		JRadioButton earl = new JRadioButton("Earl Gamboa");
		earl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (earl.isSelected()){
					earlPass.setText("Passed");
				}
				if (!earl.isSelected()) {
					earlPass.setText(null);
				}
			}
		});
		earl.setBounds(66, 73, 103, 21);
		contentPane.add(earl);
		
		earlPass = new JLabel("");
		earlPass.setForeground(new Color(255, 0, 0));
		earlPass.setBounds(197, 77, 45, 13);
		contentPane.add(earlPass);
		
		kenFail = new JLabel("");
		kenFail.setForeground(new Color(255, 0, 0));
		kenFail.setBounds(197, 100, 45, 13);
		contentPane.add(kenFail);
		
		luisPass = new JLabel("");
		luisPass.setForeground(new Color(255, 0, 0));
		luisPass.setBounds(197, 123, 45, 13);
		contentPane.add(luisPass);
		
		jmPass = new JLabel("");
		jmPass.setForeground(new Color(255, 0, 0));
		jmPass.setBounds(197, 146, 45, 13);
		contentPane.add(jmPass);
		
		tashFail = new JLabel("");
		tashFail.setForeground(new Color(255, 0, 0));
		tashFail.setBounds(197, 169, 45, 13);
		contentPane.add(tashFail);
		
		JButton submit = new JButton("submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (luis.isSelected() || jm.isSelected() || earl.isSelected()){
					JOptionPane.showMessageDialog(earl, "luis, jm, and earl passed");
				}else if (!earl.isSelected() && !luis.isSelected() && !earl.isSelected()) {
					JOptionPane.showMessageDialog(submit, "please select the one who passed");
				}else if (earl.isSelected()) {
					JOptionPane.showMessageDialog(earl, "please select the one who passed");
				}else if (luis.isSelected()) {
					JOptionPane.showMessageDialog(luis, "please select the one who passed");
				}else if (ken.isSelected()) {
					JOptionPane.showMessageDialog(ken, "please select the one who passed");
				}else if (tash.isSelected()) {
					JOptionPane.showMessageDialog(tash, "please select the one who passed");
				}else if (jm.isSelected()) {
					JOptionPane.showMessageDialog(jm, "please select the one who passed");
				}else {
					JOptionPane.showMessageDialog(submit,"please select the one who passed");
				}
			
					
			}
		});
		submit.setBounds(230, 119, 85, 21);
		contentPane.add(submit);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main back = new main();
				back.setVisible(true);
			}
		});
		btnNewButton.setBounds(89, 302, 85, 21);
		contentPane.add(btnNewButton);
	}
}
