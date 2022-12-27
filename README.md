# **Totem de Consulta das Linhas de Ônibus de São Luís**

### Instituto Federal do Maranhão
**Time**: Ana Paula Rabelo e Edgar Costa Melo

**Professor**: Mauro Lopes Carvalho Silva

**Programação eXtrema**

### **Descrição do sistema**

São Luís é uma cidade visitada por várias pessoas. Os turistas vêm de várias cidades, algumas próximas a nossa e outras bem distante. Há vários tipos de turistas, aqueles que gostam de conhecer a cidade através de guias turísticos e aqueles que preferem “desbravar” o local por eles mesmos. Apesar de existirem vários serviços de transporte espalhados pela cidade, muitos locais podem ser visitados através das linhas de ônibus da cidade. Porém é muito difícil para quem não conhece a cidade chegar em algum lugar de visitação através dos ônibus. Num outro contexto, vários moradores da cidade de São Luís atualmente têm dúvidas em qual linha de ônibus pegar, para ir a alguns lugares. “Estou no Terminal da Cohab/Cohatrac, qual ônibus pegar para ir ao Hospital Aldenora Bello?”. Não é algo tão simples, se pararmos para pensar que a nossa cidade não teve seu crescimento estruturado, seu crescimento foi desordenado. Atualmente temos até alguns serviços para a população mais próximos de suas residências, mas há tempos, para resolver qualquer problema, dependíamos de um ônibus para nos levar até lá. Em São Luís, assim como em muitas cidades do Brasil, há um Sistema Integrado de Transporte. 

Neste sistema temos a existência dos populares “Terminais da Integração”. Os terminais congregam várias linhas de ônibus. Inicialmente nos terminais haviam colaboradores do próprio terminal que auxiliavam os usuários que tinham dúvidas sobre as plataformas e sobre qual ônibus “pegar” para ir a determinado destino.
Atualmente, os terminais tem pouquíssimos colaboradores, conseguir uma informação de auxílio não é tão simples como outrora. Bom, baseado neste cenário temos o seguinte entendimento, precisamos de uma ferramenta computacional que possamos informar uma origem (obrigatoriamente um Terminal da Integração) e um destino, e após informar estes dados, possamos ter uma resposta de qual ou quais ônibus podemos “pegar” que resolva a nossa consulta. Podemos pensar que a origem sempre será um Terminal da Integração (pois o produto de software baseado neste cenário será um totem fixado em um dos muitos terminais da integração), porém o destino
pode ser um bairro, um ponto da cidade (um supermercado, uma escola, um hospital, shopping, uma praia, um ponto turístico) ou um outro Terminal da Integração. Após informar, origem e destino, esperamos receber uma lista com os ônibus que atendem a nossa consulta. Seria interessante se além da informação de qual ônibus o usuário poderá “pegar”, fosse acrescido algumas informações (plataforma, cor, tarifa, ida (sentido centro) /volta (sentido bairro), etc).

# Montar Itinerários

### Definition of Done
- [ ] Funcionalidade 100% funcional
- [ ] Critérios de aceitação atendidos
- [ ] Caso de teste aceito
- [ ] Refatoração completa
- [ ] Repositório criado com o código-fonte
- [ ] Validada por Mauro Lopes

### Definition of Ready
- [x] História de Usuário tem valor ao negócio
- [x] Estimada pela dupla de desenvolvimento utilizando a sequência Fibonacci
- [x] História de usuário segue o padrão INVEST
- [x] As dependências da história foram identificadas
    - Manter Itens de Itinerário
    - Manter Linhas de Ônibus
- [x] É mensurável e testável
- [x] Documentação da história completa

--------------
|**Cartão**: 01<br/>**Estimativa**: 5| **Projeto**: Totem de Consulta das Linhas de Ônibus de São Luís | 
|--|--|
| Nome da História: **Montar Itinerários** | **Data**: 23/11/2022 |
|**História**: Como Administrador de Itinerários das Linhas de Ônibus, preciso de uma interface que me permita montar os itinerários das linhas de ônibus existentes em São Luís, para que possam ser utilizados nas consultas realizadas no Totem de Consulta.|**Critérios de Aceitação** <br/>**- Dado que** o usuário logado é um Administrador de Itinerários/**Quando** for informado menos que 5 (cinco) itens de itinerário e  o botão [SALVAR] for clicado/**Então** o usuário deve ser informado que não é possível cadastrar o itinerário; <br/>**- Dado que** o usuário logado é um Administrador de Itinerários/**Quando** não for informado a Linha de Ônibus e  o botão [SALVAR] for clicado/ **Então** o usuário deve ser informado que não é possível cadastrar o itinerário;<br/>**- Dado que** o usuário logado é um Administrador de Itinerários/**Quando** for informado os itens de itinerário e o botão [SALVAR] for clicado/ **Então** deverá ser verificado se existe algum item duplicado no itinerário e, se for o caso, não deverá ser permitido o cadastro de um itinerário com dois ou mais itens iguais;<br/>**- Dado que** o usuário logado é um Administrador de Itinerários/**Quando** informado as informações de Itinerário e o botão [SALVAR] for clicado/**Então** a quantidade mínima de itens de itinerário deverá ser 5 (cinco) por sentido;<br/> **- Dado que** o usuário logado é um Administrador de Itinerários/**Quando** as informações de Itinerário forem preenchidas e o botão [SALVAR] for clicado/**Então** não deve ser possível cadastrar mais que 8 (oito) itens de itinerário por sentido;<br/>**- Dado que** o usuário logado é um Administrador de Itinerários/**Quando** obter um itinerário cadastrado e tendo qualquer item de itinerário alterado e após o botão [SALVAR] for clicado/**Então** o terminal deve ter suas informações alteradas;<br/> **- Dado que** o usuário logado é um Administrador de Itinerário/**Quando** obter um itinerário cadastrado e identificando que este não mais é necessário ou não existe, e após o botão [APAGAR] for clicado/**Então** o itinerário deve ser excluído.
|**Observações**: Para montar um itinerário precisamos da Linha de Ônibus em questão, do sentido (Centro ou Bairro) e dos itens de itinerário. | **Risco**: Médio. <br/> Este item será utilizado para montar os itinerários que ficarão disponíveis como opção de consulta nos terminais de consulta.

### Tarefas do time
- [ ] Criar repositório da funcionalidade no Github
- [ ] Implementar a estrutura MVC - Controllers, Services e Repositories
    - Para padronizar o projeto e abstrair as camadas da aplicação, será utilizado o padrão MVC (Model - View - Controller). Para isso, criaremos as classes de controller, service e repository. 
- [ ] Estruturar Banco de Dados
    - Após analisar os requisitos documentados para o sistema, precisamos estruturar o banco de dados, considerando a forma que os usuários precisam acessar os dados. Será necessário especificar as entidades (tabelas), suas chaves primárias e a analisar as relações.
- [ ] Criar as classes baseadas no modelo de domínio	
    - Após informar, origem e destino, esperamos receber uma lista com os ônibus que atendem a nossa consulta, para isso precisamos construir, a partir do modelo de domínio, as classes, métodos e fluxos utilizados para garantir que os dados sejam recebidos, processados e armazenados no banco de dados
- [ ] Criar a interface para o Administrador consultar os itinerários
- [ ] Executar os testes estabelecidos e avaliar os resultados
- [ ] Implementar refatoração no código

