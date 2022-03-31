# User Stories
Lista de User Stories para a geração dos casos de teste, descritos de forma detalhada

## Caso 1
- **Funcionalidade:** Logar no Sistema Mantis BT.

  Eu, como **usuário**

  **Quero** fazer o login em minha conta no Mantis Bug Tracker

  **Para** ter acesso à plataforma de visualização e cadastro de issues


- **Cenário:** Logar com sucesso
  
  **Dado** que estou na página de login do Mantis BT
  
  **Quando** preencho o campo *Username* com um usuário válido
  
  **E** preencho o campo *Password* com uma senha válida
  
  **E** clico em entrar

  **Então** eu sou direcionado para a página de visão geral de Projetos do Mantis Bug Tracker

## Caso 2
- **Funcionalidade:** Definir um Projeto como *padrão* no Mantis BT
  
  Eu, como **usuário**
  
  **Quero** selecionar um Projeto no Mantis Bug Tracker como padrão
  
  **Para** visualizar de forma exclusiva as issues pertencentes a este Projeto


- **Cenário:** Definir com sucesso o Projeto *'Daniela Maleski's Project'* como o padrão
  
  **Dado** que estou na página de login do Mantis BT
  
  **Quando** preencho o campo *Username* com um usuário válido
  
  **E** preencho o campo *Password* com uma senha válida
  
  **E** clico em entrar
  
  **E** sou direcionado para a página de visão geral de Projetos do Mantis Bug Tracker
  
  **E** seleciono o Projeto *'Daniela Maleski's Project'* no menu Dropdown
  
  **Então** o Projeto padrão é definido como *'Daniela Maleski's Project'*

## Caso 3
- **Funcionalidade:** Cadastrar uma issue resumida no Projeto *'Daniela Maleski's Project'*

  Eu, como **usuário**
  
  **Quero** incluir uma issue resumida no Projeto *'Daniela Maleski's Project'*
  
  **Para** que a equipe de desenvolvimento possa analisar o problema encontrado


- **Cenário:** Cadastrar com sucesso uma issue resumida no Projeto *'Daniela Maleski's Project'*

  **Dado** que estou na página de login do Mantis BT
  
  **Quando** preencho o campo *Username* com um usuário válido
  
  **E** preencho o campo *Password* com uma senha válida
  
  **E** clico em entrar
  
  **E** clico no item do menu *'Report Issue'*

  **E** selecionar o Projeto *'Daniela Maleski's Project'*
  
  **E** seleciono a categoria *'Apptest'*
  
  **E** incluo um resumo da issue no campo *'Summary'*
  
  **E** incluo uma descrição detalhada da issue no campo *'Description'*
  
  **E** clico no botão *'Submit Report'*
  
  **Então** a issue resumida é cadastrada, retornando a mensagem *'Operation successful'* e retornando para a lista de issues do sistema

## Caso 4
- **Funcionalidade:** Cadastrar uma issue detalhada no Projeto *'Daniela Maleski's Project'*
  
  Eu, como **usuário**
  
  **Quero** incluir uma issue detalhada no Projeto *'Daniela Maleski's Project'*
  
  **Para** que a equipe de desenvolvimento possa analisar o problema encontrado


- **Cenário:** Cadastrar com sucesso uma issue detalhada no Projeto *'Daniela Maleski's Project'*

  **Dado** que estou na página de login do Mantis BT
  
  **Quando** preencho o campo *Username* com um usuário válido
  
  **E** preencho o campo *Password* com uma senha válida
  
  **E** clico em entrar
  
  **E** clico no item do menu *'Report Issue'*
  
  **E** selecionar o Projeto *'Daniela Maleski's Project'*
  
  **E** seleciono a categoria *'Apptest'*
  
  **E** seleciono a reprodutibilidade no campo *'Reproducibility'*
  
  **E** seleciono a severidade da issue no campo *'Severity'*
  
  **E** seleciono a prioridade da issue no campo *'Priority'*
  
  **E** seleciono o perfil onde o problema foi encontrado no campo *'Select Profile'*
  
  **E** incluo um resumo da issue no campo *'Summary'*
  
  **E** incluo uma descrição detalhada da issue no campo *'Description'*
  
  **E** incluo os passos para reprodução da issue no campo *'Steps to Reproduce'*
  
  **E** incluo quaisquer informações adicionais no campo *'Additional Information'*
  
  **E** faço o upload do arquivo de log no campo *'Upload File'*
  
  **E** clico no botão *'Submit Report'*
  
  **Então** a issue detalhada é cadastrada, retornando a mensagem *'Operation successful'* e retornando para a lista de issues do sistema

## Caso 5
- **Funcionalidade:** Visualizar todas as issues que não foram atribuídas a um usuário no Projeto *'Daniela Maleski's Project'* com prioridade alta

  Eu, como **usuário**

  **Quero** listar todas as issues de prioridade alta que não foram atribuídas a um usuário
  
  **Para** visualizar as pendências que precisam de tratamento com urgência


- **Cenário:** Visualizar com sucesso as issues de prioridade alta no Projeto *'Daniela Maleski's Project'* que não foram atribuídas a um usuário
  
  **Dado** que estou na página de login do Mantis BT
  
  **Quando** preencho o campo *Username* com um usuário válido
  
  **E** preencho o campo *Password* com uma senha válida
  
  **E** clico em entrar
  
  **E** clico em *'View Issues'*
  
  **E** clico no link *'Assignet To:'*
  
  **E** seleciono no campo *dropdown* a opção *'[none]'*
  
  **E** clico no link *'Priority:'*
  
  **E** seleciono no campo *dropdown* a opção *high*
  
  **E** clico no botão *'Apply Filter'*
  
  **Então** a lista de issues de prioridade alta sem atribuição de usuário para tratamento é exibida