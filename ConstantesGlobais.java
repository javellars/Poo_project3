package src.view;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que armazena constantes globais e fornece métodos para obter textos informativos.
 */
public class ConstantesGlobais {
    
    /**
    * Lista de autores do programa.
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
    * Nome do programa.
    */
    public static final String nome = "Interface Gráfica - créditos";
    /**
    * Versão do programa.
    */
    public static final String versao = "Version 1.0.2";
    /**
    * Nome do arquivo de imagem.
    */
    public static final String arqImg = "imgGP.png";

    // Inicialização da lista de autores
    static {
        autor.add("Jullia Souza De Avelar 214539");
        autor.add("Laís Azevedo Soares 173455");
        autor.add("Victor Ferreira Da Silva 177950");
        autor.add("Felipe Lemos Ferreira 174483");
        autor.add("Clara Luiza De Andrade Klippel 234458");
    }
    
    /**
     * Obtém o texto informativo sobre o programa.
     *
     * @return Texto informativo sobre o programa.
     */
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

    /**
    * Título da seção de ajuda.
    */
    public static final String tituloajuda = "AJUDA";
    /**
    * Saudações iniciais.
    */
    public static final String greetingstxt = "Bem-vindo ao programa de conexão de máquinas via suite TCP/IP para conversação online! Este software permite estabelecer uma conexão entre duas máquinas para troca de mensagens por texto durante um período determinado, possibilitando um encerramento suave da conexão.";
    /**
    * Instruções de conexão.
    */
    public static final String conexaotxt = "Conexão: No menu Arquivo, selecione 'Abrir conexão' para estabelecer a conexão entre as máquinas. Você será solicitado a inserir o endereço IP e a porta para se conectar à outra máquina.";
    /**
    * Instruções de encerramento.
    */
    public static final String encerramentotxt = "Encerramento: Ao selecionar 'Fechar conexões' no menu Arquivo, o programa encerrará as conexões ativas e finalizará o software de maneira adequada.";
    /**
    * Informações sobre como obter ajuda.
    */
    public static final String ajudatxt = "Ajuda: Para obter informações detalhadas sobre o funcionamento do programa, selecione 'Ajuda' no menu Ajuda. Aqui, você encontrará uma descrição mais detalhada das funcionalidades e recursos disponíveis.";
    /**
    * Informações sobre a seção "Sobre".
    */
    public static final String sobretxt = "Sobre: No menu Ajuda, escolha 'Sobre' para ver informações sobre a versão do programa, bem como os créditos dos autores envolvidos no desenvolvimento. Esta janela apresenta os nomes e as fotos de cada integrante do grupo.";

    /**
     * Obtém o texto informativo de ajuda.
     *
     * @return Texto informativo de ajuda.
     */
    static String getTextoAjuda() {
        final StringBuilder textoajuda = new StringBuilder();
                   
        textoajuda.append(System.lineSeparator()).append(greetingstxt);
        textoajuda.append(System.lineSeparator()).append(conexaotxt);
        textoajuda.append(System.lineSeparator()).append(encerramentotxt);
        textoajuda.append(System.lineSeparator()).append(ajudatxt);
        textoajuda.append(System.lineSeparator()).append(sobretxt);
            
        return textoajuda.toString();
    }
}