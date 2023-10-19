package Week5;

public class yl86 {

    public static class LyyraCard {
        private double balance;

        public LyyraCard(double balanceAtStart) {
            // write code here
            this.balance = balanceAtStart;
        }

        public double balance() {
            return this.balance;
        }

        public void loadMoney(double amount) {
            // write code here
            if (amount < 0) {
                return;
            }
            if (this.balance + amount <= 150) {
                this.balance += amount;
            } else {
                this.balance = 150;
            }

        }

        public boolean pay(double amount) {
            // the method checks if the balance of the card is at least the amount given as
            // parameter
            // if not, the method returns false meaning that the card could not be used for
            // the payment
            // if the balance is enough, the given amount is taken from the balance and true
            // is returned
            if (this.balance >= amount) {
                this.balance -= amount;
                return true;
            } else {
                return false;
            }
        }

    }

    public static class CashRegister {
        private double cashInRegister; // the amount of cash in the register
        private int economicalSold; // the amount of economical lunches sold
        private int gourmetSold; // the amount of gourmet lunches sold

        public CashRegister() {
            // at start the register has 1000 euros
            this.cashInRegister = 1000;
        }

        /* Paying with CASH */
        public double payEconomical(double cashGiven) {
            // the price of the economical lunch is 2.50 euros
            // if the given cash is at least the price of the lunch:
            // the price of lunch is added to register
            // the amount of the sold lunches is incremented by one
            // the method returns cashGiven - lunch price
            if (cashGiven >= 2.5) {
                this.cashInRegister += 2.5;
                economicalSold++;
                return cashGiven - 2.5;
            }
            // if not enough money is given, all is returned and nothing else happens
            else {
                return cashGiven;
            }
        }

        public double payGourmet(double cashGiven) {
            // the price of the gourmet lunch is 4.00 euros
            // if the given cash is at least the price of the lunch:
            // the price of lunch is added to the register
            // the amount of the sold lunches is incremented by one
            // the method returns cashGiven - lunch price
            if (cashGiven >= 4) {
                this.cashInRegister += 4;
                gourmetSold++;
                return cashGiven - 4;
            }
            // if not enough money is given, all is returned and nothing else happens
            else {
                return cashGiven;
            }
        }

        /* Paying with CARD */
        public boolean payEconomical(LyyraCard card) {
            // the price of the economical lunch is 2.50 euros
            // if the balance of the card is at least the price of the lunch:
            // the amount of sold lunches is incremented by one
            // the method returns true
            if (card.balance() >= 2.5) {
                card.balance -= 2.5;
                economicalSold++;
                return true;
            }
            // if not, the method returns false
            else {
                return false;
            }
        }

        public boolean payGourmet(LyyraCard card) {
            // the price of the gourmet lunch is 4.00 euros
            // if the balance of the card is at least the price of the lunch:
            // the amount of sold lunches is incremented by one
            // the method returns true
            if (card.balance() >= 4) {
                card.balance -= 4;
                gourmetSold++;
                return true;
            }
            // if not, the method returns false
            else {
                return false;
            }
        }

        /* Loading money to LyyraCard */
        public void loadMoneyToCard(LyyraCard card, double sum) {

            // if the loaded sum is below 0, return and nothing happens
            if (sum < 0) {
                return;
            }
            // if not:
            // the sum is loaded to the card
            // the amount stored in the register increases correspondingly
            else {
                card.balance += sum;
                cashInRegister += sum;
            }
        }

        public String toString() {
            return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold
                    + " gourmet lunches sold: " + gourmetSold;
        }
    }

    public class Main {
        public static void main(String[] args) {

            /* 86.1 TESTING */

            LyyraCard cardOfPekka = new LyyraCard(10);

            System.out.println("money on the card " + cardOfPekka.balance());
            boolean succeeded = cardOfPekka.pay(8);
            System.out.println("money taken: " + succeeded);
            System.out.println("money on the card " + cardOfPekka.balance());

            succeeded = cardOfPekka.pay(4);
            System.out.println("money taken: " + succeeded);
            System.out.println("money on the card " + cardOfPekka.balance());

            /* 86.2 TESTING */

            /*
             * CashRegister unicafeExactum = new CashRegister();
             * 
             * double theChange = unicafeExactum.payEconomical(10);
             * System.out.println("the change was " + theChange);
             * 
             * theChange = unicafeExactum.payEconomical(5);
             * System.out.println("the change was " + theChange);
             * 
             * theChange = unicafeExactum.payGourmet(4);
             * System.out.println("the change was " + theChange);
             * 
             * System.out.println(unicafeExactum);
             */

            /* 86.3 TESTING */

            /*
             * CashRegister unicafeExactum = new CashRegister();
             * 
             * double theChange = unicafeExactum.payEconomical(10);
             * System.out.println("the change was " + theChange);
             * 
             * LyyraCard cardOfJim = new LyyraCard(7);
             * 
             * boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
             * System.out.println("payment success: " + succeeded);
             * succeeded = unicafeExactum.payGourmet(cardOfJim);
             * System.out.println("payment success: " + succeeded);
             * succeeded = unicafeExactum.payEconomical(cardOfJim);
             * System.out.println("payment success: " + succeeded);
             * 
             * System.out.println(unicafeExactum);
             */

            /* 86.4 TESTING */

            /*
             * CashRegister unicafeExactum = new CashRegister();
             * System.out.println(unicafeExactum);
             * 
             * LyyraCard cardOfJim = new LyyraCard(2);
             * 
             * System.out.println("the card balance " + cardOfJim.balance() + " euros");
             * 
             * boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
             * System.out.println("payment success: " + succeeded);
             * 
             * unicafeExactum.loadMoneyToCard(cardOfJim, 100);
             * 
             * succeeded = unicafeExactum.payGourmet(cardOfJim);
             * System.out.println("payment success: " + succeeded);
             * 
             * System.out.println("the card balance " + cardOfJim.balance() + " euros");
             * 
             * System.out.println(unicafeExactum);
             */

        }
    }

}
