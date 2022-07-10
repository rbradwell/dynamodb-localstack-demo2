https://medium.com/dandelion-tutorials/using-dynamodb-localstack-with-spring-boot-and-spring-data-b7f487bd9e9d

curl -X POST -H "Content-Type: application/json" -d "{ \"itemName\": \"dynamodb-item2\", \"itemUrl\": \"http://localhost:8080/dynamodb/view/dynamodb-item2\" }" http://localhost:8080/dynamodb/save

curl -X GET http://localhost:8080/dynamodb/view-all