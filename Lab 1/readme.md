# Lab 1

Autor: Rui Fernandes
Nmec: 92952

# 1.1

**Archetype**: No Maven um archetype é, por definição, um padrão ou modelo original do qual tudo do mesmo tipo é feito. Ou seja, por base, um modelo de projeto.

**GroupId**: Um nome unico que identifica o dado projeto entre todos os outros, tipicamente representativo da empresa ou grupo que detém o projeto.

**ArtifactId**: Nome base do artifacto primário gerado pelo dado projeto, tipicamente um ficheiro JAR.

*********

Projeto de código inicial encontra-se na pasta Lab 1.1

*********

Para explicar as _goals_ do Maven, é necessário  do _Build Lifecycle_.
Este ciclo de vida representa a construção e distribuição de um projeto (ou artifact), existem 3 _build lifecycles_ integrados por defeito no Maven: `default`, `clean` e `site`.

Cada um destes é composto por _build phases_ representativas de um estado do ciclo e são executadas sequencialmente para completar o dado ciclo.
Por exemplo o ciclo **`default`** incorpora as fases: 
+ `validate` 
+ `compile` 
+ `test` 
+ `package` 
+ `verify` 
+ `install` 
+ `deploy`   

Cada fase tem ainda _goals_ associadas que representam tarefas menores executadas também por ordem em cada fase.

# 1.2

O projeto alterado, bem como o log da atividade no git encontram-se na pasta Lab 1.2

# 1.3

Comandos importantes do Docker:

+ `docker build -t myimage:1.0 ` - Constroi uma imagem a partir da Dockerfile no diretorio e dá tag na imagem.
+ `docker image ls` - Lista todas as imagens guardadas localmente com a Docker Engine
+ `docker image rm myimage:1.0` - Elimina a imagem do armazenamento local
+ `docker container run --name web -p 5000:80 myimage:1.0` - Correr container do myimage versão 1.0, dar-lhe o nome de "web". Port do host é 5000, port do container é 50
+ `docker container stop web` - Parar um container.
+ `docker container ls` - Listar todos os containers (com `--all` inclui os containers parados)

*********

Resultado do comando `docker container ls –all`:

<pre>
CONTAINER ID        IMAGE                    COMMAND             CREATED             STATUS                    PORTS                                            NAMES
73511859ba5e        portainer/portainer-ce   "/portainer"        12 hours ago        Up 14 minutes             0.0.0.0:8000->8000/tcp, 0.0.0.0:9000->9000/tcp   portainer
ada48e76124d        hello-world              "/hello"            14 hours ago        Exited (0) 14 hours ago                                                    keen_perlman
547317d7d2a8        hello-world              "/hello"            15 hours ago        Exited (0) 15 hours ago                                                    amazing_sutherland
</pre>

*********

A vantagem de usar volumes é que o conteudo destes persiste além do ciclo de vida de um container.