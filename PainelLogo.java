package src.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
* Classe que representa um painel personalizado para exibir um logotipo na interface gráfica.
*/
public class PainelLogo extends JPanel {

    private static final long serialVersionUID = 1L;

    /**
    * Sobrescreve o método paint para desenhar o logotipo no painel.
    * 
    * @param g O contexto gráfico no qual o logotipo será desenhado.
    */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        final Graphics2D auxGraphics = (Graphics2D) g;

        try {
            // Obtém a URL do arquivo de imagem a partir das ConstantesGlobais
            final URL auxURL = this.getClass().getResource(ConstantesGlobais.arqImg);

            // Carrega a imagem a partir da URL
            final Image auxImage = ImageIO.read(auxURL);

            // Desenha a imagem no painel com as dimensões especificadas
            auxGraphics.drawImage(auxImage, 20, 50, 180, 190, 0, 0, auxImage.getWidth(null), auxImage.getHeight(null), null);

        } catch (final IOException e) {
            System.out.println("Erro ao carregar imagem: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivo de imagem." + e.getMessage());
        }
    }
}