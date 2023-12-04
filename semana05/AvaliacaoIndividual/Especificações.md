# Especificações

## Ponto
 - Tem um atributo com nome do ponto e um id que é gerado automaticamente
 - Tem um construtor que recebe o nome do ponto, o id é gerado pelo atributo estatico 'idCounter'

## Trecho
 - Tem um atributo com o ponto de origem, um com o ponto de destino e um com a duracao do trecho
 - Tem tambem associado a ele uma lista de embarques
 - Ao adicionar um trecho a sua jornada a duração do trecho já é calculada e adicionada ao tempo estimado
 - Há um metodo para adicionar um embarque a um trecho
 - Os trechos sao identificados pelo id que é gerado automaticamente com ajuda do atributo estatico 'idCounter'

## Embarque
 - Tem um atributo com o ponto, que pode ser de embarque ou desembarque, e um atributo com o tipo de embarque.
 - Alem disso tem um atributo numeroCartao que identifica o passageiro e um id que é gerado automaticamente pelo atributo estatico 'idCounter'

## Trajeto 
  - É iniciado apenas com um data e hora de inicio
  - O trajeto é identificado por um id que é gerado automaticamente com ajuda do atributo estatico 'idCounter'
  - Tem uma lista de trechos que podem ser adicionados com a função 'adicionarTrecho'
  - Ao adicionar um trecho a um trajeto, a duracao estimada é incrementada com a duracao do trecho
  - A função 'finalizarTrajeto' define a horaCheckPoint que é a hora de chegada do ultimo trecho

## Onibus
 - Tem um atributo placa que serve como id
 - Tem um Trajeto associado a ele
 - O trajeto pode ou nao ser definido no construtor
 - O trajeto pode ser mudado

## Jornada
 - Tem um atributo estativo numeroJornadas que é usado para gerar o id da jornada
 - A jornada contem um motorista, um possivel cobrador e varios onibus.
 - Como um onibus so pode fazer um trajeto, ao adicionar um onibus a jornada, o trajeto esta sendo definido, por isso não existe uma lista de trajetos
 - No construtor nao é necessario passar cobrador, pois ele pode ser adicionado depois.
 - No construtor nao é necessario passar onibus, pois ele pode ser adicionado depois.
 - Os onibus são adicionados com a função 'adicionarTrajeto' que recebe a lista de Onibus, um id de trajeto e procura o id do trajeto nos onibus que foram fornecidos.
 - Ao adicionar um onibus/trajeto a duracao do trajeto é adicionada ao tempo estimado da jornada.


## Pessoa
 - Classe abstrata que contem os atributos nome, cpf, rg e data de nascimento, seus getters e setters e um construtor que recebe esses atributos.
 - Tem metodos para calcular a idade e saber se a pessoa é maior de idade
 - Tem um metodo para validar cpf e rg

### Passageiro
 - Herda da classe Pessoa
 - Tem atributos para numero de cartao, tipo do cartao e saldo

### Funcionario
 - Classe abstrata que herda da classe Pessoa
 - Tem atributos para salario, data de admissao, data de demissao e cargo
 - Não é precisso passar data de demissao no construtor, pois ela pode ser adicionada depois pelo metodo 'demitir'
 - Tem um metodo para calcular o tempo de trabalho
 - Tem um metodo para saber se o funcionario esta ativo

#### Cobrador
 - Herda da classe Funcionario
 - Não tem atributos alem dos herdados de Funcionario

#### Motorista
 - Herda da classe Funcionario
 - So tem um atributo para numero de habilitacao