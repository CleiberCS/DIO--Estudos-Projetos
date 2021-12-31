# :book: Variáveis, tipos de dados e operadores matemáticos em java

##  Variáveis :v:

* variável -> espaço na memória para se guardar dados.
* Existem 4 tipos:
  * Instância: objeto
  * Classe: classe
  * Local: dentro dos métodos
  * Parâmetros: passada nos métodos

- Definição de uma variável:

  ````
  <?visibilidade?><?modificador?>tipo nome<?=valorInicial?>
  ````

  - Visibilidade (não obrigatório) -> public, protected e private;
  - Modificador (não obrigatório)-> static e final (define a variável como constante):
  - Tipo (obrigatório) -> tipo de dado que vai ser armazenado;
  - Valor(opcional) -> atribui um valor inicial.


## Tipos de dados:

- números inteiros:
  - byte: -128 até 127. Ex.: byte b=22
  - short: -32768 até 32767. Ex.: short s=1000
  - int:(32 bits) -1.147.483.648 até 2.147.483.647. Ex.: int i=-173.456
  - long(64 bits):-9.223.372.036.854.775.808 até 9.223.372.036.854.775.807. Ex.: long l=123.567L

- números reais:
  - float (32 bits): +/- 3.40282347E+38F -> na criação deve se colocar um f no fim. Ex.: float num=2.25(f)
  - double (64 bits): +/- 1.79769313486231570E+308 -> na criação deve se colocar um d no fim. Ex.: double num2=3.05(d)

- textos:
  - char (16 bits): caracteres unicode. EX.: char='Z'
  - String: recebe textos. EX.: String="Eu sou na verdade uma classe"
- Lógicos
  - boolean: recebe true ou false. Ex.: boolean status=true 

## Operadores matemáticos

- Tipos

  - pós-fixados: exp++ ou exp--

    int j=k++ -> j=k ->k=k+1

  - pré-fixados: ++exp ou --exp

    int i=++k ->i=K+1

  - aritméticos:+,-,*,/ e %(resto da divisão)

  - atribuição: +=, -=, *=, /= e %=

    m+=1 ->m=m+1

    g%=3 -> g=g%3

- Casting (conversões)

  Transformar um tipo de variável em outra. Tem dois tipos:

  -  upcast(transformação implícita)-> vai da escala menor para a maior

    int i=10 ;long z; z=i

  - downcast(transformação explicita) ->vai da escala maior para a menor

    int i; long z=10; i=(int) z
