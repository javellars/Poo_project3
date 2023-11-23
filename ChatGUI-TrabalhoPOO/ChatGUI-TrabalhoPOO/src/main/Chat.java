package main;

import com.mycompany.projeto3poo.src.view.Janela;
/**
 * A classe Chat é a classe principal do projeto que inicia a aplicação de chat.
 */
public class Chat {
   public static void main(String[] args) {
       // Cria uma instância da classe Janela, que representa a interface gráfica do chat.
        Janela janela = new Janela();
        // Torna a janela visível para o usuário.
        janela.setVisible(true);
    }
}
