package src.view;

import java.util.ArrayList;
import java.util.List;


public class ConstantesGlobais {
    public static final List<String> autor = new ArrayList<>();
    public static final String escola = "FT- Faculdade de Tecnologia";
    public static final String universidade = "Unicamp";
    public static final String nome = "Interface Gráfica - créditos";
    public static final String versao = "Version 1.0.2";
    public static final String arqImg = "imgGP.png";
  
    static {
        autor.add("Jullia Souza De Avelar 214539");
        autor.add("Laís Azevedo Soares 173455");
        autor.add("Victor Ferreira Da Silva 177950");
        autor.add("Felipe Lemos Ferreira 174483");
        autor.add("Clara Luiza De Andrade Klippel 234458");
    }
      
    static String getTextoSobre() {
        final StringBuilder text = new StringBuilder();
       
        text.append(System.lineSeparator()).append(universidade);
        text.append(System.lineSeparator()).append(escola);
        text.append(System.lineSeparator()).append(versao);
        for (String autor : autor) {
            text.append(System.lineSeparator()).append(autor);
        }

        return text.toString();
    }
}
