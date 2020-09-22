package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.Funcionario;

import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Clinica extends JFrame  {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clinica frame = new Clinica();
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
	public Clinica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 712);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktop = new JDesktopPane();
		contentPane.add(desktop, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 851, 53);
		desktop.add(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		mnCadastros.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/registration.png")));
		menuBar.add(mnCadastros);
		
		JMenuItem mntmCliente = new JMenuItem("Pacientes");
		mntmCliente.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/Paciente.png")));
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pacientes p = new Pacientes();
				p.setVisible(true);
				desktop.add(p);
			}
		});
		
		
		mnCadastros.add(mntmCliente);
		
		JSeparator separator_1 = new JSeparator();
		mnCadastros.add(separator_1);
		
		
		JMenuItem mntmFornecedor = new JMenuItem("Funcionarios");
		mntmFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Funcionarios f = new Funcionarios();
				f.setVisible(true);
				desktop.add(f);
				
				
				
			}
		});
		mntmFornecedor.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/funcionario.png")));
		mnCadastros.add(mntmFornecedor);
		
		JSeparator separator_2 = new JSeparator();
		mnCadastros.add(separator_2);
		
		JMenuItem mntmFornecedores = new JMenuItem("Fornecedores");
		mntmFornecedores.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/fornecedores.png")));
		mnCadastros.add(mntmFornecedores);
		
		JMenu mnAgenda = new JMenu("Agenda");
		mnAgenda.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/notebook.png")));
		menuBar.add(mnAgenda);
		
		JMenu mnMaterias = new JMenu("Materias");
		mnMaterias.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/Equipamentos.png")));
		menuBar.add(mnMaterias);
		
		JMenu mnProcedimentos = new JMenu("Procedimentos");
		menuBar.add(mnProcedimentos);
		
		JMenu mnRelatrios = new JMenu("Relat\u00F3rios");
		menuBar.add(mnRelatrios);
	}
}
