package src.view;

import javax.swing.*;

public class PopupPorta {

	public static int showPopUp() {
        JTextField textField = new JTextField(10);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite o valor da Porta escolhida:"));
        panel.add(textField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Porta", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return Integer.parseInt(textField.getText());
        }
        return -1;
    }
}
