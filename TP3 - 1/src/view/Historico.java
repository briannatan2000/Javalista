package view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controle.ControleDados;
public class Historico implements ListSelectionListener {
	private  static JFrame janela;
	private  static JLabel titulo;
	private  static ControleDados dados;
	private  static JList<String> historicoCompra;

	private static String[] nomesCompras;
	
	 




		public ControleDados historico (ControleDados d){
			dados = d;
			nomesCompras = new String[dados.getCompra().size()];
			for (int i=0; i<dados.getCompra().size();i++) {
				nomesCompras[i]= dados.getCompra().get(i).getNome();
			}
			
		
			historicoCompra = new JList<String>(nomesCompras);
			
			janela = new JFrame("Compras");
			titulo = new JLabel("Histórico de Compras");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			historicoCompra.setBounds(20, 50, 350, 120);
			historicoCompra.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			historicoCompra.setVisibleRowCount(10);
			


			janela.setLayout(null);

			janela.add(titulo);
			janela.add(historicoCompra);
		

			janela.setSize(400, 250);
			janela.setVisible(true);
			historicoCompra.addListSelectionListener(this);

			return dados;
	
}
		public void valueChanged(ListSelectionEvent e) {
			Object src = e.getSource();
			

			if(e.getValueIsAdjusting() && src == historicoCompra) {
				/* new TelaDetalhe().inserirEditar(2, dados, 
						 historicoCompra.getSelectedIndex()); */
				
				new tabelaCompra(dados, historicoCompra.getSelectedIndex());
				tabelaCompra gui = new tabelaCompra(dados, historicoCompra.getSelectedIndex());
				gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				gui.setSize(600, 200);
				gui.setVisible(true);
				gui.setTitle("Compra do dia");
				
			}
			janela.dispose();
		}
}


