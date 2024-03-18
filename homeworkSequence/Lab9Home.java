
public class Lab9Home {
    
    class Customer {
        private Cashier cashier;
        private double cash = 2000; // Customer has some amount of cash
        private boolean creditCard = true; // Customer has a credit card
        private int totalItemCount = 10;
        private double itemCost = 100;

        public Customer(Cashier cashier) {
            this.cashier = cashier;
        }

        public void checkout() {
            for (int i = 0; i < totalItemCount; i++) {
                cashier.unloadItem(itemCost);
            }
            payment();
        }
        
        public double getTotalCost() {
            return itemCost * totalItemCount;
        }

        private void payment() {
            if (cash >= getTotalCost()) {
                cashier.payCash(this, getTotalCost());
            } else if (creditCard) {
                cashier.payCreditCard();
            }
        }
    }

    class Cashier {
        private double requespayment;
        private double totalItemCount;
        private CardProcessor cardProcessor;
        private CashRegister cashRegister;

        public Cashier(CardProcessor cardProcessor, CashRegister cashRegister) {
            this.cardProcessor = cardProcessor;
            this.cashRegister = cashRegister;
        }

        public double unloadItem(double itemCost) {
            tallyItem(itemCost);
            requespayment += itemCost;
            return requespayment;

        }

        private int tallyItem(double cost) {
            return (int) (totalItemCount += cost);
        }

        public void payCash(Customer customer, double amount) {
            cashRegister.depositPayment(amount);
            double change = cashRegister.retrieveChange(amount - totalItemCount);
            customer.cash -= (amount - change); // Deduct the net amount from the customer's cash
            System.out.println("Change given: " + change);
        }

        public void payCreditCard() {
            cardProcessor.processCard();
        }
    }

    class CardProcessor {
        public void processCard() {
            // Implement card processing logic here
            System.out.println("Card processed.");
        }
    }

    class CashRegister {
        private double cash = 5000; // Cash register starts with some cash

        public void depositPayment(double amount) {
            cash += amount;
            System.out.println("Payment deposited: " + amount);
        }

        public double retrieveChange(double amount) {
            // Implement change retrieval logic here
            if (cash >= amount) {
                cash -= amount;
                return amount;
            } else {
                System.out.println("Not enough cash in the register to provide change.");
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Lab9Home lab = new Lab9Home();
        CashRegister cashRegister = lab.new CashRegister();
        CardProcessor cardProcessor = lab.new CardProcessor();
        Cashier cashier = lab.new Cashier(cardProcessor, cashRegister);
        Customer customer = lab.new Customer(cashier);
        customer.checkout(); 
        System.out.println("Total payment: " + customer.getTotalCost());
    }
}

