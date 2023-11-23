package com.mycompany.projeto3poo.src.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * A classe PainelLogo é uma extensão da classe JPanel e representa um painel
 * que exibe um logotipo.
 * Este painel contém métodos para desenhar o logotipo na tela.
 */
public class PainelLogo extends JPanel {
    private static final long serialVersionUID = 1L;
    /**
     * Este método é chamado automaticamente sempre que o painel precisa ser
     * redesenhado. Ele desenha o logotipo na tela.
     *
     * @param g O objeto Graphics usado para desenhar.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        final Graphics2D auxGraphics = (Graphics2D) g;

        try {
                // Obtém a URL do arquivo de imagem usando a constante arqImg
                final URL auxURL = this.getClass().getResource(ConstantesGlobais.arqImg);
                // Lê a imagem usando a API ImageIO
                final Image auxImage = ImageIO.read(auxURL);
                // Desenha a imagem na tela com as dimensões especificadas
                auxGraphics.drawImage(auxImage, 20, 50, 180, 190, 0, 0, auxImage.getWidth(null), auxImage.getHeight(null), null);
     
        } catch (final IOException e) {
            System.out.println("Erro ao carregar imagem: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivo de imagem." + e.getMessage());
        }
    }
}
