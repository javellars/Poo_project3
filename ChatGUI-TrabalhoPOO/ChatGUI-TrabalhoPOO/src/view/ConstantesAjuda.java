package src.view;

public class ConstantesAjuda {
	public static final String tituloajuda = "AJUDA";
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