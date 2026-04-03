# Computer Store Backend Project

## Technologies

- Java 
- Maven 
- PostgreSQL 
- Hibernate 

### Prerequisites
- Java JDK 17+
- Maven
- PostgreSQL

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

### Layers

- **Model** → Represents database entities 
- **Repository** → Handles data persistence 
- **Service** → Contains business rules and logic   