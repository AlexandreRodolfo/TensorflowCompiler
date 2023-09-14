Para compilar o projeto digite os seguintes comandos:
```
#Chama o antlr para compilar a descrição
> java -jar antlr.jar DummyFlow.g4 -o gen
#Compila os programas em java
> javac -cp antlr.jar:gen *.java gen/*.java -d gen
#Executa o compilador, imprimindo e salvando os arquivos
> java -cp antlr.jar:gen MainDF exemplos/*.df
```