package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
import modelo.Produto;

public class TelaDetalhe implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelQtd = new JLabel("Quantidade: ");
	private JTextField valorQtd;
	private JLabel labelUnid = new JLabel("Unidade: ");
	private JTextField valorUnid;
	private JLabel labelPreco = new JLabel("Pre�o: ");
	private JTextField valorPreco;
	private JLabel labelCat = new JLabel("Categoria: ");
	private JTextField valorCat;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, 
			TelaEditaveis p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Aluno";
		if (op == 3) s = "Detalhe de Aluno";
		

		janela = new JFrame(s);

		//Preenche dados com dados do aluno clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getProdutos().get(pos).getNome(), 200);
			valorQtd = new JTextField(String.valueOf(dados.getProdutos().get(pos).getQuantidade()),200);
			valorUnid = new JTextField(String.valueOf(dados.getProdutos().get(pos).getUnidade()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getProdutos().get(pos).getPreco()), 200);
			valorCat = new JTextField(String.valueOf(dados.getProdutos().get(pos).getCategoria()), 200);
				

		}  else { //N�o preenche com dados

			valorNome = new JTextField(200);
			valorQtd = new JTextField(200);
			valorUnid = new JTextField(200);
			valorPreco = new JTextField(200);
			valorCat = new JTextField(200);
			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelQtd.setBounds(30, 50, 150, 25);
		valorQtd.setBounds(180, 50, 180, 25);
		labelUnid.setBounds(30, 80, 150, 25);
		valorUnid.setBounds(180, 80, 180, 25);
		labelPreco.setBounds(30, 110, 150, 25);
		valorPreco.setBounds(180, 110, 180, 25);
		labelCat.setBounds(30, 140, 150, 25);
		valorCat.setBounds(180, 140, 150, 25);


		//Coloca os campos relacionados a endereco se aluno
		if (op == 1 || op == 3 ) {
			this.janela.add(labelQtd);
			this.janela.add(valorQtd);

		}

		//Coloca campos relacionados a valor hora/aula se professor


		//Coloca botoes de excluir e salvar
		if (op == 3) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelUnid);
		this.janela.add(valorUnid);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		this.janela.add(labelCat);
		this.janela.add(valorCat);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res=false;
				if(opcao == 1) //cadastro de novo aluno
					novoDado[0] = Integer.toString(dados.getProdutos().size());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorQtd.getText();
				novoDado[3] =  valorUnid.getText();
				novoDado[4] =  valorPreco.getText();
				novoDado[5] =  valorCat.getText();

				if (opcao == 1){
					
					
					Produto novoProduto = new Produto(dados.getProdutos().size()+1,novoDado[1],Integer.parseInt(novoDado[2]),novoDado[3],Double.parseDouble(novoDado[4]), novoDado[5]);
					dados.getProdutos().add(novoProduto);
					res = true;
				} 
				if (opcao == 3) {
					Produto novoProduto = new Produto(posicao,novoDado[1],Integer.parseInt(novoDado[2]),novoDado[3],Double.parseDouble(novoDado[4]), novoDado[5]);
					dados.getProdutos().set(posicao, novoProduto);
					res = true;
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui aluno
				dados.getProdutos().remove(posicao);
				res = false;
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
							
		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone n�o cont�m apenas n�meros", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno est� matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor est� respons�vel\n"
				+ "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}