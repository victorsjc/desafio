# desafio

Tecnologias aplicadas:

* Spring Boot
* Spring MVC
* Lombok
* AngularJS
* Bootstrap

## Requisitos

* JDK 8

  Oracle Java 8 � necess�rio, caso n�o tenha pode-se fazer o download atrav�s do site [Oracle Java website](http://java.oracle.com). 
 
  Opcionalmente, voc� pode configurar a vari�vel de ambiente **JAVA\_HOME** e adicionar *&lt;JDK instala��o diret�rio>/bin* na vari�vel de ambiente **PATH**.

* Apache Maven

  Necess�rio a instala��o do Apache Maven que pode ser obtido pelo endere�o [http://maven.apache.org](http://maven.apache.org). 

  Opcionalmente, you pode configurar a vari�vel de ambiente **M2\_HOME** e tamb�m  adicionar *&lt;Maven instala��o diret�rio>/bin* na vari�vel de ambiente **PATH**.

## Obtendo o c�digo-fonte

Fa�a uma c�pia do c�digo fonte para seu sistema local.

```
git clone https://github.com/victorsjc/desafio.git
```
  
## Iniciando o projeto

1. Iniciar o servidor de backend API via Spring Boot.

   ```
   mvn spring-boot:run
   ```

   O servidor ir� iniciar na porta 8080.

2. Para carregar o extrato, basta ir no diret�rio <diret�rio de instala��o dos fontes>/app/index.html para que seja carregado a p�gina com os lan�amentos.
