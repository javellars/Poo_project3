package src.view;

public class ConstantesGlobais {
    public static final String autor = "Jullia S.Avelar";
    public static final String escola = "FT UNicamp - Faculdade de Tecnologia";
    public static final String universidade = "Unicamp";
    public static final String nome = "Interface Gráfica";
    public static final String versao = "Ver. 1.0.0";
    public static final String arqLogotipo = "imagem1L.jpg";

    static String getTextoSobre() {
        final StringBuilder text = new StringBuilder();

        text.append(System.lineSeparator()).append(autor);
        text.append(System.lineSeparator()).append(escola);
        text.append(System.lineSeparator()).append(universidade);
        text.append(System.lineSeparator()).append(nome);
        text.append(System.lineSeparator()).append(versao);

        return text.toString();
    }
}