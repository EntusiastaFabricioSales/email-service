<h1 align="center"> Email Sender</h1>

<h3> Desafio Uber BackEnd</h3>

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

Esse Projeto é uma API feita usando **Java, Java Spring, Aws Simple Email Service.**

## Índice

 - [Instalação](#Instalação)
 - [Uso](#Uso)
 - [Terminais Da API](#terminais-api)

 ## Instalação

 1. Clone o repositório:

 ```bash
git clone https://github.com/EntusiastaFabricioSales/email-service
```

 2. Instalar as dependências com o maven

 3. Atualizar `application.properties` com suas credencias AWS

 ```yaml
aws.region=SUA-REGIAO
aws.accessKeyId=SUA-CHAVE
aws.secretKey=SUA-SECRET
```

## Uso

1. Inicie a aplicação com o Maven
2. A API será acessível em http://localhost:8080

## Terminais Da API

Fornece os seguintes endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Envia um email do seu para o escolhido
```

**BODY**
```json
{
  "to": "fabriciooliveirasales2005@gmail.com",
  "subject": "teste",
  "body": "teste"
}
```