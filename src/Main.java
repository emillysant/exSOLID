import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        SRP (Single Responsibility Principle
//        Classe de Relatório: Crie uma classe Relatorio que gera relatórios de vendas e também os imprime.
//        Refatore a classe para seguir o SRP, separando a lógica de geração e impressão do relatório.

        ArrayList<Sales> sales = new ArrayList<>();
        sales.add(new Sales("Notebool Acer", 4, 20000));
        sales.add(new Sales("Iphone", 5, 45450));
        sales.add(new Sales("Monitor LG", 7, 14000));

        Report report = new Report();
        StringBuilder gReport = report.generateSalesReports(sales);
        report.printReports(gReport);

//        OCP (Open/Closed Principle)
//        Sistema de Descontos: Implemente uma classe Pedido que aplica um desconto baseado na categoria do cliente (por exemplo, estudante, idoso).
//        Use herança e polimorfismo para permitir que novos tipos de descontos sejam adicionados sem modificar a classe Pedido.

        Discount studentDiscount = new StudentDiscount();
        Discount seniorDiscount = new SeniorDiscount();
        Order studentOrder = new Order( studentDiscount, 100.00);
        Order seniorOrder = new Order(seniorDiscount, 100);
        System.out.println(studentOrder);
        System.out.println(seniorOrder);

        System.out.println("\n");

//        LSP (Liskov Substitution Principle)
//        Implemente uma classe base Conta e subclasses ContaCorrente e ContaPoupanca.
//        Assegure-se de que as subclasses podem substituir a classe base sem alterar o comportamento esperado.

        Account currentAccount = new CurrentAccount(1, "Mariana", 1000, 500);
        Account savingsAccount = new SavingsAccount(1, "Francisco", 1002, 0.05);

        currentAccount.deposit(100.0);
        currentAccount.withdraw(50.0);
        System.out.println("Balance: " + currentAccount.getBalance());


        ((SavingsAccount) savingsAccount).applyInterest();
        System.out.println("Saldo após aplicação de juros: " + savingsAccount.getBalance());
        System.out.println("\n");

//        ISP (Interface Segregation Principle)
//        Classe de Impressora: Dada uma interface Impressora com métodos imprimirDocumento, escaneiarDocumento, faxearDocumento, crie interfaces mais específicas para cada funcionalidade.

        FunctionPrint fPrint = new FunctionPrint();
        fPrint.printDocument();
        fPrint.scanDocument();
        fPrint.faxDocument();
        System.out.println("\n");

//        DIP (Dependency Inversion Principle)
//        Sistema de Pagamento: Implemente um sistema de pagamento que depende de
//        diferentes métodos de pagamento (cartão de crédito, PayPal).
//        Use o princípio DIP para garantir que o sistema dependa de abstrações (interfaces) e
//        não de implementações concretas.

        CreditCard creditCard = new CreditCard();
        creditCard.paymentProcess(100);
        PayPal payPal = new PayPal();
        payPal.paymentProcess(120);

    }
}