package src.main;
import src.view.ChatClient;
import src.view.ChatServer;
import src.view.Janela;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chat{
	public static void main(String[] args) {
		int result = JOptionPane.showConfirmDialog(null,"Você será o Servidor do Chat? (Caso for conectar em algum outro sevidor, esolha não)", "Escolha",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
        	servidor();
        }else if (result == JOptionPane.NO_OPTION){
        	cliente();
        }else {
            System.exit(0);
        }
   }
	
	private static void servidor() {    
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
      ser.ReciveMessage();
   }
	
	
	
	private static void cliente() {
		JFrame frameC = new JFrame("Chat");
		frameC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      JPanel panel = new JPanel();
	      LayoutManager layout = new FlowLayout();  
	      panel.setLayout(layout);    
	      final JLabel label = new JLabel();
	      label.setText("Digite o IP do Servidor: ");
	      JTextField ipTextField = new JTextField("", 20);
	      panel.add(label);
	      panel.add(ipTextField, BorderLayout.CENTER);
	      
	      JButton button = new JButton("Conectar!");
	      button.addActionListener(new ActionListener() {
	    	  @Override
	    	    public void actionPerformed(ActionEvent e) {
	    	       String ip = ipTextField.getText();
	    	       ChatClient c;
	    			try {
	    				c = new ChatClient(ip, frameC);
	    	           c.setVisible(true);
	    	           c.ReciveMessage();
	    			} catch (IOException e1) {
	    				// TODO Auto-generated catch block
	    				e1.printStackTrace();
	    			}
	    	    }
	      });

	      panel.add(button);
	      frameC.getContentPane().add(panel, BorderLayout.CENTER);
	      frameC.setSize(360, 100);      
	      frameC.setLocationRelativeTo(null);  
	      frameC.setVisible(true);
	}
}

                