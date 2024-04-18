import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class adicionar_user {
    private JPanel painelPrincipal;

    public adicionar_user(JPanel painelPrincipal) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
    }
}
