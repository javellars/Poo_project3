package src.main;
import java.io.IOException;

import src.view.ChatClient;

public class Chat{
	public static void main(String[] args) {
		ChatClient c;
		try {
			c = new ChatClient();
	        c.setVisible(true);
	        c.receberMensagem();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
}

                