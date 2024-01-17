# SolidPrinciples
Projeto para estudar principios do SOLID

SOLID são cinco princípios da programação orientada a objetos que facilitam no desenvolvimento de ‘softwares’, tornando-os fáceis de manter e estender. 

Esses princípios podem ser aplicados a qualquer linguagem de POO.

## Definição

### S — Single Responsiblity Principle (Princípio da responsabilidade única)
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

### O — Open Closed Principle (Princípio Aberto Fechado)

- Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação
- Quando novos comportamentos e recursos precisam ser adicionados no ‘software’, devemos estender e não alterar o código-fonte original
- Como diria 'Uncle Bob': Separe o comportamento extensível por trás de uma ‘interface’ e inverta as dependências
- Esse princípio é a base para o padrão de projeto 'Strategy'

### L — Liskov Substitution Principle (Princípio da substituição de Liskov)

- Uma classe derivada deve ser substituível por sua classe base.
- Introduzido por Barbara Liskov.
- Exemplo:
  - se S é um subtipo de T, então os objetos do tipo T, num programa, podem ser trocados pelos objetos de tipo S sem ser necessário alterar as propriedades deste programa.
- Para não violar o LSP é necessário em alguns casos considerar o OCP e ISP, além de estrutura muito bem as suas abstrações.
- Seguir o LSP nos permite usar o poliformismo com mais confiança.
- Podemos chamar as nossas classes derivadas referindo-se à sua classe base sem preocupações com resultados inesperados.
- Violação de LSP
  - Sobrescrever / implementar um método que não faz nada
  - Lançar uma exceção inesperada
  - Retornar valores de tipos diferentes da classe base

### I — Interface Segregation Principle (Princípio de Segregação da Interface)

- Uma classe não deve ser forçada a implementar ‘interfaces’ e métodos que não irão utilizar.
- É melhor criar interfaces especificas do que uma única interface generica.
- A solução para o problema de ISP é criar interfaces baseadas na interface só que mais especificas.

### D - Dependency Inversion Principle (Princípio de Inversão de Dependência)

- Dependa de abstrações e não de implementações
- Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender da abstração.
- Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.

### Referências

- Todo o conteúdo desse repositório foi retirado do site da Medium 
  - Disponível em https://medium.com/desenvolvendo-com-paixao/o-que-%C3%A9-solid-o-guia-completo-para-voc%C3%AA-entender-os-5-princ%C3%ADpios-da-poo-2b937b3fc530