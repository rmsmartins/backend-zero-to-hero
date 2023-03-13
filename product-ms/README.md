# Product-ms
## Endpoints
- BaseURL: /products
- POST: create()
- GET: getAll()
- GET /{id}: betByID()
- PUT /{id}: update()
- DELETE /{id}: delete()

## Model
```json
{
  "id": 1,
  "name": "iPhone Pro Max",
  "description": "Smartphone de última geração",
  "price": 1999.900,
  "isAvailable": true
}
```

## Business Rules
- Só é possível a criação de produtos com preço positivo:
- Não é possível pesquisar produtos que não estão disponíveis
- Não é possível inserir descrições com menos de 50 caracteres