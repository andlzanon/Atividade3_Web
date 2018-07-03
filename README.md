# Atividade 3 da Disciplina de Desenvolvimento Web
Implementação de funcionalidades em um sistema de Bolão com JavaScript e React.

## Requisitos do sistema:
A partir do sistema de Bolão feito em sala, pelo menos três novas funiconalidades dentre as debaixo poderiam ser implementadas:

* Destacar utilizando as classes Bootstrap os campos inválidos (e não apenas mostrar uma mensagem ao lado)

* Modificar a aplicação para que só seja possível adicionar seleções de uma lista pré-definida (que está armazenada no banco de dados): IMPLEMENTADA

* Limitar o número de palpites por usuário (no máximo X palpites)

* Adicionar mais duas opções ao palpite (terceiro e quarto lugares, além de campeão e vice). Em seguida, adicionar uma função onde é informado o resultado da Copa, e a aplicação mostra quem ganhou o bolão, com base em alguma fórmula de sua escolha

* Adicionar papeis específicos aos usuários, como: usuário comum só pode fazer palpites, administrador pode acessar as demais funções

* Adicionar uma opção para que o usuário possa alterar seus palpites até uma certa data-limite (a ser configurada pelo administrador)

## Configuração do Projeto de BackEnd
* Realizar git pull
* Configurar o Glassfish para trabalhar com o mesmo banco de dados do projeto anterior (Derby)
* Copiar os drivers do derby para a pasta <domínio>/lib do Glassfish
* Criar um novo JDBC Connection Pool
* No Netbeans (aba Serviços), criar uma conexão com o banco com o nome ReservaHotelDB2 
* No projeto, criar novo arquivo (Recurso JDBC - Glassfish)
* Ao criar o recurso, escolher para criar novo pool de conexões
* Nome JNDI: jdbc/HotelDB
* Nome do pool: HotelDBPool
* Extrair de conexão existente (escolher a conexão do passo 3.2.1)
* No Netbeans, exibir o console de administração do domínio Glassfish (aba Serviços)
* Abrir a opção Recursos, e fazer upload do arquivo .xml
* Para testar, abrir a opção Pool de conexões JDBC, escolher a conexão criada e clicar em Ping
* No projeto, criar um novo arquivo do tipo Descritor do Glassfish (glassfish-web.xml)
* Criar um ref para o recurso JNDI criado no passo anterior (ver Hotel.sql no projeto Atividade 2)
* Executar comandos para criar tabelas (ver Hotel.sql no projeto Atividade 2)
* Inserir dados nas tabelas (ver Hotel.sql no projeto Atividade 2)

## Configuração do Projeto para React 
* Instalar o node.js, caso ainda não tenha
* Criar uma pasta para os projetos Node (ex: /home/user/NodeProjects)
* Executar, a partir da pasta, o seguinte comando no terminal (Obs: testado na versão npm 5.2.0 ou superior):
npx create-react-app bolao-da-copa-v2-front-end
* Entrar no diretório recém-criado (bolao-da-copa-v2-front-end) e executar os seguintes comandos, para instalar os pacotes necessários
para o exemplo:
npm install react-router-dom -S // Para criação e configuração das rotas
npm install classnames -S // Para estilização dos componentes PrimeReact
npm install font-awesome -S // Para estilização dos componentes PrimeReact
npm install primereact -S // Biblioteca de componentes ricos para React
npm start

## Configuração Extra para Configurar Biblioteca Externa React-Select
npm install react-select@1.0.0-rc.5

## Créditos de bibliotecas:
* [PrimeReact](https://www.primefaces.org/primereact/)
* [React-Select](https://github.com/JedWatson/react-select)

## Alunos
* André Levi Zanon
* Victor Santos Ferrari
* Victor Hugo Domingos de Abreu

## Professores 
* Daniel Lucrédio