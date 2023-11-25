package src.view;

import javax.swing.*;

public class Popupconnect {

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
