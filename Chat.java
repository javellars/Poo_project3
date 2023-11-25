package src.main;

import java.io.IOException;
import src.view.ChatClient;

/**
* Classe principal responsável por iniciar o cliente de chat.
*/
public class Chat{
	
    /**
    * Método principal que inicia o cliente de chat.
    *
    * @param args Argumentos da linha de comando (não utilizados neste contexto).
    */
	public static void main(String[] args) {
		ChatClient c;
		try {
			c = new ChatClient();
	        c.setVisible(true);
	        c.receberMensagem();
		} catch (IOException e) {
			e.printStackTrace();
		}
   }
}                