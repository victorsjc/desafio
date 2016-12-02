# desafio

Tecnologias aplicadas:

* Spring Boot
* Spring MVC
* Lombok
* AngularJS
* Bootstrap

## Requisitos

* JDK 8

  Oracle Java 8 é necessário, caso não tenha pode-se fazer o download através do site [Oracle Java website](http://java.oracle.com). 
 
  Opcionalmente, você pode configurar a variável de ambiente **JAVA\_HOME** e adicionar *&lt;JDK instalação diretório>/bin* na variável de ambiente **PATH**.

* Apache Maven

  Necessário a instalação do Apache Maven que pode ser obtido pelo endereço [http://maven.apache.org](http://maven.apache.org). 

  Opcionalmente, you pode configurar a variável de ambiente **M2\_HOME** e também  adicionar *&lt;Maven instalação diretório>/bin* na variável de ambiente **PATH**.

## Obtendo o código-fonte

Faça uma cópia do código fonte para seu sistema local.

```
git clone https://github.com/victorsjc/desafio.git
```
  
## Iniciando o projeto

1. Iniciar o servidor de backend API via Spring Boot.

   ```
   mvn spring-boot:run
   ```

   O servidor irá iniciar na porta 8080.

2. Para carregar o extrato, basta ir no diretório <diretório de instalação dos fontes>/app/index.html para que seja carregado a página com os lançamentos.
