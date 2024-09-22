## 🚚 - Arquitetura de Microsserviços:
- Sistemas de Pedidos personalizados com cálculos do valor total da compra e o total de items, validando os produtos selecionados; 

## 📦 - Microsserviços:

- Order-Service: microsserviço responsável apenas por gerar um pedido inicial, e receber uma notificação. Aqui que teremos endpoints REST para inciar o processo e recuperar os dados dos eventos. O banco de dados utilizado será o MongoDB.

- Orchestrator-Service: microsserviço responsável por orquestrar todo o fluxo de execução da Saga, ele que saberá qual microsserviço foi executado e em qual estado, e para qual será o próximo microsserviço a ser enviado, este microsserviço também irá salvar o processo dos eventos. Este serviço não possui banco de dados.

- Product-Validation-Service: microsserviço responsável por validar se o produto informado no pedido existe e está válido. Este microsserviço guardará a validação de um produto para o ID de um pedido. O banco de dados utilizado será o PostgreSQL.

- Payment-Service: microsserviço responsável por realizar um pagamento com base nos valores unitários e quantidades informadas no pedido. Este microsserviço guardará a informação de pagamento de um pedido. O banco de dados utilizado será o PostgreSQL.

- Inventory-Service: microsserviço responsável por realizar a baixa do estoque dos produtos de um pedido. Este microsserviço guardará a informação da baixa de um produto para o ID de um pedido. O banco de dados utilizado será o PostgreSQL.

## 📂 - Estrutura de Pastas:
```
├── projects
│   ├── config
│   |  ├── exception
│   |  ├── kafka
│   ├── core
│   |  ├── consumer
│   |  ├── dto
│   |  ├── enums
│   |  ├── model
│   |  ├── producer
│   |  ├── repository
│   |  ├── service
│   |  ├── utils
```

## 📋 - Diagrama Funcional:
  
![orchestrator drawio](https://github.com/user-attachments/assets/b89e4bac-0b0b-418d-9627-95a1a28ddd69)

## ⚙️ - Tecnologias/Ferramentas:

- Java 17
- Spring Boot 3
- Apache Kafka
- API REST
- PostgreSQL
- MongoDB
- Docker
- docker-compose
- Redpanda Console
