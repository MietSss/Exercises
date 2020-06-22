package Oefening.Liang9_2;

public class StockApp {
    public static void main(String[] args) {
        Stock testProgram = new Stock("ORCL", "Oracle", 34.5);

        testProgram.setCurrentPrice(34.35);

        System.out.printf("Price-change percentage %.2f", testProgram.getChangePercentage());

    }
}
