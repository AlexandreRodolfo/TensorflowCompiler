Repositório dos Programas Desenvolvidos pela disciplia
de Compiladores da POLI-UPE no Semestre 2023.1

Para compilar o projeto digite os seguintes comandos:
```
#Chama o antlr para compilar a descrição
> java -jar antlr.jar DummyFlow.g4 -o gen
#Compila os programas em java
> javac -cp antlr.jar:gen *.java gen/*.java -d gen
#Executa o compilador
> java -cp antlr.jar:gen MainDF

```

Conteúdo:

1 - Código da Árvore Sintática.
