package com.mycompany.projeto3poo.src.view;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe contém constantes globais utilizadas na interface gráfica.
 * Inclui informações sobre os autores, escola, universidade, nome, versão atual do programa e nome de arquivo de imagem.
 */
public class ConstantesGlobais {
    /**
     * Lista de autores que contribuíram para o trabalho.
     */
    public static final List<String> autor = new ArrayList<>();
    /**
     * Nome do campus.
     */
    public static final String escola = "FT- Faculdade de Tecnologia";
    /**
     * Nome da universidade.
     */
    public static final String universidade = "Unicamp";
        /**
     * Nome da interface gráfica.
     */
    public static final String nome = "Interface Gráfica - créditos";
    /**
     * Versão da interface gráfica.
     */
    public static final String versao = "Version 1.0.2";
    /**
     * Nome do arquivo de imagem associado à interface gráfica.
     */
    public static final String arqImg = "imgGP.png";

    
    static {
        autor.add("Jullia Souza De Avelar 214539");
        autor.add("Laís Azevedo Soares 173455");
        autor.add("Victor Ferreira Da Silva 177950");
        autor.add("Felipe Lemos Ferreira 174483");
        autor.add("Clara Luiza De Andrade Klippel 234458");
    }
    
    /**
     * Obtém o texto contendo informações sobre a universidade, escola, versão e autores.
     *
     * @return O texto com informações sobre a universidade, escola, versão e autores.
     */
    static String getTextoSobre() {
        final StringBuilder text = new StringBuilder();
       
        text.append(System.lineSeparator()).append(universidade);
        text.append(System.lineSeparator()).append(escola);
 //     text.append(System.lineSeparator()).append(nome);
        text.append(System.lineSeparator()).append(versao);
        for (String autor : autor) {
            text.append(System.lineSeparator()).append(autor);
        }

        return text.toString();
    }
}
