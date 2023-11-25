package src.view;

import javax.swing.*;

public class Popupconnect {

    public static int showPopUp() {
        JTextField textField = new JTextField(10);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite o valor de IP para conectar:"));
        panel.add(textField);

        int result = JOptionPane.showConfirmDialog(null, panel, "IPConnect", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                return Integer.parseInt(textField.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return showPopUp(); // Chama novamente se não for um inteiro válido
            }
        }
        return -1; // Retorno caso o usuário cancele a operação
    }
}
