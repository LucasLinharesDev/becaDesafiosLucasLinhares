# Projeto Referente ao Desafio Beca Java NTT Data

### Sobre o projeto:

* Desenvolvedor: Lucas Linhares
* IDE Utilizada: IntelliJ
* Nome do Projeto: LucPlayer

##### O que o Lucplayer faz?

* No LucPlayer podemos criar ouvintes e musicas, e interagir de várias maneiras com as reproduções criadas: download, curtir, reproduzir.

##### Modelagem Conceitual:

<img width="575" alt="modelagemConceitual" src="https://user-images.githubusercontent.com/63889027/150397585-18898c3b-7b70-40dc-9a8c-286788c44c6d.png">

___________________________
### Endpoints:
* Para teste dessa API é necessário a utilização de um software/aplicação que faça requisições HTTP. Utilizamos o Postman(ferramenta que tem como objetivo testar serviços RESTful).

### Musica:

#### POST (Criar passando Json pelo body): 
* api/musica/criar

##### GET (Obter passando o id na url obter/{id}):
* api/musica/obter/1

##### GET (Obter lista):
* api/musica/obter/lista

##### DELETE (Deletar passando id no url):
* api/musica/deletar/3

##### PATCH (Atualizar passando id no url, e objeto no body em JSON):
* api/musica/atualizar/5

-----------------------------------------------------------------------------------
### Ouvinte:

##### POST (Criar passando Json pelo body):
* api/ouvinte/criar

##### GET (Obter passando o id na url obter/{id}):
* api/ouvinte/obter/1

##### GET (Obter lista):
* api/ouvinte/obter/lista

##### DELETE (Deletar passando id no url):
* api/ouvinte/deletar/3

##### PATCH (Atualizar passando id no url, e objeto no body em JSON):
* api/ouvinte/atualizar/2

-----------------------------------------------------------------------------------
### Curtir:

##### POST (Criar passando Json pelo body):
* api/curtir/adicionar

##### GET (Obter passando o id na url obter/{id}):
* api/curtidas/obter/1

##### GET (Obter lista):
* api/curtidas/obter/lista

##### DELETE (Deletar passando id no url):
* api/curtidas/deletar/3

##### PATCH (Atualizar passando id no url, e objeto no body em JSON):
* api/curtidas/atualizar/1

-----------------------------------------------------------------------------------
### Download:

##### POST (Criar passando Json pelo body):
* api/download/iniciar

##### GET (Obter passando o id na url obter/{id}):
* api/download/obter/1

##### GET (Obter lista):
* api/download/obter/lista

##### DELETE (Deletar passando id no url):
* api/download/deletar/3

##### PATCH (Atualizar passando id no url, e objeto no body em JSON):
* api/download/atualizar/1

_________________________________________________________________________________
### Reproduzir:

##### POST (Criar passando Json pelo body):
* api/reproduzir/iniciar

##### GET (Obter passando o id na url obter/{id}):
* api/reproduzir/obter/1

##### GET (Obter lista):
* api/reproduzir/obter/lista

##### DELETE (Deletar passando id no url):
* api/reproduzir/deletar/3

##### PATCH (Atualizar passando id no url, e objeto no body em JSON):
* api/reproduzir/atualizar/1

DESAFIO 4:

Configuração do Properties com banco de dados H2
Adição da Dependencia do Bancho H2 no Pom.xml

Criação dos Repositories 
Adição da Dependecia do Spring Boot Starter Data JPA
Adição da Dependencia do Lombook

Refatoração da Classe Model:Musica utilizando Anotações do Spring JPA e do Lombook























