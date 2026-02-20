
---

# Workshop Spring Boot com MongoDB

Este projeto consiste em uma API REST desenvolvida como estudo prático para compreender a integração entre o framework Spring Boot e o banco de dados orientado a documentos MongoDB. O foco principal é a transição do paradigma relacional para o NoSQL e a implementação de associações complexas em um ambiente não relacional.

## Objetivos do Projeto

* Compreender as principais diferenças entre o paradigma orientado a documentos e o relacional.
* Implementar operações completas de CRUD (Create, Read, Update, Delete).
* Refletir sobre decisões de design para bancos de dados NoSQL.
* Implementar associações entre objetos utilizando objetos aninhados e referências.
* Realizar consultas complexas utilizando Spring Data e MongoRepository.
* Utilizar consultas personalizadas com a anotação @Query e expressões regulares.

## Tecnologias Utilizadas

* Java 21
* Spring Boot 3
* Spring Data MongoDB
* MongoDB Community Server
* Maven

## Arquitetura e Estrutura

A aplicação foi estruturada seguindo o padrão de camadas para garantir a separação de responsabilidades:

1. **Camada de Domínio**: Definição das entidades e documentos (User, Post).
2. **Camada de Acesso a Dados (Repository)**: Interfaces que estendem MongoRepository para operações de banco.
3. **Camada de Serviço**: Lógica de negócio, instanciamento e tratamento de exceções.
4. **Camada de Controladores REST (Resource)**: Endpoints da API para comunicação com o cliente.
5. **Padrão DTO**: Uso de Data Transfer Objects para otimizar o tráfego de dados e encapsular informações sensíveis.

## Funcionalidades Implementadas

### Gestão de Usuários

* Busca de todos os usuários com projeção DTO.
* Busca por ID com tratamento para objeto não encontrado (404).
* Inserção, atualização e deleção de registros.

### Sistema de Posts e Comentários

* Associação de posts a usuários através de referências (@DBRef).
* Inclusão de comentários como objetos aninhados nos posts.
* Projeção de dados do autor nos posts para reduzir o acoplamento.

### Consultas Customizadas

* Busca por título utilizando Query Methods.
* Busca por título utilizando @Query com regex (case insensitive).
* Busca avançada por múltiplos critérios: termo presente no título, corpo ou comentários, filtrado por intervalo de datas.

## Como Executar o Projeto

1. Certifique-se de que o MongoDB esteja instalado e em execução no endereço mongodb://localhost:27017.
2. Clone o repositório.
3. Execute o comando mvn spring-boot:run através do terminal ou utilize sua IDE.
4. A aplicação realizará o seed automático da base de dados através da classe de configuração Instantiation.
5. Acesse os endpoints em http://localhost:8080/users ou http://localhost:8080/posts.

---

**Autor:** José Victor

Projeto de estudo focado em persistência de dados NoSQL e desenvolvimento de web services com Java.

---
