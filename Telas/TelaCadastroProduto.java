package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroProduto extends JFrame {
    
    private JTextField txtNome;
    private JTextField txtPreco;
    private JButton btnCadastrar, btnLimpar, btnVoltar;

    public TelaCadastroProduto() {
        setTitle("📦 Cadastro de Produto");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); 

        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(new GridLayout(2, 2, 10, 10));
        painelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); 

        painelFormulario.add(new JLabel("Nome do Produto:"));
        txtNome = new JTextField();
        painelFormulario.add(txtNome);

        painelFormulario.add(new JLabel("Preço (R$):"));
        txtPreco = new JTextField();
        painelFormulario.add(txtPreco);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());

        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");
        btnVoltar = new JButton("Voltar");

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnVoltar);

        add(painelFormulario, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarProduto();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtPreco.setText("");
                txtNome.requestFocus(); 
            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaLogin telaLogin = new TelaLogin();
                telaLogin.setVisible(true);
                dispose();
            }
        });
    }

    private void cadastrarProduto() {
        String nome = txtNome.getText();
        String preco = txtPreco.getText();

        if (nome.isEmpty() || preco.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Por favor, preencha todos os campos.", 
                    "Aviso", 
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, 
                "Produto cadastrado com sucesso!\n\nNome: " + nome + "\nPreço: R$ " + preco, 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
        
        txtNome.setText("");
        txtPreco.setText("");
    }
}