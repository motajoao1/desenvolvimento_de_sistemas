package Telas;

import javax.swing.SwingUtilities;

public class Principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaLogin tela = new TelaLogin();
                tela.setVisible(true);
            }
        });
    }
}