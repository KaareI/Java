package Week4;

public class yl77 {
    public static class LyyraCard {
        private double balance;

        public LyyraCard(double balanceAtStart) {
            // write code here
            this.balance = balanceAtStart;
        }

        public String toString() {
            // write code here
            return "The card has " + this.balance + " euros";
        }

        public void payEconomical() {
            // write code here
            if (this.balance < 2.5) {
                return;
            }
            this.balance -= 2.5;
        }

        public void payGourmet() {
            // write code here
            if (this.balance < 4) {
                return;
            }
            this.balance -= 4;
        }

        public void loadMoney(double amount) {
            // write code here
            if(amount < 0 ){
                return;
            }
            if (this.balance + amount <= 150) {
                this.balance += amount;
            }
            else{
                this.balance = 150;
            }

        }

    }

    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

    }

}
