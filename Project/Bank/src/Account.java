 public class Account {

        private String accountNu; //계좌번호
        private int balance; //잔고

        public Account(String accountNu) {
            this.accountNu = accountNu;
        }//accountNu 멤버변수 초기화

        public Account(int balance){
            this.balance=balance; // balance 초기화
        }
        public int deposit(int money){
            balance = balance + money;
            return balance;
        }//입금

        public int withdraw(int money){
            balance = balance - money;
            return balance;
        } //출금

     public void ShowBalance(){
         System.out.println("현재 잔액은 "+ balance +"원 입니다.");
     }
 }
