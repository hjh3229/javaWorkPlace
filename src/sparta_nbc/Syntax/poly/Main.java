package sparta_nbc.Syntax.poly;

public class Main {
    public static void main(String[] args) {

        Tire kiaSampleTire = new KiaTire("KIA");
        Tire hankookSampleTire = new HankookTire("HANKOOK");
        Tire tire = new Tire("company");
        HankookTire hankookTireEx = new HankookTire("Hankook");

        // 매개변수 다형성 확인!
        Car car1 = new Car(kiaSampleTire);
        Car car2 = new Car(hankookSampleTire);
        Car car3 = new Car(tire);
        Car car4 = new Car(hankookTireEx);

        // 반환타입 다형성 확인!
        Tire hankookTire = car1.getHankookTire(); // Tire hankkokTire = new HanKookTire("HANKOOK")
        KiaTire kiaTire = (KiaTire) car2.getKiaTire();  // KiaTire kiaTire = new KiaTire("KIA")

        // 오버라이딩된 메서드 호출
        car1.tire.rideComfort(); // KIA 타이어 승차감은 60
        car2.tire.rideComfort(); // HANKOOK 타이어 승차감은 100
        car3.tire.rideComfort(); // company 타이어 승차감은?
        car4.tire.rideComfort(); // Hankook 타이어 승차감은 100
    }
}