import java.util.ArrayList;

public class Report {
    public Report() {
    }

    public StringBuilder generateSalesReports(ArrayList<Sales> sales) {
        StringBuilder report = new StringBuilder();
        report.append("-------------------\n");
        report.append("Sales Report\n");
        report.append("-------------------\n");

        for (Sales sale: sales) {
            report.append("Product: ").append(sale.getProduct()).append("\n");
            report.append("Sales amount: ").append(sale.getSoldAmount()).append("\n");
            report.append("Total value: ").append(sale.getTotalPrice()).append("\n");
            report.append("-------------------\n");
        }
        return report;
    }

    public void printReports(StringBuilder report){
        System.out.println("Printing report: \n" + report);
    }
}
