package src.view;
import javax.swing.*;

public class Popupconnect {

    public static class IPAndPort {
        private String IPConnect;
        private int PortaConnect;

        public IPAndPort(String IPConnect, int PortaConnect) {
            this.IPConnect = IPConnect;
            this.PortaConnect = PortaConnect;
        }

        public String getIPConnect() {
            return IPConnect;
        }

        public int getPortaConnect() {
            return PortaConnect;
        }
    }

    public static IPAndPort showPopUp() {
        JTextField IPField = new JTextField(10);
        JTextField portaField = new JTextField(10);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Digite o valor de IP:"));
        panel.add(IPField);
        panel.add(Box.createHorizontalStrut(15)); // Add spacing
        panel.add(new JLabel("Digite o valor da Porta:"));
        panel.add(portaField);

        int result = JOptionPane.showConfirmDialog(null, panel, "IP e Porta", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String IPConnect = IPField.getText();
            int PortaConnect;
            try {
                PortaConnect = Integer.parseInt(portaField.getText());
                return new IPAndPort(IPConnect, PortaConnect);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido para a porta.", "Erro", JOptionPane.ERROR_MESSAGE);
                return showPopUp(); 
            }
        }
        return null; 
    }
}
