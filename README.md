## Workshop Spring Boot JPA

### Descrição

Este repositório contém um workshop prático de Spring Boot com JPA (Java Persistence API). O objetivo é demonstrar como construir uma aplicação web utilizando o framework Spring Boot e a integração com JPA para persistência de dados.

### Tecnologias Utilizadas

- Java: Linguagem de programação utilizada no projeto.
- Spring Boot: Framework que facilita a criação de aplicações standalone e de produção prontas.
- Spring Data JPA: Abstração sobre JPA que simplifica o acesso a dados.
- H2 Database: Banco de dados em memória usado para testes e desenvolvimento.
- Maven: Ferramenta de gerenciamento de dependências e construção do projeto.

### Estrutura do Projeto

- src/main/java/com/example/demo: Código-fonte principal da aplicação.
  - controller: Contém os controladores REST.
  - model: Define as entidades JPA.
  - repository: Interfaces de repositório para acesso aos dados.
  - service: Contém a lógica de negócios da aplicação.
- src/main/resources: Arquivos de configuração e recursos estáticos.
  - application.properties: Configurações da aplicação.

### Funcionalidades

- CRUD: Operações de Create, Read, Update e Delete para entidades gerenciadas pelo JPA.
- API REST: Endpoints para manipulação das entidades através de chamadas HTTP.
- Persistência de Dados: Uso do Spring Data JPA para abstrair operações de banco de dados.

### Como Executar

1. Clone o Repositório:
   
Bash

    git clone https://github.com/marcelojacint/workshop-springboot-jpa.git
    
2. Navegue até o Diretório do Projeto:
   
Bash

    cd workshop-springboot-jpa
    
3. Execute a Aplicação com Maven:
   
Bash

    mvn spring-boot:run
    
A aplicação estará disponível em http://localhost:8080.

### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.
