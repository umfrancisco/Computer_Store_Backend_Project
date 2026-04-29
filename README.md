# Computer Store Backend Project

## Description

** Português **

O projeto utiliza parcialmente o padrão de projeto MVC (Model-View-Controller) para simular uma aplicação backend voltada para a venda de computadores. Ele possui três classes POJO (Plain Old Java Object): Product (produto), Customer (cliente) e Order (pedido). As classes POJO estão no pacote "model". 

A camada que estabelece relação com a persistencia dos dados é o repositorio, ou "repository". Aí está uma classe abstrata chamada de "AbstractRepository" que estabelece a conexão com o banco de dados relacional PostgreSQL a partir de Hibernate. "ProductRepository", "CustomerRepository" e "OrderRepository" implementam os métodos abstratos de "AbstractRepository" para salvar, consultar, atualizar e deletar - CRUD (Create, Read, Update, Delete). 

A camada de serviço utiliza uma interface chamada "EntityPersistence", que define os métodos para serem implementados pelas classes concretas do pacote "service".

** English **

The project partially uses the MVC (Model-View-Controller) design pattern to simulate a backend application focused on selling computers. It has three POJO (Plain Old Java Object) classes: Product, Customer, and Order. The POJO classes are located in the "model" package.

The layer that handles data persistence is the repository layer. There is an abstract class called "AbstractRepository" that establishes the connection with the PostgreSQL relational database using Hibernate. "ProductRepository", "CustomerRepository", and "OrderRepository" implement the abstract methods of "AbstractRepository" to perform save, query, update, and delete operations—CRUD (Create, Read, Update, Delete).

The service layer uses an interface called "EntityPersistence", which defines the methods to be implemented by the concrete classes in the "service" package.

## Technologies

- JDK 17+
- Maven 
- PostgreSQL 
- Hibernate 

## Folders Structure

<pre>
├─── src
│   ├─── main 
│   │   ├─── java 
│   │   │   └─── com 
│   │   │       └─── umfrancisco
│   │   │           ├─── model
│   │   │           ├─── repository
│   │   │           └─── service
│   │   └─── resources 
│   └─── test 
│       ├─── java 
│       └─── resources 
└─── target 
    ├─── classes 
    │   ├─── com 
    │   │   └─── umfrancisco 
    │   │       ├─── model 
    │   │       ├─── repository 
    │   │       └─── service 
    │   └─── META-INF 
    │       └─── maven 
    │           └─── com.umfrancisco 
    │               └─── ComputerStore 
    └─── test-classes 
</pre>
