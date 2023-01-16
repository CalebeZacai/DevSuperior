package Aula81.Example2.entities;

public class Product {

        private int account;
        private String holder;
        private double amount;


        public Product(int account, String holder, double amount) {
                this.account = account;
                this.holder = holder;
                this.amount = amount;
        }

        public int getAccount() {
                return account;
        }

        public void setAccount(int account) {
                this.account = account;
        }

        public String getHolder() {
                return holder;
        }

        public void setHolder(String holder) {
                this.holder = holder;
        }

        public double getAmount() {
                return amount;
        }

        public void addDeposit(double amount) {
                this.amount += amount;
        }

        public void removeDeposit(double amount) {
                this.amount -= amount;
        }
}
