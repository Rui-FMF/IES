# Lab 2

Autor: Rui Fernandes
Nmec: 92952

# 2.1

Projeto com o servlet encontra-se na pasta Lab 2.1, webapp.

*********

Logs:

<pre>
20-Oct-2020 10:33:08.496 INFO [main] org.apache.catalina.startup.HostConfig.deployWAR Deploying web application archive [/home/ruifmf/Desktop/IES/Lab 2/Lab 2.1/apache-tomcat-9.0.39/webapps/webapp-1.0.war]
20-Oct-2020 10:33:08.760 INFO [main] org.apache.catalina.startup.HostConfig.deployWAR Deployment of web application archive [/home/ruifmf/Desktop/IES/Lab 2/Lab 2.1/apache-tomcat-9.0.39/webapps/webapp-1.0.war] has finished in [263] ms
</pre>

*********

Um servlet container em java, é um componente essencial de um servidor web, dedicado a interagir com java servlets, permite gerar paginas web dinâmicas.
É responsável por:
+ gerir o ciclo de vida de servlets
+ carregar os servlets para memória
+ inicializar e invocar os metodos dos servlets
+ destruir os servlets

# 2.2

Projeto utilizando embedded server encontra-se na pasta Lab 2.2.

# 2.3

Projeto SpringBoot encontra-se na pasta Lab 2.3, demo.

*********

É importante começar por referir que ambos os sistemas têm vantagens e desvantagens e face a elas é que se deve escolher o modelo mais apropriado.

No caso dos embedded servers, em que o servidor HTTP é executado no mesmo espaço que a aplicação, é vantajoso pois:

+ As aplicações são mais contidas e autónomas
+ Sendo uma dependência do projeto, é possivél testar fácilmente outras versões do servidor
+ Mais controlo sobre como o servidor web se comporta
+ Um unico objeto para *deployment*

Por outro lado:

+ Excesso de dependências necessárias
+ Mais difícil de fazer *hotfixes* para problemas de segurança no servidor
+ Não é possivél agrupar várias aplicações por de trás de um servidor sem recorrer a um proxy
+ Uma unica exceção indetetada pode mandar abaixo toda a aplicação

No caso de stand-alone applications servers, em que o servidor HTTP é externo á aplicação, é vantajoso pois:

+ Mais versatilidade na arquitetura da aplicação
+ Fácil de trocar de servidores mais tarde
+ Erros na aplicação não afetam o servidor
+ Fácil de atualizar a aplicação sem ter de reiniciar o servidor

Por outro lado:

+ Maior complexidade de *deployment*, é preciso manter o servidor web e a aplicação sendo preciso dar *deploy* dos mesmos individualmente 
+ Mais dificuldades de desenvolvimento/programação

É ainda de notar que o SpringBoot é uma ferramenta extremamente util no desenvolvimento com stand-alone applications servers.

*********

Retirando da documentação do SpringBoot:

<pre>
For a lot of projects, sticking to established conventions and having reasonable defaults is just what they (the projects) need... this theme of convention-over-configuration now has explicit support in Spring Web MVC. What this means is that if you establish a set of naming conventions and suchlike, you can substantially cut down on the amount of configuration that is required to set up handler mappings, view resolvers, ModelAndView instances, etc. This is a great boon with regards to rapid prototyping, and can also lend a degree of (always good-to-have) consistency across a codebase should you choose to move forward with it into production.
</pre>

Exemplos de anotações:

+ @Controller - marca a classe como um *web controller*, capaz de lidar com *requests*
+ @RequestMapping - mapeia *HTTP requests* com um caminho para o metodo *controller*
+ @SpringBootApplication - permite a auto configuração SpringBoot e análise de componentes

*********

A anotação @SpringBootApplication, inclúi opcionalmente: @EnableAutoConfiguration, @ComponentScan e @Configuration