# Lógica Condicional e Controle de Fluxo em Java :sunrise_over_mountains:

## Operadores relacionais

Símbolos utilizados para realizar comparações.

Tipos:

- similaridades: == , !=;
- tamanho: >, >=, <, <=;

## Operadores Lógicos

Utilizado para fazer comparações lógicas e entre relações lógicas.

Tipos:

- Conjunção :&& -> e ou and.

  ````java
  2>3 e 5>3
  false&&true
     false

- Disjunção :|| -> ou ou or

  ````java
  2>3 ou 5>3
  false||true
      true
  ````

  

- Disjunção exclusiva: ^ ->xor - só é verdadeiro se as proposições forem opostas caso contrário será falso.

  ````java
  2>3 xor 5>3		2<3 xor 5>3
  false^true		true^true
  	true			false

- negação: ! -> inverte o valor lógico

  ````java
  (2>1)			!(2>1)
  true			!true
      			false
  ````

## Controle de fluxo

São estruturas para direcionar o fluxo da execução do código.

- Decisão: if, if-else, if-else if- else, switch e operador ternário
- Repetição: for, while, do while.
- interrupção: break, continue e return.

## Blocos

Grupo de linhas de código que executam uma operação.

Tipos:

- locais -> dentro de métodos;
- estáticos -> dentro de classes;
- instância -> dentro de classes.

