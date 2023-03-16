import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Account_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 스캐너 객체 생성
        boolean existence = true; // 돈이 있는지 없는지 확인
        int money;

        Account account = new Account(351 - 48648 - 648648);

        while (existence) {
            System.out.println(" ");

            System.out.println("--------------------------------------");
            System.out.println("| 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 |");
            System.out.println("--------------------------------------");
            System.out.println(" 선택 >");

            int menu = sc.nextInt(); // int 형 입력 및 리턴

            switch (menu) {
                case 1:
                    System.out.println("1. 예금액 > ");
                    money = sc.nextInt();
                    account.deposit(money);
                    System.out.println(money + " 원을 입금합니다.");
                    break;
                case 2:
                    System.out.println("2. 출금액 >");
                    money = sc.nextInt();
                    account.withdraw(money);
                    System.out.println(money + " 원을 출금합니다.");
                    break;
                case 3:
                    System.out.println("3. 잔액조회 > ");
                    account.ShowBalance();
                    break;
                case 4:
                    System.out.println("4. 종료하기 > ");
                    existence = false;
                    break;
                default:
                    System.out.println(" 다시 입력해주세요. ");
                    continue;
            }//switch문
        }//while문
        sc.close();
    }
}
