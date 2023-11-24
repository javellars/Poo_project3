package src.view;

import javax.swing.*;
import java.awt.*;

public class Ajuda extends JFrame {

    public void iniciar() {
        JFrame frame = new JFrame("Ajuda");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setText("Bem-vindo ao programa de conexão de máquinas via suite TCP/IP para conversação online! Este software permite estabelecer uma conexão entre duas máquinas para troca de mensagens por texto durante um período determinado, possibilitando um encerramento suave da conexão.\n\nFuncionalidades Principais:\n\nConexão: No menu Arquivo, selecione \"Abrir conexão\" para estabelecer a conexão entre as máquinas. Você será solicitado a inserir o endereço IP e a porta para se conectar à outra máquina.\n\nEncerramento: Ao selecionar \"Fechar conexões\" no menu Arquivo, o programa encerrará as conexões ativas e finalizará o software de maneira adequada.\n\nAjuda: Para obter informações detalhadas sobre o funcionamento do programa, selecione \"Ajuda\" no menu Ajuda. Aqui, você encontrará uma descrição mais detalhada das funcionalidades e recursos disponíveis.\n\nSobre: No menu Ajuda, escolha \"Sobre\" para ver informações sobre a versão do programa, bem como os créditos dos autores envolvidos no desenvolvimento. Esta janela apresenta os nomes e as fotos de cada integrante do grupo.");
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);
        JLabel titleLabel = new JLabel("Bem-vindo ao Programa de Conexão");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Ajuda ajuda = new Ajuda();
        ajuda.iniciar();
    }
}
