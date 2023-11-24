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
 //     text.append(System.lineSeparator()).append(nome);
        text.append(System.lineSeparator()).append(versao);
        for (String autor : autor) {
            text.append(System.lineSeparator()).append(autor);
        }

        return text.toString();
    }

    public static final String greetingstxt = "Bem-vindo ao programa de conexão de máquinas via suite TCP/IP para conversação online! Este software permite estabelecer uma conexão entre duas máquinas para troca de mensagens por texto durante um período determinado, possibilitando um encerramento suave da conexão.";
    public static final String conexaotxt = "Conexão: No menu Arquivo, selecione 'Abrir conexão' para estabelecer a conexão entre as máquinas. Você será solicitado a inserir o endereço IP e a porta para se conectar à outra máquina.";
    public static final String encerramentotxt = "Encerramento: Ao selecionar 'Fechar conexões' no menu Arquivo, o programa encerrará as conexões ativas e finalizará o software de maneira adequada.";
    public static final String ajudatxt = "Ajuda: Para obter informações detalhadas sobre o funcionamento do programa, selecione 'Ajuda' no menu Ajuda. Aqui, você encontrará uma descrição mais detalhada das funcionalidades e recursos disponíveis.";
    public static final String sobretxt = "Sobre: No menu Ajuda, escolha 'Sobre' para ver informações sobre a versão do programa, bem como os créditos dos autores envolvidos no desenvolvimento. Esta janela apresenta os nomes e as fotos de cada integrante do grupo.";

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
