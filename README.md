# SolidPrinciples
Projeto para estudar principios do SOLID

SOLID são cinco princípios da programação orientada a objetos que facilitam no desenvolvimento de ‘softwares’, tornando-os fáceis de manter e estender. 

Esses princípios podem ser aplicados a qualquer linguagem de POO.

## Definição

### S - Single Responsiblity Principle (Princípio da responsabilidade única)
- Explicação
  - Uma classe deve ter um, e somente um, motivo para mudar.
  - Uma classe deve ter apenas uma responsabilidade no ‘software’.
  - Procura evitar a God Class (Classe que sabe demais ou faz demais)
  - Esse principio também se aplica a métodos
- O que acontece se eu violar o principio
  - Falta de coesão
    - Uma classe acaba a assumir responsabilidades que não são dela
  - Alto acoplamento
    - Torna o sistema engessado e frágil para alterações devido às dependências
  - Dificuldades em testes automatizados
    - É difícil "mockar" esse tipo de classe 

### O - Open Closed Principle (Princípio Aberto Fechado)

- Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação
- Quando novos comportamentos e recursos precisam ser adicionados no ‘software’, devemos estender e não alterar o código-fonte original
- Como diria 'Uncle Bob': Separe o comportamento extensível por trás de uma ‘interface’ e inverta as dependências
- Esse princípio é a base para o padrão de projeto 'Strategy'

### L

-

### I

-

### D

-
