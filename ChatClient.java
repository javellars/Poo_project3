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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
* Classe que representa a interface gráfica do cliente de chat.
*/
public class ChatClient extends JFrame implements ActionListener {

    // Declarações
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
    Socket s;
    ObjectOutputStream out;
    ObjectInputStream in;

    /**
    * Construtor da classe ChatClient.
    *
    * @throws IOException Exceção de E/S caso ocorra um problema ao configurar a conexão.
    */
    public ChatClient() throws IOException {
        setTitle("ChatGUI-Grupo 3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(new BorderLayout());

        menuSetup();
        componentesSetup();
        acaoSetup();
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
        conectarItem.addActionListener(this);
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
        } else if (e.getSource() == conectarItem) {
        	conectar();
            System.out.println("Clicou em conectar");
        } else if (e.getSource() == sairItem) {
            System.exit(0);
        } else if (e.getSource() == enviarButton) {
        	if (!mensagemTextField.getText().equals("")) { 
                String msg = mensagemTextField.getText();
                enviarMensagem(msg); 
                mensagemTextField.setText("");
            }
        }
    }
    
    /**
    * Método para estabelecer a conexão com o servidor.
    */
    public void conectar() {
    	new Popupconnect();
		String ip = Popupconnect.showPopUp();
        try {
			s = new Socket(ip, 9998);
	        out = new ObjectOutputStream(s.getOutputStream());
	        in = new ObjectInputStream(s.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
    * Método para enviar uma mensagem para o servidor.
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
    * Método para receber mensagens do servidor e exibi-las na área de chat.
    */
    public void receberMensagem() {
        String msg;
        while (true) {
            try {
                msg = (String) in.readObject();
                areaDeChat.append("Servidor: " + msg + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}