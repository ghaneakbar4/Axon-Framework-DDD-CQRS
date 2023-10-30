Axon Multi-services
---

:construction: **Attention: under construction** :construction:

:warning: Note, in `AssignPrivateAddressSaga.java` there is a use of `QueryGateway` for validation
of the address assigment. 


### Introduction

Playground application with uses Axon framework to demonstrates a way of building a distributed event-driven 
system around the concepts of domain-driven design and CQRS. 

### Application structure

There are several modules, they are standalone Spring Boot applications or libraries:

- `common`: module containing configuration (Maven dependencies) common to other modules
- `core`: module with all commands and events shared by other modules
- `db`: H2 file database running as a TCP server
- `address`: microservice around "address" aggregate
- `person`: microservice around "person" aggregate
- `saga`: Saga implementation of a business transaction (private address assignment)

### Axon configuration

- Using Axon Server version 4.1 _without event sourcing infrastructure_
- Aggregates, projections, and Sagas persist their states in the separate schemas of the central H2 database

### CQRS and messaging infrastructure

This is the overview of the system:

![architecture](https://github.com/gushakov/axon-multi/blob/master/cqrs.png)

### API

- http://localhost:8080/swagger-ui.html (Person)
- http://localhost:8081/swagger-ui.html (Address)

### Saga

This is how assigning private address to a person Saga proceeds:

![address_saga](https://github.com/gushakov/axon-multi/blob/master/address_saga.png)

### Build and run with Docker

- Run `mvn package` on the project
- Run `docker-compose up`

### H2 database

- Access H2 console at http://localhost:8079/h2-console
- Use Server configuration
- JDBC URL: jdbc:h2:tcp://localhost:9090/./axondb;IFEXISTS=true;DB_CLOSE_ON_EXIT=FALSE
-you can  change database to sql server or oracle
### Education
- I try to recored video from source code and discribe it
- We using Axonserver and Rabbitmq for event sourcing
