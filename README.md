# Workshop Spring Boot 3 + JPA / Hibernate

O objetivo é criar uma aplicação **Spring Boot** com **JPA / Hibernate**, implementando um modelo de domínio completo, operações CRUD e tratamento de exceções.

## Objetivos do Projeto

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas **resource**, **service** e **repository**
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- Implementar operações **CRUD**
- Tratar exceções

---

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
  - Spring Web
  - Spring Data JPA
- **Hibernate**
- **H2 Database** 
- **Maven**

---


## Modelo de Domínio

- **User**
- **Order**
- **Category**
- **Product**
- **OrderItem**
- **Payment**

Relacionamentos implementados:
- One-to-Many
- Many-to-Many com `@JoinTable`
- One-to-One

---

## Como Executar o Projeto

###  Clonar o repositório
```bash
git clone https://github.com/juliocbms/workshop-spring3-jpa.git
```

###  Entrar no diretório
```bash
cd workshop-spring3-jpa
```

###  Executar com Maven
```bash
./mvnw spring-boot:run
```

> O projeto utiliza o perfil **test** por padrão, com banco de dados H2.

---

## Endpoints Principais

| Método | Endpoint       | Descrição                  |
|--------|---------------|----------------------------|
| GET    | /users        | Lista todos os usuários     |
| GET    | /users/{id}   | Busca usuário por ID        |
| POST   | /users        | Cadastra novo usuário       |
| PUT    | /users/{id}   | Atualiza dados do usuário   |
| DELETE | /users/{id}   | Remove usuário              |

---

## Tratamento de Exceções

- **ResourceNotFoundException** → Recurso não encontrado (`404 Not Found`)
- **DatabaseException** → Violação de integridade no banco (`400 Bad Request`)
- **StandardError** → Resposta padronizada para erros
