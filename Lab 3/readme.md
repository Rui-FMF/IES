# Lab 3

Autor: Rui Fernandes
Nmec: 92952

# 3.1

O código HTTP Status apropriado para http://localhost:8080/employees/987987 devia ser um 404 Not found

*********

Screenshots da interação encontram-se na pasta /Lab 3.1/prints

*********

O diagrama UML encontra-se na pasta /Lab 3.1

*********

+ Employee: Classe usada para representar os employees
+ PayrollApplication: Usado para correr a aplicação, contém a anotação @SpingBootApplication que disponibiliza component scanning, autoconfiguration, e property support.
+ LoadDatabase: Usada para carregar a base de dados, é automaticamente chamada pelo SpringBoot, pede uma cópia de EmployeeRepository e neste caso cria 2 entidades Employee e armazena-as no repositorio.
+ EmployeeNotFoundException e EmployeeNotFoundAdvice: usados para tratar de erros 404 no caso de não encontrar um employee.
+ EmployeeRepository: Extende *JpaRepository* especificando o dominio como Employee e o tipo de id como Long. Usado para armazenar e disponibilizar a informação dos employees, servindo como um espécie de base de dados.
+ EmployeeController: permite manipulação de dados e indica os dados retornados por cada metodo HTTP (GET, POST...)

*********

c) Quando recomeçamos todos os dados inseridos ou atualizados são perdidos, isto acontece pois quando inicializamos a REST API o metodo em LoadDatabase limita-se a inserir os dois primeiros employees, sendo que o problema real é que não temos nenhuma base de dados real com qualuqer permanência, estando os dados inseridos associados apenas á instancia atual da API. Para resolver isto era necessário impementar uma base de dados externa á API e o REST teria de inserir e buscar os dados á base de dados em si.

*********

# 3.2

@Table: Especifica a tabela na base de dados que vai guardar a entidade, neste caso está a definir-se que as entidades Employee vão ser guardadas na tabela "employees" na BD MySQL.

@Column: Serve para mapear um atributo como uma coluna na tabela da base de dados.

@Id: Identifica um atributo como Primary Key da tabela da base de dados

*********

No nosso caso usamos o @Autowired na property _employeeRepository_ isto serve para evitar fazer metodos _setter_.
<pre>
    You can use @Autowired annotation on properties to get rid of the setter methods. When you will pass values of autowired properties using <property> Spring will automatically assign those properties with the passed values or references.
</pre>

retirado de: https://www.tutorialspoint.com/spring/spring_autowired_annotation.htm

*********

O projeto encontra-se na pasta Lab 3.2

# 3.3

A diferença entre @RestController e @Controller é apenas que o primeiro trata-se de uma combinação de @Controller e @ResponseBody, tornando o desenvolvimento ligeiramente mais fácil.

*********


*********

O projeto encontra-se na pasta Lab 3.3