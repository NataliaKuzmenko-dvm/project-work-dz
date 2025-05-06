package sales_amount;

public class SalesAmountСalculation {
    public static void main(String[] args) {
        int number1 = 1;
        String product1Name = "Laptop";
        double protduction1Volume = 15153.41;
        int Product1SalesDaily = 5;

        double product1AverageSales = protduction1Volume / Product1SalesDaily;

        System.out.printf("Produc: %s//n", product1Name);
        System.out.printf("Total Sales: EUR %.2f//n", protduction1Volume);
        System.out.printf("Average daily sales amount: EUR %.2f//n//n", product1AverageSales);

        int number2 = 2;
        String product2Name = "cellphone";
        double protduct2Volume = 10486.85;
        int Product2SalesDaily = 7;

        double product2AverageSales = protduct2Volume / Product2SalesDaily;

        System.out.printf("Produc: %s//n", product2Name);
        System.out.printf("Total Sales: EUR %.2f//n", protduct2Volume);
        System.out.printf("Average daily sales amount: EUR %.2f//n", product2AverageSales);
    }
}
