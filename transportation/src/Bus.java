public class Bus {
    int number;
    int PassengerCount;
    int money;

    public Bus(int number){
        this.number=number;
    }
    //승객 수 증가
    public void take(int money){
        this.money += money;
        PassengerCount ++;
    }

    public void showInfo(){
        System.out.println("버스"+number+"번의 승객은"+PassengerCount+"명 이고 총 수익은"+money+"입니다.");
    }
}
