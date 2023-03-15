public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames = new Student("James", 50000);
        Student studentTomas = new Student("Tomas", 10000 );
        Student studentAriana = new Student("Ariana",12000);

        Bus bus1 = new Bus(100);
        Taxi taxi100 = new Taxi("모범택시");
        studentJames.takeBus(bus1);
        studentAriana.takeTaxi(taxi100);

        studentJames.showInfo();// James 정보 출력
        studentAriana.showInfo();
        bus1.showInfo();// 버스 정보 출력
        taxi100.showInfo();

        Subway subway1 = new Subway(1);
        studentTomas.takeSubway(subway1);
        studentTomas.showInfo();
        subway1.showInfo();
    }
}
