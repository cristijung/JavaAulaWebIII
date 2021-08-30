# JavaAulaWebIII
Códigos de aula de Desenvolvimento de Sistemas de Web III
##
# Introdução a Java

Java é uma linguagem de programação orientada a objetos desenvolvida na década de 90 por uma equipe de programadores chefiada por James Gosling, na empresa Sun Microsystems. Em 2008 o Java foi adquirido pela empresa Oracle Corporation.

Importante ressaltar que Java é uma tecnologia usada para desenvolver aplicações que tornam a Web mais divertida e útil. Java não é a mesma coisa que o javascript, que é uma tecnologia simples usada para criar páginas Web e só é executado no seu browser.
Java permite executar jogos, fazer upload de fotos, bater papo on-line, fazer tours virtuais e usar serviços, como treinamento on-line, transações bancárias on-line e mapas interativos. Se você não tiver  Java, muitas aplicações e websites simplesmente não funcionarão.
Por default, o Java avisará a você automaticamente que novas atualizações estão prontas para serem instaladas. Para manter-se atualizado e proteger seu computador, é importante aceitar e instalar essas atualizações. Se você for avisado sobre uma atualização do Java no computador Windows e não lembrar de ter feito download dela e instalado, pode ser que o Java tenha vindo pré-carregado com seu novo computador.

## Programando em Java

Quando falamos de Java, podemos estar fazendo referência a dois itens basicamente: à linguagem de programação Java e à plataforma Java.

Quando falamos da plataforma Java, estamos falando de todo o ambiente de execução de uma aplicação que tenha sido escrita em alguma linguagem de programação suportada por este ambiente. Este ambiente é composto por uma série de ferramentas que são importantes tanto para nós como desenvolvedores como para quem vai simplesmente utilizar as aplicações que viermos a criar com alguma das linguagens suportadas pela plataforma. 

Continuando a falar da plataforma Java em si, é importante ressaltar que ela é composta por vários elementos que tornam possível a execução de uma aplicação escrita em alguma linguagem suportada pela plataforma. Mas, nesse contexto, podemos destacar pelo menos dois componentes de extrema importância:

Java Virtual Machine (JVM): é o componente responsável por “rodar” as aplicações dentro da plataforma Java. Ela compõe um ambiente controlado, isolado e seguro para a execução das aplicações que iremos escrever;
Base Class Library: um conjunto de bibliotecas comuns entre os diferentes tipos de aplicação Java e que podem ser reutilizadas em diferentes projetos.


E o que vem a ser a JVM?
A JVM é uma máquina virtual que executa aplicações Java em um ambiente controlado dentro de uma máquina.

Para que sua função fique mais clara, vamos analisar algumas situações... Existem algumas linguagens de programação, como o C/C++ e o Delphi, cujo código que escrevemos é convertido diretamente para linguagem de máquina. É importante ressaltar que esse processo de conversão do nosso código para o código de máquina correspondente é chamado de compilação.


Poderíamos ilustrar esse processo com a figura abaixo:
![rId5t4aplow5 swj](https://user-images.githubusercontent.com/17149877/131359444-6f53bc55-02e5-4b64-b893-fb70399a0ca4.png)

## Como programar em Java?

Atributos: 
Ao modelar uma classe, listamos todas as características que os objetos criados a partir dela irão possuir e que são relevantes para nosso problema. Essas características do objeto que estamos modelando recebem o nome de “atributos”. Na Programação Orientada a Objetos, um atributo é uma variável, ou seja, um espaço reservado na memória do computador para guardar um valor temporariamente. É chamada de variável porque seu valor pode mudar durante sua existência. Cada atributo representa um dado que compõe o estado de um objeto. Como  estamos lidando com dados digitais, o computador precisa saber como armazenar cada dado. Por isso existem as definições de tipos de dados, que variam de linguagem para linguagem.


## Tipos de Dados

O Java é uma linguagem fortemente tipada, ou seja, todos os dados do programa devem ter um tipo de dado especificando que tipo de informação irá para a memória, se será um texto, número inteiro, um número que pode ter casas decimais, e assim por diante.

## Exemplo de tipos de dados:

nome: String (pois contém letras, espaços, etc.)
numeroDeFilhos: byte (pois não será um número superior a 127 e nem terá casasdecimais)
numeroDeHabitantes: int (pois não terá casas decimais)
media: double (pode conter casas decimais, como por exemplo, 9,5)
aprovado: boolean (pois só pode assumir os valores true (verdadeiro) ou false (falso))

## Métodos

Métodos são blocos de código que pertencem a uma classe e tem por finalidade realizar uma tarefa. Ou seja, são as ações, comportamentos que nossos objetos poderão ter. Métodos podem ou não alterar o estado (dados) de um objeto.

## Tipos de Métodos

Métodos de ação (sem retorno) - void:
Apenas realizam a ação sem dar nenhum resultado. A palavra void significa ausência de retorno. 
Exemplo: sentar(), levantar(), etc.

Métodos de retorno – double, int, byte, String, boolean:
Realizam a ação e ao final retornam um valor de resposta. 
Exemplo: verificarStatus(), calcularMedia(), etc.


## Argumentos

Os métodos podem ou não possuir argumentos

### Métodos com ou sem argumento

São os dados adicionais que o método requer para realizar a sua tarefa. Por exemplo, para uma pessoa realizar a ação “andar”, é necessário informar a quantidade de passos e a direção. Para uma pessoa girar, é necessário indicar a direção e os graus. Em alguns casos o método pode não ter argumento. Nesse caso, apenas utilizamos um conjunto vazio de parênteses. Para cada argumento devemos especificar o tipo de dado, assim como nos atributos. 
Ex: andar(passos:int, direcao:String).

Exemplo: Imagine o seguinte: Se eu falar para uma pessoa sentar, não preciso
falar mais nada, isso basta, ela sabe que é para sentar-se. Agora se eu falar para andar,
a pessoa provavelmente perguntará para onde. A direção seria o argumento, para que a
pessoa execute  a ação, ela precisa de mais informações além da própria ação imposta.


### Passagem por Parâmetro

A passagem por parâmetro, nada mais é, do que o argumento do método, ou seja, o que deverá ser informado ao método para que o mesmo seja executado.
O exemplo acima é um método sem retorno e com argumento, temos dois parâmetros: direção e passos.





