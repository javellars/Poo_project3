
package src.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class TelaMensagem extends JDialog implements ActionListener {
    private static final long serialVersionUID = 1L;
    private final JButton botaoFechar;
    private final JPanel painelTxt;
    private final JPanel painelBtn;
    private final PainelLogo painelLogo;
    private final JTextArea areaTxt;

    TelaMensagem(JFrame janela, String titulo, String texto) throws HeadlessException {
        super(janela, titulo);
        setSize(800, 320);
        setResizable(false);
        setLocationRelativeTo(janela);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

        areaTxt = new JTextArea();
        areaTxt.setText(texto);

        formatareaTxt();

        painelTxt = new JPanel();
        painelTxt.setBackground(Color.white);
        painelTxt.setBorder(new TitledBorder(new LineBorder(Color.gray), ConstantesGlobais.nome));
        painelTxt.add(areaTxt);
        add(painelTxt, BorderLayout.CENTER);

        // Usando a variável de instância painelLogo
        this.painelLogo = new PainelLogo();
        this.painelLogo.setPreferredSize(new Dimension(200, 220));
        this.painelLogo.setBorder(new TitledBorder(new LineBorder(Color.gray), ConstantesGlobais.escola));
        this.painelLogo.setBackground(Color.white);
        add(this.painelLogo, BorderLayout.WEST);

        painelBtn = new JPanel();
        botaoFechar = new JButton("fechar");
        botaoFechar.addActionListener(this);
        painelBtn.add(botaoFechar);
        add(painelBtn, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        this.setVisible(false);
    }

    private void formatareaTxt() {
        areaTxt.setPreferredSize(new Dimension(580, 220));
        areaTxt.setForeground(Color.black);
        areaTxt.setBackground(Color.white);
        areaTxt.setEditable(false);
        areaTxt.setFocusable(false);
        areaTxt.setLineWrap(true);
        areaTxt.setWrapStyleWord(true);

        areaTxt.setFont(new Font("Arial", Font.BOLD, 12));
    }
}