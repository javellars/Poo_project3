package src.main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import src.view.ChatServer;

public class Servidor {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Servidor");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JPanel panel = new JPanel();
	      LayoutManager layout = new FlowLayout();  
	      panel.setLayout(layout);    
	      final JLabel label = new JLabel();
	      label.setText("Esperando conexão do usuário...");
	      panel.add(label);
	      frame.getContentPane().add(panel, BorderLayout.CENTER);
	      frame.setSize(360, 100);      
	      frame.setLocationRelativeTo(null);  
	      frame.setVisible(true);
	      
	      ChatServer ser = new ChatServer(frame);
	      ser.setVisible(true);
	      ser.receberMensagem();
   }
}
