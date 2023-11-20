# Poo_project3
Projeto III: Conversação Online (Chat) - SI400 – Programação Orientada a Objetos II
Prof. André F. de Angelis
--------------------------------------------------------------------------------------------------------------------------------
*Objetivo:* desenvolver um programa em Java com interface gráfica para realizar conversação
por texto (chat).
--------------------------------------------------------------------------------------------------------------------------------------
* O programa deve estabelecer conexão entre duas máquinas via suite tcp/ip, possibilitando a conversação por texto online durante um período arbitrário e o encerramento suave da conexão.
  
* As trocas de dados devem ocorrer por meio de streams de bytes ou de objetos
  
* É necessário uso de multithreading para garantir responsividade da interface
  
* Não é permitido o uso de bibliotecas de terceiros ou qualquer componente de software que não seja
nativo da linguagem ou da biblioteca Swing.

* O programa deve incluir uma interface gráfica de usuário (GUI) baseada em componentes Swing,
onde a janela principal é uma derivação personalizada de JFrame, contendo menus. A janela
principal deve ser redimensionável pelo usuário a qualquer tempo.

* O texto da conversação deve ser exibido na área de fundo da janela principal por meio de um
componente JTextArea com barras de rolagem. Veja a sugestão de um protótipo da tela principal a
seguir:
São necessárias, ao menos, as seguintes opções:
• Menu Arquivo: Conexão Abre conexão (pede IP e porta)
• Saída do programa Fecha conexões e termina programa
• Menu Ajuda Ajuda Texto explicativo do programa
• Sobre Versão e créditos de autoria

* As janelas de diálogo (solicitação de IP e porta, ajuda e sobre) devem ser implementadas com
derivações personalizadas de JDialog, não precisam ser redimensionáveis e não podem ter menus.
Na tela de créditos, devem ser apresentados os nomes e as fotos de cada integrante do grupo (é
parte do exercício trabalhar com imagens).
