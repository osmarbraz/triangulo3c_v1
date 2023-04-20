# Aplicação em 3 camadas para o sistema de cálculo da área do triângulo versão 1

## Contextualização

- Realiza o cálculo da área de um triângulo.<br>
- Aplicação Java desenvolvida em 3 camadas.<br>
- Interface gráfica utilizando JFrame.<br>
- O projeto foi desenvolvido no NetBeans deve ser chamado triangulo3c_v1.<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 5.<br>

## Diagramas

![Estrutura geral do projeto](estruturageral.png)

![Diagrama de caso de uso](diagramacasodeuso.png)

![Diagrama de classe](diagramadeclasse.png)

![Diagrama de sequência](diagramasequencia.png)

## Arquivos do projeto

Os arquivos *.EAP são os projetos do sistema utilizando ferramanta CASE Enterprise Arquitect.
`
- Arquivo Modelo1.EAP - Projeto que não especifica classes externas no projeto. (E.g.: JButton, JLabel, ...).
- Arquivo Modelo2.EAP - Projeto que especifica classes externas no projeto. (E.g.: JButton, JLabel, ...).

## Outras arquivos
- pom.xml - Arquivo de configuração da ferramenta de automação Maven.
- *.bat - Arquivos de lote(Batch) de console para tarefas compilar, executar, documentar, empacotar e limpar o projeto.
