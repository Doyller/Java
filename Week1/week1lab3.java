public class week1lab3 {
    public static void main (String[] args) {
        double initialInvestment = 1000.0;
        double annualProfitRate = 0.05;
        double accountBalance = initialInvestment;

        System.out.println("Year\tAmount on deposit");

        for (int year = 1; year <= 10; year++) {
            double annualProfit = accountBalance * annualProfitRate;
            accountBalance += annualProfit;
            System.out.printf("%d\t%.2f\n", year, accountBalance);
        }
    }
}

