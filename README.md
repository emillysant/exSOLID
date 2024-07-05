# exSOLID
Exercícios SOLID

SRP (Single Responsibility Principle
Classe de Relatório: Crie uma classe Relatorio que gera relatórios de vendas e também
os imprime.
Refatore a classe para seguir o SRP, separando a lógica de geração e impressão do
relatório.
OCP (Open/Closed Principle)
Sistema de Descontos: Implemente uma classe Pedido que aplica um desconto
baseado na categoria do cliente (por exemplo, estudante, idoso).
Use herança e polimorfismo para permitir que novos tipos de descontos sejam
adicionados sem modificar a classe Pedido.
LSP (Liskov Substitution Principle)
Implemente uma classe base Conta e subclasses ContaCorrente e ContaPoupanca.
Assegure-se de que as subclasses podem substituir a classe base sem alterar o
comportamento esperado.
ISP (Interface Segregation Principle)
Classe de Impressora: Dada uma interface Impressora com métodos
imprimirDocumento, escaneiarDocumento, faxearDocumento,
crie interfaces mais específicas para cada funcionalidade.
DIP (Dependency Inversion Principle)
Sistema de Pagamento: Implemente um sistema de pagamento que depende de
diferentes métodos de pagamento (cartão de crédito, PayPal).
Use o princípio DIP para garantir que o sistema dependa de abstrações (interfaces) e
não de implementações concretas.
