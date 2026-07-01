package ObserverPatternExample;

public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("Alice");
        Observer web = new WebApp("Bob");

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStock("TCS", 4200.50);

        stockMarket.setStock("Infosys", 1650.75);

        stockMarket.removeObserver(web);

        stockMarket.setStock("Wipro", 295.30);
    }
}