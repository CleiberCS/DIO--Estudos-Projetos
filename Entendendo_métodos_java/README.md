# Entendendo métodos java

Métodos são declarados dentro de classes e são responsáveis por definir e realizar um determinado comportamento. Este é executado quando é feito uma requisição a ele.

## Criação de um método

- Estrutura básica

  ````
  <?visibilidade?><?tipo?><?modificador?>retorno nome (<?parâmetros?>)<?exceções?>{Corpo}
  ````

  - visibilidade (definição comum e não obrigatória) -> public, protected ou private
  - tipo (definição incomum e não obrigatória) -> concreto ou abstrato
  - modificador (definição incomum e não obrigatória) -> static ou final
  - retorno (obrigatório) -> tipo de dado (primitivo ou composto) ou void (vazio)
  - nome (obrigatório) -> tem os  mesmos aspectos de definição que uma variável
  - parâmetros(definição comum e não obrigatória) -> parâmetros que pode receber
  - exceções (definição incomum e não obrigatória) -> exceções que podem lançar
  - Corpo (obrigatório) ->código que possui ou vazio

Obs.: neste curso usara principalmente a definição, que é mais comum:

​	**public static "retorno" "nome" (parâmetro){corpo}**

## Utilização de um método

Para "chamarmos" um método utilizamos a seguinte sintaxe:

- nome_da_classe.nome_do_método()
  - Math.random();
- nome_do_objeto.nome_do_método()
  - usuario.getEmail();

Assinatura de um método é definida pelo seu nome mais o parâmetro. Exemplo:

````java
public double consultarSaldo(int id){}
consultarSaldo(12345);//assinatura do método

````

