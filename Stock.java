package Oefening.Liang9_2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock (String symbol, String name, double previousClosingPrice){
        setSymbol(symbol);
        setName(name);
        setPreviousClosingPrice(previousClosingPrice);

    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice= currentPrice;
    }

    public double getChangePercentage() {
        return (currentPrice)*100/ previousClosingPrice;
    }
}
