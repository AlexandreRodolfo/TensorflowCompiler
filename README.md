# Projeto de Compiladores
## Alunos:
 - [Alexandre Rodolfo](https://github.com/AlexandreRodolfo)
 - [Antônio Tito](https://github.com/Tito-Jr)
 - [Djair Maynart](https://github.com/DjairMaynart)
 - [Rhadyja Gabriela](https://github.com/rhadyja)
 - [Samuel Lima](https://github.com/Samuk4Lima)
## Professor
 - [Luis Menezes](https://github.com/lcsm-ecomp)

# Motivação
A Inteligência Artificial (IA) tem experimentado um notável crescimento nos últimos anos, desempenhando um papel importante em nossa graduação. As redes neurais, por sua vez, têm sido responsáveis por diversos avanços tecnológicos, contribuindo significativamente para áreas como processamento de imagens, reconhecimento de voz, medicina e até mesmo previsão do mercado financeiro.

No entanto, à medida que a complexidade dos problemas abordados aumenta, a implementação de redes neurais, apesar de acessível para iniciantes, pode se tornar progressivamente intrincada. Isso muitas vezes dificulta a compreensão clara das etapas envolvidas, resultando em linhas de código complexas e abstrações difíceis de serem visualizadas.

Nesse contexto, nosso projeto busca enfrentar esse desafio específico. Desenvolvemos um subconjunto de camadas que implementam redes neurais usando o TensorFlow, mas de maneira mais acessível, em uma linguagem simples e intuitiva, *DummyFlow*. Nosso objetivo é simplificar o processo de implementação de redes neurais, tornando-o mais transparente e compreensível, permitindo uma visão mais clara e didática das operações realizadas.

# Entendendo a linguagem
## Tensores
Toda representação numérica na linguagem representa um Tensor, que é um termo para uma estrutura matemática multidimensional. Buscamos representar estas abstrações de uma forma mais simples, por exemplo:
- Valores mensais dos últimos 5 anos: 12x5
- RGB de uma imagem: 1280x720x3
## Operações
As operações são aplicadas da esquerda para a direita, sem hierarquia, representando a mesma lógica aplicada 
Operações podem ser Element Wise, afetando todos os elementos do Tensor sem afetar sua forma
- Adição (+)
- Subtração (-)
- Multiplicação (*)
- Divisão (/)

Ou Tensor Wise, interferindo diretamente em sua forma e/ou elementos
- Redimensionar (~>)
- Reformar (->)
- Convolução (@)
- Deconvolução (&)
## Funções de ativação
Podem ser digitadas diretamente do modelo, como uma de suas camadas
## Palavras reservadas
- max
- avg
- drop
- norm
## Comentários
Basta digitar "#" que toda a linha será comentada
## Extra
Para aprender mais sobre a sintaxe, visite o diretório *exemplos*, lá você encontrará ainda implementações reais de redes neurais utilizadas para classificação de imagens.

# Como compilar e executar o projeto?
Compile a descrição com o antlr
```
> java -jar antlr.jar DummyFlow.g4 -o gen
```
Compile os programas em Java
```
> javac -cp antlr.jar:gen *.java gen/*.java -d gen
```
Execute o compilador, e automaticamente será impresso na tela o resultado do seu arquivo, bem como ficará salva uma cópia em Python no mesmo diretório do arquivo para melhor lhe auxiliar. OBS: Os arquivos precisam ser passados como parâmetro!
```
> java -cp antlr.jar:gen MainDF exemplos/*.df
```
