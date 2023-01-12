package Aula81.entities;

public class Product {

        private int account;
        private String holder;
        private int amount;


        public Product(int account, String holder, int amount) {
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

        public int getAmount() {
                return amount;
        }

        public void addDeposit(int amount) {
                this.amount += amount;
        }

        public void removeDeposit(int amount) {
                this.amount -= amount;
        }
}
