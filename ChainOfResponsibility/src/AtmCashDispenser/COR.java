package AtmCashDispenser;

public class COR {
    public static void main(String[] args) {
        
        MoneyHandler thousandHandler = new ThousandHandler(3);
        MoneyHandler fiveHundredHandler = new FiveHundredHandler(5);
        MoneyHandler twoHundredHandler = new TwoHundredDispenser(10);
        MoneyHandler hundredHandler = new HundredDispenser(20);
        
        thousandHandler.setNextHandler(fiveHundredHandler);
        fiveHundredHandler.setNextHandler(twoHundredHandler);
        twoHundredHandler.setNextHandler(hundredHandler);
        
        
        int amountToWithdraw = 3500;

        System.out.println("Attempting to withdraw: $" + amountToWithdraw);
        thousandHandler.dispense(amountToWithdraw);
    }
}