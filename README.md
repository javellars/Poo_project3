# Poo_project3
Projeto III: Conversação Online (Chat)
SI400 – Programação Orientada a Objetos II
Prof. André F. de Angelis
Oferecimento 2S2023
Projeto III: Conversação Online (Chat)
Objetivo: desenvolver um programa em Java com interface gráfica para realizar conversação
por texto (chat).
Observação: antes de iniciar este projeto, assista aos vídeos 029 a 035, 036, 038 e 041 do
Café Forte Academic Channel (youtube). Deixe seu ‘like’ se gostar da forma com que o
conteúdo é explicado.
O seu programa deve permitir o estabelecimento de uma conexão entre duas máquinas via suite
TCP/IP, possibilitando a conversação por texto online durante um período arbitrário e o encerramento
suave da conexão. As trocas de dados devem ocorrer por meio de streams de bytes ou de objetos
(neste último caso, é necessário definir um objeto de transferência de dados – DTO).
É necessário uso de multithreading para garantir responsividade da interface. O programa deve ser
estruturado em pacotes (packages) que separem, pelo menos, os aspectos da interface gráfica e das
operações de rede. Pacotes adicionais podem ser definidos conforme necessário.
Não é permitido o uso de bibliotecas de terceiros ou qualquer componente de software que não seja
nativo da linguagem ou da biblioteca Swing.
O programa deve incluir uma interface gráfica de usuário (GUI) baseada em componentes Swing,
onde a janela principal é uma derivação personalizada de JFrame, contendo menus. A janela
principal deve ser redimensionável pelo usuário a qualquer tempo.
O texto da conversação deve ser exibido na área de fundo da janela principal por meio de um
componente JTextArea com barras de rolagem. Veja a sugestão de um protótipo da tela principal a
seguir:
São necessárias, ao menos, as seguintes opções:
• Menu Arquivo: Conexão Abre conexão (pede IP e porta)
• Saída do programa Fecha conexões e termina programa
• Menu Ajuda Ajuda Texto explicativo do programa
• Sobre Versão e créditos de autoria
As janelas de diálogo (solicitação de IP e porta, ajuda e sobre) devem ser implementadas com
derivações personalizadas de JDialog, não precisam ser redimensionáveis e não podem ter menus.
Na tela de créditos, devem ser apresentados os nomes e as fotos de cada integrante do grupo (é
parte do exercício trabalhar com imagens).
Será considerado recurso adicional a transferência de arquivos binários entre as máquinas envolvidas
no chat (será preciso alterar a GUI sugerida para acomodar os comandos dessa ação).
Implemente e depure o programa, gere a documentação com a ferramenta javadoc.
A entrega do projeto será feita no Moodle com a postagem de UM único arquivo pdf contendo, na
ordem:
• relatório de contribuição comentado (veja modelo no Moodle);
• link para um vídeo (até 4 minutos) mostrando a operação do programa entre 2 máquinas.
• todos os códigos-fonte, listados em sequência (coloque o código de cada arquivo em uma
nova página ou separe-os com algum delimitador muito visível na diagramação).
Critérios de Avaliação
• Só serão considerados os programas que compilem sem erro e executem corretamente a(s)
funcionalidade(s) requerida(s).
# Item Max. pontos
Pontuação Máxima
01 Entrega completa de todos os ítens solicitados 0,5
02 Código e documentação em inglês e Javadoc para todas as classes e métodos* 1,0
03 Arquitetura de classes e pacotes (estruturação, divisão de responsabilidades) 1,0
04 Qualidade e consistência do código (estilo, indentação, organização, limpeza, nomeação) 1,0
05 Qualidade, consistência, e usabilidade da GUI 2,0
06 Design das telas de diálogo e trabalho com imagens 1,2
07 Uso correto de multithreading para manter resposta da GUI durante a comunicação 1,2
08 Tratamento de exceções adequado 0,5
09 Recursos extras (troca de arquivos) 0,6
10 Aspecto geral do trabalho 1,0
Total 10,0
* não é necessária documentação javadoc para getters e setters que não executem transformações
de dados.
