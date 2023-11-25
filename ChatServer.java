package src.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
* Classe que representa a interface gráfica do servidor de chat.
*/
public class ChatServer extends JFrame implements ActionListener {

    // Declarações
    private JMenuBar menuBar;
    private JMenu ajudaMenu;
    private JMenu arquivoMenu;
    private JMenuItem sobreItem;
    private JMenuItem ajudaItem;
    //private JMenuItem conectarItem;
    private JMenuItem sairItem;
    private JButton enviarButton;
    private JTextField mensagemTextField;
    private JTextArea areaDeChat;
    private JLabel statusConexaoLabel;
    ServerSocket ss;
    Socket s;
    ObjectOutputStream out;
    ObjectInputStream in;

    /**
    * Construtor da classe ChatServer.
    *
    * @param frame Referência para o JFrame principal do cliente.
    */
    public ChatServer(final JFrame frame) {
        try {
        	setTitle("ChatGUI-Grupo 3 -  Servidor");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 500);
            setLayout(new BorderLayout());

            menuSetup();
            componentesSetup();
            acaoSetup();
            
            ss = new ServerSocket(9998);
            s = ss.accept();
            frame.setVisible(false);
            out = new ObjectOutputStream(s.getOutputStream());
            in = new ObjectInputStream(s.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
    * Método para exibir uma tela de mensagem.
    *
    * @param tela Tela de mensagem a ser exibida.
    */
    private void mostrarTelaMensagem(TelaMensagem tela) {
    	tela.setVisible(true);
    }
    
    /**
    * Configuração do menu da interface gráfica.
    */
    public void menuSetup(){
     
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        arquivoMenu = new JMenu("Arquivo");
        menuBar.add(arquivoMenu);
        sairItem = new JMenuItem("Sair");
        arquivoMenu.add(sairItem);

        ajudaMenu = new JMenu("Ajuda");
        menuBar.add(ajudaMenu);
        sobreItem = new JMenuItem("Sobre");
        ajudaMenu.add(sobreItem);
        ajudaItem = new JMenuItem("Ajuda");
        ajudaMenu.add(ajudaItem);
    }

    /**
    * Configuração dos componentes da interface gráfica.
    */
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

    /**
    * Configuração das ações (eventos) dos componentes da interface gráfica.
    */
    public void acaoSetup() {
        // Eventos
        enviarButton.addActionListener(this);
        sobreItem.addActionListener(this);
        ajudaItem.addActionListener(this);
        sairItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ações
        if (e.getSource() == sobreItem) {
            mostrarTelaMensagem(new TelaMensagem(this, "Sobre - " + ConstantesGlobais.versao, ConstantesGlobais.getTextoSobre()));
            System.out.println("Clicou em sobre");
        } else if (e.getSource() == ajudaItem) {
        	mostrarTelaMensagem(new TelaMensagem(this, "Ajuda - " + ConstantesGlobais.tituloajuda, ConstantesGlobais.getTextoAjuda()));
            System.out.println("Clicou em ajuda");
        } else if (e.getSource() == sairItem) {
            System.exit(0);
        } else if (e.getSource() == enviarButton) {
        	if (!mensagemTextField.getText().equals("")) { // Certifica-se de que a caixa de texto não está vazia
                String msg = mensagemTextField.getText();
                enviarMensagem(msg);
                mensagemTextField.setText("");
            }
        }
    }

    /**
    * Método para enviar uma mensagem para o cliente.
    *
    * @param msg Mensagem a ser enviada.
    */
    private void enviarMensagem(String msg) {
        try {
            out.writeObject(msg);
            areaDeChat.append("Você: " + msg + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
    * Método para receber mensagens do cliente e exibi-las na área de chat.
    */
    public void receberMensagem() {
        String msg;
        while (true) {
            try {
                msg = (String) in.readObject();
                areaDeChat.append("Cliente: " + msg + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}