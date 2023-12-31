 
package src.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Janela extends JFrame implements ActionListener {

    // declarações
    private JMenuBar menuBar;
    private JMenu ajudaMenu;
    private JMenu arquivoMenu;
    private JMenuItem sobreItem;
    private JMenuItem ajudaItem;
    private JMenuItem conectarItem;
    private JMenuItem sairItem;
    private JButton enviarButton;
    private JTextField mensagemTextField;
    private JTextArea areaDeChat;
    private JLabel statusConexaoLabel;

    // Construtor

    public Janela() {
        setTitle("ChatGUI-Grupo 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(new BorderLayout());

        menuSetup();
        componentesSetup();
        acaoSetup();
        
    }
    
    private void mostrarTelaMensagem(TelaMensagem tela) {
    	tela.setVisible(true);
    }
    
    public void menuSetup(){
     
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        arquivoMenu = new JMenu("Arquivo");
        menuBar.add(arquivoMenu);
        conectarItem = new JMenuItem("Conectar");
        arquivoMenu.add(conectarItem);
        sairItem = new JMenuItem("Sair");
        arquivoMenu.add(sairItem);

        ajudaMenu = new JMenu("Ajuda");
        menuBar.add(ajudaMenu);
        sobreItem = new JMenuItem("Sobre");
        ajudaMenu.add(sobreItem);
        ajudaItem = new JMenuItem("Ajuda");
        ajudaMenu.add(ajudaItem);
    }

    public void componentesSetup(){
        // Display chat
        areaDeChat = new JTextArea();
        areaDeChat.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaDeChat);
        scrollPane.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(50, 50, 30, 50),BorderFactory.createLineBorder(Color.black)));
        add(scrollPane, BorderLayout.CENTER);

        // Area sul(status+mensagem+botão))
        JPanel areaSul = new JPanel();
        areaSul.setLayout(new BorderLayout());
        add(areaSul, BorderLayout.SOUTH);

        JPanel areaMensagemPanel = new JPanel();
        areaMensagemPanel.setLayout(new BorderLayout());
        areaMensagemPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        areaSul.add(areaMensagemPanel, BorderLayout.CENTER);

        // Campo de Texto
        mensagemTextField = new JTextField();
        areaMensagemPanel.add(mensagemTextField, BorderLayout.CENTER);

        // Botao Enviar
        enviarButton = new JButton("Enviar");
        areaMensagemPanel.add(enviarButton, BorderLayout.EAST);

        statusConexaoLabel = new JLabel("Status de conexão:");
        statusConexaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusConexaoLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        areaSul.add(statusConexaoLabel, BorderLayout.SOUTH);
    }

    public void acaoSetup() {
        // Eventos
        enviarButton.addActionListener(this);
        sobreItem.addActionListener(this);
        ajudaItem.addActionListener(this);
        conectarItem.addActionListener(this);
        sairItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ações
        //JOptionOane.showMessageDialog(this, evento.getActionCommand(), "Ação Solicitada", JOptionPane.INFORMATION_MESSAGE);

        if (e.getSource() == sobreItem) {
            mostrarTelaMensagem(new TelaMensagem(this, "Sobre - " + ConstantesGlobais.versao, ConstantesGlobais.getTextoSobre(), true));
            System.out.println("Clicou em sobre");
        } else if (e.getSource() == ajudaItem) {
            mostrarTelaMensagem(new TelaMensagem(this, "Ajuda - " + ConstantesGlobais.tituloajuda, ConstantesGlobais.getTextoAjuda(), false));
            System.out.println("Clicou em ajuda");
        } else if (e.getSource() == conectarItem) {
            System.out.println("Clicou em conectar");
        } else if (e.getSource() == sairItem) {
            System.exit(0);
        } else if (e.getSource() == enviarButton) {
            String mensagem = mensagemTextField.getText();
            if (!mensagem.isEmpty()) {
                areaDeChat.append("Você: " + mensagem + "\n");
                mensagemTextField.setText("");
            }
        }
    }

   


}


/*
 "Grupo:");
"Laís Azevedo Soares 173455");
"Jullia Souza De Avelar 214539");
"Clara Luiza De Andrade Klippel 234458");
"Victor Ferreira Da Silva 177950");
"Felipe Lemos Ferreira 174483");
 */
