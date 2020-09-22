package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JTextField;


import bean.Cadastro_Cliente;

import connectionfactory.Conexao;
import dao.Cliente;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Pacientes extends JInternalFrame {
	private JTextField txtnome;
	private JTextField txttell;
	private JTextField txtcpf;
	private JTextField txtemail;
	private JTextField txtrg;
	private JTextField txtrua;
	private JTextField txtbairro;
	private JTextField txtcidade;
	private JTextField txtestado;
	private JTable table;
	private JTextField txtdata_nasc;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacientes frame = new Pacientes();
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
	
	
	
	
	 
	public Pacientes() {
		setClosable(true);
		
		setBounds(100, 100, 632, 597);
		getContentPane().setLayout(null);
        
		JLabel lblCadastroDePacientes = new JLabel("Cadastro de Pacientes:");
		lblCadastroDePacientes.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblCadastroDePacientes.setBounds(10, 22, 170, 22);
		getContentPane().add(lblCadastroDePacientes);

		
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(88, 90, 48, 14);
		getContentPane().add(lblNome);
		
		txtnome = new JTextField();
		txtnome.setBounds(127, 87, 334, 20);
		getContentPane().add(txtnome);
		txtnome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(76, 115, 48, 14);
		getContentPane().add(lblTelefone);
		
		txttell = new JTextField();
		txttell.setBounds(127, 112, 126, 20);
		getContentPane().add(txttell);
		txttell.setColumns(10);
		
		JLabel lblCpfcnpj = new JLabel("Cpf/Cnpj:");
		lblCpfcnpj.setBounds(76, 143, 48, 14);
		getContentPane().add(lblCpfcnpj);
		
		txtcpf = new JTextField();
		txtcpf.setBounds(127, 140, 198, 20);
		getContentPane().add(txtcpf);
		txtcpf.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(276, 115, 48, 14);
		getContentPane().add(lblEmail);
		
		txtemail = new JTextField();
		txtemail.setBounds(315, 112, 146, 20);
		getContentPane().add(txtemail);
		txtemail.setColumns(10);
		
		JLabel lblRg = new JLabel("Rg:");
		lblRg.setBounds(105, 168, 48, 14);
		getContentPane().add(lblRg);
		
		txtrg = new JTextField();
		txtrg.setBounds(127, 165, 126, 20);
		getContentPane().add(txtrg);
		txtrg.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(258, 168, 109, 14);
		getContentPane().add(lblDataDeNascimento);
		
		JLabel lblRuan = new JLabel("Rua/N:");
		lblRuan.setBounds(88, 196, 48, 14);
		getContentPane().add(lblRuan);
		
		txtrua = new JTextField();
		txtrua.setBounds(127, 193, 233, 20);
		getContentPane().add(txtrua);
		txtrua.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(88, 221, 48, 14);
		getContentPane().add(lblBairro);
		
		txtbairro = new JTextField();
		txtbairro.setBounds(126, 218, 199, 20);
		getContentPane().add(txtbairro);
		txtbairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(83, 248, 41, 14);
		getContentPane().add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(83, 273, 41, 14);
		getContentPane().add(lblEstado);
		
		txtcidade = new JTextField();
		txtcidade.setBounds(127, 243, 96, 20);
		getContentPane().add(txtcidade);
		txtcidade.setColumns(10);
		
		txtestado = new JTextField();
		txtestado.setBounds(127, 270, 96, 20);
		getContentPane().add(txtestado);
		txtestado.setColumns(10);
		
		table = new JTable();
    	table.setModel(new DefaultTableModel(
    		new Object[][]{},
    		//TITULOS DAS SUAS COLUNAS
    		new String []{"NOME","RG","CPF","DATA_NASC","TELL","RUA","BAIRRO","CIDADE","ESTADO","EMAIL"})     
	
    		{
    			public boolean isCellEditable(int r, int c)
    			{
    				return false;
    			}
    		} );
    	
    	//ALINHAMENTO DO TEXTO	
    	DefaultTableCellRenderer center = new DefaultTableCellRenderer();
    	center.setHorizontalAlignment(SwingConstants.CENTER);
    	
    	//DEFINE O TAMANHO DA LARGURA DA CULUNA
    	table.getColumnModel().getColumn(0).setPreferredWidth(50);
    	//NÃO PERMITE REDIMENCIONAMENTO
    	table.getColumnModel().getColumn(0).setResizable(false);
    	//CENTRALIZA O TEXTO
    	table.getColumnModel().getColumn(0).setCellRenderer(center);
    	
    	table.getColumnModel().getColumn(1).setPreferredWidth(250);
    	table.getColumnModel().getColumn(1).setResizable(false);
    	table.getColumnModel().getColumn(1).setCellRenderer(center);
    	table.getColumnModel().getColumn(2).setPreferredWidth(70);
    	table.getColumnModel().getColumn(2).setResizable(false);
    	table.getColumnModel().getColumn(2).setCellRenderer(center);
    	table.getColumnModel().getColumn(3).setPreferredWidth(150);
    	table.getColumnModel().getColumn(3).setResizable(false);
    	table.getColumnModel().getColumn(3).setCellRenderer(center);
    	table.getColumnModel().getColumn(4).setPreferredWidth(50);
    	table.getColumnModel().getColumn(4).setResizable(false);
    	table.getColumnModel().getColumn(4).setCellRenderer(center);
    	
    	//DEFINE A FONTE
    	table.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
    	//NÃO PERMITE A REORDENAÇÃO DAS COLUNAS
    	table.getTableHeader().setReorderingAllowed(false);
    	table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    	table.setSelectionMode(0);
    	
    	JScrollPane Scroll = new JScrollPane();
    	Scroll.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			
    			if(table.getSelectedRow() != -1) {
    				txtnome.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
    				txtrg.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
    				txtcpf.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
    				txtdata_nasc.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
    				txttell.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
    				txtrua.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
    				txtbairro.setText(table.getValueAt(table.getSelectedRow(), 6).toString());
    				txtcidade.setText(table.getValueAt(table.getSelectedRow(), 7).toString());
    				txtestado.setText(table.getValueAt(table.getSelectedRow(), 8).toString());
    				txtemail.setText(table.getValueAt(table.getSelectedRow(), 9).toString());
    			}
    			
    		}
    	});
    	Scroll.setViewportView(table);
    	Scroll.setBounds(10,365,600,200);
    	getContentPane().add(Scroll);
    	
    	
		
		JButton btnNovo = new JButton("NOVO");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnome.setText(null);
				txtrg.setText(null);
				txtcpf.setText(null);
				txtdata_nasc.setText(null);
				txttell.setText(null);
				txtrua.setText(null);
				txtbairro.setText(null);
				txtcidade.setText(null);
				txtestado.setText(null);
				txtemail.setText(null);
			}
		});
		btnNovo.setBounds(39, 329, 109, 23);
		getContentPane().add(btnNovo);
		
		JButton btnSalvar_1 = new JButton("SALVAR");
		btnSalvar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Cliente c_cliente = new Cadastro_Cliente();
				// populei o objeto aluno
				c_cliente.setNome(txtnome.getText());
				c_cliente.setRg(txtrg.getText());
				c_cliente.setCpf(txtcpf.getText());
				c_cliente.setData_nasc(txtdata_nasc.getText());
				c_cliente.setTell(txttell.getText());
				c_cliente.setRua(txtrua.getText());
				c_cliente.setBairro(txtbairro.getText());
				c_cliente.setCidade(txtcidade.getText());
				c_cliente.setEstado(txtestado.getText());
				c_cliente.setEmail(txtemail.getText());
				
				
				
				
				try {
					// chamar a classe Cliente
					Cliente cliente = new Cliente();
					cliente.salvar(c_cliente);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso");
					
					
					
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a.getMessage());
				}

				// ====================
				
				
				
				
				
				DefaultTableModel Dtm = (DefaultTableModel) table.getModel();
		    	Object [] dados = {txtnome.getText(),txtrg.getText(),txtcpf.getText(),txtdata_nasc.getText(),txttell.getText(),txtrua.getText(),txtbairro.getText(),txtcidade.getText(),txtestado.getText(),txtemail.getText()};
		    	Dtm.addRow(dados);
		    	
		    	
		    	
			}
		});
			

		btnSalvar_1.setBounds(181, 329, 109, 23);
		getContentPane().add(btnSalvar_1);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Cliente c_cliente = new Cadastro_Cliente();
				// populei o objeto aluno
				c_cliente.setNome(txtnome.getText());
				c_cliente.setRg(txtrg.getText());
				c_cliente.setCpf(txtcpf.getText());
				c_cliente.setData_nasc(txtdata_nasc.getText());
				c_cliente.setTell(txttell.getText());
				c_cliente.setRua(txtrua.getText());
				c_cliente.setBairro(txtbairro.getText());
				c_cliente.setCidade(txtcidade.getText());
				c_cliente.setEstado(txtestado.getText());
				c_cliente.setEmail(txtemail.getText());
				
				
				
				
				try {
					// chamar a classe Cliente
					Cliente cliente = new Cliente();
					cliente.atualizar(c_cliente);
					JOptionPane.showMessageDialog(null, "Alterado com sucesso");
					
					
					
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a.getMessage());
				}
				
				
				

				
				if(table.getSelectedRow() != -1 ) {
					
					table.setValueAt(txtnome.getText(), table.getSelectedRow(), 0);
					table.setValueAt(txtrg.getText(), table.getSelectedRow(), 1);
					table.setValueAt(txtcpf.getText(), table.getSelectedRow(), 2);
					table.setValueAt(txtdata_nasc.getText(), table.getSelectedRow(), 3);
					table.setValueAt(txttell.getText(), table.getSelectedRow(), 4);
					table.setValueAt(txtrua.getText(), table.getSelectedRow(), 5);
					table.setValueAt(txtbairro.getText(), table.getSelectedRow(), 6);
					table.setValueAt(txtcidade.getText(), table.getSelectedRow(), 7);
					table.setValueAt(txtestado.getText(), table.getSelectedRow(), 8);
					table.setValueAt(txtemail.getText(), table.getSelectedRow(), 9);
				}
			}
		});
		btnAlterar.setBounds(325, 329, 109, 23);
		getContentPane().add(btnAlterar);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() != -1) {
					
					DefaultTableModel dtm = (DefaultTableModel) table.getModel();
					dtm.removeRow(table.getSelectedRow());
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um campo para excluir.");
				}
			}
		});
		btnExcluir.setBounds(468, 329, 103, 23);
		getContentPane().add(btnExcluir);
		
		txtdata_nasc = new JTextField();
		txtdata_nasc.setColumns(10);
		txtdata_nasc.setBounds(365, 165, 96, 20);
		getContentPane().add(txtdata_nasc);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(TelaLogin.class.getResource("/img/fundo.png")));
		label.setBounds(0, -50, 635, 621);
		getContentPane().add(label);
		
		

	}
}
