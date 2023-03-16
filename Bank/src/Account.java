 public class Account {

        private String accountNu; //계좌번호
        private int balance; //잔고

        public Account(String accountNu) {
            this.accountNu = accountNu;
        }
        public Account(int balance){
            this.balance=balance;
    }
        public int deposit(int money){
            balance = balance + money;
            return balance;
        }//입금

        public int withdraw(int money){
            balance = balance - money;
            return balance;
        } //출금

     public int getBalance() {
         return balance;


     }
 }
