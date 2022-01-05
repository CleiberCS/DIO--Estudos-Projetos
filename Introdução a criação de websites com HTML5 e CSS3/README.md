# Introdução a criação de websites com HTML5 e CSS3

- Todo arquivo/documento HTML é formado por elementos:

  ```html
   abertura da tag
  _________|________
  |                 |
  <h1 class="titulo">Título</h1>
  |    |___________|  |_____|   |
  |          |            |     |   
  |       Atributo    Conteúdo  |
  |_____________________________|
                   |
             Elemento HTML
  ```

   

- Estrutura básica de uma página HTML:

  ````html
  <!DOCTYPE html>  (indica ao navegador que o arquivo e do tipo html)
  <html>
  	<head>
  		<meta>  (informações para o navegador,buscadores na internet,etc.)
  		<title></title> (titulo que será exibido na aba do navegador)
  	</head>
  	<body>
  		Aqui fica todo o conteúdo da página!
  	</body>
  </html>
  ````

  

## Semântica

Durante muitos anos o elemento padrão no HTML era a div, construíamos nosso conteúdo todo baseado nela, e assim nascia a sopa de divs.

Mas em 2014 saiu a quinta versão do HTML, e com ela vieram vários mudanças importantes, como performance e acessibilidade, mas nesse curso introdutório vamos focar na semântica.

A semântica nos permite descrever mais precisamente o nosso conteúdo, agora um bloco de texto não é apenas uma div, agora é um article e tem mais significado assim. E temos vários elementos para ressignificar as divs:

**<section>**

Representa uma seção genérica de conteúdo quando não houver um elemento mais específico para isso.

**<header>**

É o cabeçalho da página ou de uma seção da página e normalmente contém logotipos, menus, campos de busca.

**<article>**

Representa um conteúdo independente e de maior relevância dentro de uma página, como um post de blog, uma notícia em uma barra lateral ou um bloco de comentários. Um article pode conter outros elementos, como header, cabeçalhos, parágrafos e imagens.

**<aside>**

É uma seção que engloba conteúdos relacionados ao conteúdo principal, como artigos relacionados, biografia do autor e publicidade. Normalmente são representadas como barras laterais.

**<footer>**

Esse elemento representa o rodapé do conteúdo ou de parte dele, pois ele é aceito dentro de vários elementos, como article e section e até do body. Exemplos de conteúdo de um <footer> são informações de autor e *links* relacionados.

**<h1>**-**<h6>**

Eles não foram criados na versão 5 do HTML e nem são específicos para semântica, mas servem para esse propósito. São utilizados para marcar a importância dos títulos, sendo <h1> o mais importante e <h6> o menos. Uma dica: use apenas um <h1> por página, pois ele representa o objetivo da sua página.

## TAGs

- "<p>" ->representa um parágrafo ou seja quando queremos inserir um texto na página.

- "<a>" ->ancora representa um hiperlink. Possui vários atributos, os principais são:

  - href ->representa um hiperlink para a página, que pode levar para outra página ou site, email e telefone. Para tel e email devemos usar os prefixos tel e mailto respectivamente. 

    ````html
    	EX.:  <a href="link site">nome do site</a>
    		  <a href="mailto:email@gmail.com">email@gmail.com</a>
    ````

    

  - target -> abre link da página em outra aba do navegador. 

- "<img>" utilizado para inserção de imagem. Possui dois atributos:

  - src -> define o caminho onde está armazenado a figura

  - alt -> define uma descrição para a imagem que será exibida se a imagem não carregar e que será lida caso se use um leitor de tela.

    ````html
    <img src="img/imagem.jpg" alt="imagem">

- listas

  - "<ul>" utilizado para iniciar uma lista não ordenada

  - "<ol>"utilizado para iniciar uma lista ordenada

  - "<li>" utilizado para inserir cada item da lista

    ````html
    <ul>
    	<li>item 1</li>
        <li>item 2</li>
        <li>item 3</li>
    </ul>
    
    <ol>
        <li>item 1</li>
        <li>item2</li>
    </ol>



## CSS 3

Regra CSS:

````html
<!-- Seletores -> elementos html (tag)-->
 ___|_____
 |        |
 a,p,h1,h3{
	color: blue;
	font-size: 14px;
}  |_________________|
            |
    <!-- Declarações-> formadas por uma propriedade e um valor-->  
    <!-- Neste código todas as tags do site terão as mesmas características-->
````

Para que possamos personalizar cada item da página usaremos o "id" e a "class" , pois eles podem ser atribuídos a qualquer elemento de forma específica.

- id -> no html declara se o "id" como id e no CSS pelo hash ( # ), só pode ser usado uma vez na página.

  ````html
  #header{
  color : blue;
  }

- class (classes) -> no html declara se a "class" como class e no CSS por um ponto     ( . )  

  ````html
  .header{
  color: blue;
  }

Para utilizarmos o CSS na página criamos um arquivo .CSS por padrão nomeia se o arquivo como style.css.

No head do arquivo html indicamos a utilização do arquivo CSS:

````html
<link rel="stylesheet" href="caminho do arquivo.css"
````

- rel -> indica ao navegador qual tipo de arquivo está adicionando a página html (css -> stylesheet)
-  href-> indica o caminho do arquivo.css

No elemento que se pretende mudar a característica inserimos a classe ou o id:

````html
<h1 id="header">
    Título Principal
</h1>
````



## Links úteis

- <a href="https://tinypng.com/">Tynipng</a>
  - O Tinypng faz compactação de arquivos de imagem reduzindo seu tamanho fazendo com que sejam carregados mais rapidamente nas páginas web.

- <a href="https://unsplash.com/">Unsplash</a>
  - Site para baixar imagens gratuitas.
