package src.view;

import javax.swing.*;

/**
* Classe que exibe um pop-up para obter o endereço IP para conexão.
*/
public class Popupconnect {

    /**
    * Exibe um pop-up para obter o endereço IP para conexão.
    *
    * @return O endereço IP inserido pelo usuário ou null se o pop-up for cancelado.
    */
    public static String showPopUp() {
        JTextField textField = new JTextField(10);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite o valor de IP para conectar:"));
        panel.add(textField);

        int result = JOptionPane.showConfirmDialog(null, panel, "IPConnect", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return textField.getText();
        }
        return null;
    }
}