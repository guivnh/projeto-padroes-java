<h1>Projeto Simples de Desafio do Bootcamp Java da Dio</h1><p>
Este projeto foi criado com java puro como parte do desafio Java e permite ao usuário escolher somar ou subtrair dois números. Para implementar essa funcionalidade, foram utilizados os padrões Singleton Lazy, Strategy e Facade.

<h2>Padrões de Projeto Utilizados:</h2><p>

<ul><li><h3>Singleton Lazy</h3></li>
O padrão Singleton Lazy foi utilizado para garantir que apenas uma instância da classe responsável pelo cálculo seja criada durante a execução do programa. Isso ajuda a economizar recursos do sistema e a garantir a consistência dos resultados.

<li><h3>Strategy</h3><p></li>
O padrão Strategy foi utilizado para permitir que o usuário escolha entre somar ou subtrair dois números. Para isso, foram criadas duas classes que implementam uma mesma interface de cálculo, e a classe responsável por receber a escolha do usuário utiliza a classe correspondente à operação escolhida.

<li><h3>Facade</h3><p></li></ul>
O padrão Facade foi utilizado para simplificar a interface com o usuário. Em vez de expor as classes e métodos complexos responsáveis pelos cálculos, foi criada uma classe Facade que fornece uma interface simples e fácil de usar para o usuário.

<h2>Como Utilizar</h2>
Para utilizar o programa, basta executar o arquivo principal Main.java e seguir as instruções exibidas na tela. O usuário poderá escolher entre somar ou subtrair dois números, e o resultado será exibido na tela.

<h2>Conclusão</h2>
Este projeto demonstra como é possível utilizar os padrões de projeto Singleton Lazy, Strategy e Facade para implementar uma funcionalidade simples em Java de forma eficiente e organizada.
