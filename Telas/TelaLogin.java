package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;

    public TelaLogin() {
        setTitle("🔐 Tela de Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setLayout(new GridLayout(3, 2, 10, 10)); 

        JLabel lblUsuario = new JLabel("Usuário:");
        txtUsuario = new JTextField();
        
        JLabel lblSenha = new JLabel("Senha:");
        txtSenha = new JPasswordField();
        
        btnEntrar = new JButton("Entrar");

        add(lblUsuario);
        add(txtUsuario);
        add(lblSenha);
        add(txtSenha);
        add(new JLabel("")); 
        add(btnEntrar);

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fazerLogin();
            }
        });
    }

    private void fazerLogin() {
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());

        if (usuario.equals("admin") && senha.equals("1234")) {
            TelaCadastroProduto telaCadastro = new TelaCadastroProduto();
            telaCadastro.setVisible(true);
            
            this.dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Usuário ou senha incorretos!", 
                    "Erro de Autenticação", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}