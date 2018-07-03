# Atividade 3 da Disciplina de Desenvolvimento Web
Implementa��o de funcionalidades em um sistema de Bol�o com JavaScript e React.

## Requisitos do sistema:
A partir do sistema de Bol�o feito em sala, pelo menos tr�s novas funiconalidades dentre as debaixo poderiam ser implementadas:

* Destacar utilizando as classes Bootstrap os campos inv�lidos (e n�o apenas mostrar uma mensagem ao lado)

* Modificar a aplica��o para que s� seja poss�vel adicionar sele��es de uma lista pr�-definida (que est� armazenada no banco de dados): IMPLEMENTADA

* Limitar o n�mero de palpites por usu�rio (no m�ximo X palpites)

* Adicionar mais duas op��es ao palpite (terceiro e quarto lugares, al�m de campe�o e vice). Em seguida, adicionar uma fun��o onde � informado o resultado da Copa, e a aplica��o mostra quem ganhou o bol�o, com base em alguma f�rmula de sua escolha

* Adicionar papeis espec�ficos aos usu�rios, como: usu�rio comum s� pode fazer palpites, administrador pode acessar as demais fun��es

* Adicionar uma op��o para que o usu�rio possa alterar seus palpites at� uma certa data-limite (a ser configurada pelo administrador)

## Configura��o do Projeto de BackEnd
* Realizar git pull
* Configurar o Glassfish para trabalhar com o mesmo banco de dados do projeto anterior (Derby)
* Copiar os drivers do derby para a pasta <dom�nio>/lib do Glassfish
* Criar um novo JDBC Connection Pool
* No Netbeans (aba Servi�os), criar uma conex�o com o banco com o nome ReservaHotelDB2 
* No projeto, criar novo arquivo (Recurso JDBC - Glassfish)
* Ao criar o recurso, escolher para criar novo pool de conex�es
* Nome JNDI: jdbc/HotelDB
* Nome do pool: HotelDBPool
* Extrair de conex�o existente (escolher a conex�o do passo 3.2.1)
* No Netbeans, exibir o console de administra��o do dom�nio Glassfish (aba Servi�os)
* Abrir a op��o Recursos, e fazer upload do arquivo .xml
* Para testar, abrir a op��o Pool de conex�es JDBC, escolher a conex�o criada e clicar em Ping
* No projeto, criar um novo arquivo do tipo Descritor do Glassfish (glassfish-web.xml)
* Criar um ref para o recurso JNDI criado no passo anterior (ver Hotel.sql no projeto Atividade 2)
* Executar comandos para criar tabelas (ver Hotel.sql no projeto Atividade 2)
* Inserir dados nas tabelas (ver Hotel.sql no projeto Atividade 2)

## Configura��o do Projeto para React 
* Instalar o node.js, caso ainda n�o tenha
* Criar uma pasta para os projetos Node (ex: /home/user/NodeProjects)
* Executar, a partir da pasta, o seguinte comando no terminal (Obs: testado na vers�o npm 5.2.0 ou superior):
npx create-react-app bolao-da-copa-v2-front-end
* Entrar no diret�rio rec�m-criado (bolao-da-copa-v2-front-end) e executar os seguintes comandos, para instalar os pacotes necess�rios
para o exemplo:
npm install react-router-dom -S // Para cria��o e configura��o das rotas
npm install classnames -S // Para estiliza��o dos componentes PrimeReact
npm install font-awesome -S // Para estiliza��o dos componentes PrimeReact
npm install primereact -S // Biblioteca de componentes ricos para React
npm start

## Configura��o Extra para Configurar Biblioteca Externa React-Select
npm install react-select@1.0.0-rc.5

## Cr�ditos de bibliotecas:
* [PrimeReact](https://www.primefaces.org/primereact/)
* [React-Select](https://github.com/JedWatson/react-select)

## Alunos
* Andr� Levi Zanon
* Victor Santos Ferrari
* Victor Hugo Domingos de Abreu

## Professores 
* Daniel Lucr�dio