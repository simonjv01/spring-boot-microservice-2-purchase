## Spring Boot Microservice 2 - Purchase Service

### Endpoints




### Save Purchase

POST /api/purchase HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Content-Type: application/json
Content-Length: 103

{
"userId": 2,
"courseId": 101,
"title": "Intro to Computer Science I",
"price": 1500
}

### Get Purchase of User
GET /api/purchase/2 HTTP/1.1
Host: localhost:4444
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==

