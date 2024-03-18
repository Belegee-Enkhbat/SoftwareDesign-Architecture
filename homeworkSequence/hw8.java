package homeworkSequence;

class customer {
    private String giveReceipt;
    private cardProcessor cardProcessor;
    private cardRegister cardRegister;
    private boolean cash;
    private boolean creditCard;
    private double returnChange;
    private int totalItemCount = 10;
    private double itemCost = 1000;
    private cashier cashier;

    public void call() {
        for (int i = 0; i < totalItemCount; i++) {
            cashier.unloadItem(itemCost);
        }
    }

    public double payCash() {
        cardRegister.depositPayment();
        return returnChange;
    }

    public String payCreditCard() {
        cardProcessor.processCard();
        return giveReceipt;
    }

    public void chooseYourPayment() {
        if (cash) {
            payCash();
        } else if (creditCard) {
            payCreditCard();
        }
    }

}

class cashier {
    private double totalTallyItem;

    public void unloadItem(double itemCost) {
        tallyItem();
        requestPayment();
    }

    public double requestPayment() {
        return totalTallyItem;
    }

    public void tallyItem() {
        totalTallyItem += itemCost;
    }

    public void retrieveChange() {

    }
}

class cardProcessor {
    private boolean processStatus;

    public boolean processCard() {
        return processStatus;
    }
}

class cardRegister {
    cashier cashier;

    public void depositPayment() {
        cashier.retrieveChange();
    }

}

public class hw8 {
    public static void main(String[] args) {

    }
}
