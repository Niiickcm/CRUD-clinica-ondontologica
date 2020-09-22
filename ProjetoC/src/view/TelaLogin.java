package view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaLogin extends JFrame {
	
	
	

	private JPanel contentPane;
	private JTextField Login;
	private JPasswordField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblCasoPreciseDe = new JLabel("Login:");
		lblCasoPreciseDe.setBackground(new Color(0, 0, 0));
		lblCasoPreciseDe.setForeground(Color.WHITE);
		lblCasoPreciseDe.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblCasoPreciseDe.setBounds(103, 212, 74, 38);
		contentPane.add(lblCasoPreciseDe);
		
		JButton btnSair = new JButton("Entrar");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Login.getText().contentEquals("usuario") && Senha.getText().equals("123")) {
				Clinica c = new Clinica();
				 c.setVisible(true);
				}else JOptionPane.showInternalMessageDialog(null, "Senha Incorreta!");
				
			}
		});
		
		
		btnSair.setBounds(223, 319, 134, 32);
		contentPane.add(btnSair);
		
		JLabel lblLigueNoNosso = new JLabel("Senha:");
		lblLigueNoNosso.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblLigueNoNosso.setForeground(Color.WHITE);
		lblLigueNoNosso.setBounds(103, 261, 74, 57);
		contentPane.add(lblLigueNoNosso);
		
		Login = new JTextField();
		Login.setBounds(187, 221, 202, 29);
		contentPane.add(Login);
		Login.setColumns(10);
		
		Senha = new JPasswordField();
		Senha.setBounds(187, 279, 202, 29);
		contentPane.add(Senha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/fundo.png")));
		lblNewLabel.setBounds(-122, -39, 759, 458);
		contentPane.add(lblNewLabel);
	}
	
		public boolean checkLogin(String login, String senha) {
	    	return login.equals("usuario") && senha.equals("123");
		
	    
	    }
		
		
	}


