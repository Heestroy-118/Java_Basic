public class Taxi {
    String name;
    int money;

    public Taxi(String name){
        this.name = name;
    }
    public void take(int money){
        this.money+= money;
    }
    public void showInfo() {
        System.out.println(name+"의 총 수익은"+money+"입니다.");
    }
}
