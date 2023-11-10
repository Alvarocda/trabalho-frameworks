# Projeto final

Em grupos de **até seis pessoas**, escolham uma biblioteca ou framework para elaboração do projeto.

## 1. Requisitos
- Seu projeto deverá ser entregue no formato de link de repositório público do GitHub, a ser enviado para o email `ah.driano@gmail.com` com o título `Projeto Final - IFMT 2023` até o dia 11/11/2023. Este repositório deve conter o código da solução e um arquivo `README.md` conforme o exemplo em anexo.
- O trabalho também deverá ser apresentado no formato de seminário no dia 11/11/2023. Esta apresentação deverá ter entre 15 e 30 minutos.
- A biblioteca ou framework utilizados poderão ser relacionados à qualquer tecnologia, à escolha do grupo.

Referências úteis para escrita de documentos Markdown:
- [Markdown Guide](https://www.markdownguide.org/basic-syntax/)
- [GitHub Docs - Basic writing and formatting syntax](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
- [Mermaid](https://mermaid.js.org/intro/)


---

# Projeto Final - Desenvolvimento de Software Através de Frameworks @ IFMT/2023

- **Biblioteca/Framework:** [Mapstruct](https://mapstruct.org/), [ModelMapper](https://modelmapper.org/) e [Spring boot](https://spring.io/)
- **Tecnologias aplicadas:** Lista de linguagens utilizadas.
- **Integrantes:**
  - Adriano Carvalho
  - Álvaro Claro
  - Clodoaldo Barbosa
  - Jaílson Ribeiro
  - Ricardo Barcelar
  - Zenildo Crisóstomo

## 1. Descrição da biblioteca/framework

O MapStruct e o ModelMapper são duas bibliotecas em Java que têm finalidades semelhantes, que é simplificar o mapeamento de objetos de um tipo para outro. Ambas são usadas para automatizar o processo de mapeamento de objetos.


## 2. Descrição do problema

Ao consultar uma entidade no banco de dados de uma aplicação e retornar os dados para o usuário, informações sensiveis do registro voltam para o usuário que solicitou aquela informação, informações essas como por exemplo senha, dados pessoas e etc, isso se torna um problema quando precisamos esconder essas informações da resposta que retornamos ao usuário com entidades grandes, pois precisamos esconder e mapear manualmente somente os campos necessários utilizando um DTO "Data Transfer Object" (Objeto de Transferência de Dados).

![Alt text](image.png)

## 3. Solução

Tanto o MapStruct quanto o ModelMapper tentam resolver o problema comum de como mapear automaticamente os dados de um objeto para outro, economizando tempo, reduzindo erros e, em alguns casos, melhorando o desempenho.



## 4. Referências

Inclua a lista de referências utilizadas no projeto ou outras referências interessantes que tiver encontrado e que possam ser úteis para os colegas ao explorar esta ferramenta.
